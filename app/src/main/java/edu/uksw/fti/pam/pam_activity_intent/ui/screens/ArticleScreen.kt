package edu.uksw.fti.pam.pam_activity_intent

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            PAM_Activity_IntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ){
                    ArticleScreen()
                }
            }
        }
    }
}

@Composable
fun ArticleScreen () {
    Box(modifier = Modifier
        .background(Color.White)
        .verticalScroll(rememberScrollState())
        .fillMaxSize()

    ) {
        Column {
            Textprofile()
            AtasProfil()
            Kartu()
            Informasi()
            Infoumum()
            Infoumum2()
            Infoumum3()
            Preferensi()
            Pref1()
            Pref2()
        }
    }
}

@Composable
fun Textprofile(){
    Text(
        text = "Profil",
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)
    )
}

@Composable
fun AtasProfil() {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .background(Color.Black), // ubah warna background di sini
            elevation = 5.dp
        ) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                imageVector = Icons.Outlined.AccountCircle,
                contentDescription = "",
                modifier = Modifier
                    .padding(10.dp)
                    .height(50.dp)
                    .width(50.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(5.dp)))
            )
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Anatasya Lingkanwene")
                    Image(
                        painter = painterResource(R.drawable.edit),
                        contentDescription = "Ini adalah gambar",
                        modifier = Modifier
                            .padding(start = 50.dp, top = 20.dp)
                            .width(30.dp)
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.telepon),
                        contentDescription = "",
                        modifier = Modifier
                            .size(ButtonDefaults.IconSize)
                    )
                    Text(text = "  628525546787", style = MaterialTheme.typography.body1)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.nik),
                        contentDescription = "",
                        modifier = Modifier.size(ButtonDefaults.IconSize)
                    )
                    Text(text = "  7174110199900001", style = MaterialTheme.typography.body1)
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.qr),
                        contentDescription = "Ini adalah gambar",
                        modifier = Modifier.size(22.dp)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        "Kode QR Profil",
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                    )
                    Image(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "Ini adalah gambar",
                        modifier = Modifier.size(32.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Kartu(color: Color = Color.Blue) {
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
    )
    {
            Column {
                Text(text = "Kartu Status Vaksin dan", style = MaterialTheme.typography.body1, color = Color.White)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Hasil Test Covid-19", style = MaterialTheme.typography.body1, color = Color.White)
                Spacer(modifier = Modifier
                    .height(15.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "ANATASYA LINGKANWENE ERING",
                        color = Color.White,
                        modifier = Modifier
                            .weight(1f) // memberikan bobot agar teks mengambil sebagian besar baris
                    )
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = null
                    )
                }
            }
        }
}


@Composable
fun Informasi(){
    Text(
        text = "Informasi Umum",
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)
    )
}

@Composable
fun Infoumum() {
    Card(
        modifier = Modifier.padding(10.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.user),
                    modifier = Modifier.size(ButtonDefaults.IconSize),
                    contentDescription = "Deskripsi ikon kiri"

                )
                Text(
                    text = "   Profil Tertaut",
                    modifier = Modifier.weight(1f) // memberikan bobot agar teks mengambil sebagian besar baris
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Deskripsi ikon kanan"
                )
            }
        }
    }
}

@Composable
fun Infoumum2() {
    Card(
        modifier = Modifier.padding(10.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.faq),
                    modifier = Modifier.size(ButtonDefaults.IconSize),
                    contentDescription = "Deskripsi ikon kiri"
                )
                Text(
                    text = "   FAQ",
                    modifier = Modifier.weight(1f) // memberikan bobot agar teks mengambil sebagian besar baris
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Deskripsi ikon kanan"
                )
            }
        }
    }
}

@Composable
fun Infoumum3() {
    Card(
        modifier = Modifier.padding(10.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.info),
                    modifier = Modifier.size(ButtonDefaults.IconSize),
                    contentDescription = "Deskripsi ikon kiri"
                )
                Text(
                    text = "   Tentang",
                    modifier = Modifier.weight(1f) // memberikan bobot agar teks mengambil sebagian besar baris
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Deskripsi ikon kanan"
                )
            }
        }
    }
}

@Composable
fun Preferensi(){
    Text(
        text = "Preferensi",
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)
    )
}

@Composable
fun Pref1() {
    Card(
        modifier = Modifier.padding(10.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.language),
                    modifier = Modifier.size(ButtonDefaults.IconSize),
                    contentDescription = "Deskripsi ikon kiri"
                )
                Text(
                    text = "   Bahasa",
                    modifier = Modifier.weight(1f) // memberikan bobot agar teks mengambil sebagian besar baris
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Deskripsi ikon kanan"
                )
            }
        }
    }
}

@Composable
fun Pref2() {
    Card(
        modifier = Modifier.padding(10.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.logout),
                    modifier = Modifier.size(ButtonDefaults.IconSize),
                    contentDescription = "Deskripsi ikon kiri"
                )
                Text(
                    text = "   Keluar",
                    modifier = Modifier.weight(1f) // memberikan bobot agar teks mengambil sebagian besar baris
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Deskripsi ikon kanan"
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAM_Activity_IntentTheme {
        ArticleScreen()
    }
}