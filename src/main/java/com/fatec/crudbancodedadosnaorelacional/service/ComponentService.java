package com.fatec.crudbancodedadosnaorelacional.service;

import com.fatec.crudbancodedadosnaorelacional.domain.entities.ComponentEntity;
import com.fatec.crudbancodedadosnaorelacional.repository.ComponentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComponentService {

    private final ComponentRepository componentRepository;

    public ComponentEntity save(ComponentEntity componentEntity) {
        return this.componentRepository.save(componentEntity);
    }
}