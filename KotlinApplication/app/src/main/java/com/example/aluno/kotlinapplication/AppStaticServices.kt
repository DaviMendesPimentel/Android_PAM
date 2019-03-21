package com.example.aluno.kotlinapplication

class AppStaticServices {
    companion object{
        public fun login(userStr: String, passStr: String): Boolean{
            return if(userStr.equals("admin") && passStr.equals("admin123")) true else false
        }
    }
}