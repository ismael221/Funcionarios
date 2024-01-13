package com.api.senac.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity,Integer> {

        FuncionarioEntity findByNome(String nome);
        List<FuncionarioEntity> findByNomeOrEmail(String nome,String email);
        List<FuncionarioEntity> findByNomeStartingWith(String nome);
        List<FuncionarioEntity> findByNomeEndingWith(String nome);
        List<FuncionarioEntity> findByNomeContaining(String nome);
        List<FuncionarioEntity> findByOrderByNomeAsc();
        List<FuncionarioEntity> findByOrderByNomeDesc();
        @Query(value = "SELECT MAX(salario) FROM Funcionario",nativeQuery = true)
        List<FuncionarioEntity> findAllMaiorSalario();
}
