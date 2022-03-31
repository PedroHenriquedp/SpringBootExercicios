package org.generation.HikariGames.repository;

import java.util.List;

import org.generation.HikariGames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findByGeneroContainingIgnoreCase(String genero);
	public List<Categoria> findByPromocaoContainingIgnoreCase(String promocao);
	public List<Categoria> findByLancamentoContainingIgnoreCase(String lancamento);
	public List<Categoria> findByMaisVendidoContainingIgnoreCase(String maisVendido);
	public List<Categoria> findByJogoCasualContainingIgnoreCase(String jogoCasual);
}
