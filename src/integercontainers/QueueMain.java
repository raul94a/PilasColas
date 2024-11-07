package integercontainers;

public class QueueMain {
    public static void main(String[] args) {

        IntegerQueue queue = new IntegerQueue();

        // Probaremos la función top con el queue vacío

        Integer result = queue.seek();
        System.out.println(result + ""); // null

        // Igual con pop, el resultado debe ser null
        result = queue.remove();
        System.out.println(result + "");

        // añadimos un elemento con push
        int firstElement = 5;
        queue.insert(firstElement);

        int size = queue.size();
        System.out.println(size); // 1

        result = queue.seek();
        System.out.println(result + ""); // 5

        result = queue.remove();
        System.out.println(result + ""); // 5

        size = queue.size();
        System.out.println(size); // 0

        // insertamos varios elementos
        int[] elements = {13, 4, 8, 7, 17, 0, 1};
        for (Integer i : elements) {
            queue.insert(i);
        }
        System.out.println("" + queue);
        int elementToSearch = 17;
        boolean existsElement = queue.search(elementToSearch);
        System.out.println(existsElement + ""); // true

        elementToSearch = 30;
        existsElement = queue.search(elementToSearch);
        System.out.println(existsElement + ""); // false

        queue.seek();
        queue.seek();

        queue.remove(); // se elimina el 13

        queue.seek();
        queue.seek();

        queue.remove(); // se elimina el 4

        result = queue.remove();
        System.out.println(result + ""); // 8

        result = queue.seek();
        System.out.println(result + ""); // 7

    }

}
