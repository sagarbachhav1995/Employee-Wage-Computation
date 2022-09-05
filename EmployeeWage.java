package com.blz.employee.wage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		int wagePerHour=20;
		int fullDayHours=8;
		int salary=0;
		
		Random random = new Random();
		int randomNum = random.nextInt(2);

		if (randomNum == 1)
		{
			System.out.println("Employee is Present");
			salary = wagePerHour * fullDayHours;
		}
		else
			System.out.println("Employee is Absent");
		
		System.out.println("Employee salary is : "+salary);
	}

}
