package br.com.gearcode.mymusic.repo;

import br.com.gearcode.mymusic.entity.Artista;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArtistaRepository extends MongoRepository<Artista, String> {

    List<Artista> findByNome(String nome);
}
