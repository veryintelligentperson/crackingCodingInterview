package app.dataStructures.list;

public interface MyList<T> {

    T get(int index);

    void add(T element);

    void add(int index, T element);

    T remove(int index);
}
