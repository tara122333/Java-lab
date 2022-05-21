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
// 	for(int i = 0;i<arr.length;i++){
// 	for(int j=0;j<arr[i].length;j++){
// 	if(arr[i][j]<min){
// 		min = arr[i][j];
// 	}
// }
// }
	// int i = 0;
	for(int x[]:arr){
		for(int y:x){
			if(y<min){
				min = y;
			}
		}
	}
	System.out.println(min);
	}
}