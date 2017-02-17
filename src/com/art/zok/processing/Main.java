package com.art.zok.processing;

import processing.core.PApplet;

public class Main {
	static public void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "Movers" };
		handlePackage(appletArgs);
		PApplet.main(appletArgs);
	}
	
	private static void handlePackage(String[] papplets) {
		String packageName = Main.class.getPackage().getName();
		for(int i = 0; i < papplets.length; i ++) {
			papplets[i] = packageName + ".papplet." + papplets[i];
		}
	}
}
