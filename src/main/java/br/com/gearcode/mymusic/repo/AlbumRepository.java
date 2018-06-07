package br.com.gearcode.mymusic.repo;

import br.com.gearcode.mymusic.entity.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepository extends MongoRepository<Album, String> {
}
