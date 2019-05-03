package com.ricoapps.gympal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        new_workout.setOnClickListener {
            val intent = Intent(this, ExerciseListActivity::class.java)
            startActivity(intent)
        }

    }
}
