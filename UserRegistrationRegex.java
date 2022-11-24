package com.bridgelab.user_registration;

import java.util.Scanner;
//Method for validation of first name -- UC1
public class UserRegistrationRegex {

		public static boolean firstName(String firstname) {
			return firstname.matches("^[A-Z]{1}[a-zA-Z]{2,}$");
		}

		public static void main(String[] args) {
			System.out.println("Welcome in User registration program using Regex");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Name");
			String firstname = sc.next();
			if (firstName(firstname)) {
				System.out.println(firstname + " : is a valid first name ");
			} else {
				System.out.println(firstname + " : is a invalid first name ");
			}
		}

}
