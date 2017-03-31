
package testingProj;

import java.util.Scanner;
public class forLoops{
static Scanner sc = new Scanner(System.in);
static int ArrayLength;

	public static void PromptValues() {
		System.out.println("Number of index in array?");	
		System.out.println("Enter ONLY integers");
			 ArrayLength = sc.nextInt();
			 System.out.println(ArrayLength);
		CallValues();
	}
	
	
	public static void CallValues(){
		int StoredInts[] = new int[ArrayLength];
		 boolean flag = true;
		int TempValue;
		
		  for(int i=0; i<ArrayLength; i++){
              System.out.println("Enter value for index " + (i+1));
              StoredInts[i] = sc.nextInt(); }
		  
		  while ( flag )
		     {
		            flag= false;    //set flag to false awaiting a possible swap
		            for(int i=0;  i < StoredInts.length -1;  i++ ) {
		                   if ( StoredInts[ i ] > StoredInts[i+1] ) {  // change to > for UP sort 
		                           TempValue = StoredInts[ i ];                //swap elements
		                           StoredInts[ i ] = StoredInts[ i+1 ];
		                           StoredInts[ i+1 ] = TempValue;
		                          flag = true;              //shows a swap  
		                  }
		           
		            		}
		      }
		  System.out.println("------------SORTED VALUES------------");
		  for(int i=0; i<ArrayLength; i++){
              System.out.println("[" +(i+1) + "]" + StoredInts[i]);
		  }
		  
		 
	}
		  
	
	public static void main(String[]args){
		//Internal Start codes here
		PromptValues();
		
	}
}
/*
 * {
     int i;
     boolean flag = true;   // set flag to true to begin first pass
     int TempValue;   //holding variable

     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for( i=0;  i < StoredInts.length -1;  i++ )
            {
                   if ( StoredInts[ i ] < StoredInts[i+1] )   // change to > for ascending sort
                   {
                           TempValue = StoredInts[ i ];                //swap elements
                           StoredInts[ i ] = StoredInts[ i+1 ];
                           StoredInts[ i+1 ] = TempValue;
                          flag = true;              //shows a swap occurred 
                  }
            }
      }
}
 
 */

/*
for i = 1:n,
swapped = false
for i = n:i+1, 
    if a[i] < a[i-1], 
        swap a[i,i-1]
        swapped = true
 to* invariant: a[1..i] in final position
break if not swapped
end*/