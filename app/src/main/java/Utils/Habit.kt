package Utils

import java.io.Serializable

class Habit(var habitID: Int, var name: String, var goalValue: Int,
            var frequencyNumber: Int, var frequency: Frequency) : Serializable {
    override fun toString(): String {
        return "Habit name is $name"
    }

    fun getAttributes(): List<Array<String>>{
        val name = arrayOf("Habit Name", habitID.toString(), Types.STRING.toString())
        val goalValue = arrayOf("Goal Value", goalValue.toString(), Types.INT.toString())
        val frequencyNumber = arrayOf("Frequency", frequencyNumber.toString(), Types.INT.toString())
        val frequency = arrayOf("Frequency Unit", frequency.toString(), Types.STRING.toString())
        return listOf(name, goalValue, frequencyNumber, frequency)
    }

}