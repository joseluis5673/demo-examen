package com.demodj.demo_examen.Service.Impl;

import com.demodj.demo_examen.Modelos.Estudiantes;
import com.demodj.demo_examen.Repository.EstudiantesRepository;
import com.demodj.demo_examen.Service.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudiantesServiceImpl implements EstudiantesService {

    @Autowired
    private EstudiantesRepository estudiantesRepository;

    @Override
    public List<Estudiantes> listarEstudiantes() {
        return estudiantesRepository.findAll();
    }

    @Override
    public Estudiantes obtenerEstudiantesPorId(Long id) {
        return estudiantesRepository.findById(id).orElse(null);
    }

    @Override
    public Estudiantes guardarEstudiantes(Estudiantes estudiantes) {
        return estudiantesRepository.save(estudiantes);
    }

    @Override
    public void eliminarEstudiantes(Long id) {
        estudiantesRepository.deleteById(id);
    }
}