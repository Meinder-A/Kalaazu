package com.manulaiko.kalaazu.persistence.database.entities.accounts_ships.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts_ships.AccountsShips;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;
import java.util.List;
import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_ships.AccountsShips}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsShipsManager extends Manager<AccountsShips> {
    
    List<Field<AccountsShips>> FIELDS = unmodifiableList(asList(
        AccountsShips.ID,
        AccountsShips.ACCOUNTS_ID,
        AccountsShips.SHIPS_ID,
        AccountsShips.MAPS_ID,
        AccountsShips.POSITION,
        AccountsShips.HEALTH,
        AccountsShips.SHIELD,
        AccountsShips.NANOHULL,
        AccountsShips.GFX
    ));
    
    @Override
    default Class<AccountsShips> getEntityClass() {
        return AccountsShips.class;
    }
}