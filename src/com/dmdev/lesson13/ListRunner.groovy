package com.dmdev.lesson13

class ListRunner {

    static void main(String[] args) {
        def list = [1, 3, 5, 6]
        assert list.getClass() == ArrayList

//        read
        assert list[2] == 5
        assert list.get(2) == 5
        assert list[-1] == 6 // list.get(list.size() - 1)
        assert list[1..3] == [3, 5, 6]
        assert list[8] == null // list.get(8) list?[8]

//        write
        list += 9
        list << 11 << 13 << 7 << 7
        assert list == [1, 3, 5, 6, 9, 11, 13, 7, 7]
        list -= 7
        assert list == [1, 3, 5, 6, 9, 11, 13]
        list -= [1, 3]
        assert list == [5, 6, 9, 11, 13]
        list *= 3
        assert list == [5, 6, 9, 11, 13, 5, 6, 9, 11, 13, 5, 6, 9, 11, 13]

//        method from queue
        list.push(999)
        assert list.pop() == 999
        assert list.head() == 5
        assert list.tail() == [6, 9, 11, 13, 5, 6, 9, 11, 13, 5, 6, 9, 11, 13]
        assert list.last() == 13

//        flatten, reverse, intersect, disjoint
        assert [1, 2, [4, 6, 7], 9].flatten() == [1, 2, 4, 6, 7, 9]
        assert [1, 2, 3].reverse() == [3, 2, 1]
        assert [1, 2, 3].intersect([2, 3, 7]) == [2, 3]
        assert [1, 2, 3].disjoint([5, 6, 7])

//        new operators
        def (a, b, c) = [3, 5, 7, 9, 10]
        assert a == 3
        assert b == 5
        assert c == 7

        func(*[8, 10])
    }

    static def func(def a, def b) {
        println a
        println b
    }
}
