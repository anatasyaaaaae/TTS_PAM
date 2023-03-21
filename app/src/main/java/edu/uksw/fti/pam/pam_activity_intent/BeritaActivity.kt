package edu.uksw.fti.pam.pamactivityintent

import android.icu.number.Scale
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activity_intent.R
import edu.uksw.fti.pam.pam_activity_intent.ui.screens.Fitur
import edu.uksw.fti.pam.pam_activity_intent.ui.screens.Greeting
import edu.uksw.fti.pam.pam_activity_intent.ui.screens.Promo
import edu.uksw.fti.pam.pam_activity_intent.ui.screens.Publik
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme
import kotlinx.coroutines.launch


class BeritaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            PAM_Activity_IntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ){
                    BeritaScreen()
                }
            }
        }
    }
}



@Composable
fun BeritaScreen () {
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ) {
        Column {
            Navbar()
         //  Layout()
            itemUI()
            itemUI2()
            itemUI3()
            itemUI4()
            itemUI5()
            itemUI6()
            itemUI7()
            itemUI8()
        }
    }
}



@Composable
fun Navbar() {

    Row(
        Modifier
            .padding(0.dp)
            .height(80.dp)
            .fillMaxWidth()
    ) {
        TextField(
            value = "",
            onValueChange = {},
            //label = { Text(text = "Hi Anatasya!", fontSize = 12.sp,color = Color.Blue) },
            singleLine = true,
            leadingIcon = {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Image(
                        imageVector = Icons.Rounded.Menu,
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp)
                            .padding(start = 25.dp)
                    )
                }
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.negeri),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)
                            .padding(16.dp)
                    )
                }
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterEnd
                ) {
                    Image(
                        imageVector = Icons.Rounded.Search,
                        contentDescription = null,
                        modifier = Modifier
                            .size(45.dp)
                            .padding(end = 20.dp)
                    )
                }
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                focusedIndicatorColor = Color.Blue,
                unfocusedIndicatorColor = Color.Gray
            ),
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier
                .weight(10f)
                .fillMaxHeight()
        )
    }
}



@Composable
fun itemUI(){
    Card(elevation = 5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(0.dp, 30.dp, 0.dp, 1.dp)
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(painter = painterResource(id = R.drawable.gambar1),
                contentDescription = null,
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .padding(0.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(15.dp)))

            )
            Column(modifier = Modifier
                .padding(start = 16.dp)
            ) {

            }
            Text(text = "RSUP Fatmawati Kembangkan Layanan Unggulan Orthopedi, Berobat Tak Perlu Lagi Keluar Negeri" ,
            fontWeight = FontWeight.Medium
                )
            Text(text = "")
        }

    }
}


@Composable
fun itemUI2(){
    Card(elevation = 5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp)
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(painter = painterResource(id = R.drawable.gambar2),
                contentDescription = null,
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .padding(0.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(15.dp)))

            )
            Column(modifier = Modifier
                .padding(start = 16.dp)
            ) {

            }
            Text(text = "RUU Kesehatan Resmi diberikan Kepada Pemerintah Untuk Dibahas" ,
                fontWeight = FontWeight.Medium
            )
            Text(text = "")
        }

    }
}

@Composable
fun itemUI3(){
    Card(elevation = 5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp)
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(painter = painterResource(id = R.drawable.gambar3),
                contentDescription = null,
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .padding(0.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(15.dp)))

            )
            Column(modifier = Modifier
                .padding(start = 16.dp)
            ) {

            }
            Text(text = "Puskesmas dan Posyandu Prima Untuk Menjaga Masyarakat Tetap Sehat" ,
                fontWeight = FontWeight.Medium
            )
            Text(text = "")
        }

    }
}


@Composable
fun itemUI4(){
    Card(elevation = 5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp)
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(painter = painterResource(id = R.drawable.gambar4),
                contentDescription = null,
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .padding(0.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(15.dp)))

            )
            Column(modifier = Modifier
                .padding(start = 16.dp)
            ) {

            }
            Text(text = "Mpok Darti Jadi Inovasi Cegah Stunting Di Kabupaten Barru Sulsel" ,
                fontWeight = FontWeight.Medium
            )
            Text(text = "")
        }

    }
}

@Composable
fun itemUI5(){
    Card(elevation = 5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp)
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(painter = painterResource(id = R.drawable.gambar5),
                contentDescription = null,
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .padding(0.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(15.dp)))

            )
            Column(modifier = Modifier
                .padding(start = 16.dp)
            ) {

            }
            Text(text = "Pemerintah Antisipasi Penularan Zoonosis dan Infeksi Baru di Indonesia" ,
                fontWeight = FontWeight.Medium
            )
            Text(text = "")
        }

    }
}

@Composable
fun itemUI6(){
    Card(elevation = 5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp)
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(painter = painterResource(id = R.drawable.gambar6),
                contentDescription = null,
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .padding(0.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(15.dp)))

            )
            Column(modifier = Modifier
                .padding(start = 16.dp)
            ) {

            }
            Text(text = "Gejala Penyakit Ginjal Kronis Sering tidak Terasa, Tiba-tiba Stadium 5" ,
                fontWeight = FontWeight.Medium
            )
            Text(text = "")
        }

    }
}

@Composable
fun itemUI7(){
    Card(elevation = 5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp)
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(painter = painterResource(id = R.drawable.gambar7),
                contentDescription = null,
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .padding(0.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(15.dp)))

            )
            Column(modifier = Modifier
                .padding(start = 16.dp)
            ) {

            }
            Text(text = "Kemenkes Tambah Vaksin Indovac untuk Booster ke-2" ,
                fontWeight = FontWeight.Medium
            )
            Text(text = "")
        }

    }
}

@Composable
fun itemUI8(){
    Card(elevation = 5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp)
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(painter = painterResource(id = R.drawable.gambar8),
                contentDescription = null,
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .padding(0.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(15.dp)))

            )
            Column(modifier = Modifier
                .padding(start = 16.dp)
            ) {

            }
            Text(text = "Resmikan Mayapada Hospital Bandung, Presiden Harap Masyaraakat Tak Berobat ke Luar Negeri" ,
                fontWeight = FontWeight.Medium
            )
            Text(text = "")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BeritaActivityPreview() {
    PAM_Activity_IntentTheme{
       BeritaScreen()
    }
}
