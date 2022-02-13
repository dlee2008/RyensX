package com.skyd.imomoe.viewmodel

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.skyd.imomoe.App
import com.skyd.imomoe.PluginManager
import com.skyd.imomoe.R
import com.skyd.imomoe.util.showToast
import com.skyd.imomoe.view.adapter.SerializableRecycledViewPool
import com.su.mediabox.plugin.interfaces.IHomeModel
import com.su.mediabox.plugin.standard.been.TabBean
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class HomeViewModel : ViewModel() {
    private val homeModel: IHomeModel by lazy(LazyThreadSafetyMode.NONE) {
        PluginManager.acquireComponent(IHomeModel::class.java)
    }
    val childViewPool = SerializableRecycledViewPool()
    val viewPool = SerializableRecycledViewPool()
    var allTabList: MutableList<TabBean> = ArrayList()
    var mldGetAllTabList: MutableLiveData<Boolean> = MutableLiveData()

    fun getAllTabData() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                homeModel.getAllTabData().apply {
                    allTabList.clear()
                    allTabList.addAll(this)
                    mldGetAllTabList.postValue(true)
                }

            } catch (e: Exception) {
                allTabList.clear()
                mldGetAllTabList.postValue(false)
                e.printStackTrace()
                (App.context.getString(R.string.get_data_failed) + "\n" + e.message).showToast(
                    Toast.LENGTH_LONG
                )
            }
        }
    }

    companion object {
        const val TAG = "HomeViewModel"
    }
}