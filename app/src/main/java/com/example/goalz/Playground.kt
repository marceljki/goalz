package com.example.goalz

import Utils.Habit

class Playground {

    fun main(){
        val i = 1..60
        println("Hi ${i.random()}")
    }
}

fun main() {
    val pg : Playground = Playground()
    pg.main()
    val habit = Habit(2, "Habit")
    print(habit.name)

}

