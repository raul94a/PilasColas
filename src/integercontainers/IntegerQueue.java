package integercontainers;

import java.util.ArrayList;
import java.util.Objects;

public class IntegerQueue implements IQueue<Integer> {

    private final ArrayList<Integer> queue = new ArrayList<>();

    public IntegerQueue() {
    }

    @Override
    public void insert(Integer i) {
        if (i == null) {
            return;
        }
        queue.add(i);
    }

    @Override
    public Integer remove() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }

    @Override
    public Integer seek() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.getFirst();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean search(Integer i) {
        return queue.stream().anyMatch(q -> Objects.equals(q, i));
    }

    @Override
    public String toString() {
        if (queue.isEmpty()) {
            return "Empty Queue";
        }
        return " " + queue;
    }

}
