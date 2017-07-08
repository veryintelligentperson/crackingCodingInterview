package app

import spock.lang.Specification

class TestTest extends Specification {

    def "test"() {
        when:
        def test = Test.test()

        then:
        test
    }
}
