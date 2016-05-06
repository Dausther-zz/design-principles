package com.designprinciples.lecture3.part2;

public abstract class Player {
    public String name;

    public Player(String name) {
        this.name = name;
    }

    public void train() {
        System.out.println(name + " trains hard");
    }

    public void run() {
        System.out.println(name + " runs a lot during the game.");
    }

    public void compete() {
        System.out.println(name + " is very competitive");
    }

    public abstract void defineTactics();
}
