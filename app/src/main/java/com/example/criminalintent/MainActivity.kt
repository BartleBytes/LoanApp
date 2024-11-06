package com.example.criminalintent

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Check if this is the first time creating the activity
        if (savedInstanceState == null) {
            // Add the fragment to the container
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, CrimeDetailFragment())
                .commit()
        }
    }
}
