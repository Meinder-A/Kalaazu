package com.kalaazu.persistence.database.entities.maps_npcs.generated;

import com.kalaazu.persistence.database.entities.MapsNpcs;
import com.kalaazu.persistence.database.entities.maps_npcs.MapsNpcsImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.common.injector.annotation.WithState;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * MapsNpcs}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMapsNpcsSqlAdapter {

    private final TableIdentifier<MapsNpcs> tableIdentifier;

    protected GeneratedMapsNpcsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "maps_npcs");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected MapsNpcs apply(ResultSet resultSet) throws SpeedmentException {
        final MapsNpcs entity = createEntity();
        try {
            entity.setId(resultSet.getByte(1));
            entity.setMapsId(resultSet.getByte(2));
            entity.setNpcsId(resultSet.getByte(3));
            entity.setAmount(resultSet.getByte(4));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected MapsNpcsImpl createEntity() {
        return new MapsNpcsImpl();
    }
}