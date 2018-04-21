package com.manulaiko.kalaazu.persistence.database.entities.accounts_clans_roles.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts_clans_roles.AccountsClansRoles;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_clans_roles.AccountsClansRolesManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_clans_roles.AccountsClansRoles}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsClansRolesManagerImpl 
extends AbstractManager<AccountsClansRoles> 
implements GeneratedAccountsClansRolesManager {
    
    private final TableIdentifier<AccountsClansRoles> tableIdentifier;
    
    protected GeneratedAccountsClansRolesManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_clans_roles");
    }
    
    @Override
    public TableIdentifier<AccountsClansRoles> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<AccountsClansRoles>> fields() {
        return AccountsClansRolesManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<AccountsClansRoles>> primaryKeyFields() {
        return Stream.of(
            AccountsClansRoles.ID
        );
    }
}