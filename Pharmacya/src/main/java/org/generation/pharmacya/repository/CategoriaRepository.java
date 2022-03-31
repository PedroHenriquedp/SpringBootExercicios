package org.generation.pharmacya.repository;

import java.util.List;

import org.generation.pharmacya.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByMedicamentosContainingIgnoreCase(String medicamentos);
}
