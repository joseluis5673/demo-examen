package com.demodj.demo_examen.Service;

import com.demodj.demo_examen.Modelos.Estudiantes;

import java.util.List;

public interface EstudiantesService {
    List<Estudiantes> listarEstudiantes();
    Estudiantes obtenerEstudiantesPorId(Long id);
    Estudiantes guardarEstudiantes(Estudiantes estudiantes);
    void eliminarEstudiantes(Long id);
}