package com.su.mediabox.config

import com.su.mediabox.App
import com.su.mediabox.R

interface Const {

    object ViewComponent {
        const val HISTORY_INFO_TAG = "history_info_tag"
        const val EPISODE_LIST_TAG = "episode_list_tag"
        const val DEFAULT_PAGE = 1
        const val PLAY_SPEED_TAG = "play_speed_tag"
    }

    object Player {
        val SELECT_ITEM_COLOR = App.context.resources.getColor(R.color.unchanged_main_color_2_skin)
        val UNSELECT_ITEM_COLOR = App.context.resources.getColor(android.R.color.white)
    }

    interface Common {
        companion object {
            const val GITHUB_URL = "https://github.com/RyensX/MediaBox"
            const val GITHUB_NEW_ISSUE_URL = "https://github.com/RyensX/MediaBox/issues/new"
            const val USER_NOTICE_VERSION = 2
        }
    }

    object Plugin {
        const val GITHUB_OFFICIAL_REPOSITORY_PLUGIN_INFO_TEMPLATE =
            "https://raw.githubusercontent.com/RyensX/MediaBoxPluginRepository/gh-pages/data/data.json"
        const val GITHUB_OFFICIAL_REPOSITORY_PAGE_PLUGIN_INFO_TEMPLATE =
            "https://raw.githubusercontent.com/RyensX/MediaBoxPluginRepository/gh-pages/data/data_{page}.json"

        const val PLUGIN_STATE_DOWNLOADABLE = 0
        const val PLUGIN_STATE_UPDATABLE = 70
        const val PLUGIN_STATE_DOWNLOADING = 1
        const val PLUGIN_STATE_OPEN = 100
    }

    interface Setting {
        companion object {
            const val SHOW_PLAY_BOTTOM_BAR = "show_play_bottom_bar"
        }
    }

    interface ShortCuts {
        companion object {
            const val ID_FAVORITE = "favorite"
            const val ID_EVERYDAY = "everyday"
            const val ID_DOWNLOAD = "download"
            const val ACTION_EVERYDAY = "everyday"
        }
    }

    interface Database {
        object AppDataBase {
            const val ANIME_DOWNLOAD_TABLE_NAME = "animeDownloadList"
            const val FAVORITE_ANIME_TABLE_NAME = "favoriteAnimeList"
            const val HISTORY_TABLE_NAME = "historyList"
            const val SEARCH_HISTORY_TABLE_NAME = "searchHistoryList"

            const val MEDIA_DB_FILE_NAME_TEMPLATE = "media_plugin_data_%s.db"
            const val FAVORITE_MEDIA_TABLE_NAME = "favorite"
            const val HISTORY_MEDIA_TABLE_NAME = "history"
            const val SEARCH_MEDIA_TABLE_NAME = "search"
        }

        object OfflineDataBase {
            const val OFFLINE_DATA_BASE_FILE_NAME = "offline_data.db"
            const val PLAY_RECORD_TABLE_NAME = "playRecord"
        }
    }

    interface ViewHolderTypeInt {
        companion object {
            const val UNKNOWN = -1              //未知类型，使用EmptyViewHolder容错处理。
            const val ANIME_COVER_1 = R.layout.item_anime_cover_1
            const val ANIME_COVER_2 = R.layout.item_anime_cover_2
            const val ANIME_COVER_3 = R.layout.item_anime_cover_3
            const val ANIME_COVER_4 = R.layout.item_anime_cover_4
            const val ANIME_COVER_5 = R.layout.item_anime_cover_5
            const val ANIME_COVER_6 = R.layout.item_anime_cover_6
            const val ANIME_COVER_7 = R.layout.item_anime_cover_7
            const val ANIME_COVER_8 = R.layout.item_anime_cover_8
            const val ANIME_COVER_9 = R.layout.item_anime_cover_9
            const val GRID_RECYCLER_VIEW_1 = R.layout.item_grid_recycler_view_1
            const val LICENSE_HEADER_1 = R.layout.item_license_header_1
            const val SEARCH_HISTORY_HEADER_1 = R.layout.item_search_history_header_1
            const val SEARCH_HISTORY_1 = R.layout.item_search_history_1
            const val ANIME_EPISODE_FLOW_LAYOUT_1 = R.layout.item_anime_episode_flow_layout_1
            const val ANIME_EPISODE_FLOW_LAYOUT_2 = R.layout.item_anime_episode_flow_layout_2
            const val ANIME_DESCRIBE_1 = R.layout.item_anime_describe_1
            const val ANIME_INFO_1 = R.layout.item_anime_info_1
            const val HORIZONTAL_RECYCLER_VIEW_1 = R.layout.item_horizontal_recycler_view_1
            const val ANIME_EPISODE_2 = R.layout.item_anime_episode_2
            const val UPNP_DEVICE_1 = R.layout.item_dlna_device_1
            const val MORE_1 = R.layout.item_more_1
            const val SKIN_COVER_1 = R.layout.item_skin_cover_1
            const val DATA_SOURCE_1 = R.layout.item_data_source_1
        }
    }

    interface DownloadAnime {
        companion object {
            val animeFilePath = App.context.getExternalFilesDir(null).toString() + "/DownloadAnime/"
        }
    }

}