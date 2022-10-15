package com.example.tablebooking.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.tablebooking.R

@Composable
fun Restro(navController: NavController? = null)
{
    Column()
    {
        Row()
        {

            Image(painter = painterResource(id = R.drawable.bir1), contentDescription = "biryani ")
            Column()
            {
                Text(text = "Anna Biryani", fontSize = 34.sp)
                Button(onClick = { navController?.navigate("Menu")},
                modifier = Modifier.clip(RoundedCornerShape(10.dp)).clickable { navController?.navigate("Menu") })
                {
                    Text(text = "-->")


                }
            }
        }
        Row()
        {

            Image(painter = painterResource(id = R.drawable.k), contentDescription = "Kebab ")
            Column()
            {
                Text(text = "Kebab Corner", fontSize = 34.sp)
                Button(onClick = { navController?.navigate("Menu")},
                    modifier = Modifier.clip(RoundedCornerShape(10.dp)).clickable{ navController?.navigate("Menu") })
                {
                    Text(text = "-->")


                }
            }
        }
        Row()
        {

            Image(painter = painterResource(id = R.drawable.p), contentDescription = "Panner Makani ")
            Column()
            {
                Text(text = "Lemon Tree", fontSize = 34.sp)
                Button(onClick = { navController?.navigate("Menu")},
                    modifier = Modifier.clip(RoundedCornerShape(10.dp)).clickable{ navController?.navigate("Menu") })
                {
                    Text(text = "-->")


                }
            }
        }
    }
}