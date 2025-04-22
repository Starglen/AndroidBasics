package com.starglen.zawadimart.ui.screens.dashboard

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_ABOUT
import com.navigation.ROUT_HOME
import com.navigation.ROUT_INTENT
import com.navigation.ROUT_ITEM
import com.navigation.ROUT_WELCOME
import com.starglen.zawadimart.R
import com.starglen.zawadimart.ui.theme.neworange
import com.starglen.zawadimart.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize().background(neworange)
    ) {

      //=====BOX====

        Box (){
//----------------------------------
//      CARD
//----------------------------------

            Card (
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomEnd = 30.dp, bottomStart = 30.dp),
                colors = CardDefaults.cardColors(newwhite)
            ){
                TopAppBar(
                    title = { Text(text = "Dashboard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                        }
                    }
                )

            }
//----------------------------------
//     END CARD
//----------------------------------
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(alignment = Alignment.BottomCenter)
                    .height(250.dp)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "img",
                    modifier = Modifier.fillMaxWidth().height(250.dp),
                    contentScale = ContentScale.FillWidth
                )
            }
        }
        //=====END BOX====

        Spacer(modifier = Modifier.height(100.dp))
//=======ROW=======
        Row (){
        //Card One
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(180.dp)
                    .padding(start = 20.dp, end = 20.dp)
                    .clickable{navController.navigate(ROUT_HOME)}
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().background(newwhite),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(R.drawable.home),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.FillWidth
                    )

                    Text(text = "Home", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
                }
            }

            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(180.dp)
                    .padding(start = 20.dp, end = 20.dp)
                    .clickable{navController.navigate(ROUT_WELCOME)}
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().background(newwhite),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(R.drawable.home),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.FillWidth
                    )

                    Text(text = "WelcomeScrn", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
                }
            }
        //Card Two
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(180.dp)
                    .padding(end = 20.dp)
                    .clickable{navController.navigate(ROUT_ITEM)}
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().background(newwhite),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.products),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.FillWidth
                    )

                    Text(text = "Products", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
                }

            }

        }
//======END ROW======
        Spacer(modifier = Modifier.height(20.dp))

        //=======ROW=======
        Row (){
            //Card One
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(180.dp)
                    .padding(start = 20.dp, end = 20.dp)
                    .clickable{navController.navigate(ROUT_INTENT)}
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().background(newwhite),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(R.drawable.contact),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.FillWidth
                    )

                    Text(text = "Contact", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
                }
            }
            //Card Two
            Card(
                modifier = Modifier
                    .width(200.dp)
                    .height(180.dp)
                    .padding(end = 20.dp)
                    .clickable{navController.navigate(ROUT_ABOUT)}
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().background(newwhite),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.FillWidth
                    )

                    Text(text = "About Us", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
                }

            }

        }
//======END ROW======
    }

}


@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}