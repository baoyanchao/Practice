public class InputTest{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("请输入您的消费金额：");
		int money = input.nextInt();
		
		if (money > 100){
			int acount = money/100;
			money -= acount * 20;
			System.out.println("您应该支付的金额为："+ money);
		}
		
		
		
		
		
		
		
		
		/*
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("请输入你消费的金额：");
		int money = input.nextInt();
		
		if(money > 100){
			int count = money/100;
			money -= count * 20;
			System.out.println("您应该支付的金额为:"+ money);
		}
		*/
		
		/*java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("请输入你的用户名：");
		String name = input.next();
		
		System.out.println("请输入你的密码：");
		String password = input.next();
		
		/*if(name.equals("jack")&&password.equals("123456")){
			System.out.println("欢迎登录");
		}else{
			System.out.println("你的用户名或密码错误，请重新输入！");
		}
		*/
		//String str = (name.equals("jack")&&password.equals("123456"))?"登录成功":"登录失败";
		//System.out.println(str);
		
		
		
		
		
		
		
		
		/*
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int numA = input.nextInt();
		System.out.println("请输入第二个数字：");
		int numB = input.nextInt();
		int temp = numA;
		    numA = numB;
			numB = temp;
		System.out.println("两数在交换之后为："+"numA =" + numA +"numB =" +numB);
		*/
		
        		 
		/*java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("请输入您的姓名：");
		String name = input.next();
		System.out.println("请输入您的年龄：");
		int age = input.nextInt();
		System.out.println("欢迎您！" +name+",您的年龄是"+age+"岁" );*/
		/*java.util.Scanner input = new java.util.Scanner (System.in);
		System.out.println("请输入一个数字a：");
		int a = input.nextInt();
		System.out.println("请再输入一个数字b：");
		int b = input.nextInt();
		System.out.println("a=" + b);
		System.out.println("b=" + a);
		int c = a ;
		    b = c;
		int d = b;
		    a = d;*/
			/*int a = 10; 
			int b = 20;
			System.out.println(a > b); */
			/*java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("请输入名字：");
			String name = input.next();
			System.out.println("请输入第一个数字：");
			int a = input.nextInt();
			System.out.println("请输入第二个数字：");
			int b = input.nextInt();
			System.out.println(name+"，您计算的两个数字之和："+(a+b));*/
			//String str = "3 + 4 ="+(3+4);
			//System.out.println (str);
			//String str = 3 + 4 + "= 3 + 4";
			//System.out.println(str);
			/*String ch = "郭";
			int a = 22;
			System.out.println(ch + a);*/
			/*char ch = '郭';
			int a = 22;
			System.out.println(ch + a);*/
			/*byte a = 10;
			 a = (byte)(a + 1);   
			System.out.println(a);*/
			/*int numA = 123456789;
			float numB = numA;
			System.out.println(numB);*/
			/*long numA = 100L;
			int numB = (int)numA;
			System.out.println(numB);*/
			/*int a = 10;
			int b = a++;
			System.out.println(a);
			System.out.println(b);*/
			/*int a = 10;
			int b = ++a;
			System.out.println(a);
			System.out.println(b);*/
			//System.out.println((int)(10/3.0));
			/*double numA = 2.0;
			double numB = 1.1;
			System.out.println(numA-numB);*/
			/*java.util.Scanner input = new java.util.Scanner(System.in);
			
			System.out.println("请输入第一个数字：");
			int numA = input.nextInt();
			
			System.out.println("请输入第二个数字：");
			int numB = input.nextInt();
			
		    System.out.println("输出两数交换之前的值："+"numA="+ numA +",numB="+numB);
			
			numA = numA + numB;// 30  10  20
			numB = numA - numB;
			numA = numA - numB;
			
			System.out.println("输出两数交换之后的值："+"numA="+ numA +",numB="+numB);
			*/
			/*java.util.Scanner input = new java.util.Scanner(System.in);
			
			System.out.println("请输入第一个数字：");
			int numA = input.nextInt();
			
			System.out.println("请输入第二个数字：");
			int numB = input.nextInt();
			
			int temp = numA;
			    numA = numB;
				numB = temp;
				
			System.out.println("输出两数交换之后的值："+"numA="+ numA +",numB="+numB);
			*/
			//double a = 10 / 3.0;
			//double a = 10 / 3;
			//System.out.println(a);
			
			
			
			
	}
}