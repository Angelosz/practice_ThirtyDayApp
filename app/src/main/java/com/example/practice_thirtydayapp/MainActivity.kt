package com.example.practice_thirtydayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practice_thirtydayapp.data.HaikuRepository
import com.example.practice_thirtydayapp.model.Haiku
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
                        HaikuCardList(HaikuRepository.haikus)
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

@Composable
fun HaikuCard(cardTitle: String, haiku: Haiku, modifier: Modifier = Modifier){
    Card(modifier = modifier
        .padding(dimensionResource(R.dimen.padding_medium))
        .shadow(6.dp, MaterialTheme.shapes.large)
        .clip(MaterialTheme.shapes.large)
    ) {
        Column {
            Column(modifier = Modifier
                .padding(dimensionResource(R.dimen.padding_medium))
                .fillMaxWidth()
            ) {
                Text(
                    text = cardTitle,
                    style = MaterialTheme.typography.displaySmall
                )
                Text(
                    text = haiku.title,
                    style = MaterialTheme.typography.displayMedium
                )
            }
            Image(
                painter = painterResource(haiku.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(dimensionResource(R.dimen.image_height))
            )
            Text(
                text = haiku.text,
                style = MaterialTheme.typography.labelSmall,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
            )
        }
    }
}

@Composable
fun HaikuCardList(haikus: List<Haiku>, modifier: Modifier = Modifier){
    LazyColumn(modifier = modifier) {
        itemsIndexed(haikus) { day, haiku ->
            HaikuCard(stringResource(R.string.day_of, day + 1), haiku)
        }
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
                HaikuCardList(HaikuRepository.haikus)
            }
        }
    }
}