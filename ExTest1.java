
public class ExTest1 {
	public static void main(String args[]) {
		int a = 0, b = 10;
		try {
			
			System.out.println(b / a);
			System.out.println("Game Over");
			
			
		} catch (Exception e) {
			System.out.println("It is ArithmeticaException");
			return;

		}finally{
			System.out.println("/0");
		}
		
	}

}
