package test.integercontainers;

import static org.junit.jupiter.api.Assertions.*;

import integercontainers.IntegerStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.*;

class IntegerStackTest {

    IntegerStack stack = new IntegerStack();


    @AfterEach
    public void tearDown() {
        stack = new IntegerStack();

    }

    @Test
    void push() {
        stack.push(0);
        int size = stack.size();
        Assertions.assertEquals(size, 1);
    }

    @Test
    void topEmptyStack() {
        Integer result = stack.top();
        assertNull(result);

    }

    @Test
    void top() {
        int firstElement = 0;
        stack.push(firstElement);
        int result = stack.top();
        Assertions.assertEquals(result, firstElement);

    }

    @Test
    void topKeepsStack() {
        int firstElement = 0;
        stack.push(firstElement);
        int result = stack.top();
        int size = stack.size();
        Assertions.assertTrue(size == 1 && result == firstElement);

    }

    @Test
    void popEmptyStack() {
        Integer result = stack.pop();
        assertNull(result);
    }

    @Test
    void pop() {
        int firstElement = 0;
        stack.push(firstElement);
        Integer result = stack.pop();
        Assertions.assertEquals(result, 0);

    }

    @Test
    void popRemovesElementFromStack() {
        int firstElement = 0;
        stack.push(firstElement);
        stack.pop();
        boolean isEmptyStack = stack.size() == 0;
        Assertions.assertTrue(isEmptyStack);
    }

    @Test
    void sequenceTopAndPopTest() {
        int[] elements = {13, 4, 8, 7, 17, 0, 1};
        for (Integer i : elements) {
            stack.push(i);
        }
        stack.top();
        stack.top();
        Integer result = stack.pop(); // remove
        Assertions.assertEquals(result, 1);
        stack.top();
        stack.top();
        result = stack.pop();
        Assertions.assertEquals(result, 0);
        result = stack.pop();
        Assertions.assertEquals(result, 17);
        result = stack.top();
        Assertions.assertEquals(result, 7);

    }

    @Test
    void searchExistingElement() {
        int[] elements = {13, 4, 8, 7, 17, 0, 1};
        for (Integer i : elements) {
            stack.push(i);
        }
        int elementToSearch = 17;
        boolean existsElement = stack.search(elementToSearch);
        Assertions.assertTrue(existsElement);
    }

    @Test
    void searchNonExistingElement() {
        int[] elements = {13, 4, 8, 7, 17, 0, 1};
        for (Integer i : elements) {
            stack.push(i);
        }
        int elementToSearch = 30;
        boolean existsElement = stack.search(elementToSearch);
        Assertions.assertFalse(existsElement);
    }

}
