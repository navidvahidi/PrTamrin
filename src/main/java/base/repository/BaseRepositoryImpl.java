package base.repository;

import base.BaseEntity;

import java.util.List;

public abstract class BaseRepositoryImpl<I,E extends BaseEntity<I>> implements BaseRepository<I,E>{

    @Override
    public void save(E entity) {
        String query=getQuery();

    }
    protected abstract String getQuery();


    @Override
    public List<E> Select() {
        return null;
    }

    @Override
    public E selectID(I Id) {
        return null;
    }

    @Override
    public void edit(E entety) {

    }

    @Override
    public void delete(E entity) {

    }


}
