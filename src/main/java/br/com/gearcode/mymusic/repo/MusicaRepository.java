package br.com.gearcode.mymusic.repo;

import br.com.gearcode.mymusic.entity.Musica;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusicaRepository extends MongoRepository<Musica, String> {
}
