package com.my.courses.smack.Model

class Channel(val name : String, val description : String, val id : String) {
    override fun toString(): String {
        return "#$name"
    }
}