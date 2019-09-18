package interfaces;

import domain.Usuario;

import java.util.List;

public interface Repository<T> {

    List<T> getAll();

    void add(T item);

    void add(Iterable<T> item);

    void update(T item);

    void remove(T item);

}
