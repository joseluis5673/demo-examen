package com.demodj.demo_examen.Repository;

import com.demodj.demo_examen.Modelos.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudiantesRepository extends JpaRepository<Estudiantes, Long> {
}
