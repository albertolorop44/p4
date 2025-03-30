package edu.comillas.icai.gitt.pat.spring.mvc;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/api/cultivos")
public class ControladorCultivos {

    private final Map<String, edu.comillas.icai.gitt.pat.spring.mvc.ModeloCultivo> cultivos = new ConcurrentHashMap<>();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public edu.comillas.icai.gitt.pat.spring.mvc.ModeloCultivo crear(@Valid @RequestBody edu.comillas.icai.gitt.pat.spring.mvc.ModeloCultivo cultivo) {
        cultivos.put(cultivo.nombre(), cultivo);
        return cultivo;
    }

    @GetMapping("/{nombre}")
    public edu.comillas.icai.gitt.pat.spring.mvc.ModeloCultivo obtener(@PathVariable String nombre) {
        return cultivos.get(nombre);
    }

    @PutMapping("/{nombre}")
    public edu.comillas.icai.gitt.pat.spring.mvc.ModeloCultivo actualizar(@PathVariable String nombre, @Valid @RequestBody edu.comillas.icai.gitt.pat.spring.mvc.ModeloCultivo cultivo) {
        cultivos.put(nombre, cultivo);
        return cultivo;
    }

    @DeleteMapping("/{nombre}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void borrar(@PathVariable String nombre) {
        cultivos.remove(nombre);
    }
}
