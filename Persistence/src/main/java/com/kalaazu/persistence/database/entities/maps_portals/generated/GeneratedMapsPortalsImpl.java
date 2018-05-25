package com.kalaazu.persistence.database.entities.maps_portals.generated;

import com.kalaazu.math.Vector2;
import com.kalaazu.persistence.database.entities.Manager;
import com.kalaazu.persistence.database.entities.Maps;
import com.kalaazu.persistence.database.entities.MapsPortals;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.maps_portals.MapsPortals}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMapsPortalsImpl implements MapsPortals {

    private byte id;

    private byte levelsId;

    private byte mapsId;

    private long position;

    private byte targetMapsId;

    private long targetPosition;

    private int  isVisible;

    private int  isWorking;

    private byte gfx;

    protected GeneratedMapsPortalsImpl() {
    }

    @Override
    public Byte getId() {
        return id;
    }

    @Override
    public byte getLevelsId() {
        return levelsId;
    }

    @Override
    public byte getMapsId() {
        return mapsId;
    }

    @Override
    public long getPosition() {
        return position;
    }

    @Override
    public byte getTargetMapsId() {
        return targetMapsId;
    }

    @Override
    public long getTargetPosition() {
        return targetPosition;
    }

    @Override
    public int getIsVisible() {
        return isVisible;
    }

    @Override
    public int getIsWorking() {
        return isWorking;
    }

    @Override
    public byte getGfx() {
        return gfx;
    }

    @Override
    public MapsPortals setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public MapsPortals setLevelsId(byte levelsId) {
        this.levelsId = levelsId;
        return this;
    }

    @Override
    public MapsPortals setMapsId(byte mapsId) {
        this.mapsId = mapsId;
        return this;
    }

    @Override
    public MapsPortals setPosition(long position) {
        this.position = position;
        return this;
    }

    @Override
    public MapsPortals setTargetMapsId(byte targetMapsId) {
        this.targetMapsId = targetMapsId;
        return this;
    }

    @Override
    public MapsPortals setTargetPosition(long targetPosition) {
        this.targetPosition = targetPosition;
        return this;
    }

    @Override
    public MapsPortals setIsVisible(int isVisible) {
        this.isVisible = isVisible;
        return this;
    }

    @Override
    public MapsPortals setIsWorking(int isWorking) {
        this.isWorking = isWorking;
        return this;
    }

    @Override
    public MapsPortals setGfx(byte gfx) {
        this.gfx = gfx;
        return this;
    }

    @Override
    public Maps findMapsId(Manager<Maps> foreignManager) {
        return foreignManager.stream()
                             .filter(Maps.ID.equal(getMapsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Maps findTargetMapsId(Manager<Maps> foreignManager) {
        return foreignManager.stream()
                             .filter(Maps.ID.equal(getTargetMapsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("levelsId = " + Objects.toString(getLevelsId()));
        sj.add("mapsId = " + Objects.toString(getMapsId()));
        sj.add("position = " + Objects.toString(getPosition()));
        sj.add("targetMapsId = " + Objects.toString(getTargetMapsId()));
        sj.add("targetPosition = " + Objects.toString(getTargetPosition()));
        sj.add("isVisible = " + Objects.toString(getIsVisible()));
        sj.add("isWorking = " + Objects.toString(getIsWorking()));
        sj.add("gfx = " + Objects.toString(getGfx()));
        return "MapsPortalsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof MapsPortals)) {
            return false;
        }
        final MapsPortals thatMapsPortals = (MapsPortals) that;
        if (this.getId() != thatMapsPortals.getId()) {
            return false;
        }
        if (this.getLevelsId() != thatMapsPortals.getLevelsId()) {
            return false;
        }
        if (this.getMapsId() != thatMapsPortals.getMapsId()) {
            return false;
        }
        if (this.getPosition() != thatMapsPortals.getPosition()) {
            return false;
        }
        if (this.getTargetMapsId() != thatMapsPortals.getTargetMapsId()) {
            return false;
        }
        if (this.getTargetPosition() != thatMapsPortals.getTargetPosition()) {
            return false;
        }
        if (this.getIsVisible() != thatMapsPortals.getIsVisible()) {
            return false;
        }
        if (this.getIsWorking() != thatMapsPortals.getIsWorking()) {
            return false;
        }
        if (this.getGfx() != thatMapsPortals.getGfx()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Byte.hashCode(getId());
        hash = 31 * hash + Byte.hashCode(getLevelsId());
        hash = 31 * hash + Byte.hashCode(getMapsId());
        hash = 31 * hash + Long.hashCode(getPosition());
        hash = 31 * hash + Byte.hashCode(getTargetMapsId());
        hash = 31 * hash + Long.hashCode(getTargetPosition());
        hash = 31 * hash + Integer.hashCode(getIsVisible());
        hash = 31 * hash + Integer.hashCode(getIsWorking());
        hash = 31 * hash + Byte.hashCode(getGfx());
        return hash;
    }
}