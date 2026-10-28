package com.produtoapi.repository;

import com.produtoapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Busca detalhada referente ao nome de Produto
    List<Produto> findByNome(String nome);

    List<Produto> findByNomeContaining(String nome);
    
    List<Produto> findByNomeAndStatus(String nome, String status);

    List<Produto> findByNomeStartingWith(String prefix);

    List<Produto> findByNomeEndingWith(String suffix);

    // Busca detalhada referente ao preço de Produto
    List<Produto> findByPreco(Double preco);

    List<Produto> findByPrecoGreaterThan(Double preco);

    List<Produto> findByPrecoLessThan(Double preco);

    // Usando anottation @Query para obter total de preços
    @Query("SELECT SUM(p.preco) FROM Produto p")
    Double findTotalPreco();
}
