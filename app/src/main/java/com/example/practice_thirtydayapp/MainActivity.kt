package com.example.practice_thirtydayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.practice_thirtydayapp.ui.theme.Practice_ThirtyDayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practice_ThirtyDayAppTheme {
                Scaffold (modifier = Modifier.fillMaxSize(),
                    topBar = { TopAppBar(Modifier.padding(WindowInsets.statusBars.asPaddingValues())) }
                ) { innerPadding ->
                    Surface(modifier = Modifier.padding(innerPadding)) {

                    }
                }
            }
        }
    }
}

@Composable
fun TopAppBar(modifier: Modifier = Modifier){
    Row(modifier = modifier
        .fillMaxWidth()
        .background(MaterialTheme.colorScheme.background),
        horizontalArrangement = Arrangement.Center){
        Text(
            text = stringResource(R.string.topbar),
            style = MaterialTheme.typography.displayLarge,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppPreview(){
    Practice_ThirtyDayAppTheme {
        Scaffold (modifier = Modifier.fillMaxSize(),
            topBar = { TopAppBar(Modifier.padding(WindowInsets.statusBars.asPaddingValues())) }
        ) { innerPadding ->
            Surface(modifier = Modifier.padding(innerPadding)) {

            }
        }
    }
}