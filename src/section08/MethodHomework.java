package section08;
// 계산기 메서드


public class MethodHomework {
	public static void main(String[] args) {
		double result = calculate(7, 2, '/');
		System.out.println(result);
	}
	
	
	public static double calculate(double num1, double num2, char operator) {
		double result = 0;
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Division by zero is not allowed.");
			}
			break;
		default:
			System.out.println("Invalid operator");
		}
		return result;
	}
}
