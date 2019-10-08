/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.records;


import com.kalaazu.persistence.database.tables.SkilltreeLevels;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;


/**
 * Levels a skill can reach.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class SkilltreeLevelsRecord extends UpdatableRecordImpl<SkilltreeLevelsRecord> implements Record6<Short, Byte, Byte, Integer, Short, Byte> {

    private static final long serialVersionUID = 674929003;

    /**
     * Create a detached SkilltreeLevelsRecord
     */
    public SkilltreeLevelsRecord() {
        super(SkilltreeLevels.SKILLTREE_LEVELS);
    }

    /**
     * Create a detached, initialised SkilltreeLevelsRecord
     */
    public SkilltreeLevelsRecord(
            Short id, Byte skilltreeSkillsId, Byte levelsId, Integer credits, Short seprom, Byte points
    ) {
        super(SkilltreeLevels.SKILLTREE_LEVELS);

        set(0, id);
        set(1, skilltreeSkillsId);
        set(2, levelsId);
        set(3, credits);
        set(4, seprom);
        set(5, points);
    }

    /**
     * Getter for <code>kalaazu.skilltree_levels.id</code>. Primary Key.
     */
    public Short getId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>kalaazu.skilltree_levels.id</code>. Primary Key.
     */
    public void setId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.skilltree_levels.skilltree_skills_id</code>. The skill.
     */
    public Byte getSkilltreeSkillsId() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>kalaazu.skilltree_levels.skilltree_skills_id</code>. The skill.
     */
    public void setSkilltreeSkillsId(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.skilltree_levels.levels_id</code>. Level to upgrade the skill.
     */
    public Byte getLevelsId() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>kalaazu.skilltree_levels.levels_id</code>. Level to upgrade the skill.
     */
    public void setLevelsId(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.skilltree_levels.credits</code>. Credits needed to upgrade this skill.
     */
    public Integer getCredits() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>kalaazu.skilltree_levels.credits</code>. Credits needed to upgrade this skill.
     */
    public void setCredits(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>kalaazu.skilltree_levels.seprom</code>. Seprom needed to upgrade this skill.
     */
    public Short getSeprom() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>kalaazu.skilltree_levels.seprom</code>. Seprom needed to upgrade this skill.
     */
    public void setSeprom(Short value) {
        set(4, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.skilltree_levels.points</code>. Research points needed to upgrade this skill.
     */
    public Byte getPoints() {
        return (Byte) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.skilltree_levels.points</code>. Research points needed to upgrade this skill.
     */
    public void setPoints(Byte value) {
        set(5, value);
    }

    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    @Override
    public Row6<Short, Byte, Byte, Integer, Short, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Short, Byte, Byte, Integer, Short, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return SkilltreeLevels.SKILLTREE_LEVELS.ID;
    }

    @Override
    public Field<Byte> field2() {
        return SkilltreeLevels.SKILLTREE_LEVELS.SKILLTREE_SKILLS_ID;
    }

    @Override
    public Field<Byte> field3() {
        return SkilltreeLevels.SKILLTREE_LEVELS.LEVELS_ID;
    }

    @Override
    public Field<Integer> field4() {
        return SkilltreeLevels.SKILLTREE_LEVELS.CREDITS;
    }

    @Override
    public Field<Short> field5() {
        return SkilltreeLevels.SKILLTREE_LEVELS.SEPROM;
    }

    @Override
    public Field<Byte> field6() {
        return SkilltreeLevels.SKILLTREE_LEVELS.POINTS;
    }

    @Override
    public Short component1() {
        return getId();
    }

    @Override
    public Byte component2() {
        return getSkilltreeSkillsId();
    }

    @Override
    public Byte component3() {
        return getLevelsId();
    }

    @Override
    public Integer component4() {
        return getCredits();
    }

    @Override
    public Short component5() {
        return getSeprom();
    }

    @Override
    public Byte component6() {
        return getPoints();
    }

    @Override
    public Short value1() {
        return getId();
    }

    @Override
    public Byte value2() {
        return getSkilltreeSkillsId();
    }

    @Override
    public Byte value3() {
        return getLevelsId();
    }

    @Override
    public Integer value4() {
        return getCredits();
    }

    @Override
    public Short value5() {
        return getSeprom();
    }

    @Override
    public Byte value6() {
        return getPoints();
    }

    @Override
    public SkilltreeLevelsRecord value1(Short value) {
        setId(value);
        return this;
    }

    @Override
    public SkilltreeLevelsRecord value2(Byte value) {
        setSkilltreeSkillsId(value);
        return this;
    }

    @Override
    public SkilltreeLevelsRecord value3(Byte value) {
        setLevelsId(value);
        return this;
    }

    @Override
    public SkilltreeLevelsRecord value4(Integer value) {
        setCredits(value);
        return this;
    }

    @Override
    public SkilltreeLevelsRecord value5(Short value) {
        setSeprom(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public SkilltreeLevelsRecord value6(Byte value) {
        setPoints(value);
        return this;
    }

    @Override
    public SkilltreeLevelsRecord values(
            Short value1, Byte value2, Byte value3, Integer value4, Short value5, Byte value6
    ) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }
}