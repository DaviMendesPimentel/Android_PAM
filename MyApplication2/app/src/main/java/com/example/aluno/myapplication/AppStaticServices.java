package com.example.aluno.myapplication;

public final class AppStaticServices {

    public static boolean login(String userStr, String passStr){

        if(userStr.equals("admin") && passStr.equals("admin123"))
            return true;

        return false;
    }
}
