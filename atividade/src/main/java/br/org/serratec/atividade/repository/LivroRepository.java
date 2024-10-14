package br.org.serratec.atividade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.serratec.atividade.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
