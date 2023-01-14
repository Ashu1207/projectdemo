package java8demo;

public class FuctionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * SayHii i=(int a)->{System.out.println("Hii friends"+a); return a;}; int
		 * num=i.getNumber(100);
		 */
		SayHii i2 = new SayHii() {

			@Override
			public int getNumber(int a) {
				// TODO Auto-generated method stub
				return a;
			}

			@Override
			public void setInfo() {
				System.out.println(" I am bhavana Patil");
			}

			/*
			 * public static void getInfo() { System.out.println("I am getInfo"); }
			 */
		};
		int num = i2.getNumber(100);
		i2.setInfo();
		SayHii.getInfo();

		System.out.println("I am getNumber" + num);

	}

}
