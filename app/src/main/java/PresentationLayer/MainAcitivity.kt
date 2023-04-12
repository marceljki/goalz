package PresentationLayer

import Utils.Habit
import Utils.IntentNames
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.goalz.R


class MainAcitivity : AppCompatActivity(){

    private val USER_ID = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pController = startServices()
        setHabitsOnView(pController)
    }

    private fun setHabitsOnView(pController: PControllerInterface) {
        val arrayAdapter: ArrayAdapter<*>
        val habitView: ListView = findViewById(R.id.habitList)
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, pController.getAllHabits(USER_ID)
        )
        habitView.adapter = arrayAdapter
        habitView.setOnItemClickListener { parent, view, position, id ->
            val habit = parent.getItemAtPosition(position) as Habit
            val habitName = habit.name
            val intent = Intent(this, HabitView::class.java)
            intent.putExtra(IntentNames.HABIT_NAME, habitName)
            startActivity(intent)
    }
    }

    private fun startServices() : PControllerInterface{
        return TestPController()
    }
}