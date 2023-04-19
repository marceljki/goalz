package PresentationLayer

import PresentationLayer.Adapter.EditHabitAdapter
import Utils.Habit.Habit
import Utils.Habit.HabitItem
import Utils.IntentNames
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
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
        gobackbtn()
    }

    private fun gobackbtn() {
        val gobackbtn: Button = findViewById(R.id.goback_habitedit)
        gobackbtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_delete){
            Toast.makeText(baseContext, "Hello", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}