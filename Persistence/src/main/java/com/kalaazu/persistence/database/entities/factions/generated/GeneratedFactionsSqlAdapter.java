package com.kalaazu.persistence.database.entities.factions.generated;

import com.kalaazu.persistence.database.entities.Factions;
import com.kalaazu.persistence.database.entities.factions.FactionsImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The generated Sql Adapter for a {@link
 * com.kalaazu.persistence.database.entities.factions.Factions} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFactionsSqlAdapter implements SqlAdapter<Factions> {

    private final TableIdentifier<Factions> tableIdentifier;

    private SqlTypeMapperHelper<Integer, Boolean> isPublicHelper;

    private SqlTypeMapperHelper<Long, Vector2> lowMapsPositionHelper;

    private SqlTypeMapperHelper<Long, Vector2> highMapsPositionHelper;

    protected GeneratedFactionsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "factions");
    }

    protected Factions apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
                .setId(resultSet.getByte(1 + offset))
                .setName(resultSet.getString(2 + offset))
                .setTag(resultSet.getString(3 + offset))
                .setDescription(resultSet.getString(4 + offset))
                .setIsPublic(resultSet.getInt(5 + offset))
                .setLowMapsId(resultSet.getByte(6 + offset))
                .setLowMapsPosition(resultSet.getLong(7 + offset))
                .setHighMapsId(resultSet.getByte(8 + offset))
                .setHighMapsPosition(resultSet.getLong(9 + offset))
                ;
    }

    protected FactionsImpl createEntity() {
        return new FactionsImpl();
    }

    @Override
    public TableIdentifier<Factions> identifier() {
        return tableIdentifier;
    }

    @Override
    public SqlFunction<ResultSet, Factions> entityMapper() {
        return entityMapper(0);
    }

    @Override
    public SqlFunction<ResultSet, Factions> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}