	package org.generation.HikariGames.repository;

import java.math.BigDecimal;
import java.util.List;
import org.generation.HikariGames.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long>{

	public List<Jogo> findByCodigoBarraContainingIgnoreCase(String codigoBarra);
	public List<Jogo> findByJogoDigital(Boolean jogoDigital);
	public List<Jogo> findByMultiplayer(Boolean multiplayer);
	public List<Jogo> findByCrossplayer(Boolean crossplayer);
	public List<Jogo> findByFaixaEtariaContainingIgnoreCase(String faixaEtaria);
	public List<Jogo> findByPreco(Double preco);
	@Query
	(value = "select * from tb_jogo where preco between :inicio and :fim", nativeQuery = true)
		public List<Jogo> findByPrecoBetween(BigDecimal inicio, BigDecimal fim);
	@Query
	(value = "select * from tb_jogo where preco > :x", nativeQuery = true)
		public List<Jogo> findByPrecoMaior(BigDecimal x);
}
