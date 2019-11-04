package com.kalaazu.persistence.service;

import com.kalaazu.persistence.entity.MapsNpcsEntity;
import com.kalaazu.persistence.repository.MapsNpcsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * MapsNpcs service.
 * ====================
 *
 * Service for the MapsNpcs entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Service
public class MapsNpcsServiceImpl implements MapsNpcsService {
    @Autowired
    private MapsNpcsRepository repository;

    /**
     * @inheritDoc
     */
    @Override
    public MapsNpcsEntity create(MapsNpcsEntity entity) {
        return this.repository.save(entity);
    }

    /**
     * @inheritDoc
     */
    @Override
    public MapsNpcsEntity find(Integer id) {
        return this.repository.findById(id).orElse(null);
    }

    /**
     * @inheritDoc
     */
    @Override
    public List<MapsNpcsEntity> findAll() {
        return this.repository.findAll();
    }

    /**
     * @inheritDoc
     */
    @Override
    public MapsNpcsEntity update(MapsNpcsEntity entity) {
        return this.repository.save(entity);
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean delete(Integer id) {
        this.repository.deleteById(id);

        return !this.repository.existsById(id);
    }
}