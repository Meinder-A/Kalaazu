package com.kalaazu.persistence.database.entities.maps_stations.generated;

import com.kalaazu.math.Vector2;
import com.kalaazu.persistence.database.entities.Factions;
import com.kalaazu.persistence.database.entities.Manager;
import com.kalaazu.persistence.database.entities.Maps;
import com.kalaazu.persistence.database.entities.MapsStations;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;
import lombok.Data;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * MapsStations}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
@Data
public abstract class GeneratedMapsStationsImpl implements MapsStations {

    private Byte id;

    private Vector2 position;

    private Byte mapsId;

    private Byte factionsId;

    protected GeneratedMapsStationsImpl() {

    }
    @Override
    public Optional<Byte> mapsId() {
        return Optional.ofNullable(mapsId);
    }

    @Override
    public Optional<Byte> factionsId() {
        return Optional.ofNullable(factionsId);
    }

    @Override
    public Optional<Maps> findMapsId(Manager<Maps> foreignManager) {
        if (mapsId().isPresent()) {
            return foreignManager.stream()
                                 .filter(Maps.ID.equal(mapsId().get()))
                                 .findAny();
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<Factions> findFactionsId(Manager<Factions> foreignManager) {
        if (factionsId().isPresent()) {
            return foreignManager.stream()
                                 .filter(Factions.ID.equal(factionsId().get()))
                                 .findAny();
        } else {
            return Optional.empty();
        }
    }
}