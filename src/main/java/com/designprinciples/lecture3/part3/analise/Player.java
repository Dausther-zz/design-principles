package com.designprinciples.lecture3.part3.analise;

public abstract class Player {

    public String name;

    public Behavior behavior;

    public Player(String name) {
        this.name = name;
    }

    public void train() {
        System.out.println(name + " trains hard.");
    }

    public void compete() {
        System.out.println(name + " is very competitive.");
    }

    public void run() {
        System.out.println(name + " runs a lot during the game.");
    }

    public abstract void defineTactics();
}
