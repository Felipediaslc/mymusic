package br.com.gearcode.mymusic.web;


import br.com.gearcode.mymusic.entity.Playlist;
import br.com.gearcode.mymusic.repo.MusicaRepository;
import br.com.gearcode.mymusic.repo.PlaylistRepository;
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
@RequestMapping("/playlist")
public class PlaylistController {

    @Autowired
    private PlaylistRepository repository;

    @Autowired
    private MusicaRepository musicasRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Playlist> findAll() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@PathParam("id") String id) {
        repository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Response save(@RequestBody Playlist playlist){
        repository.save(playlist);
        return Response.ok(playlist).build();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Response update(@RequestBody Playlist playlist){
        repository.save(playlist);
        return Response.ok(playlist).build();
    }

    

}
