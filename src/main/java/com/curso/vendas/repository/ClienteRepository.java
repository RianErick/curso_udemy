package com.curso.vendas.repository;

import com.curso.vendas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

   List <Cliente> findByNomeOrId(String nome,Integer id);
   List <Cliente> findByNomeLike(String nome);
   Cliente findOneById(Integer id);
   List <Cliente> findByNome(String nome);

   List<Cliente> findByOrderByNome();

}
