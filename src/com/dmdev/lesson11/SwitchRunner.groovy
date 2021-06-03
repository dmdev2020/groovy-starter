package com.dmdev.lesson11

import com.dmdev.lesson10.Person

class SwitchRunner {

    static void main(String[] args) {
        int x = 12
        // byte, short, int, char, String, enum
        switch (x) {
            case String:        // isInstance
                println 0
                break
            case 5:             // equals ==   ===
                println 1
                break
            case new Person(29):        // person.isCase(12)
                println 5
                break
            case ~/\d+/:        // pattern.matcher(12.toString()).matches()
                println 2
                break
            case { it % 5 == 0 }:
                println 3
                break
            case [1, 3, 5, 9]:      //list.isCase(12)
                println 4
                break
            default:
                println "None"
                break
        }

        if (x in [1, 3, 6, 8, 12]) {
            println x
        }
    }
}
