package integercontainers;

public class StackMain {

	public static void main(String[] args) {

		IntegerStack stack = new IntegerStack();

		// Probaremos la función top con el stack vacío

		Integer result = stack.top();
		System.out.println(result + ""); // null

		// Igual con pop, el resultado debe ser null
		result = stack.pop();
		System.out.println(result + "");

		// añadimos un elemento con push
		int firstElement = 5;
		stack.push(firstElement);

		int size = stack.size();
		System.out.println(size); // 1

		result = stack.top();
		System.out.println(result + ""); // 5

		result = stack.pop();
		System.out.println(result + ""); // 5

		size = stack.size();
		System.out.println(size); // 0

		// insertamos varios elementos
		int[] elements = { 13, 4, 8, 7, 17, 0, 1 };
		for (Integer i : elements) {
			stack.push(i);
		}
		System.out.println("" + stack);
		int elementToSearch = 17;
		boolean existsElement = stack.search(elementToSearch);
		System.out.println(existsElement + ""); // true

		elementToSearch = 30;
		existsElement = stack.search(elementToSearch);
		System.out.println(existsElement + ""); // false

		stack.top();
		stack.top();

		stack.pop(); // se elimina el 1

		stack.top();
		stack.top();

		stack.pop(); // se elimina el 0

		result = stack.pop();
		System.out.println(result + ""); // 17

		result = stack.top();
		System.out.println(result + ""); // 7

	}

}
