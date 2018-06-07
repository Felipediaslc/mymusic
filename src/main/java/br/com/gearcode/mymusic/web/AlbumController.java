package br.com.gearcode.mymusic.web;

import br.com.gearcode.mymusic.entity.Album;
import br.com.gearcode.mymusic.entity.Musica;
import br.com.gearcode.mymusic.repo.AlbumRepository;
import br.com.gearcode.mymusic.repo.MusicaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/albuns")
public class AlbumController {

    @Autowired
    private AlbumRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Album> findAllBooks() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@PathParam("id") String id) {
        repository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Response save(@RequestBody Album album){
        repository.save(album);
        return Response.ok(album).build();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Response update(@RequestBody Album album){
        repository.save(album);
        return Response.ok(album).build();
    }
}
