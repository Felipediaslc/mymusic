package br.com.gearcode.mymusic.repo;

import br.com.gearcode.mymusic.entity.Playlist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlaylistRepository extends MongoRepository<Playlist, String> {
}
