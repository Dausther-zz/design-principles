package com.designprinciples.lecture2.part4;

public class TestInheritance {
    //Creating container and adding elements to it
    public static void main(String... args){
        //Creating components

        Component button = new Component("Button");
        Component textArea = new Component("TextArea");
        Component textField = new Component("TextField");
        Component checkBox = new Component("CheckBox");

        //Creating FlowContainer and adding elements to it
        Container c1 = new FlowContainer();

        Component radioButton = new Component("RadioButton");

        c1.addComponent(radioButton);
        c1.addComponent(button);
        c1.addComponent(textArea);
        c1.addComponent(textField);
        c1.addComponent(checkBox);

        c1.doLayout();

        System.out.println("Below the new requeriments of client");

        Container c2 = new FlowContainerDottedBorder();



        c2.addComponent(radioButton);
        c2.addComponent(button);
        c2.addComponent(textArea);
        c2.addComponent(textField);
        c2.addComponent(checkBox);

        c2.doLayout();

        Container c3 = new FlowContainerSolidBorder();



        c3.addComponent(radioButton);
        c3.addComponent(button);
        c3.addComponent(textArea);
        c3.addComponent(textField);
        c3.addComponent(checkBox);

        c3.doLayout();

        System.out.println("below the new requeriments implemented on GridContainer ");

        Container c4 = new GridContainerDottedBorder(2,2);

        c4.addComponent(radioButton);
        c4.addComponent(button);
        c4.addComponent(textArea);
        c4.addComponent(textField);


        c4.doLayout();

        Container c5 = new GridContainerSolidBorder(2,2);

        c5.addComponent(radioButton);
        c5.addComponent(button);
        c5.addComponent(textArea);
        c5.addComponent(textField);


        c5.doLayout();


    }
}
