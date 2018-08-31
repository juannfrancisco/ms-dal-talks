package cl.zenta.example.graphql.talks.controllers;

import cl.zenta.example.graphql.talks.entities.Talk;
import cl.zenta.example.graphql.talks.repositories.TalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TalkController {

    @Autowired
    private TalkRepository repo;

    @RequestMapping(method = RequestMethod.GET, value="/talks")
    public Iterable<Talk> findAll( ){
        Iterable<Talk> listPos = repo.findAll();
        return listPos;
    }

    @RequestMapping(method = RequestMethod.GET , value="/talks/{id}")
    public Talk findById(@PathVariable("id") Integer id ){
        return repo.findById(id).get();
    }


    @RequestMapping(method = RequestMethod.POST, value="/talks" )
    public void save( @RequestBody Talk pos){
        repo.save(pos);
    }

    @RequestMapping(method = RequestMethod.PUT , value="/talks/{id}")
    public void update( @PathVariable("id") Integer id , Talk pos){
    }

    @RequestMapping(method = RequestMethod.DELETE , value="/talks/{id}")
    public void delete( @PathVariable("id") Integer id ){
        Talk ob = new Talk();
        ob.setId(id);
        repo.delete(ob);
    }
}
