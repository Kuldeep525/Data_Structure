package com.bridgelabz.program;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;


public class SingleLinkList {
	
		public static void main(String[] args) {
			Utility utility = new Utility();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the option what you want to see");
			System.out.println("1. Creation of linklist \n 2. Append of  integer \n 3.  Insert by position \n 4. Delete first element \n 5.Delete last element \n "
					+ "6.Search the number \n 7. Insert data in between \n 8.Delete of middle data \n 9.Sorted list");
			
			int input = scanner.nextInt();
			switch(input) {
			case 1 :
				utility.insertData(70);
				utility.insertData(30);
				utility.insertData(56);
				utility.printLinkedList();
				break;
			case 2 :
				System.out.println("Append");
				utility.append(56);
				utility.append(30);
				utility.append(70);
				utility. printLinkedList();
				break;
			case 3:	
				System.out.println("Insert by position");
				utility.insert(2,30);
				utility. printLinkedList();
				break;
			case 4 :	
				System.out.println(" Delete first element  ");
				utility.insertData(56);
				utility.insertData(30);
				utility.insertData(70);
				System.out.println();
				System.out.println(utility.deleteFirst().data);
				utility. printLinkedList();
			    break;
			case 5 :
				System.out.println("Delete last element ");
				utility.insertData(56);
				utility.insertData(30);
				utility.insertData(70);
				utility. printLinkedList();
				System.out.println();
				System.out.println(utility.deleteLast().data );
				utility. printLinkedList();
				break;
			case 6 :
				System.out.println("Search the number");
				utility.insertData(56);
				utility.insertData(30);
				utility.insertData(70);
				utility. printLinkedList();
				 System.out.println();
				 if(utility.find(30)) {
					 System.out.println("found");
				 }
				 else {
					 System.out.println("not found");
				 }
				 break;
			case 7 :
				System.out.println("to insert data in between");
				utility.insertData(56);
				utility.insertData(30);
				utility.insertData(70);
				utility.printLinkedList();
				 System.out.println();
				 if( utility.find(30)) {
					 System.out.println("found");
						utility.insert(3,40);
						utility.printLinkedList();
					 System.out.println();
					 System.out.println(" Data is insert between 30 and 70");
				 }
				 else {
					 System.out.println("not found");
				 }
			
				 break;
			case 8 :
				 System.out.println("To delete 40 ");
					utility.insertData(56);
					utility.insertData(30);
					utility.insertData(40);
					utility.insertData(70);
					utility.printLinkedList();
				 System.out.println();
				 if( utility.find(40)) {
					 System.out.println("found");
						utility.delete(3);
						utility.printLinkedList();
					 System.out.println();
					 System.out.println("Size of list is " +utility.length());

				 }
				 else {
					 System.out.println("not found");
				 }  
				 break;
			case 9 :
				 System.out.println("Sorted list");
				 utility.insertData(56);
				 utility.insertData(30);
				 utility.insertData(40);
				 utility.insertData(70);
				 System.out.println("Original data");
				 utility.printLinkedList();
				 System.out.println();
				 utility.sortedList();
				 System.out.println("sorted data");
				 utility.printLinkedList();	
				 break;
			default :  
				System.out.println("Enter correct option ");
			}
				
			                                
				
				
				
		}					
		                                
		
		
	}
	


