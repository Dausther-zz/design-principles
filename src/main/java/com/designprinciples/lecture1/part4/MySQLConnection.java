package com.designprinciples.lecture1.part4;

public class MySQLConnection implements Connection {
    public void connect(){
        System.out.println("Connection to MySQL");
    }
}
