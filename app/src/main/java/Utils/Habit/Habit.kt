package Utils.Habit

import Utils.Frequency
import Utils.Types
import java.io.Serializable

class Habit(var habitID: Int, var name: String, var goalValue: Int,
            var frequencyNumber: Int, var frequency: Frequency
) : Serializable {
    override fun toString(): String {
        return "Habit name is $name"
    }

    fun getAttributes(): ArrayList<HabitItem>{
        val name = HabitItem("Name", name, Types.STRING, true)
        val goalValue = HabitItem("Goal Value", goalValue.toString(), Types.INT, true)
        val frequencyNumber = HabitItem("Frequency", frequencyNumber.toString(), Types.INT, true)
        val frequency = HabitItem("Frequency Unit", frequency.stringToPrint, Types.STRING, true)
        return arrayListOf(name, goalValue, frequencyNumber, frequency)
    }

}