package LogicLayer

import Utils.Habit

interface LogicInterface {

    fun getAllHabits(userID: Int?) : List<Habit>

}