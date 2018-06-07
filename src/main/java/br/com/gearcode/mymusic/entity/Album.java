package br.com.gearcode.mymusic.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document
public class Album {

    @Id
    private String id;

    private String nome;

    private LocalDate dataLançamento;

    private String gravadora;

    @DBRef
    private List<Musica> musicas;


}
