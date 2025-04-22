package com.starglen.zawadimart.ui.screens.cryptoassg

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_HOME
import com.starglen.zawadimart.R
import com.starglen.zawadimart.ui.theme.blue
import com.starglen.zawadimart.ui.theme.green
import com.starglen.zawadimart.ui.theme.grey
import com.starglen.zawadimart.ui.theme.newwhite
import com.starglen.zawadimart.ui.theme.row3

@Composable
fun WelcomeScreen(navController: NavController){
    //==================================================
    //             MAIN COLUMN
    //==================================================
    Column (modifier = Modifier.fillMaxSize(),
        ) {
        Row(modifier = Modifier.padding(top = 50.dp, start = 50.dp),
            verticalAlignment = Alignment.CenterVertically)
        {
            Column() {
                Text(text = "Hi Samantha", fontSize = 30.sp, fontWeight = FontWeight.ExtraBold)
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = "Here are your projects", fontSize = 15.sp)
            }
            //add image
            Image(
                painter = painterResource(R.drawable.crypto),
                contentDescription = "img",
                modifier = Modifier.size(300.dp).padding(start = 30.dp),

            )

            //add image
        }

        Spacer(modifier = Modifier.height(50.dp))
        //Rectangle cards
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Card(
                modifier = Modifier
                    .width(300.dp)
                    .height(450.dp)
                    .padding(start = 20.dp, end = 20.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().background(blue).padding(20.dp),
                    verticalArrangement = Arrangement.Center,


                    ) {
                    Image(
                        painter = painterResource(R.drawable.img_5),
                        contentDescription = "img",
                        modifier = Modifier.width(200.dp).clip(shape = RoundedCornerShape(10.dp))
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = "Cryptocurrency",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = (newwhite)
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Landing Page",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = (newwhite)
                    )
                }
            }

            Card(
                modifier = Modifier
                    .width(300.dp)
                    .height(450.dp)
                    .padding(start = 20.dp, end = 20.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().background(green).padding(20.dp),
                    verticalArrangement = Arrangement.Center,


                    ) {
                    Image(
                        painter = painterResource(R.drawable.img_6),
                        contentDescription = "img",
                        modifier = Modifier.width(200.dp).clip(shape = RoundedCornerShape(10.dp))
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = "Statistics",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = (newwhite)
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Dashboard",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = (newwhite)
                    )
                }
            }

            Card(
                modifier = Modifier
                    .width(300.dp)
                    .height(450.dp)
                    .padding(start = 20.dp, end = 20.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().background(row3).padding(20.dp),
                    verticalArrangement = Arrangement.Center,


                    ) {
                    Image(
                        painter = painterResource(R.drawable.home),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.FillWidth
                    )

                    Text(
                        text = "Crypto",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = (newwhite)
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "BitCoin Mining",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = (newwhite)
                    )
                }
            }

        }

        //=====BOX====
        Spacer(modifier = Modifier.height(100.dp))
        Box() {
            Card(
                modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                shape = RoundedCornerShape(topEnd = 10.dp, topStart = 10.dp),
                colors = CardDefaults.cardColors(grey)
            ) {

            }
            Spacer(modifier = Modifier.height(20.dp))

            Column(modifier = Modifier.padding(20.dp)) {
                Text(text = "Personal Tasks", fontSize = 20.sp, fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier.height(30.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(10.dp)
                        ) {
                        Image(
                            painter = painterResource(R.drawable.img_8),
                            contentDescription = "img",
                            modifier = Modifier.size(80.dp),
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Column {
                            Text(text = "NDA Review for website project", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = "Today - 10pm")
                        }

                    }
                }

                Spacer(modifier = Modifier.height(25.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_7),
                            contentDescription = "img",
                            modifier = Modifier.size(80.dp),
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Column {
                            Text(text = "Email Reply for Green Project", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = "Today - 10pm")
                        }

                    }
                }

            }

        }


    }

}


@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview(){
    WelcomeScreen(rememberNavController())
}