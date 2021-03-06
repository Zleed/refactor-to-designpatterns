package com.csmastery.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzPrinterTest {

  private FizzBuzz fizzBuzz;
  private FizzBuzzPrinter printer;

  @BeforeEach
  public void init() {
    fizzBuzz = new FizzBuzz();
    printer = new FizzBuzzPrinter(fizzBuzz);
  }

  @Test
  public void smokeTest() {
    assertTrue(printer != null);
  }

  @Test
  public void printsFirstFive() {
    String result = printer.printFizzBuzzQozz(5);
    assertEquals("1\n2\nFizz\n4\nBuzz", result);
  }
}