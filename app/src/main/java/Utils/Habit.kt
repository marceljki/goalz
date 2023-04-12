package Utils

class Habit(var habitID: Int, var name: String) {
    override fun toString(): String {
        return "Habit name is $name"
    }
}