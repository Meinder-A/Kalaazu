package com.kalaazu.persistence.database.entities.galaxygates_spawns.generated;

import com.kalaazu.persistence.database.entities.GalaxygatesSpawns;
import com.kalaazu.persistence.database.entities.galaxygates_spawns.GalaxygatesSpawnsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * GalaxygatesSpawns}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedGalaxygatesSpawnsManagerImpl
        extends AbstractManager<GalaxygatesSpawns>
        implements GeneratedGalaxygatesSpawnsManager {

    private final TableIdentifier<GalaxygatesSpawns> tableIdentifier;

    protected GeneratedGalaxygatesSpawnsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "galaxygates_spawns");
    }

    @Override
    public TableIdentifier<GalaxygatesSpawns> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<GalaxygatesSpawns>> fields() {
        return GalaxygatesSpawnsManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<GalaxygatesSpawns>> primaryKeyFields() {
        return Stream.of(
                GalaxygatesSpawns.ID
        );
    }
}