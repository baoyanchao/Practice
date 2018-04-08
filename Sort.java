
public class Sort {

	public static void main(String[] args) {
		//随机数生成器
		java.util.Random random = new java.util.Random();
		//输入器
		java.util.Scanner input = new java.util.Scanner(System.in);
		//随机生成一个0到100以内的数字
		int answer = random.nextInt(100);
		//定义错误次数
		int errornum = 0;
		
		//用户循环输入猜测的数字
		while(true) {
			System.out.println("请输入你猜测的数字：");
			int num = input.nextInt();
			
			if(num > answer) {
				System.out.println("太大啦");
				errornum++;	
			}else if(num < answer){
				System.out.println("太小了");
				errornum++;
			}else {
				System.out.println("太棒啦，你猜对啦");
				break;
			}
			
		}
		if(errornum > 8) {
			System.out.println("太Low啦！");
		}else if(errornum > 4){
			System.out.println("还行吧！");
		}else {
			System.out.println("牛逼！");
		}
		//如果用户输入的数字比随机数字大，则提示太大啦，错误次数加1
		//如果用户输入的数字比随机数字小，则提示太小啦，错误次数加1
		//如果用户输入的数字和随机数一样大，则提示成功！
		//根据用户错误次数评级。

		
	}

}
