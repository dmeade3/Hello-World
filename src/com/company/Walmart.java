package com.company;

import java.util.ArrayList;

/**
 * Created by dcmeade on 10/31/2016.
 */
public class Walmart
{
    private ArrayList<Employee> employees = new ArrayList<>();

    public Walmart() {

        Employee a1 = new Employee(7.5, "a1", "test");
        employees.add(a1);

        Employee a2 = new Employee(71.5, "a2", "test");
        employees.add(a1);

        Employee a3 = new Employee(72.5, "a3", "test");
        employees.add(a1);

        Employee a4 = new Employee(73.5, "a4", "test");
        employees.add(a1);

        Employee a5 = new Employee(74.5, "a5", "test");
        employees.add(a1);

        Employee a6 = new Employee(75.5, "a6", "test");
        employees.add(a1);

        Employee a7 = new Employee(76.5, "a7", "test");
        employees.add(a1);

        Employee a8 = new Employee(77.5, "a8", "test");
        employees.add(a1);

        Employee a9 = new Employee(78.5, "a9", "test");
        employees.add(a1);

        Employee a10 = new Employee(79.5, "a10", "test");
        employees.add(a1);
    }

    public void addUpEmployees()
    {

        int i = 0;
        for(Employee emp: employees)
        {
            for(Employee emp1: employees)
            {
                for(Employee emp2: employees)
                {
                    i++;
                }
            }
        }

        System.out.println(i);
    }

	public static void main(String... args)
	{
		Walmart walmart = new Walmart();

		walmart.addUpEmployees();
	}

}
