// Java program to find shortest distance
// in a multistage graph.

import java.util.*;
class Main
{
	static int INF = Integer.MAX_VALUE;

	public static int shortestDist(int[][] graph , int N)
	{
		int[] dist = new int[N];
		dist[N - 1] = 0;
		for (int i = N - 2; i >= 0; i--)
		{

			dist[i] = INF;
			for (int j = i; j < N; j++)
			{
				if (graph[i][j] == INF)
				{
					continue;
				}
				dist[i] = Math.min(dist[i], graph[i][j]
						+ dist[j]);
			}
		}
		return dist[0];
	}

	// Driver code
	public static void main(String[] args)
	{
		// Graph stored in the form of an
		// adjacency Matrix
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter number of vertex");
		int n = sc.nextInt();
		int array[][] = new int[n][n];   
// Read the matrix values   
                System.out.println("Enter the elements of the array: ");   
//loop for row  
                for (int i = 0; i < n; i++){   
//inner for loop for column  
                for (int j = 0; j < n; j++) {
                        System.out.println("Enter element in position of"+"("+i+","+j+")");
                        int inp = sc.nextInt();
                        if(inp == 0)
                        {
                              array[i][j]=INF;  
                        }
                        else{
                             array[i][j] = inp;    
                        }
                       
                }  
   }
		
		System.out.println("Elements of the array are: ");   
                for (int i = 0; i < n; i++){   
                for (int j = 0; j < n; j++) {  
//prints the array elements  
                System.out.print(array[i][j] + " "); 
                        
                }  
//throws the cursor to the next line  
                System.out.println(); 
                } 

		System.out.println("Shortest distance is "+shortestDist(array,n));
	}
}

// This code has been contributed by 29AjayKumar
