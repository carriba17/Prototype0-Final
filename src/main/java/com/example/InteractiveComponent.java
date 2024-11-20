package com.example;

public abstract class InteractiveComponent {
    protected String name;
    protected int x, y; // Position on screen
    protected int width, height;

    public abstract void onHover();
    public abstract void onClick();
    public abstract void draw();

}
