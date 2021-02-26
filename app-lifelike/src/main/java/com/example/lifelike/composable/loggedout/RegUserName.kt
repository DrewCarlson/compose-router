package com.example.lifelike.composable.loggedout

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.lifelike.composable.loggedout.common.RegFlowPanel
import com.example.lifelike.entity.User


interface RegUserName {
    companion object {

        @OptIn(ExperimentalFoundationApi::class)
        @Composable
        fun Content(user: User, onNext: () -> Unit) {
            RegFlowPanel("Your fake name", onNext) {
                BasicTextField(
                    value = TextFieldValue(user.name, TextRange(user.name.length,user.name.length)),
                    onValueChange = { user.name = it.text }
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewRegUserName() {
    RegUserName.Content(User("Test user", "123456"), {})
}
