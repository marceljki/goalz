package PresentationLayer

import Utils.Habit.Habit

interface PControllerInterface {

    fun getAllHabits(userID: Int?) : List<Habit>
}