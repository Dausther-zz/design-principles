package com.designprinciples.lecture3.part3;

public abstract class Player {

    public String name;

    public Behavior[] behavior;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Behavior... behavior) {
        this.name = name;
        this.behavior = behavior;
    }

//    public void setBehavior(Behavior behavior) {
//        this.behavior = behavior;
//    }

    public void train() {
        System.out.println(name + " trains hard.");
    }

    public void compete() {
        System.out.println(name + " is very competitive.");
    }

    public void run() {
        if(behavior != null) {
            for(Behavior b : behavior){
                System.out.print(name);
                b.behave();
            }
        }
    }

    public abstract void defineTactics();
}
