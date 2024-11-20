package com.example;

import java.util.ArrayList;
import java.util.List;

public class Muscle extends InteractiveComponent{
  private String function;
    private String origin;
    private String insertion;

    public Muscle(String name, int x, int y, int width, int height, String function, String origin, String insertion) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.function = function;
        this.origin = origin;
        this.insertion = insertion;
    }

    @Override
    public void onHover() {
        System.out.println("Displaying info for " + name);
    }

    @Override
    public void onClick() {
        System.out.println("Zooming in on " + name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing muscle: " + name);
    }
}

class MuscleGroup {
    private String name;
    private List<Muscle> muscles;

    public MuscleGroup(String name) {
        this.name = name;
        this.muscles = new ArrayList<>();
    }

    public void addMuscle(Muscle muscle) {
        muscles.add(muscle);
    }

    public void drawGroup() {
        for (Muscle muscle : muscles) {
            muscle.draw();
        }
    }
}
