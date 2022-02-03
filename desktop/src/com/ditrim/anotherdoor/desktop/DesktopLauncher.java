package com.ditrim.anotherdoor.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ditrim.anotherdoor.AnotherDoor;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = 800;
		config.width = 500;
		config.resizable = false;
		new LwjglApplication(new AnotherDoor(), config);
	}
}
