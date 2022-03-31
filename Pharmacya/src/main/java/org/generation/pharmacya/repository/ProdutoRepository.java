package org.generation.pharmacya.repository;

import java.util.List;

import org.generation.pharmacya.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos, Long>{
	public List<Produtos> findAllByPreco(Double preco);
	
}
