package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
     Alina joined the company last week. She receives the company mails in
     bulk and it is very hectic to go through each and every mail. She wants
     to filter out the emails that are related to Human Resources(HR) Department.
     So help her make the list of the designations that are related to HR.

     Write a program that accepts designations in a String array. Check the given
     array elements containing "HR" and display the total number of elements that
     contains "HR" and display the elements in the upper case. If no elements contains
     "HR" then return "-1" as output.

      Input Format
      A multiline string input.
      Constraints
      Atleast one element is required.

      Output Format
      Number of designation that contains "HR" along with the elements.
      Sample Input 0

      4
      HRExecutive
      Accountant
      HRManager
      SalesMan
      Sample Output 0
      2
      HREXECUTIVE
      HRMANAGER
      Sample Input 1

      2
      Operator
      Programmer
      Sample Output 1
      -1
	 */
        String[] str = {"manager","manipal","clerkHR","ghivaHR"};
        designation(str);
    }
    public static void designation(String[] str){
        String[] str1 = new String[str.length];
        int j=0;

        // if it will contains "HR" then it will add the word in the new string array.

        for(int i=0;i<str.length;i++) {
            if (str[i].contains("HR")) {

                // conversion with lowercase.

                str1[j] = str[i].toUpperCase();
                j++;
            }
        }
            if(j==0){
                System.out.println("-1");
            }
            else{
                for(int k=0;k<j;k++){
                    System.out.println(str1[k]);
                }
                System.out.println(j);
            }
        }
    }
