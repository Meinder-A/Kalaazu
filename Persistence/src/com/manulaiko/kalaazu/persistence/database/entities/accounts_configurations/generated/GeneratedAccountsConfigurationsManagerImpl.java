package com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations.AccountsConfigurations;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations.AccountsConfigurationsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations.AccountsConfigurations}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsConfigurationsManagerImpl 
extends AbstractManager<AccountsConfigurations> 
implements GeneratedAccountsConfigurationsManager {
    
    private final TableIdentifier<AccountsConfigurations> tableIdentifier;
    
    protected GeneratedAccountsConfigurationsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_configurations");
    }
    
    @Override
    public TableIdentifier<AccountsConfigurations> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<AccountsConfigurations>> fields() {
        return AccountsConfigurationsManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<AccountsConfigurations>> primaryKeyFields() {
        return Stream.of(
            AccountsConfigurations.ID
        );
    }
}