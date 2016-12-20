package com.alexhodge.tink;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FactoryImpl implements Factory {

    public Batch GetBatch() {
        return new SpriteBatch();
    }
    public Texture GetLogo() {
        return new Texture("badlogic.jpg");
    }
}
