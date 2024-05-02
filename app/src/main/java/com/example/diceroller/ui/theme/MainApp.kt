package com.example.diceroller.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diceroller.R
import java.lang.Math.random
import kotlin.random.Random

@Composable


fun MainApp(){

    var imagePlaceHolder by remember {
        mutableIntStateOf(R.drawable.dice_11)
    }
    var Result  by remember{
        mutableStateOf("")
    }



Column {
            Text(text = " Welcome to my App!", modifier = Modifier

                .align(Alignment.CenterHorizontally)
                .padding(top = (80.dp)), fontSize = 34.sp,
                fontWeight = FontWeight.Bold)

    Text(
        text =
                "Click on the Button to Roll the Dice",
        modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(top = (50.dp), bottom = (65.dp)), fontSize = 20.sp,
        fontWeight = FontWeight.Bold


    )

    Image(
        painter = painterResource(id = imagePlaceHolder), contentDescription = null,
        modifier = Modifier.align(Alignment.CenterHorizontally)
    )

    Text(
        text =
        "You got: $Result",
        modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(top = (20.dp), bottom = (20.dp)), fontSize = 20.sp,
        fontWeight = FontWeight.Bold)

                Button(onClick = {
                    var random =Random.nextInt(6)+1
                    Result =random.toString()
                    when(random) {
                        1->imagePlaceHolder= R.drawable.dice_1
                        2->imagePlaceHolder= R.drawable.dice_2
                        3->imagePlaceHolder= R.drawable.dice_3
                        4->imagePlaceHolder= R.drawable.dice_4
                        5->imagePlaceHolder= R.drawable.dice_5
                        6->imagePlaceHolder= R.drawable.dice_6
                    }
                },
                    colors = ButtonDefaults.buttonColors(containerColor = buttonColor),
        modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(30.dp)
        ) {
        Text(text = "Click to Roll Dice" , fontWeight = FontWeight.Bold)


    }

}
}
