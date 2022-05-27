public class ConditionalStatement{
	public static void main(String[] args) {
		int age = 21;
		boolean isMan = true;
		boolean isWoman = true;
		double height = 1.50;
		char name = "Sanos";

		if(age > 20){
			System.out.println("Grow");
		}

		if(isMan){
			System.out.println("Man");
		}

		if(isWoman){
			System.out.println("Man");
		}

		if(height < 1.80){
			System.out.println("Low");
		} else {
			System.out.println("High");
		}

		if(name.charAt(0) == 'M'){
			System.out.println("Name start with M");
		}

		if(name.charAt(0) == 'S'){
			System.out.println("Name not start with S");	
		}
	}
}