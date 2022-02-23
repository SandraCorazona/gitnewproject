
public class Array_Bidimensional1 {

	public static void main(String[] args) {
		
		int [][]matriz= {
				{10,12,18,20,89},
				{6,45,30,58,23},
				{63,21,30,47,86},
				{55,46,2,7,48}
		};
          for (int i = 0; i < 4; i++) {
			
			System.out.println();  //para que salga en forma de tabla
			
			for (int j = 0; j < 5; j++) {
				
				System.out.print(matriz[i][j] + " ");				
			}			
			}
		
		}

	}

