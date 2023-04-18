package PresentationLayer

import PresentationLayer.Adapter.EditHabitAdapter
import Utils.Habit.Habit
import Utils.Habit.HabitItem
import Utils.IntentNames
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.goalz.R

class EditHabitView : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_habit)
        val habit = intent.getSerializableExtra(IntentNames.HABIT) as Habit
        val habitAttr: ArrayList<HabitItem> = habit.getAttributes()
        val adapter = EditHabitAdapter(this, R.layout.edit_habit_listview_item, habitAttr)
        val listView = findViewById<ListView>(R.id.editHabitList)
        listView.adapter = adapter
        val gobackbtn : Button = findViewById(R.id.goback_habitedit)
        gobackbtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}