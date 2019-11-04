package com.kalaazu.persistence.service;

import com.kalaazu.persistence.entity.GalaxygatesSpawnsEntity;
import com.kalaazu.persistence.repository.GalaxygatesSpawnsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * GalaxygatesSpawns service.
 * =============================
 *
 * Service for the GalaxygatesSpawns entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Service
public class GalaxygatesSpawnsServiceImpl implements GalaxygatesSpawnsService {
    @Autowired
    private GalaxygatesSpawnsRepository repository;

    /**
     * @inheritDoc
     */
    @Override
    public GalaxygatesSpawnsEntity create(GalaxygatesSpawnsEntity entity) {
        return this.repository.save(entity);
    }

    /**
     * @inheritDoc
     */
    @Override
    public GalaxygatesSpawnsEntity find(Integer id) {
        return this.repository.findById(id).orElse(null);
    }

    /**
     * @inheritDoc
     */
    @Override
    public List<GalaxygatesSpawnsEntity> findAll() {
        return this.repository.findAll();
    }

    /**
     * @inheritDoc
     */
    @Override
    public GalaxygatesSpawnsEntity update(GalaxygatesSpawnsEntity entity) {
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