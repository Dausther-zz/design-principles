package com.designprinciples.lecture2.part6;

public abstract class Container {
    protected Border border;

    protected Container() {
    }

    protected Container(Border border) {
        this.border = border;
    }

    public abstract void addComponent(Component c);

    public abstract void removeComponent(Component c);

    public abstract void doLayout();

    public void dispose() {
        System.out.println("Closing the Container");
    }
}
