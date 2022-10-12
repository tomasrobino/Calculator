package com.tutorial.calculator

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

fun String.myIsDigitsOnly() = all(Char::isDigit) && isNotEmpty()

class MainActivity : AppCompatActivity() {

    private var superList :MutableList<String> = mutableListOf()
    private var realString = "0"
    private var mappingList :MutableList<Char> = mutableListOf()
    private var doneCalculation = false
    private var charPressed :Char? = null

    override fun onCreate(savedInstanceState :Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView :TextView = findViewById(R.id.textView)
        val btn1 :Button = findViewById(R.id.button1)
        val btn3 :Button = findViewById(R.id.button3)
        val btn4 :Button = findViewById(R.id.button4)
        val btn5 :Button = findViewById(R.id.button5)
        val btn6 :Button = findViewById(R.id.button6)
        val btn7 :Button = findViewById(R.id.button7)
        val btn8 :Button = findViewById(R.id.button8)
        val btn9 :Button = findViewById(R.id.button9)
        val btn10 :Button = findViewById(R.id.button10)
        val btn11 :Button = findViewById(R.id.button11)
        val btn12 :Button = findViewById(R.id.button12)
        val btn13 :Button = findViewById(R.id.button13)
        val btn14 :Button = findViewById(R.id.button14)
        val btn15 :Button = findViewById(R.id.button15)
        val btn16 :Button = findViewById(R.id.button16)
        val btn17 :Button = findViewById(R.id.button17)
        val btn18 :Button = findViewById(R.id.button18)
        val btn19 :Button = findViewById(R.id.button19)
        val btn20 :Button = findViewById(R.id.button20)

        textView.movementMethod = ScrollingMovementMethod()

        btn1.setOnClickListener() {
            textView.text = "0"
            realString = "0"
            superList = mutableListOf()
            mappingList = mutableListOf()
        }

        btn3.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                charPressed = 's'
                superList = mutableListOf()
                mappingList = mutableListOf()
            }

