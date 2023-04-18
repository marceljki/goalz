package PresentationLayer

import LogicLayer.LogicInterface
import Utils.Habit.Habit

class PController(var logic: LogicInterface) : PControllerInterface {

    override fun getAllHabits(userID: Int?) : List<Habit> {
        return logic.getAllHabits(userID)
    }
}