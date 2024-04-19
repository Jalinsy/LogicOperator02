public class LogicOperator02 {
	public static void main(String[] args) {
		//'||短路或' 和  '|逻辑或' 演示
		int age = 50;
		if(age > 20 || age < 90) {
			System.out.println("OK1");
		}
		
		if(age > 20 | age < 30) { 
			System.out.println("OK2");
		}
		
		int a = 4;
		int b = 9;
		if(a > 1 | ++b > 4) {
			System.out.println("OK3");
		}
		System.out.println("a=" + a + "b=" + b);
	
	}
}