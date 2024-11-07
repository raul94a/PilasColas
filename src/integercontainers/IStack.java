package integercontainers;

public interface IStack<T> {
	void push(T i);

	T pop();

	T top();

	int size();

	boolean search(T i);

}
