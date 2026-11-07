package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Email
import androidx.compose.ui.Alignment
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCardApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {
    BusinessCardScreen(
        logo = null,
        fullName = stringResource(R.string.abubakar_nadeem),
        profession = stringResource(R.string.android_developer_extraordinaire),
        phoneIcon = Icons.Default.Phone,
        phoneNum = stringResource(R.string._923174931914),
        shareIcon = Icons.Default.Share,
        shareAddress = "@abubakar_nadeem",
        emailIcon = Icons.Default.Email,
        email = stringResource(R.string.an7907529_gmail_com),
        modifier = modifier
    )
}

@Composable
fun BusinessCardScreen(
    logo: Painter?,
    fullName: String,
    profession: String,
    phoneIcon: ImageVector,
    phoneNum: String,
    shareIcon: ImageVector,
    shareAddress: String,
    emailIcon: ImageVector,
    email: String,
    modifier: Modifier = Modifier
) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(top = 200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Box(
                modifier = modifier.background(color = Color.Green)
                    .height(200.dp).width(200.dp)
                ) {
//                Image(
//                    painter = logo,
//                    contentDescription = null,
//                    modifier = Modifier
//                        .height(150.dp)
//                        .width(150.dp),
//                )
            }
            Text(
                text = fullName,
                fontSize = 30.sp,
                color = Color.White,
                )
            Spacer(modifier = Modifier.height(10.dp)            )
            Text(
                text = profession,
                fontSize = 14.sp,
                color = Color(0xFF2a6047),
                fontWeight = FontWeight.Bold
            )
            Column(modifier = Modifier.padding(top = 200.dp)) {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Icon(
                        imageVector = phoneIcon,
                        contentDescription = null,
                        tint = Color(0xFF2a6047)
                    )
                    Text(
                        text = phoneNum,
                        fontSize = 16.sp,
                        color = Color(0xFF2a6047),
                    )
                }
                Spacer(modifier = Modifier.height(12.dp))

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Icon(
                        imageVector = shareIcon,
                        contentDescription = null,
                        tint = Color(0xFF2a6047)
                    )
                    Text(
                        text = shareAddress,
                        fontSize = 16.sp,
                        color = Color(0xFF2a6047),
                    )
                }
                Spacer(modifier = Modifier.height(12.dp))

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Icon(
                        imageVector = emailIcon,
                        contentDescription = null,
                        tint = Color(0xFF2a6047)
                    )
                    Text(
                        text = email,
                        fontSize = 16.sp,
                        color = Color(0xFF2a6047),
                    )

                }
            }
        }
}