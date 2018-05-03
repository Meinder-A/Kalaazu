package com.manulaiko.kalaazu.persistence.database.entities.factions.generated;

import com.manulaiko.kalaazu.math.Vector2;
import com.manulaiko.kalaazu.persistence.database.entities.factions.Factions;
import com.manulaiko.kalaazu.persistence.database.entities.maps.Maps;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.factions.Factions}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFactionsImpl implements Factions {

    private byte    id;

    private String  name;

    private String  tag;

    private String  description;

    private boolean isPublic;

    private byte    lowMapsId;

    private Vector2 lowMapsPosition;

    private byte    highMapsId;

    private Vector2 highMapsPosition;

    protected GeneratedFactionsImpl() {

    }

    @Override
    public Byte getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTag() {
        return tag;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean getIsPublic() {
        return isPublic;
    }

    @Override
    public byte getLowMapsId() {
        return lowMapsId;
    }

    @Override
    public Vector2 getLowMapsPosition() {
        return lowMapsPosition;
    }

    @Override
    public byte getHighMapsId() {
        return highMapsId;
    }

    @Override
    public Vector2 getHighMapsPosition() {
        return highMapsPosition;
    }

    @Override
    public Factions setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public Factions setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Factions setTag(String tag) {
        this.tag = tag;
        return this;
    }

    @Override
    public Factions setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Factions setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    @Override
    public Factions setLowMapsId(byte lowMapsId) {
        this.lowMapsId = lowMapsId;
        return this;
    }

    @Override
    public Factions setLowMapsPosition(Vector2 lowMapsPosition) {
        this.lowMapsPosition = lowMapsPosition;
        return this;
    }

    @Override
    public Factions setHighMapsId(byte highMapsId) {
        this.highMapsId = highMapsId;
        return this;
    }

    @Override
    public Factions setHighMapsPosition(Vector2 highMapsPosition) {
        this.highMapsPosition = highMapsPosition;
        return this;
    }

    @Override
    public Maps findLowMapsId(Manager<Maps> foreignManager) {
        return foreignManager.stream()
                             .filter(Maps.ID.equal(getLowMapsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Maps findHighMapsId(Manager<Maps> foreignManager) {
        return foreignManager.stream()
                             .filter(Maps.ID.equal(getHighMapsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("name = " + Objects.toString(getName()));
        sj.add("tag = " + Objects.toString(getTag()));
        sj.add("description = " + Objects.toString(getDescription()));
        sj.add("isPublic = " + Objects.toString(getIsPublic()));
        sj.add("lowMapsId = " + Objects.toString(getLowMapsId()));
        sj.add("lowMapsPosition = " + Objects.toString(getLowMapsPosition()));
        sj.add("highMapsId = " + Objects.toString(getHighMapsId()));
        sj.add("highMapsPosition = " + Objects.toString(getHighMapsPosition()));
        return "FactionsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof Factions)) {
            return false;
        }
        final Factions thatFactions = (Factions) that;
        if (this.getId() != thatFactions.getId()) {
            return false;
        }
        if (!Objects.equals(this.getName(), thatFactions.getName())) {
            return false;
        }
        if (!Objects.equals(this.getTag(), thatFactions.getTag())) {
            return false;
        }
        if (!Objects.equals(this.getDescription(), thatFactions.getDescription())) {
            return false;
        }
        if (this.getIsPublic() != thatFactions.getIsPublic()) {
            return false;
        }
        if (this.getLowMapsId() != thatFactions.getLowMapsId()) {
            return false;
        }
        if (!Objects.equals(this.getLowMapsPosition(), thatFactions.getLowMapsPosition())) {
            return false;
        }
        if (this.getHighMapsId() != thatFactions.getHighMapsId()) {
            return false;
        }
        if (!Objects.equals(this.getHighMapsPosition(), thatFactions.getHighMapsPosition())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Byte.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Objects.hashCode(getTag());
        hash = 31 * hash + Objects.hashCode(getDescription());
        hash = 31 * hash + Boolean.hashCode(getIsPublic());
        hash = 31 * hash + Byte.hashCode(getLowMapsId());
        hash = 31 * hash + Objects.hashCode(getLowMapsPosition());
        hash = 31 * hash + Byte.hashCode(getHighMapsId());
        hash = 31 * hash + Objects.hashCode(getHighMapsPosition());
        return hash;
    }
}