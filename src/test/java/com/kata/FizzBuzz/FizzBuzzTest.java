package com.kata.FizzBuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @BeforeEach
    void setUp() {

    }
    @Test
    void executeReturnFizzIfNumIsDivisibleBy3(){
        //given
        var fizzbuzz = new FizzBuzz();

        //when
        var sut = fizzbuzz.execute(3);

        //then
        assertEquals("Fizz", sut);
    }


    @Test
    void executeReturnFizzIfNumIsDivisibleBy5(){
        //given
        var fizzbuzz = new FizzBuzz();

        //when
        var sut = fizzbuzz.execute(5);

        //then
        assertEquals("Buzz", sut);
    }
    @Test
    void executeReturnFizzBuzzIfNumIsDivisibleBy5And3(){
        //given
        var fizzbuzz = new FizzBuzz();

        //when
        var sut = fizzbuzz.execute(15);

        //then
        assertEquals("FizzBuzz", sut);
    }
    @Test
    void executeReturnNumIfNumIsNotDivisibleBy5Or3(){
        //given
        var fizzbuzz = new FizzBuzz();

        //when
        var sut = fizzbuzz.execute(4);

        //then
        assertEquals("4", sut);
    }






}