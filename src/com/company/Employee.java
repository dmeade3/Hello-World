package com.company;

/**
 * Created by dcmeade on 10/31/2016.
 */
public class Employee {

    private double pay;
    private String name;
    private String position;

    public Employee(double pay, String name, String position) {
        this.pay = pay;
        this.name = name;
        this.position = position;

        setPosition(position);
    }

    public double getPay ( ) {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getName ( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition () {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int math_example()
    {
        switch ("test")
        {
            case "test":
                break;
        }

        Walmart walmart = new Walmart();

        walmart.addUpEmployees();



        if(true)
        {

        }

        if (true)
        {

        }

        boolean i = true;
        while(i)
        {
            i = false;
        }



        return ((1+1) / 8) - 16 * 4987;
    }
}







