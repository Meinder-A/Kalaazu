package com.kalaazu.persistence.database.entities;

import com.kalaazu.persistence.database.entities.accounts_clans_roles.generated.GeneratedAccountsClansRoles;

/**
 * The main interface for entities of the {@code accounts_clans_roles}-table in
 * the database.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface AccountsClansRoles extends GeneratedAccountsClansRoles, Entity<Integer> {
    /**
     * Returns the account.
     *
     * @return The account.
     */
    Accounts getAccount();

    /**
     * Returns the role.
     *
     * @return The role.
     */
    ClansRoles getRole();
}