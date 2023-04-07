package base.repository;

import base.BaseEntity;

import java.util.List;

public interface BaseRepository<I,E extends BaseEntity<I>> {
    void save(E entity);
    List<E> Select();
    E selectID(I Id);
    void edit(E entity);
    void delete(E entity);

}
