
public class ArrayDemo {
	public static void main(String[] args) {
	      int[] myArray = {1,100,3,400,5};
	      
	      //retrieve array values
	      for(int i=0;i<5;i++)
	      {
	    	  System.out.println(myArray[i]);
	      }
	      
	      //Summing all Arrays
	      int j=0;
	      for (int i=0;i<myArray.length;i++)
	      {
	    	 j= j+ myArray[i];
	      }
	      System.out.println("The Sum of array values is " + j);
	   
	
		//Finding the largest Array value
	
		j=0;
		int temp=0;
		for (int i=0;i<myArray.length;i++)
		{
			if(temp<myArray[i]) 
			{
				temp=myArray[i];
			}
			
		}
		System.out.println("The largest array value is " + temp);
	

}
}
