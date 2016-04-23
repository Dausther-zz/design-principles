package com.designprinciples.lecture2.part4;

import java.util.ArrayList;
import java.util.List;

public class FlowContainerSolidBorder extends Container {
    private List<Component> elements;

    public FlowContainerSolidBorder() {
        elements = new ArrayList<Component>();
    }

    @Override
    public void addComponent(Component c) {
        elements.add(c);
    }

    @Override
    public void removeComponent(Component c) {
       elements.remove(c);
    }

    @Override
    public void doLayout() {
        System.out.println("The container being used is the FlowContainer");
        System.out.println("This container also contains an Solid Border around it");
        System.out.println("These are elements presented in this container");
        System.out.println(elements);
        System.out.println("Using of inheritance to close container");
        dispose();
        System.out.println();
    }
}
