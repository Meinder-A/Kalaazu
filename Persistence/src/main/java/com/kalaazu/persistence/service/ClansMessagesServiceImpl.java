package com.kalaazu.persistence.service;

import com.kalaazu.persistence.entity.ClansMessagesEntity;
import com.kalaazu.persistence.repository.ClansMessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClansMessages service.
 * =========================
 *
 * Service for the ClansMessages entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Service
public class ClansMessagesServiceImpl implements ClansMessagesService {
    @Autowired
    private ClansMessagesRepository repository;

    /**
     * @inheritDoc
     */
    @Override
    public ClansMessagesEntity create(ClansMessagesEntity entity) {
        return this.repository.save(entity);
    }

    /**
     * @inheritDoc
     */
    @Override
    public ClansMessagesEntity find(Integer id) {
        return this.repository.findById(id).orElse(null);
    }

    /**
     * @inheritDoc
     */
    @Override
    public List<ClansMessagesEntity> findAll() {
        return this.repository.findAll();
    }

    /**
     * @inheritDoc
     */
    @Override
    public ClansMessagesEntity update(ClansMessagesEntity entity) {
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