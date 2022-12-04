package Incapsulation

import kotlin.random.Random
import kotlin.system.exitProcess

open class Animal(var energy: Int, var weight: Int, var age: Int, var maxAge: Int, var name: String) {
    private val isTooOld = age >= maxAge

    private fun tryIncrementAge(){
        if(Random.nextBoolean()){
            age++
        }
    }


    fun sleep(){
        if(isTooOld) exitProcess(1)
        energy += 5
        age++
        println("$name спит")
    }

    fun eat(){
        if(isTooOld) exitProcess(1)
        energy+=3
        weight++
        tryIncrementAge()
        println("$name ест")
    }

    fun move(){
        if(isTooOld || energy < 5 || weight < 5) exitProcess(1)
        energy-=5
        weight--
        tryIncrementAge()
        println("$name передвигается")
    }

    fun makeChild(parent: Animal){
        var child = Animal((1..10).random(),(1..5).random(),
        0,parent.maxAge,parent.name)
        println("${child.name} родился \n" +
                "Его вес: ${child.weight}, " +
                "Энергия: ${child.energy}, " +
                "Максимальный возраст: ${child.maxAge} ")
    }

}

fun main(){
    var animal = Animal(100,70,7,65,"OLEG")
    animal.sleep()
    animal.makeChild(animal)

}