public class InsertSort {
	public static void main(String[] args){
		int[] arr = new int[]{2,1,6,4,5,7,3};
		for(int i = 1; i < arr.length; i++){
			int j = i;
			int temp = arr[j];
			while(j > 0&&temp < arr[j-1]){
				arr[j] = arr[j-1];
				j --;
			}
			arr[j] = temp;
			
		}
		for(int n : arr){
			System.out.println(n);
		}
	}
}