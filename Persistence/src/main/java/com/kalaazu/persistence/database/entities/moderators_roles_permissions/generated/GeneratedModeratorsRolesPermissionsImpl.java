package com.kalaazu.persistence.database.entities.moderators_roles_permissions.generated;

import com.kalaazu.persistence.database.entities.Manager;
import com.kalaazu.persistence.database.entities.ModeratorsRoles;
import com.kalaazu.persistence.database.entities.ModeratorsRolesPermissions;
import com.kalaazu.persistence.database.entities.Permissions;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.function.OptionalBoolean;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * ModeratorsRolesPermissions}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedModeratorsRolesPermissionsImpl implements ModeratorsRolesPermissions {

    private byte id;

    private byte moderatorsRolesId;

    private byte permissionsId;

    private boolean isEnabled;

    protected GeneratedModeratorsRolesPermissionsImpl() {

    }

    @Override
    public Byte getId() {
        return id;
    }

    @Override
    public byte getModeratorsRolesId() {
        return moderatorsRolesId;
    }

    @Override
    public byte getPermissionsId() {
        return permissionsId;
    }

    @Override
    public OptionalBoolean getIsEnabled() {
        return OptionalUtil.ofNullable(isEnabled);
    }

    @Override
    public ModeratorsRolesPermissions setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public ModeratorsRolesPermissions setModeratorsRolesId(byte moderatorsRolesId) {
        this.moderatorsRolesId = moderatorsRolesId;
        return this;
    }

    @Override
    public ModeratorsRolesPermissions setPermissionsId(byte permissionsId) {
        this.permissionsId = permissionsId;
        return this;
    }

    @Override
    public ModeratorsRolesPermissions setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    @Override
    public ModeratorsRoles findModeratorsRolesId(Manager<ModeratorsRoles> foreignManager) {
        return foreignManager.stream()
                             .filter(ModeratorsRoles.ID.equal(getModeratorsRolesId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Permissions findPermissionsId(Manager<Permissions> foreignManager) {
        return foreignManager.stream()
                             .filter(Permissions.ID.equal(getPermissionsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("moderatorsRolesId = " + Objects.toString(getModeratorsRolesId()));
        sj.add("permissionsId = " + Objects.toString(getPermissionsId()));
        sj.add("isEnabled = " + Objects.toString(OptionalUtil.unwrap(getIsEnabled())));
        return "ModeratorsRolesPermissionsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof ModeratorsRolesPermissions)) {
            return false;
        }
        final ModeratorsRolesPermissions thatModeratorsRolesPermissions = (ModeratorsRolesPermissions) that;
        if (this.getId() != thatModeratorsRolesPermissions.getId()) {
            return false;
        }
        if (this.getModeratorsRolesId() != thatModeratorsRolesPermissions.getModeratorsRolesId()) {
            return false;
        }
        if (this.getPermissionsId() != thatModeratorsRolesPermissions.getPermissionsId()) {
            return false;
        }
        if (this.getIsEnabled() != thatModeratorsRolesPermissions.getIsEnabled()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Byte.hashCode(getId());
        hash = 31 * hash + Byte.hashCode(getModeratorsRolesId());
        hash = 31 * hash + Byte.hashCode(getPermissionsId());
        hash = 31 * hash + Boolean.hashCode(getIsEnabled().orElse(false));
        return hash;
    }
}