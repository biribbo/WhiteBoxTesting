package calculator;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void powerTest() {
        Assert.assertEquals(25.0, calculator.powerTwoNumbers(5.0, 2.0), 0.001);
        Assert.assertNotEquals(0.0, calculator.powerTwoNumbers(5.0, 0.0), 0.001);
    }

    @Test
    public void sqrtTest() {
        Assert.assertEquals(5.0, calculator.sqrt(25.0), 0.001);
        Assert.assertNotEquals(2.0, calculator.sqrt(8.0), 0.001);
    }

    @Test
    public void calculateSqrtAreaTest() {
        Assert.assertEquals(36.0, calculator.CalculateSquareArea(6), 0.001);
        Assert.assertNotEquals(10.0, calculator.CalculateSquareArea(5), 0.001);
    }

    @Test
    public void calculateRectAreaTest() {
        Assert.assertEquals(36.0, calculator.CalculateRectArea(4, 9), 0.001);
        Assert.assertNotEquals(25.0, calculator.CalculateRectArea(5, 2), 0.001);
    }

    @Test
    public void CalculateSquareCircTest() {
        Assert.assertEquals(28.0, calculator.CalculateSquareCirc(7), 0.001);
        Assert.assertNotEquals(10.0, calculator.CalculateSquareCirc(4), 0.001);
    }

    @Test
    public void CalculateRectCircTest() {
        Assert.assertEquals(8.0, calculator.CalculateRectCirc(2, 2), 0.001);
        Assert.assertNotEquals(10.0, calculator.CalculateRectCirc(6, 4), 0.001);
    }

    @Test
    public void calculateTriangleAreaTest() {
        Assert.assertEquals(18.0, calculator.CalculateTriangleArea(4, 9), 0.001);
        Assert.assertNotEquals(15.0, calculator.CalculateTriangleArea(5, 2), 0.001);
    }

    @Test
    public void calculateTriangleCircTest() {
        Assert.assertEquals(20.0, calculator.CalculateTriangleCirc(4, 9, 7), 0.001);
        Assert.assertNotEquals(150.0, calculator.CalculateTriangleCirc(5, 5, 6), 0.001);
    }

    @Test
    public void convertCelsiusToFahrenheitTest() {
        Assert.assertEquals(50.0, calculator.convertCelsiusToFarenheit(10), 0.001);
        Assert.assertNotEquals(100.0, calculator.convertCelsiusToFarenheit(100), 0.001);
    }

    @Test
    public void convertFahrenheitToCelsiusTest() {
        Assert.assertEquals(6.0, calculator.convertFarenheitToCelsius(42), 0.001);
        Assert.assertNotEquals(100.0, calculator.convertCelsiusToFarenheit(100), 0.001);
    }

    @Test
    public void convertMphToKphTest() {
        Assert.assertEquals(161.0, calculator.convertFromMphToKph(100), 0.001);
        Assert.assertNotEquals(100.0, calculator.convertFromMphToKph(100), 0.001);
    }

    @Test
    public void factorialTest() {
        Assert.assertEquals(1, calculator.factorial(0));
        Assert.assertEquals(120, calculator.factorial(5));
        Assert.assertNotEquals(25, calculator.factorial(5));
    }

    @Test
    public void fibonacciTest() {
        Assert.assertEquals(0, calculator.fibbonacci(0));
        Assert.assertEquals(1, calculator.fibbonacci(1));
        Assert.assertEquals(55, calculator.fibbonacci(10));
        Assert.assertNotEquals(25, calculator.fibbonacci(5));
    }

    @Test
    public void findGCDTest() {
        Assert.assertEquals(5, calculator.findGCD(5, 0));
        Assert.assertEquals(16, calculator.findGCD(144, 256));
        Assert.assertNotEquals(96, calculator.findGCD(16, 24));
    }

    @Test
    public void findLCMTest() {
        Assert.assertEquals(48, calculator.findLCM(16, 24));
        Assert.assertNotEquals(16, calculator.findLCM(144, 256));
    }

    @Test
    public void isPrimeTest() {
        Assert.assertFalse(calculator.isPrime(1));
        Assert.assertFalse(calculator.isPrime(4));
        Assert.assertFalse(calculator.isPrime(0));
        Assert.assertTrue(calculator.isPrime(5));
    }
}
