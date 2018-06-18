package com.kalaazu.persistence.database.entities.accounts_hangars.generated;

import com.kalaazu.persistence.database.entities.AccountsHangars;
import com.kalaazu.persistence.database.entities.accounts_hangars.AccountsHangarsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * AccountsHangars}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsHangarsManagerImpl
        extends AbstractManager<AccountsHangars>
        implements GeneratedAccountsHangarsManager {

    private final TableIdentifier<AccountsHangars> tableIdentifier;

    protected GeneratedAccountsHangarsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_hangars");
    }

    @Override
    public TableIdentifier<AccountsHangars> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<AccountsHangars>> fields() {
        return AccountsHangarsManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<AccountsHangars>> primaryKeyFields() {
        return Stream.of(
                AccountsHangars.ID
        );
    }
}