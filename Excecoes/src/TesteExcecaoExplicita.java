public class TesteExcecaoExplicita {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		try {
			System.out.println(calc.divisao(10, 0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}

class Calculadora {
	public int divisao(int dividendo, int divisor) throws ArithmeticException { //Notificação de exceção
		
		if(divisor == 0) throw new ArithmeticException("Divisão por zero ^_^");
		
		return dividendo / divisor;
	}
}