package com.manulaiko.kalaazu.persistence.database.entities.ranks.generated;

import com.manulaiko.kalaazu.persistence.database.entities.ranks.Ranks;
import com.manulaiko.kalaazu.persistence.database.entities.ranks.RanksManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.ranks.Ranks} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRanksManagerImpl 
extends AbstractManager<Ranks> 
implements GeneratedRanksManager {
    
    private final TableIdentifier<Ranks> tableIdentifier;
    
    protected GeneratedRanksManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "ranks");
    }
    
    @Override
    public TableIdentifier<Ranks> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Ranks>> fields() {
        return RanksManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Ranks>> primaryKeyFields() {
        return Stream.of(
            Ranks.ID
        );
    }
}