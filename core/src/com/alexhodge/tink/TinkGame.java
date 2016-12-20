package com.alexhodge.tink;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class TinkGame extends ApplicationAdapter {
    private final Factory _factory;
    private Batch _batch;
    private Texture _img;

    public TinkGame(Factory factory) {
        this._factory = factory;
    }

    @Override
    public void create () {
        _batch = _factory.GetBatch();
        _img = _factory.GetLogo();
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        _batch.begin();
        _batch.draw(_img, 0, 0);
        _batch.end();
    }

    @Override
    public void dispose () {
        _batch.dispose();
        _img.dispose();
    }
}
