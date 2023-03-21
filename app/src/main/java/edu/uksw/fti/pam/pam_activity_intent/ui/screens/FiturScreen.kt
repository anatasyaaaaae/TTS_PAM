package edu.uksw.fti.pam.pam_activity_intent.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pam_activity_intent.ui.screens.PromotionItem
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme
import edu.uksw.fti.pam.pam_activity_intent.R



class FiturActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM_Activity_IntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FiturScreen()
                }
            }
        }
    }
}

fun item(function: () -> Unit) {

}

@Composable
fun FiturScreen () {
    Text(
        text = "",
        fontWeight = FontWeight.Bold,
        color = Color.Blue,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    )
    LazyRow(
        /*contentPadding = PaddingValues(horizontal = 0.dp, vertical = 0.dp),
        horizontalArrangement = Arrangement.spacedBy(1.dp),*/
        modifier = Modifier.fillMaxSize(),

    ) {
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.kes),
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.kes),
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.cr),
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.kes),
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.kes),
            )
        }
        item{
            PromotionItem(imagePainter = painterResource(id = R.drawable.kes),
            )
        }

    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    PAM_Activity_IntentTheme {
        FiturScreen()
    }
}