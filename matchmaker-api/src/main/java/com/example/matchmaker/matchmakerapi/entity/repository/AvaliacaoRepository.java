package com.example.matchmaker.matchmakerapi.entity.repository;

import com.example.matchmaker.matchmakerapi.entity.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Integer> {
    // A AVALIACAO TEM QUE VIR JA TRATADA LEVANDO EM CONSIDERAÇÃO A NOTA DO CARA Q TA AVALIANDO PORRA
    // @Procedure("SP_nova_avaliacao")
    // Optional<Avaliacao> adicionarAvaliacao (Integer idPerfilAvaliado, Integer idPerfilLogado, Double avaliacao, String descricao,LocalDate dataHora);
}
