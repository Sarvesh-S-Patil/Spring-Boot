package com.Sarvesh.MavenIntro;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter a number :" );
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if(isNumber(num)) {
        	System.out.println("You have entered a number");
        }
        else {
        	System.out.println("It is not a number");
        }
    }
    
    public static boolean isNumber(String s) {
    	return StringUtils.isNumeric(s);
    }
}
