package com.dmdev.lesson6

assert 1 + 2 == 3
assert 4 - 3 == 1
assert 3 * 5 == 15
assert 3 / 2 == 1.5
assert 3.intdiv(2) == 1
assert 10 % 3 == 1
assert 2**3 == 8

//def result = (int) (3 / 2)
def result = (3 / 2) as Integer // def asType(clazz)

println result <= 29
println result === Integer.valueOf(1) // true
println result * 130 === 130    // false
println result <=> 130