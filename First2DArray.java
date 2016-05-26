import java.util.Scanner;
public class First2DArray {
	
	private static int[][] genesis;
	
	private static int row;
	private static int col;
	
	private static int[][] setUp2DArray(int r, int c) {
		genesis = new int[r][c];
		row = r;
		col = c;
		return genesis;
		}
		
	private static void buildArray() {
		Scanner keys = new Scanner(System.in);
		System.out.println("Input " + (row * col) + " integers please.");
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				genesis[r][c] = keys.nextInt();;
				}
			}		
		}
	
	private static void display() {
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				System.out.print(genesis[r][c] + " ");
				}
			System.out.println();	
			}
		}		
	
	public static void main(String[] args) {
		First2DArray demo = new First2DArray();
		demo.setUp2DArray(3, 6);
		demo.buildArray();
		demo.display();
		}
	}
