package br.com.gearcode.mymusic.repo;

import br.com.gearcode.mymusic.entity.Musica;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MusicaRepository extends MongoRepository<Musica, String> {

    List<Musica> findByNome(String nome);

}
