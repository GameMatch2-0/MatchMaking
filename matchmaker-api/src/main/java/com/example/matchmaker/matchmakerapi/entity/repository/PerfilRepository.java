package com.example.matchmaker.matchmakerapi.entity.repository;

import com.example.matchmaker.matchmakerapi.FilaObj;
import com.example.matchmaker.matchmakerapi.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {
    @Procedure("SP_curtir_perfil")
    void curtirOutroPerfil(Integer idPerfilLogado, Integer idPerfilCurtido, LocalDate dataHora);

    @Procedure("SP_descurtir_perfil")
    void descurtirOutroPerfil(Integer idPerfilLogado, Integer idPerfilDescurtido);

    @Procedure("SP_busca_carrossel")
    FilaObj<Perfil> buscaPerfisCarrossel(Integer idPerfilLogado);
}
