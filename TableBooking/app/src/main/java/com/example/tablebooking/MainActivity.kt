package com.example.tablebooking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.tablebooking.ui.theme.Restro
import com.example.tablebooking.ui.theme.Shapes
import com.example.tablebooking.ui.theme.TableBookingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TableBookingTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                Scaffold(
                    bottomBar = {
                        BottomNavigationBar(items = listOf(
                            BottomNavItems(
                                name = "",
                                route = "book",
                                icon = Icons.Default.Home
                            ),
                            BottomNavItems(
                                name = "",
                                route = "resto",
                                icon = Icons.Default.Menu
                            ),
                            BottomNavItems(
                                name = "",
                                route = "user",
                                icon = Icons.Default.Person
                            )
                        ) , navController = navController ,
                            onItemClick ={
                                navController.navigate(it.route)
                            } )
                    }) {
//                    Greeting("Android")
                    //start()
                    content(navController = navController)

                }
            }
        }
    }
}
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun Greeting(name: String) {
//    //Text(text = "Hello $name!")
//
//}
//}

/*@Composable
fun restro()
{

    }
    */
    
    

/*@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    TableBookingTheme {
//        Greeting("Android")
        //start()
        content()
    }
}*/