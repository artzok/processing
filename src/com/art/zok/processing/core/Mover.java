package com.art.zok.processing.core;

import processing.core.PApplet;
import processing.core.PVector;
public class Mover {
	PApplet applet = GPApplet.applet;

	PVector location;
	PVector velocity;
	PVector acceleration;
	float topspeed;
	public Mover() {
		location = new PVector(applet.random(applet.width), applet.random(applet.height));
		velocity = new PVector(0, 0);
		topspeed = 10;
		acceleration = new PVector(-0.001f, 0.001f);
	}

	public void update() {
		PVector mouse = new PVector(applet.mouseX, applet.mouseY);
		PVector dir = PVector.sub(mouse, location);
		dir.normalize();
		dir.mult(0.5f);
		acceleration = dir;
		velocity.add(acceleration);
		velocity.limit(topspeed);
		location.add(velocity);
	}

	public void display() {
		applet.stroke(0);
		applet.fill(175);
		applet.ellipse(location.x, location.y, 16, 16);
	}

	public void checkEdges() {
		if (location.x > applet.width) {
			location.x = 0;
		} else if (location.x < 0) {
			location.x = applet.width;
		}
		if (location.y > applet.height) {
			location.y = 0;
		} else if (location.y < 0) {
			location.y = applet.height;
		}
	}
}
