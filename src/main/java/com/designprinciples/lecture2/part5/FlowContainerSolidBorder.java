package com.designprinciples.lecture2.part5;

public class FlowContainerSolidBorder extends FlowContainer {

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
