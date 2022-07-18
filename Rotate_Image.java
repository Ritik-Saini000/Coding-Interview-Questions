
public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int N=matrix.length;
		for(int i=0;i<N;i++) {
			for(int j=i;j<N;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N/2;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][N-1-j];
				matrix[i][N-1-j]=temp;
			}
		}

		for(int i=0;i<N;i++) {
			System.out.print("[");
			for(int j=0;j<N;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("]\n");
		}
	}

}
