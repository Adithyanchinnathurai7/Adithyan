package vin;

public class Arraytry {

	public static void main(String[] args) {
		
		int[] arr= {40,20,50,70,90,10};
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[j]+"\n");
			}
			
			int arrayLength=arr.length;   
			//prints array length  
			System.out.println("The size of the array is: " + arrayLength);  
				
				for(int n:arr) {
					System.out.print(n+"\t");
					//System.out.println();
				}
				int [][] rrr={ {20,60,56,66,89},
							{100,400,600,800,900},
							{1000,2000,3789,4445,5234}
				};
				for(int i=0;i<rrr.length;i++) {
					for(int j=0;j<rrr.length;j++) {
						System.out.print(rrr[i][j]+"\t");
					}
					System.out.println();
				}
								
	}   

}

