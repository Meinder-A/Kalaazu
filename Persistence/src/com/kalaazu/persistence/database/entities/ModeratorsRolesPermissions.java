package com.kalaazu.persistence.database.entities;

import com.kalaazu.persistence.database.entities.moderators_roles_permissions.generated.GeneratedModeratorsRolesPermissions;

/**
 * The main interface for entities of the {@code
 * moderators_roles_permissions}-table in the database.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface ModeratorsRolesPermissions extends GeneratedModeratorsRolesPermissions, Entity<Byte> {
    /**
     * Returns the role.
     *
     * @return The role.
     */
    ModeratorsRoles getRole();

    /**
     * Returns the permission.
     *
     * @return The permission.
     */
    Permissions getPermission();
}