package day_07;

public class Two_Dimensional_array {

	public static void main(String[] args) {
     	int a[][]= 	new int [3][2];
     	
     	a[0][0]=10;
     	a[0][1]=20;
     	a[1][0]=30;
     	a[1][1]=40;
     	a[2][0]=50;
     	a[2][1]=60;
     	
     	//System.out.println(a.length);// read rows or array
     //	System.out.println(a[0].length);// read column size
     	
     	
     	for (int i=0; i<=2;i++) {
     		
     		for(int j=0;j<=1;j++) {
     			System.out.println(a[i][j]);
     		
     		}
     	
     	}
     	
     	
     	
     	
     	
     	
	}

}
