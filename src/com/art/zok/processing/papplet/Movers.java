package com.art.zok.processing.papplet;

import com.art.zok.processing.core.GPApplet;
import com.art.zok.processing.core.Mover;

public class Movers extends GPApplet { 

	Mover mover;

	public void settings() {
		size(640, 360);
	}
	
	public void setup() {
		mover = new Mover();
	}

	public void draw() {
		mover.update();
		mover.checkEdges();
		mover.display();
	}

}
