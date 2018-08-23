package com.kalaazu.persistence.database.entities.items.generated;

import com.kalaazu.persistence.database.entities.Items;
import com.kalaazu.persistence.database.mappers.ItemCategory;
import com.kalaazu.persistence.database.mappers.ItemCategoryMapper;
import com.kalaazu.persistence.database.mappers.ItemType;
import com.kalaazu.persistence.database.mappers.ItemTypeMapper;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;
import com.speedment.runtime.typemapper.integer.PrimitiveIntegerZeroOneToBooleanMapper;

/**
 * The generated base for the {@link
 * Items}-interface
 * representing entities of the {@code items}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedItems {

    /**
     * This Field corresponds to the {@link Items} field that can be obtained
     * using the {@link Items#id()} method.
     */
    ShortField<Items, Short> ID = ShortField.create(
            Identifier.ID,
            Items::id,
            Items::id,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link Items} field that can be obtained
     * using the {@link Items#name()} method.
     */
    StringField<Items, String> NAME = StringField.create(
            Identifier.NAME,
            Items::name,
            Items::name,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Items} field that can be obtained
     * using the {@link Items#category()} method.
     */
    EnumField<Items, Byte, ItemCategory> CATEGORY = EnumField.create(
            Identifier.CATEGORY,
            Items::category,
            Items::category,
            new ItemCategoryMapper(),
            ItemCategory::name,
            ItemCategory::valueOf,
            ItemCategory.class
    );

    /**
     * This Field corresponds to the {@link Items} field that can be obtained
     * using the {@link Items#description()} method.
     */
    StringField<Items, String> DESCRIPTION = StringField.create(
            Identifier.DESCRIPTION,
            Items::description,
            Items::description,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Items} field that can be obtained
     * using the {@link Items#price()} method.
     */
    IntField<Items, Integer> PRICE = IntField.create(
            Identifier.PRICE,
            Items::price,
            Items::price,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link Items} field that can be obtained
     * using the {@link Items#type()} method.
     */
    EnumField<Items, Byte, ItemType> TYPE = EnumField.create(
            Identifier.TYPE,
            Items::type,
            Items::type,
            new ItemTypeMapper(),
            ItemType::name,
            ItemType::valueOf,
            ItemType.class
    );

    /**
     * This Field corresponds to the {@link Items} field that can be obtained
     * using the {@link Items#isElite()} method.
     */
    BooleanField<Items, Integer> IS_ELITE = BooleanField.create(
            Identifier.IS_ELITE,
            Items::isElite,
            Items::isElite,
            new PrimitiveIntegerZeroOneToBooleanMapper(),
            false
    );

    /**
     * This Field corresponds to the {@link Items} field that can be obtained
     * using the {@link Items#isEvent()} method.
     */
    BooleanField<Items, Integer> IS_EVENT = BooleanField.create(
            Identifier.IS_EVENT,
            Items::isEvent,
            Items::isEvent,
            new PrimitiveIntegerZeroOneToBooleanMapper(),
            false
    );

    /**
     * This Field corresponds to the {@link Items} field that can be obtained
     * using the {@link Items#isBuyable()} method.
     */
    BooleanField<Items, Integer> IS_BUYABLE = BooleanField.create(
            Identifier.IS_BUYABLE,
            Items::isBuyable,
            Items::isBuyable,
            new PrimitiveIntegerZeroOneToBooleanMapper(),
            false
    );

    /**
     * Returns the id of this Items. The id field corresponds to the database
     * column kalaazu.kalaazu.items.id.
     *
     * @return the id of this Items
     */
    Short id();

    /**
     * Returns the name of this Items. The name field corresponds to the
     * database column kalaazu.kalaazu.items.name.
     *
     * @return the name of this Items
     */
    String name();

    /**
     * Returns the category of this Items. The category field corresponds to the
     * database column kalaazu.kalaazu.items.category.
     *
     * @return the category of this Items
     */
    ItemCategory category();

    /**
     * Returns the description of this Items. The description field corresponds
     * to the database column kalaazu.kalaazu.items.description.
     *
     * @return the description of this Items
     */
    String description();

    /**
     * Returns the price of this Items. The price field corresponds to the
     * database column kalaazu.kalaazu.items.price.
     *
     * @return the price of this Items
     */
    int price();

    /**
     * Returns the type of this Items. The type field corresponds to the
     * database column kalaazu.kalaazu.items.type.
     *
     * @return the type of this Items
     */
    ItemType type();

    /**
     * Returns the isElite of this Items. The isElite field corresponds to the
     * database column kalaazu.kalaazu.items.is_elite.
     *
     * @return the isElite of this Items
     */
    boolean isElite();

    /**
     * Returns the isEvent of this Items. The isEvent field corresponds to the
     * database column kalaazu.kalaazu.items.is_event.
     *
     * @return the isEvent of this Items
     */
    boolean isEvent();

    /**
     * Returns the isBuyable of this Items. The isBuyable field corresponds to
     * the database column kalaazu.kalaazu.items.is_buyable.
     *
     * @return the isBuyable of this Items
     */
    boolean isBuyable();

    /**
     * Sets the id of this Items. The id field corresponds to the database
     * column kalaazu.kalaazu.items.id.
     *
     * @param id to set of this Items
     *
     * @return this Items instance
     */
    Items id(Short id);

    /**
     * Sets the name of this Items. The name field corresponds to the database
     * column kalaazu.kalaazu.items.name.
     *
     * @param name to set of this Items
     *
     * @return this Items instance
     */
    Items name(String name);

    /**
     * Sets the category of this Items. The category field corresponds to the
     * database column kalaazu.kalaazu.items.category.
     *
     * @param category to set of this Items
     *
     * @return this Items instance
     */
    Items category(ItemCategory category);

    /**
     * Sets the description of this Items. The description field corresponds to
     * the database column kalaazu.kalaazu.items.description.
     *
     * @param description to set of this Items
     *
     * @return this Items instance
     */
    Items description(String description);

    /**
     * Sets the price of this Items. The price field corresponds to the database
     * column kalaazu.kalaazu.items.price.
     *
     * @param price to set of this Items
     *
     * @return this Items instance
     */
    Items price(int price);

    /**
     * Sets the type of this Items. The type field corresponds to the database
     * column kalaazu.kalaazu.items.type.
     *
     * @param type to set of this Items
     *
     * @return this Items instance
     */
    Items type(ItemType type);

    /**
     * Sets the isElite of this Items. The isElite field corresponds to the
     * database column kalaazu.kalaazu.items.is_elite.
     *
     * @param isElite to set of this Items
     *
     * @return this Items instance
     */
    Items isElite(boolean isElite);

    /**
     * Sets the isEvent of this Items. The isEvent field corresponds to the
     * database column kalaazu.kalaazu.items.is_event.
     *
     * @param isEvent to set of this Items
     *
     * @return this Items instance
     */
    Items isEvent(boolean isEvent);

    /**
     * Sets the isBuyable of this Items. The isBuyable field corresponds to the
     * database column kalaazu.kalaazu.items.is_buyable.
     *
     * @param isBuyable to set of this Items
     *
     * @return this Items instance
     */
    Items isBuyable(boolean isBuyable);

    enum Identifier implements ColumnIdentifier<Items> {

        ID("id"),
        NAME("name"),
        CATEGORY("category"),
        DESCRIPTION("description"),
        PRICE("price"),
        TYPE("type"),
        IS_ELITE("is_elite"),
        IS_EVENT("is_event"),
        IS_BUYABLE("is_buyable");

        private final String columnName;

        private final TableIdentifier<Items> tableIdentifier;

        Identifier(String columnName) {
            this.columnName = columnName;
            this.tableIdentifier = TableIdentifier.of(
                    getDbmsName(),
                    getSchemaName(),
                    getTableName()
            );
        }

        @Override
        public String getDbmsName() {
            return "kalaazu";
        }

        @Override
        public String getSchemaName() {
            return "kalaazu";
        }

        @Override
        public String getTableName() {
            return "items";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<Items> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}