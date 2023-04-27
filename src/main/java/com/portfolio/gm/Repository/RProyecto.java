
package com.portfolio.gm.Repository;

import com.portfolio.gm.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RProyecto extends JpaRepository<Proyecto,Integer>{
    public Optional<Proyecto> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}

