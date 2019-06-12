import java.util.*;
public class MagicSquares {

	public static void main(String[] args) {
		
		Scanner console=new Scanner(System.in);
		System.out.println("Give me an odd number. I will make a magic square.");
		int dim=console.nextInt();
		int [][] array=new int[dim][dim];
		int start=dim/2;
		int x=start=dim-1;
		int y=dim/2;
		for(int i=1;i<=dim*dim;i++) {
			array[x][y]=i;
				if(array[(x+1)%dim][(y+1)%(dim)]==0) {
					x=(x+1)%dim;
					y=(y+1)%(dim);
				}
				else {
					x=(x+dim-1)%(dim);
				}
			}
		for (int i = 0; i < array.length; i++) {
		    for (int j = 0; j < array[i].length; j++) {
		        System.out.print(array[i][j] + " ");
		    }
		    System.out.println();
		}
	}

}
