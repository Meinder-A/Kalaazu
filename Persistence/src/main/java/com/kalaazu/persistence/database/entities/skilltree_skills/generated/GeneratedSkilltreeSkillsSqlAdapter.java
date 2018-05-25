package com.kalaazu.persistence.database.entities.skilltree_skills.generated;

import com.kalaazu.persistence.database.entities.SkilltreeSkills;
import com.kalaazu.persistence.database.entities.skilltree_skills.SkilltreeSkillsImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The generated Sql Adapter for a {@link
 * com.kalaazu.persistence.database.entities.skilltree_skills.SkilltreeSkills}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSkilltreeSkillsSqlAdapter implements SqlAdapter<SkilltreeSkills> {

    private final TableIdentifier<SkilltreeSkills> tableIdentifier;

    private SqlTypeMapperHelper<Byte, SkillType> typeHelper;

    private SqlTypeMapperHelper<Integer, Boolean> isAdvancedHelper;

    protected GeneratedSkilltreeSkillsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "skilltree_skills");
    }

    protected SkilltreeSkills apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
                .setId(resultSet.getByte(1 + offset))
                .setName(resultSet.getString(2 + offset))
                .setDescription(resultSet.getString(3 + offset))
                .setType(resultSet.getByte(4 + offset))
                .setIsAdvanced(resultSet.getInt(5 + offset))
                .setBonusType(resultSet.getString(6 + offset))
                .setBonusAmount(resultSet.getInt(7 + offset))
                .setBonusFactor(resultSet.getByte(8 + offset))
                ;
    }

    protected SkilltreeSkillsImpl createEntity() {
        return new SkilltreeSkillsImpl();
    }

    @Override
    public TableIdentifier<SkilltreeSkills> identifier() {
        return tableIdentifier;
    }

    @Override
    public SqlFunction<ResultSet, SkilltreeSkills> entityMapper() {
        return entityMapper(0);
    }

    @Override
    public SqlFunction<ResultSet, SkilltreeSkills> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}