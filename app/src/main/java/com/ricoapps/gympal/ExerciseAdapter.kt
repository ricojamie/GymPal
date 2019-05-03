package com.ricoapps.gympal

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.muscle_row.view.*

class ExerciseAdapter(private val exercises: MutableList<Exercise>) : RecyclerView.Adapter<ExerciseAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.muscle_row, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount() = exercises.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.muscleName.text = exercises[position].bodyPart

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val muscleName: TextView = itemView.muscleName

    }

}
