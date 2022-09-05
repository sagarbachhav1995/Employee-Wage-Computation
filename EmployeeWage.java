package com.blz.employee.wage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");

		int wagePerHour = 20;
		int fullDayHours = 8;
		int halfDayHours = 4;
		int salary = 0;
		int workingDayPerMonth = 20;
		int monthlySalary = 0;

		Random random = new Random();
		int randomNum = random.nextInt(3);

		for (int i = 1; i <= workingDayPerMonth; i++) {
			switch (randomNum) {
			case 0:
				System.out.println("Employee is Absent");
				break;

			case 1:
				System.out.println("Employee is Present");
				salary = wagePerHour * fullDayHours;
				break;

			case 2:
				salary = wagePerHour * halfDayHours;
				break;
			}

			monthlySalary = monthlySalary + salary;

		}
		System.out.println("Employee Monthly Salary is : " + monthlySalary);
	}

}
