package base;

public abstract class BaseEntity<T > {

    private T Id;



    public BaseEntity(T id) {
        Id = id;
    }

    public BaseEntity() {
    }

    public T getId() {
        return Id;
    }

    public void setId(T id) {
        Id = id;
    }
}
