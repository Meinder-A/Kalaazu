package com.kalaazu.persistence.database.entities.accounts_history.generated;

import com.kalaazu.persistence.database.entities.AccountsHistory;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * AccountsHistory}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsHistoryManager extends Manager<AccountsHistory> {

    List<Field<AccountsHistory>> FIELDS = unmodifiableList(asList(
            AccountsHistory.ID,
            AccountsHistory.ACCOUNTS_ID,
            AccountsHistory.TYPE,
            AccountsHistory.MESSAGE,
            AccountsHistory.AMOUNT,
            AccountsHistory.DATE
    ));

    @Override
    default Class<AccountsHistory> getEntityClass() {
        return AccountsHistory.class;
    }
}