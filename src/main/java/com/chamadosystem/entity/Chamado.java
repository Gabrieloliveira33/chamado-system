package com.chamadosystem.entity;

import java.time.LocalDateTime;
import com.chamadosystem.enums.Status;

public class Chamado {

    private Long id;
    private String titulo;
    private String descricao;
    private Status status;
    private LocalDateTime dataCriacao;

    // Relacionamentos (modelo)
    private Usuario cliente;
    private Usuario tecnico;

}
