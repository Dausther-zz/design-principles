package com.designprinciples.lecture2.part6;

public class TestInheritance {

    public static void main(String... args) {
        //Creating components

        Component button = new Component("Button");
        Component textArea = new Component("TextArea");
        Component textField = new Component("TextField");
        Component radioButton = new Component("RadioButton");

        //Creating GridContainer, without border,  and adding elements to it
        Container c1 = new GridContainer(2, 2);

        c1.addComponent(radioButton);
        c1.addComponent(button);
        c1.addComponent(textArea);
        c1.addComponent(textField);

        c1.doLayout();

        //Creating FlowContainer, without border,  and adding elements to it

        Container c2 = new FlowContainer();

        c2.addComponent(radioButton);
        c2.addComponent(button);
        c2.addComponent(textArea);
        c2.addComponent(textField);

        c2.doLayout();

        //Creating FlowContainer, with dotted border,  and adding elements to it
        Border dottedBorder = new DottedBorder();

        Container c3 = new FlowContainer(dottedBorder);

        c3.addComponent(radioButton);
        c3.addComponent(button);
        c3.addComponent(textArea);
        c3.addComponent(textField);

        c3.doLayout();

        Border solidBorder = new SolidBorder();

        Container c4 = new FlowContainer(solidBorder);

        c4.addComponent(radioButton);
        c4.addComponent(button);
        c4.addComponent(textArea);
        c4.addComponent(textField);

        c4.doLayout();

        //Creating GridContainer, with dotted border,  and adding elements to it

        Container c5 = new GridContainer(2, 2, dottedBorder);

        c5.addComponent(radioButton);
        c5.addComponent(button);
        c5.addComponent(textArea);
        c5.addComponent(textField);

        c5.doLayout();

        Container c6 = new GridContainer(2, 2, solidBorder);

        c6.addComponent(radioButton);
        c6.addComponent(button);
        c6.addComponent(textArea);
        c6.addComponent(textField);

        c6.doLayout();
    }
}
