package com.alexhodge.tink;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public interface Factory {
    Batch GetBatch();
    Texture GetLogo();
}
