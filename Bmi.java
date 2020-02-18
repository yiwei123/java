import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner huoqu = new Scanner(System.in); 
		System.out.println("体脂肪健康指数程序欢迎您");
		System.out.print("你叫什么名字:");
		String name = huoqu.nextLine();
		System.out.print("你的性别是？:");
		String xinbie = huoqu.nextLine();
		if (xinbie.equals("男")){
			System.out.print(name+"先生你的身高是多少m:");
			float stature = huoqu.nextFloat();
			System.out.print(name+"先生你的体重是多少kg：");
			float weigth = huoqu.nextFloat();
			float BMI = weigth/(stature*stature);
				if (BMI<18.5) {
					System.out.printf("%s先生的BIM过轻",name); 
				}
				else if (BMI>=18.5 && BMI<=25) {
					System.out.printf("%s先生的BIM正常",name);
				}
				else if (BMI>=28 && BMI<=32) {
					System.out.printf("%s先生的BIM肥胖",name);
				}
				else if (BMI>32) {
					System.out.printf("%s先生的BIM超级肥胖",name);
				}
			}
		else if (xinbie.equals("女")) {
			System.out.print(name+"女士你的身高是多少m:");
			float stature = huoqu.nextFloat();
			System.out.print(name+"女士你的体重是多少kg：");
			float weigth = huoqu.nextFloat();
			float BMI = weigth/(stature*stature);
				if (BMI<18.5) {
					System.out.printf("%s女士的BIM过轻",name); 
				}
				else if (BMI>=18.5 && BMI<=25) {
					System.out.printf("%s女士的BIM正常",name);
				}
				else if (BMI>=28 && BMI<=32) {
					System.out.printf("%s女士的BIM肥胖",name);
				}
				else if (BMI>32) {
					System.out.printf("%s女士的BIM超级肥胖",name);
				}
			}
		else {
			System.out.printf("请%S同学不要胡乱输入！！！",name);
			System.exit(0);
		}
			
		}
		
	}

