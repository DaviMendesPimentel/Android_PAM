package com.example.aluno.firebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    lateinit var btnSignUp: Button
    lateinit var btnLogin: Button
    lateinit var lbEmailDoUsuarioLogado: TextView
    lateinit var fbAuth: FirebaseAuth
    lateinit var txtEmail: EditText
    lateinit var txtPass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.lbEmailDoUsuarioLogado = findViewById<TextView>(R.id.lbEmailDoUsuarioLogado)
        this.fbAuth = FirebaseAuth.getInstance()
        this.txtEmail = findViewById<EditText>(R.id.txtEmail)
        this.txtPass = findViewById<EditText>(R.id.txtPass)
        this.btnSignUp = findViewById<Button>(R.id.btnSignUp)
        this.btnLogin = findViewById<Button>(R.id.btnLogin)


        btnLogin.setOnClickListener {
            signUp()
        }
    }

    public override fun onStart(){
        super.onStart()

        val currentUser = this.fbAuth.currentUser
        updateUI(currentUser);
    }

    private fun updateUI(user: FirebaseUser?){
        if(user != null)
            this.lbEmailDoUsuarioLogado.text = user.email
        else this.lbEmailDoUsuarioLogado.text = "Nenhum Usuario Logado"
    }

    private fun signUp(){
        this.fbAuth.createUserWithEmailAndPassword(this.txtEmail.toString(), this.txtPass.toString())
                .addOnCompleteListener(this){task ->
                    if(task.isSuccessful){
                        toast("Sucess")
                        val user = fbAuth.currentUser
                        updateUI(user)
                    }
                    else {
                        toast("Failure")
                        toast("Autentication Fail")
                        updateUI(null)
                    }
                }
    }
}
