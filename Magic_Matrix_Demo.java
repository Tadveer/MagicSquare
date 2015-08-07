/*
* The class Magic_Matrix creates a Square Matrix of size n*n and fills it
* in such a way that sum of every row and every column is the same
*/
 
import java.util.*;

public class Magic_Matrix_Demo
{
public void createMatrix(int [][]matrix,int size)
{  
             
                /* Filling the matrix with natural numbers from 1 till n*n */
                for(int i=0;i<size;i++)
                {
                    for(int j=0;j<size;j++)
                        {
                            matrix[i][j] = 0;
                        }
                }
}

public void OddMagicSquareMatrix(int [][] matrix,int size)
{
int i=0; 
int limit=size*size;
int j = size/2;
int k = 1;
while(k<=limit)
{
matrix[i][j] = k++;
i--; // Making one step upward
j++; // Moving one step to the right
 
if(i<0 && j>size-1) // Condition for the top-right corner element
{
i = i+2;
j--;
}
 
if(i<0) // Wrapping around the row if it goes out of boundary
i = size-1;
 
if(j>size-1) // Wrapping around the column if it goes out of boundary
j = 0;
 
if(matrix[i][j]>0) // Condition when the cell is already filled
{
i = i+2;
j--;
}
}	
}

public void displayMagicSquareMatrix(int [][]matrix,int size)
{

/* Printing the Magic matrix */
            System.out.println("The Magic Matrix of size "+size+"x"+size+" is:");
            for(int i=0;i<size;i++)
                {
                    for(int j=0;j<size;j++)
                        {
                            System.out.print(matrix[i][j]+ "\t");
                        }
                 System.out.println();
                }
}

public static void main(String args[])
{            
            Magic_Matrix_Demo dm=new Magic_Matrix_Demo();
            Scanner sc=new Scanner(System.in);
            System.out.print("\n\nEnter the size of the matrix : ");
            int size=sc.nextInt(); 
            
            if(size<2&&size>5)
             System.out.println("Invalid Input");
			else
			{
			int matrix[][]=new int[size][size];
	        /* When the size of the matrix is Odd */
			if(size%2!=0)
            {
			   dm.createMatrix(matrix,size);	
               dm.OddMagicSquareMatrix(matrix,size);
			   
			}
			dm.displayMagicSquareMatrix(matrix,size);
			}			 
			 		 
}
}