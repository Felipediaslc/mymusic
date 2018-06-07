package br.com.gearcode.mymusic.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Artista {

    @Id
    private String id;

    @DBRef
    private Album artista;

    private String nome;

    @DBRef
    private List<Album> albums;

    @DBRef
    private List<Musica> musicas;

}
