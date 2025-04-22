package com.starglen.zawadimart.ui.screens.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_FORM
import com.navigation.ROUT_HOME
import com.navigation.ROUT_ITEM
import com.starglen.zawadimart.R
import com.starglen.zawadimart.ui.theme.grey
import com.starglen.zawadimart.ui.theme.neworange
import com.starglen.zawadimart.ui.theme.newwhite

@Composable
fun LoginScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {

         Box() {
            Image(
                painter = painterResource(id = R.drawable.img_10),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Card(
                modifier = Modifier.fillMaxWidth().fillMaxHeight().offset(y = 400.dp),
                shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp),
                colors = CardDefaults.cardColors(newwhite),
            ) {
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "The Most Worth",
                    color = neworange,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                    )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Grocery App",
                    color = neworange,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                )

                Spacer(modifier = Modifier.height(10.dp))
                var username by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }

                OutlinedTextField(
                    value = username,
                    onValueChange = {username = it},
                    shape = RoundedCornerShape(25.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                    label = {Text(text = "Username")},
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = neworange,
                        focusedBorderColor = Color.Gray,
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),

                )
                //end User name

                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = {password = it},
                    shape = RoundedCornerShape(25.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                    label = {Text(text = "password")},
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = neworange,
                        focusedBorderColor = Color.Gray,
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation()
                )
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = {
                        navController.navigate(ROUT_ITEM)
                    },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(neworange),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
                )
                {
                    Text(text = "Sign Up")
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row (){
                    Text(text = "Create new account?", textAlign = TextAlign.Center)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Sign in",
                        color = neworange,
                        modifier = Modifier
                            .clickable{navController.navigate(ROUT_FORM)}
                    )
                }

            }
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())
}