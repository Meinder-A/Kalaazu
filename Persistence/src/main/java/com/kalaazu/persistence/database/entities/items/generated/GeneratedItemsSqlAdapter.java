package com.kalaazu.persistence.database.entities.items.generated;

import com.kalaazu.persistence.database.entities.Items;
import com.kalaazu.persistence.database.entities.items.ItemsImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The generated Sql Adapter for a {@link
 * com.kalaazu.persistence.database.entities.items.Items} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedItemsSqlAdapter implements SqlAdapter<Items> {

    private final TableIdentifier<Items> tableIdentifier;

    private SqlTypeMapperHelper<Byte, ItemCategory> categoryHelper;

    private SqlTypeMapperHelper<Byte, ItemType> typeHelper;

    private SqlTypeMapperHelper<Integer, Boolean> isEliteHelper;

    private SqlTypeMapperHelper<Integer, Boolean> isEventHelper;

    private SqlTypeMapperHelper<Integer, Boolean> isBuyableHelper;

    protected GeneratedItemsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "items");
    }

    protected Items apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
                .setId(resultSet.getShort(1 + offset))
                .setName(resultSet.getString(2 + offset))
                .setCategory(resultSet.getByte(3 + offset))
                .setDescription(resultSet.getString(4 + offset))
                .setPrice(resultSet.getInt(5 + offset))
                .setType(resultSet.getByte(6 + offset))
                .setIsElite(resultSet.getInt(7 + offset))
                .setIsEvent(resultSet.getInt(8 + offset))
                .setIsBuyable(resultSet.getInt(9 + offset))
                ;
    }

    protected ItemsImpl createEntity() {
        return new ItemsImpl();
    }

    @Override
    public TableIdentifier<Items> identifier() {
        return tableIdentifier;
    }

    @Override
    public SqlFunction<ResultSet, Items> entityMapper() {
        return entityMapper(0);
    }

    @Override
    public SqlFunction<ResultSet, Items> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}