package gr8confeu2013.demo

import demo.Calculator
import org.junit.Test

class CalculatorTests {

    @Test
    void "2+3=5"() {
        def sut = new Calculator()
        assert sut.sum(2, 3) == 5
    }

//    @Test
//    void "5+7=12"() {
//        def sut = new Calculator()
//        assert sut.sum(5, 7) == 12
//    }
}
