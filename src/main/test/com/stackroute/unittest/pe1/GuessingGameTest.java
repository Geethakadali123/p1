package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessingGameTest {


    @Test
    public void Game()
    {
        GuessingGame game = new GuessingGame();
        String result = game.Game(23);
        assertEquals("Number guessed is less than the original number",result);
    }
}
