
package com.tienda.repository;

import com.tienda.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonaRepository extends CrudRepository<Pais, Long> {
 
}
