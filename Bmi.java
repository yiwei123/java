import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner huoqu = new Scanner(System.in); 
		System.out.println("��֬������ָ������ӭ��");
		System.out.print("���ʲô����:");
		String name = huoqu.nextLine();
		System.out.print("����Ա��ǣ�:");
		String xinbie = huoqu.nextLine();
		if (xinbie.equals("��")){
			System.out.print(name+"�����������Ƕ���m:");
			float stature = huoqu.nextFloat();
			System.out.print(name+"������������Ƕ���kg��");
			float weigth = huoqu.nextFloat();
			float BMI = weigth/(stature*stature);
				if (BMI<18.5) {
					System.out.printf("%s������BIM����",name); 
				}
				else if (BMI>=18.5 && BMI<=25) {
					System.out.printf("%s������BIM����",name);
				}
				else if (BMI>=28 && BMI<=32) {
					System.out.printf("%s������BIM����",name);
				}
				else if (BMI>32) {
					System.out.printf("%s������BIM��������",name);
				}
			}
		else if (xinbie.equals("Ů")) {
			System.out.print(name+"Ůʿ�������Ƕ���m:");
			float stature = huoqu.nextFloat();
			System.out.print(name+"Ůʿ��������Ƕ���kg��");
			float weigth = huoqu.nextFloat();
			float BMI = weigth/(stature*stature);
				if (BMI<18.5) {
					System.out.printf("%sŮʿ��BIM����",name); 
				}
				else if (BMI>=18.5 && BMI<=25) {
					System.out.printf("%sŮʿ��BIM����",name);
				}
				else if (BMI>=28 && BMI<=32) {
					System.out.printf("%sŮʿ��BIM����",name);
				}
				else if (BMI>32) {
					System.out.printf("%sŮʿ��BIM��������",name);
				}
			}
		else {
			System.out.printf("��%Sͬѧ��Ҫ�������룡����",name);
			System.exit(0);
		}
			
		}
		
	}

