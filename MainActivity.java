package com.autenticacaoandroid.cursoandroid.admin.autenticacaoandroid;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    
    private FirebaseAuth firebaseAuth ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instancia para o ponto de referencia
        firebaseAuth = FirebaseAuth.getInstance();

        //deslogar usuario
        firebaseAuth.signOut();

        //Veridica usuario logado
        if(firebaseAuth.getCurrentUser() != null){

            Log.i("logOn","usuario logado");
        }else{
            Log.i("logOn","usuario nao logado");
        }



        /**
        //Login
        firebaseAuth.signInWithEmailAndPassword("flaviopw3@gmail.com","EngenhariaUemg")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Log.i("signIn","Logado");
                        }else {
                            Log.i("signIn","Nao Logado");
                        }
                    }
                });
**/
        /**
        //cadsatro
        firebaseAuth.createUserWithEmailAndPassword("flaviopw3@gmail.com", "EngenhariaUemg")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Log.i("UserCreate","usuario cadastrado");
                        }else {
                            Log.i("UserCreate","usuario nao cadastrado");
                        }
                    }
                });
**/
    }
}
