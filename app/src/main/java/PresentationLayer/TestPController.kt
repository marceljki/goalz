package PresentationLayer

import Utils.Habit
import java.util.*

class TestPController() : PControllerInterface {
    override fun getAllHabits(userID: Int?): List<Habit> {
        val habitList = ArrayList<Habit>()
        val habit1 = Habit(1, "Habit1")
        val habit2 = Habit(2, "Habit2")
        val habit3 = Habit(3, "Habit3")
        val habit4 = Habit(4, "Habit4")
        val habit5 = Habit(5, "Habit5")
        habitList.addAll(Arrays.asList(habit1, habit2, habit3, habit4, habit5))
        return habitList
    }


}