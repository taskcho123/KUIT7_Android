package com.example.kuit7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat.enableEdgeToEdge
import com.example.kuit7.ui.theme.KUIT7week1Theme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KUIT7week1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(Modifier
                        .padding(innerPadding)
                        .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            Modifier
                                .size(140.dp)
                                .border(1.dp, Color.Black, RoundedCornerShape(10.dp) )
                                .padding(9.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.image),
                                contentDescription = "프로필 사진",
                                modifier = Modifier.size(40.dp)
                                    .clip(RoundedCornerShape(10.dp))
                            )
                            Column (
                                verticalArrangement = Arrangement.spacedBy(5.dp)
                            ){
                                val textStyle = TextStyle(
                                    fontSize = 8.sp,
                                    platformStyle = PlatformTextStyle(
                                        includeFontPadding = false //폰트 기본 여백 제거
                                    ),
                                )

                                Text(text = "이름: 조은서", style = textStyle, color = Color.Black)
                                Text(text = "학번: 202511033", style = textStyle, color = Color.Black)
                                Text(text = "학과: 컴퓨터공학부", style = textStyle, color = Color.Black)
                                Text(text = "생년월일: 2006/08/02", style = textStyle, color = Color.Black)
                            }
                        }

                    }
                }
            }
        }
    }
}