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
        victim.heals(victim, 50L);

        //then
        assertEquals( true , victim.getAlive());
        assertEquals(1000, victim.getHealth());





    }
    @Test
    void aCharacterCannotDealDamageToItSelf(){
        //given
        var character = new CharacterRpg();
        var victim = new CharacterRpg();
        //when
        victim.attack(victim, 2L);
        //then
        assertEquals(1000, victim.getHealth());



    }
    @Test
    void CharacterCanOnlyHealItSelf(){
        //given
        var character = new CharacterRpg();
        var nurse = new CharacterRpg();
        var victim = new CharacterRpg();
        var victim2 = new CharacterRpg();
        //when
        character.attack(victim, 100);
        character.attack(victim2, 100);
        nurse.heals(victim2, 100L);
        victim.heals(victim, 100L);
        //then
        assertEquals( 900, victim2.getHealth());
        assertEquals( 1000, victim.getHealth());
    }

    @Test
    void characterDeals50PerCentDamageIfTargetIs5OrMoreLevelsAboveAttacker(){
        var character = new CharacterRpg();
        var superCharacter = new CharacterRpg(12);

        var victim = new CharacterRpg();
        var victim2 = new CharacterRpg(7);

        //when
        character.attack(victim2, 100);
        superCharacter.attack(victim, 100);
        //then

        assertEquals(950, victim2.getHealth());
        assertEquals(850, victim.getHealth());

    }
}