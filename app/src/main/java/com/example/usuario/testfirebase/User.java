package com.example.usuario.testfirebase;

/**
 * Created by usuario on 09/09/2017.
 */

/**
 * Created by Ravi Tamada on 07/10/16.
 * www.androidhive.info
 */

//@IgnoreExtraProperties
public class User {

    public String name;
    public String email;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}