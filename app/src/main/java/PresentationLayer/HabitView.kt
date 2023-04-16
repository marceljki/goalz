package PresentationLayer

import Utils.Habit
import Utils.IntentNames
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.goalz.R

class HabitView : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habit)
        val habitNameTextView: TextView = findViewById(R.id.habitName)
        val habit = intent.getSerializableExtra(IntentNames.HABIT_NAME) as Habit
        habitNameTextView.text = habit.name
        val editHabitButton : Button = findViewById(R.id.editHabitButton)
        editHabitButton.setOnClickListener {
            val intent = Intent(this, EditHabitView::class.java)
            startActivity(intent)
        }
    }

}