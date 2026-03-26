package com.example.kuit7.data

import android.R.attr.type
import android.media.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import com.example.kuit7.R

data class NewsItemData (
    val label: String,
    val content: String,
    val company: String,
    val time: String,
    val image: Int
)
object NewsItem {
    fun getNewsItemList() = listOf<NewsItemData>(
        NewsItemData(
            label = "Europe",
            content = "Ukraine's President Zelensky to BBC: Blood money being paid...",
            company = "BBC News",
            time = "14m ago",
            image = R.drawable.news1
        ),
        NewsItemData(
            label = "Travel",
            content = "Ukraine's President Zelensky to BBC: Blood money being paid...",
            company = "BBC News",
            time = "14m ago",
            image = R.drawable.news2,
        ),
        NewsItemData(
            label = "Europe",
            content = "Ukraine's President Zelensky to BBC: Blood money being paid...",
            company = "BBC News",
            time = "14m ago",
            image = R.drawable.news3,
        ),
        NewsItemData(
            label = "Money",
            content = "Ukraine's President Zelensky to BBC: Blood money being paid...",
            company = "BBC News",
            time = "14m ago",
            image = R.drawable.news4,
        ),
        NewsItemData(
            label = "Life",
            content = "Ukraine's President Zelensky to BBC: Blood money being paid...",
            company = "BBC News",
            time = "14m ago",
            image = R.drawable.news5,
        ),
        NewsItemData(
            label = "Europe",
            content = "Ukraine's President Zelensky to BBC: Blood money being paid...",
            company = "BBC News",
            time = "14m ago",
            image = R.drawable.news3,
        ),
        NewsItemData(
            label = "Money",
            content = "Ukraine's President Zelensky to BBC: Blood money being paid...",
            company = "BBC News",
            time = "14m ago",
            image = R.drawable.news4,
        ),
        NewsItemData(
            label = "Life",
            content = "Ukraine's President Zelensky to BBC: Blood money being paid...",
            company = "BBC News",
            time = "14m ago",
            image = R.drawable.news5,
        )
    )
}