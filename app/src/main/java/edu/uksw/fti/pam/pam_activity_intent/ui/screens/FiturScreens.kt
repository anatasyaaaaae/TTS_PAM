package edu.uksw.fti.pam.pam_activity_intent.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activity_intent.ui.screens.PromotionItem
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme
import edu.uksw.fti.pam.pam_activity_intent.R


@Composable
fun FiturScreens(){
    Column(modifier = Modifier.padding(5.dp)) {
       Card(
           modifier = Modifier
               .padding(10.dp)
               .fillMaxWidth()
               .shadow(5.dp)
               .verticalScroll(rememberScrollState())
       ) {
           Image(painter = painterResource(id = R.drawable.tes1), contentDescription = null )
           Text(
                text = "Layanan satset di SATUSEHAT Mobile!", style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(15.dp),
                color = Color.DarkGray,
               fontWeight = FontWeight.Bold,
                fontSize = 25.sp)
           Text(
               text = "Bisa ngapain aja sih?", style = MaterialTheme.typography.body1,
               modifier = Modifier.padding(start = 16.dp, top = 75.dp),
               color = Color.DarkGray,
               fontSize = 15.sp)
       }

        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .shadow(5.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Image(painter = painterResource(id = R.drawable.tes2), contentDescription = null )
            Text (
                text = "Makin Cepat" ,
                 modifier = Modifier.padding(15.dp),
                 color = Color.DarkGray,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp)
            Text(
                text = "Ambil nomor antrian di fasilitas kesehatan terdekat lewat aplikasi SATUSEHAT", style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(start = 16.dp, top = 45.dp),
                color = Color.DarkGray,
                fontSize = 15.sp)
        }
        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .shadow(5.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Image(painter = painterResource(id = R.drawable.tes3), contentDescription = null )
            Text (
                text = "Makin Informatif" +
                        " ",
                modifier = Modifier.padding(15.dp),
                color = Color.DarkGray,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp)
            Text(
                text = "Kenali lebih baik kesehatan Anda di SATUSEHAT! Semua riwayat kesehatan dapat diakses dan digunakan untuk menjaga kesehatan Anda.", style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(start = 16.dp, top = 45.dp),
                color = Color.DarkGray,
                fontSize = 15.sp)
        }
        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .shadow(5.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Image(painter = painterResource(id = R.drawable.tes4), contentDescription = null )
            Text (
                text = "Makin Praktis" ,
                modifier = Modifier.padding(15.dp),
                color = Color.DarkGray,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp)
            Text(
                text = "Tanpa perlu membwa banyak dokumen fisik, semua rekam medis Anda dan keluarga tersedia dalam satu aplikasi.", style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(start = 16.dp, top = 45.dp),
                color = Color.DarkGray,
                fontSize = 15.sp)
        }
        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .shadow(5.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Image(painter = painterResource(id = R.drawable.tes5), contentDescription = null )
            Text (
                text = "Makin Aman" ,
                modifier = Modifier.padding(15.dp),
                color = Color.DarkGray,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp)
            Text(
                text = "Data rekam medis Anda terjamin kerahasiaanya! Semua data hanya dapat ditukarkan antar fasilitas kesehatan dengan izin Anda.", style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(start = 16.dp, top = 45.dp),
                color = Color.LightGray,
                fontSize = 15.sp)
        }
        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .shadow(5.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Image(painter = painterResource(id = R.drawable.tes6), contentDescription = null )
            Text (
                text = "#MakinSehat dengan SATUSEHAT" +
                        " ",
                modifier = Modifier.padding(15.dp),
                color = Color.DarkGray,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp)
            Text(
                text = "Rekam medis, riwayat vaksin, artikel kesehatan, sampai pengingat minum obat semua tersedia di SATUSEHAT!", style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(start = 16.dp, top = 45.dp),
                color = Color.DarkGray,
                fontSize = 15.sp)
        }
         }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    PAM_Activity_IntentTheme {
        FiturScreens()
    }
}