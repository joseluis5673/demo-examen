package com.demodj.demo_examen.Controller;

import com.demodj.demo_examen.Modelos.Estudiantes;
import com.demodj.demo_examen.Service.EstudiantesService;
import com.demodj.demo_examen.Service.Impl.EstudiantesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudiantesController {
    private  final EstudiantesServiceImpl estudiantesService;
    public EstudiantesController(EstudiantesServiceImpl estudiantesService){ this.estudiantesService=estudiantesService ;}

    @GetMapping
    public List<Estudiantes> listarEstudiantes() {
        return estudiantesService.listarEstudiantes();
    }

    @GetMapping("/{id}")
    public Estudiantes obtenerEstudiantes(@PathVariable Long id) {
        return estudiantesService.obtenerEstudiantesPorId(id);
    }

    @PostMapping
    public Estudiantes crearEstudiantes(@RequestBody Estudiantes estudiantes) {
        return estudiantesService.guardarEstudiantes(estudiantes);
    }

    @PutMapping("/{id}")
    public Estudiantes actualizarEstudiantes(@PathVariable Long id, @RequestBody Estudiantes estudiantes) {
        estudiantes.setId(id);
        return estudiantesService.guardarEstudiantes(estudiantes);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstudiante(@PathVariable Long id) {
        estudiantesService.eliminarEstudiantes(id);
    }
}