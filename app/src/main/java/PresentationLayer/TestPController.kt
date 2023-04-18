package PresentationLayer

import Utils.Frequency
import Utils.Habit.Habit

class TestPController() : PControllerInterface {
    override fun getAllHabits(userID: Int?): List<Habit> {
        val habitList = ArrayList<Habit>()
        val habit1 = Habit(1, "Habit1", 10, 2, Frequency.PER_WEEK)
        val habit2 = Habit(2, "Habit2",10, 2, Frequency.PER_WEEK)
        val habit3 = Habit(3, "Habit3",10, 2, Frequency.PER_WEEK)
        val habit4 = Habit(4, "Habit4",10, 2, Frequency.PER_WEEK)
        val habit5 = Habit(5, "Habit5",10, 2, Frequency.PER_WEEK)
        habitList.addAll(listOf(habit1, habit2, habit3, habit4, habit5))
        return habitList
    }


}