package com.chamadosystem.entity;

import java.time.LocalDateTime;

public class Comentario {

    private Long id;
    private String conteudo;
    private LocalDateTime dataCriacao;

    // Relacionamentos
    private Usuario autor;
    private Chamado chamado;

}
