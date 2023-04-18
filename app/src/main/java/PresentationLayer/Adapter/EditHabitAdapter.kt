package PresentationLayer.Adapter

import Utils.Habit.HabitItem
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.goalz.R


class EditHabitAdapter(context: Context, private val ressource: Int, private val habitItems: ArrayList<HabitItem>) :
    ArrayAdapter<HabitItem>(context, ressource, habitItems){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context).inflate(ressource, parent, false)
        val textViewAttrName = inflater?.findViewById<TextView>(R.id.habit_attr_name_textview)
        val textViewAttrValue = inflater?.findViewById<TextView>(R.id.habit_attr)
        textViewAttrName?.text = habitItems[position].name
        textViewAttrValue?.text = habitItems[position].value
        return inflater!!
    }
    override fun getCount(): Int {
        return habitItems.size
    }
}