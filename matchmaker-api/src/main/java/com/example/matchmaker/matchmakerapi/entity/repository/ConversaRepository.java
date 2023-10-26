package com.example.matchmaker.matchmakerapi.entity.repository;

import com.example.matchmaker.matchmakerapi.entity.Conversa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface ConversaRepository extends JpaRepository<Conversa, Integer> {
    public Conversa findByIdConversaAndDeletedFalse(Integer idConversa);
    public List<Conversa> findAllByIdUsuarioLogadoAndDeletedFalse(String idUsuarioLogado);
    public List<Conversa> findByIdUsuarioConversaAndDeletedFalse(String idUsuarioConversa);
    public List<Conversa> findByNotificacoesAndDeletedFalse(int notificacoes);
    public List<Conversa> findAllByDeletedTrue();

}