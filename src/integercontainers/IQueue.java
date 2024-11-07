package integercontainers;

public interface IQueue<T> {

	void insert(T i);

	T remove();

	T seek();

	int size();

	boolean search(T i);

}
