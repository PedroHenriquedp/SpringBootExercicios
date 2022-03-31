	package org.generation.HikariGames.repository;

import java.util.List;
import org.generation.HikariGames.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long>{

	public List<Jogo> findByCodigoBarraContainingIgnoreCase(String codigoBarra);
	public List<Jogo> findByJogoDigital(Boolean jogoDigital);
	public List<Jogo> findByMultiplayer(Boolean multiplayer);
	public List<Jogo> findByCrossplayer(Boolean crossplayer);
	public List<Jogo> findByFaixaEtariaContainingIgnoreCase(String faixaEtaria);
	public List<Jogo> findByPreco(Double preco);
}
