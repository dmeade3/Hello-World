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
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public class test2 {

        int test1;
        int test2;

        public int getTest1() {
            return test1;
        }

        public void setTest1(int test1) {
            this.test1 = test1;
        }

        public int getTest2() {
            return test2;
        }

        public void setTest2(int test2) {
            this.test2 = test2;
        }

        public class test3 {

            int test1;
            int test2;

            public int getTest1() {
                return test1;
            }

            public void setTest1(int test1) {
                this.test1 = test1;
            }

            public int getTest2() {
                return test2;
            }

            public void setTest2(int test2) {
                this.test2 = test2;
            }


        }


    }

    public class test1 {

        int test1;
        int test2;

        public int getTest1() {
            return test1;
        }

        public void setTest1(int test1) {
            this.test1 = test1;
        }

        public int getTest2() {
            return test2;
        }

        public void setTest2(int test2) {
            this.test2 = test2;
        }


    }
}
