package com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations_logs.generated;

import com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations_logs.ClansBattlestationsLogs;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations_logs.ClansBattlestationsLogs}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedClansBattlestationsLogsManager extends Manager<ClansBattlestationsLogs> {

    List<Field<ClansBattlestationsLogs>> FIELDS = unmodifiableList(asList(
            ClansBattlestationsLogs.ID,
            ClansBattlestationsLogs.CLANS_ID,
            ClansBattlestationsLogs.CLANS_BATTLESTATIONS_ID,
            ClansBattlestationsLogs.MESSAGE,
            ClansBattlestationsLogs.DATE
    ));

    @Override
    default Class<ClansBattlestationsLogs> getEntityClass() {
        return ClansBattlestationsLogs.class;
    }
}