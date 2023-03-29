package com.kata.RPG;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterRpgTest {

    @BeforeEach
    void setUp() {
    }

    @Test

    void characterHasInitialParameters(){
        //given
        var character = new CharacterRpg();
        //when
        //then
        assertEquals(1000, character.getHealth());
        assertEquals(1, character.getLevel());
        assertEquals(true, character.getAlive());





    }
}