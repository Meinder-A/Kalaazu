package com.manulaiko.kalaazu.persistence.database.entities.rewards.generated;

import com.manulaiko.kalaazu.persistence.database.entities.rewards.Rewards;
import com.manulaiko.kalaazu.persistence.database.entities.rewards.RewardsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.rewards.Rewards} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRewardsManagerImpl 
extends AbstractManager<Rewards> 
implements GeneratedRewardsManager {
    
    private final TableIdentifier<Rewards> tableIdentifier;
    
    protected GeneratedRewardsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "rewards");
    }
    
    @Override
    public TableIdentifier<Rewards> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Rewards>> fields() {
        return RewardsManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Rewards>> primaryKeyFields() {
        return Stream.of(
            Rewards.ID
        );
    }
}