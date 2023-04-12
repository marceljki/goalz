package PresentationLayer

import Utils.Habit

interface PControllerInterface {

    fun getAllHabits(userID: Int?) : List<Habit>
}