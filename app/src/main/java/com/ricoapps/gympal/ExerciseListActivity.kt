package com.ricoapps.gympal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_exercise_list.*

class ExerciseListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_list)

        val exercises = mutableListOf<Exercise>()
        for (i in 0..10) {
            exercises.add(Exercise("Biceps", "Barbell Curl", "Barbell"))
        }

        muscleRecyclerView.apply{
            layoutManager = LinearLayoutManager(this@ExerciseListActivity)
            adapter = ExerciseAdapter(exercises)
        }
    }
}
