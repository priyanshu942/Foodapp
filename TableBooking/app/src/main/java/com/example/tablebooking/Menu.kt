package com.example.tablebooking

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Menu()
{
    Column() {


        Card(elevation = 43.dp, modifier = Modifier.clip(RoundedCornerShape(30.dp))) {


            Row()
            {
                Image(
                    painter = painterResource(id = R.drawable.bir),
                    contentDescription = "biryani"
                )
                Text(text = "Chicken Tikka " +
                        "\n Biryani", fontSize = 24.sp)

            }

        }
        Card(elevation = 40.dp, modifier = Modifier.clip(RoundedCornerShape(30.dp))) {


            Row()
            {
                Image(
                    painter = painterResource(id = R.drawable.k),
                    contentDescription = "Kebab"
                )
                Text(text = "Chicken Kebab", fontSize = 24.sp)

            }

        }
        Card(elevation = 37.dp, modifier = Modifier.clip(RoundedCornerShape(30.dp))) {


            Row()
            {
                Image(
                    painter = painterResource(id = R.drawable.p),
                    contentDescription = "Panner"
                )
                Text(text = "Panner Makani", fontSize = 24.sp)

            }

        }
    }
}