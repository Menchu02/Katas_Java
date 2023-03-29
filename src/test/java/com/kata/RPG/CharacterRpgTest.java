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
    @Test

    void charactersCanDealDamageToCharacters(){
        //given
        var character = new CharacterRpg();
        var victim = new CharacterRpg();
        //when
        character.attack(victim ,  1000L);

        //then
        assertEquals( 0, victim.getHealth());
        assertEquals( false, victim.getAlive() );
    }
    @Test

     void aCharacterCanHealACharacter(){
        //given
        var character = new CharacterRpg();
        var victim = new CharacterRpg();

        var nurse = new CharacterRpg();

        //when
        character.attack(victim ,  2L);
        nurse.heals(victim, 50L);

        //then
        assertEquals( true , victim.getAlive());
        assertEquals(1000, victim.getHealth());





    }

}