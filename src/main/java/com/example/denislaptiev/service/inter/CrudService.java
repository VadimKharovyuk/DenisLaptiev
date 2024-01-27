package com.example.denislaptiev.service.inter;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CrudService <E,K> {
    void  create(E entity);
    E findById(K id);
    List<E> findAll();
    E update(E entity);
    void delete(E entity) ;


}
