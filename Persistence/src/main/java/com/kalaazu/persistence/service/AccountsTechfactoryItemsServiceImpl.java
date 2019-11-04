package com.kalaazu.persistence.service;

import com.kalaazu.persistence.entity.AccountsTechfactoryItemsEntity;
import com.kalaazu.persistence.repository.AccountsTechfactoryItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AccountsTechfactoryItems service.
 * ====================================
 *
 * Service for the AccountsTechfactoryItems entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Service
public class AccountsTechfactoryItemsServiceImpl implements AccountsTechfactoryItemsService {
    @Autowired
    private AccountsTechfactoryItemsRepository repository;

    /**
     * @inheritDoc
     */
    @Override
    public AccountsTechfactoryItemsEntity create(AccountsTechfactoryItemsEntity entity) {
        return this.repository.save(entity);
    }

    /**
     * @inheritDoc
     */
    @Override
    public AccountsTechfactoryItemsEntity find(Integer id) {
        return this.repository.findById(id).orElse(null);
    }

    /**
     * @inheritDoc
     */
    @Override
    public List<AccountsTechfactoryItemsEntity> findAll() {
        return this.repository.findAll();
    }

    /**
     * @inheritDoc
     */
    @Override
    public AccountsTechfactoryItemsEntity update(AccountsTechfactoryItemsEntity entity) {
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