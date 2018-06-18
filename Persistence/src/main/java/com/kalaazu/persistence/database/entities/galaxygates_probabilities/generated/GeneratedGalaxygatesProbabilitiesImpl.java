package com.kalaazu.persistence.database.entities.galaxygates_probabilities.generated;

import com.kalaazu.persistence.database.entities.Galaxygates;
import com.kalaazu.persistence.database.entities.GalaxygatesProbabilities;
import com.kalaazu.persistence.database.entities.Manager;
import com.kalaazu.persistence.database.mappers.GalaxyGateProbabilityType;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * GalaxygatesProbabilities}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedGalaxygatesProbabilitiesImpl implements GalaxygatesProbabilities {

    private byte id;

    private byte galaxygatesId;

    private GalaxyGateProbabilityType type;

    private double probability;

    protected GeneratedGalaxygatesProbabilitiesImpl() {

    }

    @Override
    public Byte getId() {
        return id;
    }

    @Override
    public byte getGalaxygatesId() {
        return galaxygatesId;
    }

    @Override
    public GalaxyGateProbabilityType getType() {
        return type;
    }

    @Override
    public double getProbability() {
        return probability;
    }

    @Override
    public GalaxygatesProbabilities setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public GalaxygatesProbabilities setGalaxygatesId(byte galaxygatesId) {
        this.galaxygatesId = galaxygatesId;
        return this;
    }

    @Override
    public GalaxygatesProbabilities setType(GalaxyGateProbabilityType type) {
        this.type = type;
        return this;
    }

    @Override
    public GalaxygatesProbabilities setProbability(double probability) {
        this.probability = probability;
        return this;
    }

    @Override
    public Galaxygates findGalaxygatesId(Manager<Galaxygates> foreignManager) {
        return foreignManager.stream()
                             .filter(Galaxygates.ID.equal(getGalaxygatesId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("galaxygatesId = " + Objects.toString(getGalaxygatesId()));
        sj.add("type = " + Objects.toString(getType()));
        sj.add("probability = " + Objects.toString(getProbability()));
        return "GalaxygatesProbabilitiesImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof GalaxygatesProbabilities)) {
            return false;
        }
        final GalaxygatesProbabilities thatGalaxygatesProbabilities = (GalaxygatesProbabilities) that;
        if (this.getId() != thatGalaxygatesProbabilities.getId()) {
            return false;
        }
        if (this.getGalaxygatesId() != thatGalaxygatesProbabilities.getGalaxygatesId()) {
            return false;
        }
        if (!Objects.equals(this.getType(), thatGalaxygatesProbabilities.getType())) {
            return false;
        }
        if (this.getProbability() != thatGalaxygatesProbabilities.getProbability()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Byte.hashCode(getId());
        hash = 31 * hash + Byte.hashCode(getGalaxygatesId());
        hash = 31 * hash + Objects.hashCode(getType());
        hash = 31 * hash + Double.hashCode(getProbability());
        return hash;
    }
}