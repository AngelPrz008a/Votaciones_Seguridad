package misionTIC.seguridad.controllers;

import misionTIC.seguridad.models.Rol;
import misionTIC.seguridad.repositorios.RolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolRepositorio repositorio;

    @GetMapping("")
    public List<Rol> index(){
        return this.repositorio.findAll();
    }

    @GetMapping("/{id}")
    public Rol show(@PathVariable String id){
        Optional<Rol> opt =  this.repositorio.findById(id);
        return opt.orElse(null);
    }
//
//    @PostMapping("/")
//    public Rol create(@RequestBody Rol request){
//        return this.repositorio.save(request);
//    }

//    @PutMapping("/{id}")
//    public Rol update(@PathVariable String id, @RequestBody Rol request){
//        Optional<Rol> opt = this.repositorio.findById(id);
//        if(opt.isPresent()){
//            Rol actual = opt.get();
//
//            if(request.getNombre() != null && !request.getNombre().isBlank())
//                actual.setNombre(request.getNombre());
//
//            return this.repositorio.save(actual);
//        }
//        return null;
//    }

//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable String id){
//        Optional<Rol> opt = this.repositorio.findById(id);
//        if(opt.isPresent()){
//            this.repositorio.deleteById(id);
//        }
//    }


}
