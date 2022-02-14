package com.janaina.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        Log.i("mainAct", "hello this is my log")

        val sum1 = sum(1, 5)
        val sum2 = sum(5,6,7)
        Log.i("mainAct", "Sum " + sum1 + " and " + sum2)

        

//        val maintextview = findViewById<TextView>(R.id.textView)
//        val num1EditText = findViewById<EditText>(R.id.num1)
//        val num2EditText = findViewById<EditText>(R.id.num2)

        val addButton = findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener {

//           Log.i("mainAct", "num1 " + num1EditText.text.toString())
//           Log.i("mainAct", "num2 " + num2EditText.text.toString())
            val num1Value: Int = Integer.parseInt(num1.text.toString())
            val num2Value: Int = Integer.parseInt(num2.text.toString())

            //maintextview.text = (sum1+sum2).toString()
            val sum: Int = num1Value + num2Value
            maintextview.text = sum.toString()
        }


    }



        fun sum(a: Int, b: Int) : Int{
            return a + b
        }

        fun sum(a: Int, b: Int, c: Int) : Int{
            return a + b + c
        }

    }
