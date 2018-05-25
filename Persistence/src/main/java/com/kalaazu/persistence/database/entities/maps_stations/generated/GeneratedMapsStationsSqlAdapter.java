package com.kalaazu.persistence.database.entities.maps_stations.generated;

import com.kalaazu.persistence.database.entities.MapsStations;
import com.kalaazu.persistence.database.entities.maps_stations.MapsStationsImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.getByte;

/**
 * The generated Sql Adapter for a {@link
 * com.kalaazu.persistence.database.entities.maps_stations.MapsStations} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMapsStationsSqlAdapter implements SqlAdapter<MapsStations> {

    private final TableIdentifier<MapsStations> tableIdentifier;

    private SqlTypeMapperHelper<Long, Vector2> positionHelper;

    protected GeneratedMapsStationsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "maps_stations");
    }

    protected MapsStations apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
                .setId(resultSet.getByte(1 + offset))
                .setPosition(resultSet.getLong(2 + offset))
                .setMapsId(getByte(resultSet, 3 + offset))
                .setFactionsId(getByte(resultSet, 4 + offset))
                ;
    }

    protected MapsStationsImpl createEntity() {
        return new MapsStationsImpl();
    }

    @Override
    public TableIdentifier<MapsStations> identifier() {
        return tableIdentifier;
    }

    @Override
    public SqlFunction<ResultSet, MapsStations> entityMapper() {
        return entityMapper(0);
    }

    @Override
    public SqlFunction<ResultSet, MapsStations> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}