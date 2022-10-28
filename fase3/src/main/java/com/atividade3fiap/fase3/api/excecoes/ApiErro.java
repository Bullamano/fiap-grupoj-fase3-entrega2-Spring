package com.atividade3fiap.fase3.api.excecoes;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class ApiErro {

    private int erro;

    private String status;

    private LocalDateTime timestamp;

    private String mensagem;

    public ApiErro() {
    }

    public ApiErro(int erro, String status, LocalDateTime timestamp, String mensagem) {
        this.erro = erro;
        this.status = status;
        this.timestamp = timestamp;
        this.mensagem = mensagem;
    }

}
