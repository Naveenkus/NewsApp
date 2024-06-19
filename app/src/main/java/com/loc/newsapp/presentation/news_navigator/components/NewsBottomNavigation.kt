package com.loc.newsapp.presentation.news_navigator.components

<<<<<<< HEAD
import android.content.res.Configuration.UI_MODE_NIGHT_YES
=======
>>>>>>> origin/main
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
<<<<<<< HEAD
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.loc.newsapp.R
import com.loc.newsapp.presentation.onboarding.Dimens.ExtraSmallPadding2
import com.loc.newsapp.presentation.onboarding.Dimens.IconSize
import com.loc.newsapp.ui.theme.NewsAppTheme
=======
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.loc.newsapp.presentation.onboarding.Dimens.ExtraSmallPadding2
import com.loc.newsapp.presentation.onboarding.Dimens.IconSize
>>>>>>> origin/main

@Composable
fun NewsBottomNavigation(
    items: List<BottomNavigationItem>,
    selected: Int,
<<<<<<< HEAD
    onItemClick: (Int) -> Unit
=======
    onSelected: (Int) -> Unit
>>>>>>> origin/main
){
    NavigationBar (
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.background,
        tonalElevation = 10.dp
    ){
<<<<<<< HEAD
        items.forEachIndexed { index, item ->
=======
        items.forEachIndexed { index, Item ->
>>>>>>> origin/main
            NavigationBarItem(
                selected = index == selected,
                onClick = { onItemClick(index)},
                icon  = {
                    Column (horizontalAlignment = CenterHorizontally){
                        Icon(
                            painter = painterResource(id = item.icon),
                            contentDescription = null,
                            modifier = Modifier.size(IconSize)
                        )
                        Spacer(modifier = Modifier.height(ExtraSmallPadding2))
<<<<<<< HEAD
                        Text(text = item.text, style = MaterialTheme.typography.labelSmall)
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = MaterialTheme.colorScheme.primary,
                    selectedTextColor = MaterialTheme.colorScheme.primary,
                    unselectedIconColor = colorResource(id = R.color.body),
                    unselectedTextColor = colorResource(id = R.color.body),
                    indicatorColor = MaterialTheme.colorScheme.background
                )
            )
=======
                    }
                }
                )
>>>>>>> origin/main
        }
    }
}

data class BottomNavigationItem(
    @DrawableRes val icon:Int,
    val text: String
<<<<<<< HEAD
)

@Preview
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun NewsBottomNavigationPreview() {
        NewsAppTheme {
            NewsBottomNavigation(
                items  = listOf(
                    BottomNavigationItem(icon = R.drawable.ic_home, text = "Home"),
                    BottomNavigationItem(icon = R.drawable.ic_search, text = "Search"),
                    BottomNavigationItem(icon = R.drawable.ic_bookmark, text = "Bookmark")
                ),
                selected = 0,
                onItemClick = {}
            )

        }
}
=======
)
>>>>>>> origin/main
