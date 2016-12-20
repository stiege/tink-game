package com.alexhodge.tink.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.alexhodge.tink.TinkGame;
import com.alexhodge.tink.FactoryImpl;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new TinkGame(new FactoryImpl()), config);
	}
}
