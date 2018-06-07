package br.com.gearcode.mymusic.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Playlist {

    @Id
    private String id;

    private String nome;

    @DBRef
    private List<Musica> musicas;

}
