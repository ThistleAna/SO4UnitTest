import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void fourPlusSixEqualsTen(){
        // arrange test
        var calculator = new Calculator();
        // assert
        assertEquals(10, calculator.add(4, 6)); // give assumption check
    }

    @Test
    void twoPlusEightEqualsTen(){
        // arrange test
        var calculator = new Calculator();
        // assert
        assertEquals(10, calculator.add(2, 8)); // give assumption check
    }

    // Lynda
    @Test
    void fivePlusTenEqualsFifteen(){
        // arrange test
        var calculator = new Calculator();
        // assert
        assertEquals(15, calculator.add(5, 10)); // give assumption check
    }
    @Test
    void fiveMinusTwoEqualsThree() {
        // arrange test
        var calculator = new Calculator();
        // assert
        assertEquals(3, calculator.subtract(5, 2)); // give assumption check
    }
    // Michelle
    @Test
    void threePlusFourEqualsSeven(){
        // arrange test
        var calculator = new Calculator();
        // assert
        assertEquals(7, calculator.add(3, 4)); // give assumption check
    }
    @Test
    void fourPlusFourEqualsEight(){
        // arrange test
        var calculator = new Calculator();
        // assert
        assertEquals(8, calculator.add(4, 4)); // give assumption check
    }


    // Esme
    @Test
    void eightPlusEightEqualsSixteen(){
        // arrange test
        var calculator = new Calculator();
        // assert
        assertEquals(16, calculator.add(8, 8)); // give assumption check
    }





    // Barbara

    @Test
    void fivePlusNineEqualsFourteenth() {
        // test
        var calculator = new Calculator();
        //assert
        assertEquals(14, calculator.add(5, 9)); // give assumption check

    }





    // Jr
    @Test
    void SevenPlusNineEqualsTen() {
        // arrange test
        var calculator = new Calculator();
        // assert
        assertEquals(15, calculator.add(7, 9)); // give assumption check

    }


    // Arnold
    @Test
    void fourPlusElevenEqualsFifteen(){
        // arrange test
        var calculator = new Calculator();
        // assert
        assertEquals(15, calculator.add(4, 11)); // give assumption check
    }

    // create unit test : 5-2 = 3 and 20-4 = 16, make one of this test failed the test

    //Jr
    @Test
    void SevenMinusFourEqualsThree(){
        // arrange test
        var calculator = new Calculator();
        // assert
        assertEquals(3, calculator.subtract(7, 4)); // give assumption check
    }

    @Test
    void TwentyMinusFourEqualsSixteen() {
        // arrange test
        var calculator = new Calculator();
        // assert
        assertEquals(16, calculator.subtract(20, 4)); // give assumption check
    }
} // end of the file


