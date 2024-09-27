package dao;

import gerenciador.Titular;

import java.util.List;

public interface ITitularDAO {
    public List<Titular> lerTodas();
    public Titular readByNumber(long nro);
    public boolean create(Titular titular);
    public boolean updtate(Titular titular);
    public boolean delete(long nro);
}
