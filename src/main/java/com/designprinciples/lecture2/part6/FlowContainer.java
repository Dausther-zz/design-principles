package com.designprinciples.lecture2.part6;

import java.util.ArrayList;
import java.util.List;

public class FlowContainer extends Container {
    protected List<Component> elements;

    public FlowContainer() {
        elements = new ArrayList<Component>();
    }

    public FlowContainer(Border border) {
        super(border);
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

        if(border != null){
              border.generateBorder();
        }
        System.out.println("The Container being used is the FlowContainer");
        System.out.println("That's elements presented in this Container");
        System.out.println(elements);
        System.out.println("Using of inheritance to close container");
        dispose();
        System.out.println();
    }
}
