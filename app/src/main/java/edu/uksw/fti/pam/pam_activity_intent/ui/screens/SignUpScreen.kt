package edu.uksw.fti.pam.acitivityintent.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activity_intent.R
import edu.uksw.fti.pam.pam_activity_intent.datastore.StoreUserFirstName
import edu.uksw.fti.pam.pam_activity_intent.datastore.StoreUserLastName
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme
import kotlinx.coroutines.launch

@Composable
fun SignUpForm(
    btnOnClickAction: (String?) -> Unit
) {
    // context
    val context = LocalContext.current
    // scope
    val scope = rememberCoroutineScope()
    // datastore First Name, Last Name
    val dataStore = StoreUserFirstName(context)
    val dataStore1 = StoreUserLastName(context)
    // get saved First Name, Last Name
    val saveFirstName = dataStore.getFirstName.collectAsState(initial = "")
    val saveLastName = dataStore1.getLastName.collectAsState(initial = "")

    var firstnameInput by remember { mutableStateOf("") }
    var lastnameInput by remember { mutableStateOf("") }
    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var confirmpasswordInput by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp)
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = "Sign Up",fontSize=24.sp ,
            modifier = Modifier
                .padding(start = 130.dp, bottom = 15.dp)
        )
        Row {
            TextField(
                modifier = Modifier
                    .width(180.dp)
                    .padding(end = 10.dp)
                    .clip(CircleShape),
                value = firstnameInput,
                onValueChange = {firstnameInput= it},
                label = { Text(text =  "Firts Name")}
            )
            Spacer(modifier = Modifier.weight(1f))
            TextField(
                modifier = Modifier
                    .clip(CircleShape),
                value = lastnameInput,
                onValueChange = {lastnameInput = it},
                label = { Text(text =  "Last Name") },

                )
        }
        TextField(
            value = usernameInput,
            onValueChange = {usernameInput = it},
            label = { Text(text =  "Username") },
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = passwordInput,
            onValueChange = {passwordInput = it},
            label = { Text(text =  "Password") },
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = confirmpasswordInput,
            onValueChange = {confirmpasswordInput = it},
            label = { Text(text =  "Password Confirmation") },
            modifier = Modifier.fillMaxWidth(),
        )
        Button(
            modifier = Modifier
                .padding(start = 250.dp),
            onClick = {
                btnOnClickAction(usernameInput)
                scope.launch {
                    dataStore.saveFirstName(firstnameInput)
                    dataStore1.saveLastName(lastnameInput)
                }
            },
        ) {
            Text(stringResource(R.string.signup))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpFormPreview() {
    PAM_Activity_IntentTheme {
        SignUpForm({})
       }
}