package com.alexhodge.tink;

import com.alexhodge.tink.Factory;
import com.alexhodge.tink.TinkGame;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class TinkGameTest {
    @org.junit.Test
    public void create() {
        Factory factory = mock(Factory.class);
        TinkGame tinkGame = new TinkGame(factory);
        tinkGame.create();
        verify(factory, times(1)).GetBatch();
        verify(factory, times(1)).GetLogo();
    }
}