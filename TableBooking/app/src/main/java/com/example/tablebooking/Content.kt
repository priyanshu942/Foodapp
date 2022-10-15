package com.example.tablebooking

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.tablebooking.ui.theme.Restro

@Composable
fun content(navController: NavHostController)
{
    val navController= rememberNavController()
  Surface(modifier=Modifier.fillMaxSize()) {
      NavHost(navController = navController, startDestination ="Restro" )
      {
       composable("Restro")
       {
           Restro(navController)
       }
          composable("Menu")
          {
              Menu()
          }
      }

  }
}

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItems>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItems) -> Unit
){
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigation(
        modifier = modifier,
        backgroundColor = Color.DarkGray,
        elevation = 5.dp
    ) {
        items.forEach{ item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(selected = selected ,
                onClick = { onItemClick(item)},
                selectedContentColor = Color.Green,
                unselectedContentColor = Color.Gray,
                icon={
                    Column(horizontalAlignment = CenterHorizontally) {
                        Icon(imageVector = item.icon, contentDescription = item.name)
                    }
                    if(selected){
                        Text(text = item.name,
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp)
                    }
                }
            )
        }
    }

}