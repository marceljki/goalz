package LogicLayer

import Utils.Habit.Habit

interface LogicInterface {

    fun getAllHabits(userID: Int?) : List<Habit>

}