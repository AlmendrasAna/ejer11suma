package com.example.ejer11suma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main(){

    var num1 = 10
    var num2 = 33
    var num3 = 66

    var resultado = num1 + num2 + num3
    num1 = 50
    println(resultado)
    resultado = num1 + num2 + num3
    println(resultado)
    var promedio = resultado / 3
    println(promedio)

    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        println("Likes to $hobby.")


        if (referrer == null)println("Doesn't have a referrer.")
            else    println("Has a referrer named ${referrer.name}, who likes ${referrer.hobby}.")

    }
}