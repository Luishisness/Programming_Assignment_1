/* Author:  Shawn Vega 
   Due Date:    2/20/2013 
*/ 
  
import java.util.Scanner; 
public class MicroFB  
 { 
 
// Part F : this the max number of people 
public static final int maxPeople=100; 
	 

// Part G : define a global variable of array Person  
public static Person allPeople[]=new Person[maxPeople];  
	 
// define global static integer variable   
public static int peopleCount=0; 
 
// Part H: Create a method Person findPerson(String name) 
//which searches through allPeople 
public static Person findPerson(String person) { 
Person findPerson=null;
// create a for loop that searches through the array allPeople 
try{
	for(int i = 0; i < allPeople.length; i++) 
 	{ 
    		if(allPeople[i].getname().equals(person)) { 
		    findPerson= allPeople[i]; 
     		} 
	}
	     }catch(NullPointerException e) { 
		     //System.out.println("Person does not exist\n");
	     } 
	return findPerson;
} 
 
// Part I: create a main method 
public static void main(String[] args) 
 { 
	// create a scanner for user input 
	Scanner sc=new Scanner(System.in); 
	 
	// give the user a prompt 
	System.out.println("Enter a command: (P,F,L,Q,X) "); 
	 
    String line = ""; 
	 
   
    while(line.equals("X")==false) 
	 { 
    	System.out.print("Enter a new command "); 
    	// create a line break 
    	System.out.println(""); 
		line= sc.next().toUpperCase(); 
		 
		 
		if(line.equals("P")) 
		 { 
		// prompt the user to use enter a name 
		System.out.print("Enter a name: "); 
		System.out.println(""); 
		String name=sc.next(); 
		 
		// call on the pCommand with the name  
		pCommand(name); 
		System.out.println(""); 
		 
		 } 
		 
		else if(line.equals("F")) 
		 { 
			// prompt the user to use enter a name 
			System.out.print("Enter a name: "); 
			String name=sc.next(); 
			 
			// prompt the user to use enter a name 
			System.out.print("Enter another name: "); 
			String name1=sc.next(); 
			 
			// call the fCommand 
			fCommand(name,name1); 
			System.out.println(""); 
		 } 
		else if(line.equals("L")) 
		 { 
			// prompt the user to use enter a name 
			System.out.print("Enter a name you would like to find: \n"); 
			String name= sc.next();  
			 
			//call the search command 
			lCommand(name); 
			System.out.println(""); 
		 } 
		 
		else if(line.equals("Q")) 
		 { 
			// find the two people and check whether the first is on the list of friends of the second  
			// prompt the user to use enter a name 
			System.out.print("Enter a name: "); 
			String name=sc.next(); 
			 
			// prompt the user to use enter a name 
			System.out.print("Enter another name: "); 
			String name1=sc.next(); 
			 
			// call the qCommand 
			qCommand(name,name1); 
		 
		 } 
		else 
		 { 
			System.out.print("Thanks for using FaceBook"); 
		 } 
 
	 } 
		 
 } 
 
 
public static void pCommand(String name) 
 { 
	// find the name and check to see amount of people is not greater than the max number of people allowed 
	if(findPerson(name)==null && peopleCount<=maxPeople) 
	 { 
		// if name is not already added then create a new person  
		Person NewPerson = new Person(name); 
		 
		// set the new person created to the new Person  
		allPeople[peopleCount]=NewPerson; 
		 
		// increase the amount of people 
		peopleCount+=1; 
		// print that the were added  
		System.out.print(name+" has been added"); 
			 
	 } 
// if the name is not than it exists  
else if(findPerson(name)!=null) 
 { 
	// the name already exist  
	System.out.print("The name already exists"); 
	System.out.println(""); 
	 
 } 
 } 
 
public static void fCommand(String pName, String qName) 
 { 
 
	//check for the same person 
	// check to see if the names are equal if they are they cannot be friends  
	try { 
	if(findPerson(pName).getname().equals(findPerson(qName).getname())) 
	 { 
		System.out.println("Sorry, but you cannot be friends with yourself."); 
	 } 
	// if the p or q is null then the person does not exist  
	else if(findPerson(pName)==null | findPerson(qName)==null) { 
		System.out.print("The person does not exist"); 
	 } 
	// add the friend  
	else { 
		findPerson(pName).addFriend(findPerson(qName)); 
	}
	// catch the exception  
	 }catch(Exception e) { } 
	}
	public static void lCommand(String name){
	 Person person=findPerson(name); 
	 if(person!=null){
		for(int i=0;i<findPerson(name).getFriends().length;i++) 
	 { 
		//nameList = nameList + person.getfriends(i).getName() + " "; 
		// get the name of the friends in the array 
		if(person.getFriends()[i]!=null){
			System.out.printf("%s\n",person.getFriends()[i].getname()); //This is not printing  
		}
	    }
	}
	else if(findPerson(name)==null){
		System.out.println("Person you are trying to call does not exist");
 }
}
 
 
// MicroFB end 
 
public static void qCommand(String pName, String qName) 
 { 
	// create two new people  
	boolean friendStatus=false;
	Person p=  findPerson(pName); 
	Person q = findPerson(qName); 
	
	if(p!=null | q!=null){	 
	for(Person pX : p.getFriends()){
		if(pX==q){
			friendStatus=true;	
		}
	}
	if(friendStatus){
		
			System.out.println("Yes they are Friends\n");
	}
	else{
		System.out.println("No they are not Friends\n");
	}
	}
	}	 
	 //u comamand I need to traverse the linked list
} 

  