            if (realString!="") {
                superList.add(realString)
            }
            superList.add("%")
            textView.append("%")
            realString = ""
        }

        btn4.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                charPressed = 's'
                superList = mutableListOf()
                mappingList = mutableListOf()
            }

            if (realString!="") {
                superList.add(realString)
            }
            superList.add("/")
            textView.append("/")
            realString = ""
        }

        btn5.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                superList = mutableListOf()
                mappingList = mutableListOf()
                textView.text="0"
                charPressed = 'n'
                realString = ""
            }

            if (textView.length() == 1 && textView.text.toString().toInt() == 0) {
                textView.text = "1"
            } else {
                textView.append("1")
            }
            realString += "1"
        }

        btn6.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                superList = mutableListOf()
                mappingList = mutableListOf()
                textView.text="0"
                charPressed = 'n'
                realString = ""
            }

            if (textView.length()==1 && textView.text.toString().toInt()==0) {
                textView.text="2"
            } else {
                textView.append("2")
            }
            realString += "2"
        }

        btn7.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                superList = mutableListOf()
                mappingList = mutableListOf()
                textView.text="0"
                charPressed = 'n'
                realString = ""
            }

            if (textView.length()==1 && textView.text.toString().toInt()==0) {
                textView.text="3"
            } else {
                textView.append("3")
            }
            realString += "3"
        }

        btn8.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                charPressed = 's'
                superList = mutableListOf()
                mappingList = mutableListOf()
            }

            if (realString!="") {
                superList.add(realString)
            }
            superList.add("*")
            textView.append("*")
            realString = ""

        }

        btn9.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                superList = mutableListOf()
                mappingList = mutableListOf()
                textView.text="0"
                charPressed = 'n'
                realString = ""
            }

            if (textView.length()==1 && textView.text.toString().toInt()==0) {
                textView.text="4"
            } else {
                textView.append("4")
            }
            realString += "4"
        }

        btn10.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                superList = mutableListOf()
                mappingList = mutableListOf()
                textView.text="0"
                charPressed = 'n'
                realString = ""
            }

            if (textView.length()==1 && textView.text.toString().toInt()==0) {
                textView.text="5"
            } else {
                textView.append("5")
            }
            realString += "5"
        }

        btn11.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                superList = mutableListOf()
                mappingList = mutableListOf()
                textView.text="0"
                charPressed = 'n'
                realString = ""
            }

            if (textView.length()==1 && textView.text.toString().toInt()==0) {
                textView.text="6"
            } else {
                textView.append("6")
            }
            realString += "6"
        }

        btn12.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                charPressed = 's'
                superList = mutableListOf()
                mappingList = mutableListOf()
            }

            if (realString!="") {
                superList.add(realString)
            }
            superList.add("-")
            textView.append("-")
            realString = ""
        }

        btn13.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                superList = mutableListOf()
                mappingList = mutableListOf()
                textView.text="0"
                charPressed = 'n'
                realString = ""
            }

            if (textView.length()==1 && textView.text.toString().toInt()==0) {
                textView.text="7"
            } else {
                textView.append("7")
            }
            realString += "7"
        }

        btn14.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                superList = mutableListOf()
                mappingList = mutableListOf()
                textView.text="0"
                charPressed = 'n'
                realString = ""
            }

            if (textView.length()==1 && textView.text.toString().toInt()==0) {
                textView.text="8"
            } else {
                textView.append("8")
            }
            realString += "8"

        }

        btn15.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                superList = mutableListOf()
                mappingList = mutableListOf()
                textView.text="0"
                charPressed = 'n'
                realString = ""
            }

            if (textView.length()==1 && textView.text.toString().toInt()==0) {
                textView.text="9"
            } else {
                textView.append("9")
            }
            realString += "9"
        }

        btn16.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                charPressed = 's'
                superList = mutableListOf()
                mappingList = mutableListOf()
            }

            if (realString!="") {
                superList.add(realString)
            }
            superList.add("+")
            textView.append("+")
            realString = ""
        }

        btn17.setOnClickListener() {
            if (doneCalculation && charPressed == null) {
                superList = mutableListOf()
                mappingList = mutableListOf()
                textView.text="0"
                charPressed = 'n'
                realString = ""
            }

            textView.append("0")
            realString += "0"
        }

        btn18.setOnClickListener() {
            textView.append(".")
            realString += "."
        }

        btn19.setOnClickListener() {
            if (textView.text.length > 1) {
                textView.text = textView.text.dropLast(1)
            } else {
                textView.text = "0"
            }

            try {
                if (mappingList.last() == 's' || (mappingList.last() == 'n' && superList.last().length == 1)) {
                    mappingList.removeLastOrNull()
                    superList.removeLastOrNull()
                } else if (mappingList.last() == 'n' && superList.last().length > 1) {
                    superList.last().dropLast(1)
                }
            } catch (exception :java.util.NoSuchElementException) {

            }
        }

        btn20.setOnClickListener() {
            if (realString.myIsDigitsOnly()) {
                superList.add(realString)
            }
            Log.i("mappingList pre-mapping", mappingList.toString())
            mapping()
            Log.i("realString", realString)
            Log.i("superList", superList.toString())
            Log.i("mappingList", mappingList.toString())
            operate()
            Log.i("realString 1", realString)
            Log.i("superList 1", superList.toString())
            Log.i("mappingList 1", mappingList.toString())
            if (superList.size>=1) {
                val result = superList[0]
                textView.text = result
                realString = result
            }
            doneCalculation = true
            charPressed=null
        }
    }

    private fun mapping() {
        for (i in 0 until superList.size) {
            if (!superList[i].contains('*') && !superList[i].contains('%') && !superList[i].contains('/') && !superList[i].contains('+') && !superList[i].contains('-')) {
                mappingList.add('n')
            } else if (superList[i].contains('*') || superList[i].contains('%') || superList[i].contains('/') || superList[i].contains('+') || superList[i].contains('-')) {
                mappingList.add('s')
            }
            //Log.i("mapping() superList[i]", mappingList[i].toString())
        }
    }

    private fun operate() {
        try {
            if (mappingList.size == 1 && mappingList[0] == 's') {
                //throw Exception("SYMBOL ERROR: Lone symbol")
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show()
            } else if (mappingList.size == 0) {

            }

            for (i in 0 until mappingList.size - 1) {
                if (mappingList[i] == 's' && mappingList[i + 1] == 's') {
                    if (superList[i + 1] == "/" || superList[i + 1] == "*" || superList[i + 1] == "%") {
                        //throw Exception("SYMBOL ERROR: There is no valid calculation with two adjacent symbols when the second one is either / or *")
                        Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show()
                    } else if (superList[i] == "/" || superList[i] == "*" || superList[i] == "%") {
                        //Start from second symbol
                        while (i + 1 < superList.size && (superList[i + 1] == "+" || superList[i + 1] == "-")) {
                            if (superList.size >= i + 1 && (superList[i + 2] == "+" || superList[i + 2] == "-")) {
                                superList[i + 1] = superList[i + 1] + "0"
                                superList[i + 2] = superList[i + 2] + "0"
                                superList[i + 1] = superList[i + 1] + superList[i + 2]
                                superList.removeAt(i + 2)
                            }
                        }
                    } else {
                        //Start from first symbol
                    }
                }
            }

            while (superList.size > 1) {
                if (mappingList[0] == 'n') {
                    if (mappingList[2] == 'n') {
                        symbolWhen(0)
                    } else if (superList[2] == "+" || superList[2] == "-") {
                        if (mappingList.size > 3 && mappingList[3] == 'n') {
                            if (superList[2] == "+" || superList[2] == "-") {
                                superList[2] = (superList[2] + superList[3]).toDouble().toString()
                                superList.removeAt(3)
                                mappingList[2] = 's'
                                mappingList.removeAt(3)
                                symbolWhen(0)
                            } else {
                                //throw Exception("SYMBOL ERROR: Invalid symbol")
                                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show()
                            }
                        } else {
                            //throw Exception("SYMBOL ERROR: No number to use i+2 symbol with")
                            Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show()
                        }
                    }
                } else if (superList[0] == "+" || superList[0] == "-") {
                    if (mappingList[1] == 'n') {
                        superList[0] = (superList[0] + superList[1]).toDouble().toString()
                        superList.removeAt(1)
                        mappingList[0] = 's'
                        mappingList.removeAt(1)
                    }
                } else {
                    //throw Exception("SYMBOL ERROR: Invalid symbol with which to start calculation")
                    Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show()
                }
            }
        } catch (e :java.lang.NumberFormatException) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show()
            val textView :TextView =findViewById(R.id.textView)
            textView.text = "0"
            realString = "0"
            superList = mutableListOf()
            mappingList = mutableListOf()
        }
    }

    private fun symbolWhen(firstNumberIndex :Int) {
        when (superList[firstNumberIndex+1]) {
            "+" -> {
                if (firstNumberIndex == 0) {
                    orderCalculations()
                }
                superList[firstNumberIndex] = (superList[firstNumberIndex].toDouble() + superList[firstNumberIndex+2].toDouble()).toString()
            }
            "-" -> {
                if (firstNumberIndex == 0) {
                    orderCalculations()
                }
                superList[firstNumberIndex] = (superList[firstNumberIndex].toDouble() - superList[firstNumberIndex+2].toDouble()).toString()
            }
            "/" -> {
                superList[firstNumberIndex] = (superList[firstNumberIndex].toDouble() / superList[firstNumberIndex+2].toDouble()).toString()
            }
            "*" -> {
                superList[firstNumberIndex] = (superList[firstNumberIndex].toDouble() * superList[firstNumberIndex+2].toDouble()).toString()
            }
            "%" -> {
                superList[firstNumberIndex] = ((superList[firstNumberIndex].toDouble() / 100) * superList[firstNumberIndex+2].toDouble()).toString()
            }
        }
        superList.removeAt(firstNumberIndex+1)
        superList.removeAt(firstNumberIndex+1)
        mappingList.removeAt(firstNumberIndex+1)
        mappingList.removeAt(firstNumberIndex+1)
    }
    
    private fun orderCalculations() {
        //Check for * or /
        if (superList.size > 3) {
            if (superList[3] == "*" || superList[3] == "/" || superList[3] == "%") {
                symbolWhen(2)
            }
        }
    }
}