package br.com.gearcode.mymusic.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;


@Data
@Document
public class Musica {

    @Id
    private String id;

    private String nome;

    private LocalTime duracao;

}
