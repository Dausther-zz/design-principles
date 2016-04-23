package com.designprinciples.lecture2.part1;

public class TestInheritance {
	// Creating container and adding elements to it
	public static void main(String... args) {
		// Creating Components
		Component button = new Component("Button");
		Component textArea = new Component("TextArea");
		Component textField = new Component("TextField");
		Component checkBox = new Component("CheckBox");

		// Creating FlowContainer and adding elements to it
		Container c1 = new FlowContainer();

		Component radioButton = new Component("RadioButton");

		c1.addComponent(radioButton);
		c1.addComponent(button);
		c1.addComponent(textArea);
		c1.addComponent(textField);
		c1.addComponent(checkBox);

		c1.doLayout();
	}
}
