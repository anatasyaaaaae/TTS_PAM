package edu.uksw.fti.pam.pam_activity_intent.ui.screens

import android.util.Log
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import com.google.common.util.concurrent.ListenableFuture
import edu.uksw.fti.pam.pam_activity_intent.BarCodeAnalyser
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.Teal200
import edu.uksw.fti.pam.pam_activity_intent.R
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors


@Composable
fun HomeScreen () {
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
    ) {
        Column {
            //NavbarAtas()
            Greeting(name = "Anatasya Lingkanwene")
            Publik()
            Fitur()
            Promo()
        }
    }
}

@Composable
fun Publik(color: Color = Color.White) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .shadow(1.dp)
            .padding(horizontal = 15.dp, vertical = 25.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text("Masuk Ke Ruang Publik?", style = TextStyle(fontSize = 16.sp, color = Color.Black))
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.setting), // sumber gambar
                    contentDescription = null, // deskripsi konten
                    modifier = Modifier.size(20.dp) // ukuran gambar
                )
                Text(
                    text = "Atur Check-in",
                    modifier = Modifier.padding(start = 8.dp) // jarak antara gambar dan teks
                )
            }
        }
        Button(onClick = {}) {
            Icon(painter = painterResource(id = R.drawable.scanner),
                contentDescription = "",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Check-in")
           // CameraPreview()
        }
    }
}


@Composable
fun Promo () {
    Text(
        text = "",
        fontWeight = FontWeight.Bold,
        color = Color.Blue,
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)
    )
    LazyRow(
        Modifier.height(180.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.iklan1),
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.iklan2),
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.iklan3),
            )
        }
    }
}


@Composable
fun PromotionItem(
    backgroundColor: Color = Color.Transparent,
    imagePainter: Painter
) {
    Card(
        Modifier.width(300.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = backgroundColor,
        elevation = 0.dp
    ) {
        Row {
            Image(
                painter = imagePainter, contentDescription = "",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                alignment = Alignment.CenterEnd,
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun Fitur () {
    Text(
        text = "Fitur",
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 5.dp)
    )
    Column(Modifier.padding(horizontal = 0.dp)) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.reme),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(115.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.vi),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(100.dp)
                    .clickable { "" }
            )
                Image(
                    painter = painterResource(id = R.drawable.ht),
                    contentDescription = "Fitur",
                    modifier = Modifier
                        .size(100.dp)
                        .clickable { "" }
                )
                Image(
                    painter = painterResource(id = R.drawable.cr),
                    contentDescription = "Fitur",
                    modifier = Modifier
                        .size(110.dp)
                        .clickable { "" }
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pk),
                    contentDescription = "Fitur",
                    modifier = Modifier
                        .size(100.dp)
                        .clickable { "" }
                )
        }
    }
}



@Composable
fun Greeting(name: String) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(17.dp)
        ) {
            Column() {
                Text(
                    text = " Halo, $name",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )

            }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAM_Activity_IntentTheme {
        HomeScreen()
    }
}