package com.designprinciples.lecture2.part5;

import java.util.Arrays;

public class GridContainerDottedBorder extends GridContainer {

    public GridContainerDottedBorder(int width, int height) {
        super(width, height);
        elementsArray = new Component[width][height];
    }

    @Override
    public void doLayout() {
        System.out.println("The Container being used is the GridContainer");
        System.out.println("This container also contains an Dotted Border around it");
        System.out.println("That's elements presented in this Container");
        System.out.println(Arrays.deepToString(elementsArray));
        System.out.println("Using of inheritance to close Container");
        dispose();
    }
}
