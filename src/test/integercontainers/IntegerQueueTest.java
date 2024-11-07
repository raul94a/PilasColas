package test.integercontainers;

import integercontainers.IntegerQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntegerQueueTest {

    IntegerQueue queue = new IntegerQueue();

    @AfterEach
    public void tearDown() {
        queue = new IntegerQueue();
    }

    @Test
    void insert() {
        queue.insert(0);
        int size = queue.size();
        Assertions.assertEquals(size, 1);
    }

    @Test
    void seekEmptyQueue() {
        Integer result = queue.seek();
        Assertions.assertNull(result);

    }

    @Test
    void seek() {
        int firstElement = 0;
        queue.insert(firstElement);
        int result = queue.seek();
        Assertions.assertEquals(result, firstElement);

    }

    @Test
    void seekKeepsQueueSize() {
        int firstElement = 0;
        queue.insert(firstElement);
        int result = queue.seek();
        int size = queue.size();
        Assertions.assertTrue(size == 1 && result == firstElement);

    }

    @Test
    void removeEmptyStack() {
        Integer result = queue.remove();
        Assertions.assertNull(result);
    }

    @Test
    void remove() {
        int firstElement = 0;
        queue.insert(firstElement);
        Integer result = queue.remove();
        Assertions.assertEquals(result, 0);

    }

    @Test
    void removeRemovesElementFromQueue() {
        int firstElement = 0;
        queue.insert(firstElement);
        queue.remove();
        boolean isEmptyStack = queue.size() == 0;
        Assertions.assertTrue(isEmptyStack);
    }

    @Test
    void sequenceTopAndPopTest() {
        int[] elements = {13, 4, 8, 7, 17, 0, 1};
        for (Integer i : elements) {
            queue.insert(i);
        }
        queue.seek();
        queue.seek();
        Integer result = queue.remove(); // remove
        Assertions.assertEquals(result, 13);
        queue.seek();
        queue.seek();
        result = queue.remove();
        Assertions.assertEquals(result, 4);
        result = queue.remove();
        Assertions.assertEquals(result, 8);
        result = queue.seek();
        Assertions.assertEquals(result, 7);

    }

    @Test
    void searchExistingElement() {
        int[] elements = {13, 4, 8, 7, 17, 0, 1};
        for (Integer i : elements) {
            queue.insert(i);
        }
        int elementToSearch = 17;
        boolean existsElement = queue.search(elementToSearch);
        Assertions.assertTrue(existsElement);
    }

    @Test
    void searchNonExistingElement() {
        int[] elements = {13, 4, 8, 7, 17, 0, 1};
        for (Integer i : elements) {
            queue.insert(i);
        }
        int elementToSearch = 30;
        boolean existsElement = queue.search(elementToSearch);
        Assertions.assertFalse(existsElement);
    }

}
