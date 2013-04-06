/* Author:  Shawn Vega
   Due Date:    2/20/2013
*/
 
////////////////Programming Assignment 1/////////////////////////
public class Person 
{

	// Part A. define the static constant maxFriends
	private static final int MAX_FRIENDS=10;
	
	// Part B.data fields 
	private String name;
	private int numFriends;
	private Person [] friends;
	
	
	//Part C.
	//Getters
	public String getname()
	{ 
		return name;
	}
	public int getnumFriends()
	{
		return numFriends;
	}
	public Person[] getFriends()
	{ 
		return friends;
	}

	public String setname()
	{
		return name;
	}
	
	//Part C.
	// create a constructor
	public Person(String n)
	{
		name=n;
		// size of array maxFriends
		friends=new Person[MAX_FRIENDS];
		 numFriends = 0; //New Line
	}
	
	//Part E
	// method - add friend
		public void addFriend(Person q)
		{

				//check that neither person 
				if( (this!=null || q!=null) & (q.numFriends < MAX_FRIENDS|| this.numFriends <MAX_FRIENDS ))
				{
					System.out.println("Your friend has been added");
					q.friends[numFriends] = this;
					this.friends[numFriends] = q;
					this.numFriends++;
					q.numFriends ++;

				}
				// friend is not maxed out
				// neither p or q is null then they are able to add a friend 
				
				else
				{
				System.out.println("Sorry, but you are unable to add this friend.");
				// add q at the end of the array and vice versa 
				}
		}
	

}
