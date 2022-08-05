package javaPrograms;

/*1.single dimension
Datatype Variablename[] = new datatype[row];

2.multi-dimension
Datatype Variablename[][]= new datatype[row][cols];*/

/*3. object array
accept various datatypes in an array*/


public class TC006_ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//-------------------single dimensional------------------------
		int nos[]=new int[5];
		nos[0]=10;
		nos[1]=20;
		nos[2]=30;
		nos[3]=40;
int arrayLength1=nos.length;
		
		
		int j;
		for(j=0;j<arrayLength1;j++)
		System.out.print(nos[j]+" ");
	}}

	/*	String name[] = new String[3];
		
		name[0] = "shobana";
		name[1] = "govindaraju";
		name[2] = "Aravindh";
		int arrayLength=name.length;
		
		
		int i;
		for(i=0;i<arrayLength;i++)
		System.out.print(name[i]+" ");*//*
	}}*/
//----------------multi dimensional-------------------------------------
		
		
		/*int nos[][]= new int[2][3];
		nos[0][0] = 10;
		nos[0][1] = 20;
		nos[0][2] = 30;
		nos[1][0] = 40;
		nos[1][1] = 50;
		nos[1][2] = 60;
		
		System.out.println("row length is "+nos.length );
		System.out.println("column length is "+nos[0].length );
		//int arrayLength=nos.length;
		
		int i,j;
		for(i=0;i<nos.length;i++) 
		{
			for(j=0;j<nos[0].length;j++)
			{
				System.out.print(nos[i][j]+" ");
				}
			System.out.println();  //for new line in matrix
			}*/

//----------------object array------------------
		/*Object  details[][] = new Object[2][6];
		details[0][0] = "shobana";
		details[0][1] = 'g';
		details[0][2] = 23;
		details[0][3] = 19.87;
		details[0][4] = "shobana.g@gmail.com";
		details[0][5] = true;
		details[1][0] = "aravindh";
		details[1][1] = 'r';
		details[1][2] = 22;
		details[1][3] = 19.80;
		details[1][4] = "aravindh.r@gmail.com";
		details[1][5] = false;
		System.out.println("rowlength="+details.length);
		System.out.println("column length="+details[0].length);
		
		int i,j;
		
		for(i=0;i<details.length;i++) {
			for(j=0;j<details[0].length;j++) {
				System.out.print(details[i][j]+"   ");
			}System.out.println();
		}
		
	}
*/
