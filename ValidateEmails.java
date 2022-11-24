package com.bridgelab.user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmails {
	public static void email(String email) {
		String regex = "^[a-z]{3,}[.+-_]*[a-z0-9]*{3,}[@][a-z0-9]{1,}[.][a-z]{2,}[.]*[a-z]*{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher match = p.matcher(email);
		if (match.matches()) {
			System.out.println(email + " : is a valid email ");
		} else {
			System.out.println(email + " : is a invalid email ");
		}
	}
	public static void main(String[] args) {
		System.out.println("valid E-mails");
		email("abc@yaho.com");
		email("abc-100@yahoo.com");
		email("abc.100@yahoo.com");
		email("abc111@abc.com");
		email("abc-100@abc.net");
		email("abc.100@abc.com.au");
		email("abc@1.com");
		email("abc@gamil.com.com");
		email("abc+100@gamil.com");
		System.out.println("");
		System.out.println("Invalid E-mails");
		email("abc");
		email(".abc@.com.my");
		email("abc123@gmail.a");
		email("abc123@.com");
		email("abc123@.com.com");
		email(".abc@.abc.com");
		email("abc()*@gamil.com");
		email("abc@%*.com");
		email("abc..2002@gamil.com");
		email("abc@abc@gmail.com");
		email("abc@gmail.com.1a");
		email("abc@gmail.com.aa.au");
	}
}
