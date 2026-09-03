package com.example.petshop

class Happy(date:String): Mood(date) {
    override fun moood(): String {
        return "happy!"
    }
}