package ar.com.api.climate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ar.com.api.climate.entities.Pais;

@Repository
public interface PaisRepo extends JpaRepository<Pais, Integer> {
    // @Query("select p from Pais p where p.codigoPais=:codigoPais")
    // public boolean existsByCodigo(Integer codigoPais);

    @Query("select p from Pais p where p.codigoPais=:codigoPais")
    public Pais buscarPorCodigo(Integer codigoPais);
}