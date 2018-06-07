package br.com.gearcode.mymusic.web;

import br.com.gearcode.mymusic.entity.Artista;
import br.com.gearcode.mymusic.entity.Musica;
import br.com.gearcode.mymusic.repo.ArtistaRepository;
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
@RequestMapping("/artistas")
public class ArtistaController {

    @Autowired
    private ArtistaRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Artista> findAllBooks() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@PathParam("id") String id) {
        repository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Response save(@RequestBody Artista artista){
        repository.save(artista);
        return Response.ok(artista).build();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Response update(@RequestBody Artista artista){
        repository.save(artista);
        return Response.ok(artista).build();
    }
}
