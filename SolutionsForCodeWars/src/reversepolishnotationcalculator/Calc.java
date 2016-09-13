package reversepolishnotationcalculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class Calc {

	public double evaluate(String expr) {
		// TODO: Your awesome code here
		if (expr.isEmpty()) {
			return 0;
		}

		Deque<String> calc = new ArrayDeque<>();
		double operandA, operandB = 0;
		double result = 0;

		String[] tokens = expr.split(" ");

		for (int i = 0; i < tokens.length; i++) {
			calc.push(tokens[i]);
			if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
				calc.poll();
				operandB = Double.parseDouble(calc.poll());
				operandA = Double.parseDouble(calc.poll());

				switch (tokens[i]) {
				case "+":
					result = operandA + operandB;
					break;
				case "-":
					result = operandA - operandB;
					break;
				case "*":
					result = operandA * operandB;
					break;
				case "/":
					result = operandA / operandB;
					break;
				}

				calc.push(Double.toString(result));
			}

		}

		result = Double.parseDouble(calc.poll());

		if (!calc.isEmpty()) {
			return Double.parseDouble(tokens[tokens.length - 1]);
		} else {
			return result;
		}

	}

}
