package app.dataStructures.singleLinkedList

import spock.lang.Specification

class MyLinkedListTest extends Specification {


    //TODO

    def "Get"() {
        given:
        MyLinkedList<Integer> linkedList = new MyLinkedList<>()
        linkedList.add(1)
        linkedList.add(2)
        linkedList.add(3)
        linkedList.add(4)

        expect:
        linkedList.get(index) == value

        where:
        index | value
            0 | 1
            1 | 2
            2 | 3
            3 | 4
    }

}
