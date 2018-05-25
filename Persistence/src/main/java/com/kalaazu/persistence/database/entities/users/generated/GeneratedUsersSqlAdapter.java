package com.kalaazu.persistence.database.entities.users.generated;

import com.kalaazu.persistence.database.entities.Users;
import com.kalaazu.persistence.database.entities.users.UsersImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.getShort;

/**
 * The generated Sql Adapter for a {@link
 * com.kalaazu.persistence.database.entities.users.Users} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedUsersSqlAdapter implements SqlAdapter<Users> {

    private final TableIdentifier<Users> tableIdentifier;

    private SqlTypeMapperHelper<Object, byte[]> ipHelper;

    protected GeneratedUsersSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "users");
    }

    protected Users apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
                .setId(resultSet.getInt(1 + offset))
                .setDate(resultSet.getTimestamp(2 + offset))
                .setInvitationCodesId(getShort(resultSet, 3 + offset))
                .setName(resultSet.getString(4 + offset))
                .setPassword(resultSet.getString(5 + offset))
                .setEmail(resultSet.getString(6 + offset))
                .setEmailVerificationCode(resultSet.getString(7 + offset))
                .setEmailVerificationDate(resultSet.getTimestamp(8 + offset))
                .setIp(resultSet.getObject(9 + offset))
                ;
    }

    protected UsersImpl createEntity() {
        return new UsersImpl();
    }

    @Override
    public TableIdentifier<Users> identifier() {
        return tableIdentifier;
    }

    @Override
    public SqlFunction<ResultSet, Users> entityMapper() {
        return entityMapper(0);
    }

    @Override
    public SqlFunction<ResultSet, Users> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}