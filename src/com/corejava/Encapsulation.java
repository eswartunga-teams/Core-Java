package com.corejava;

public class Encapsulation {

    private int id;
    private String name;
    private String email;

    public Encapsulation() {

    }

    public Encapsulation(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setId(1);
        encapsulation.setName("Eswar");
        encapsulation.setEmail("eswartunga@gmail.com");

        System.out.println("Customer Id: " + encapsulation.getId());
        System.out.println("Customer Name: " + encapsulation.getName());
        System.out.println("Customer Email-Id: " + encapsulation.getEmail());
    }
}


