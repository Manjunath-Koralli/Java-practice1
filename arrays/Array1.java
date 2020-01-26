package com.ex.arrays;

class Student 
{ 
    public int roll_no; 
    public String name; 
    Student(int roll_no, String name) 
    { 
        this.roll_no = roll_no; 
        this.name = name; 
    } 
}
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array decalration
		int arr1[];
		//allocating memroy
		arr1 = new int[5];
		for (int i = 0; i < arr1.length; i++) {
	         System.out.println("Element at index " + i + " : "+ arr1[i]); 
		}
		//initialization
		for(int i = 0;i<arr1.length;i++) {
			arr1[i] = i;
		}
		
		for (int i = 0; i < arr1.length; i++) {
	         System.out.println("Element at index " + i + " : "+ arr1[i]); 
		}
		
		
		System.out.println(arr1.hashCode());
		
		int arr2[] = {1,2,3};
		int arr3[] = {1,2,3};
		System.out.println(arr2.hashCode());
		System.out.println(arr3.hashCode());
		
		System.out.println(arr2 == arr3);
		System.out.println(arr2.equals(arr3));
		
		Student[] student = new Student[5];
		student[0]=new Student(1,"aman"); 
		student[1]=new Student(2,"vaibhav"); 
		student[2]=new Student(3,"shikar");
		student[3]=new Student(4,"dharmesh"); 
		student[4]=new Student(5,"mohit");
		
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i].name + " " + student[i].roll_no);
		}
		
		//clone
		//single dimension - deep copy 
		int arr4[] = {1,2,3,4};
		int cloneArr[] = arr4.clone();
		for(int i:cloneArr) {
			System.out.println(i);
		}
		System.out.println(arr4 == cloneArr);
		
		//double dimension - shallow copy
		
		int arr5[][] = {{1,2,3},{4,5}};
		int arr6[][] = arr5.clone();
		System.out.println(arr5 == arr6);
		System.out.println(arr5[0] == arr6[0]);
		System.out.println(arr5[1] == arr6[1]);
		
		final int arr7[] = {1, 2, 3, 4, 5};  // arr is final 
	    for (int i = 0; i < arr7.length; i++) { 
	    	arr7[i] = arr7[i]*10;   
	        System.out.println(arr7[i]);           
	    }  
	    
	    int arr8[] = {10, 20, 30, 40, 50}; 
	    arr8 = arr7;       
	    //arr7 = arr8;   
	    for (int i = 0; i < arr8.length; i++) 
	       System.out.println(arr8[i]);
	    
	    int arr9[][] = new int[2][2];
	    arr9[0][0] = 1;
	    //arr9[0][1] = 10l;// assign long value
	    
	    char b = 10; 
        arr9[1][0] = b; 
  
        // Assigning double value to char type 
        //arr9[1][1] = 10.6; 
        
        //jagged array
        int arr10[][] = new int[2][];
        arr10[0] = new int[3];
        arr10[1] =  new int[1];
        
        int count = 0; 
        for (int i=0; i<arr10.length; i++) {
            for(int j=0; j<arr10[i].length; j++) {
                arr10[i][j] = count++; 
            }
        }
        
        for (int i=0; i<arr10.length; i++) {
            for(int j=0; j<arr10[i].length; j++) {
                System.out.print(arr10[i][j] + " ");
            }
            System.out.println();
        }
        
         
		
		
		
		
		
	}

}
