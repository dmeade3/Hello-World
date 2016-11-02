package com.company;

public class Main
{
    static String name;

    public static void main(String[] args)
    {
        for (int i = 0; i < 1000; i++) {


            hughMungus();
            hughMungus();
            hughMungus();
            hughMungus();
            hughMungus();
            hughMungus();
            hughMungus();
            hughMungus();
            hughMungus();
            hughMungus();


            kenBone();
        }

        setName("Hello World 2");
        setName("Hello World 1");

        Walmart walmart = new Walmart();

        System.out.println(getName());
    }

    public static void kenBone()
    {
        int a = 0;
        for(int i=0; i < 90000000; i++)
        {
            a += i;
        }
    }

    public static void setName(String name)
    {
        Main.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void hughMungus()
    {
        int a = 0;
        for(int i=0; i < 10000000; i++)
        {
            a += i;
        }
    }
}
