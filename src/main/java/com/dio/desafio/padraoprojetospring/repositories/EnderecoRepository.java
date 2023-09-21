package com.dio.desafio.padraoprojetospring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dio.desafio.padraoprojetospring.entities.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
