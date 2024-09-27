package gerenciador;

import java.util.*;

public interface IContaDAO {
    boolean criar(Conta conta);

    List<Conta> letTodas();

    Conta buscarPeloNumero(long id);

    boolean atualizar(Conta conta);

    boolean apagar(Conta conta);
}

