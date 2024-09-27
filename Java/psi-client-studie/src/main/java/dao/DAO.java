package dao;
import java.util.List;
public abstract class DAO <T extends Object> {
    public abstract T readById(long id);
    public abstract List<T> readAll();
    public abstract boolean create(T User);
    public abstract boolean update(T User);
    public abstract boolean delete(long id);
}
