package com.dmdev.lesson7

/**
 * " "
 * ' '
 * """ """
 * ''' '''
 * /  /
 * $/ /$
 */
def name = "Ivan"
char value = 'H'

def stringValue = "Hello $name"
println stringValue

def value2 = """
SELECT *
FROM
table where name = ${getWithPrefix(name)}
"""
println value2

value3 = '''
SELECT *
FROM
table where name = $name
'''
println value3

def value5 = /Hello word $name/
println value5

def value6 = $/Hello word $name/$
println value6

println name[2]
println name[-1]
println name[1..3]
println name * 3
println name - 'Iv'
println name - 'an'

def getWithPrefix(String name) {
    "prefix-" + name
}

