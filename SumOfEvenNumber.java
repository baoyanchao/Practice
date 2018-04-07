public class SumOfEvenNumber{
	public static void main(String[] args){
		int i = 0;
		int total = 0;
		do{
			if (i%2==0){
				total = total + i;
			}
			
			i++;
		}while(i <= 100);
		
		
		
		
		
		//求0到100所有偶数的和
		//先得出包括100内所有的偶数
		//然后累加得出的偶数
		/*int i = 0;
		int total = 0;
		
		while (i <= 100){
			if(i%2 == 0){
				total = total + i;
			}
			i++;
		}
		System.out.println(total);
		*/
		
	}
}