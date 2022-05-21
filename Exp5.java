class Exp5{
	public static void main(String a[]){
		int arr[][] =new int[4][];
		arr[0] = new int [3];
		arr[1] = new int [3];
		arr[2] = new int [3];
	arr[3] = new int [3];

		arr[0][0] = 4;
arr[0][1] = 5;
arr[0][2] = 6;
arr[1][0] = 7;
arr[1][1] = 8;
arr[1][2] = 7;
arr[2][0] = 1;
arr[2][1] = 13;
arr[2][2] = 8;
arr[3][0] = 8;
arr[3][1] = 1;
arr[3][2] = 55;
	

	int min = arr[0][0];
	for(int i = 0;i<4;i++){
	for(int j=0;j<3;j++){
	if(arr[i][j]<min){
		min = arr[i][j];
	}
}
}
	System.out.println(min);
	
		

	}
}