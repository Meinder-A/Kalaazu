-- Factions table.
--
-- Contains server's factions.
--
CREATE TABLE `factions` (
    `id`                 int          NOT NULL AUTO_INCREMENT COMMENT 'Primary Key.',
    `name`               varchar(255) NOT NULL DEFAULT '',
    `tag`                varchar(3)   NOT NULL DEFAULT ''     COMMENT 'Name abbreviation.',
    `description`        text         NOT NULL,
    `is_public`          bit(1)       NOT NULL DEFAULT 1,
    `low_maps_id`        int          NULL     DEFAULT NULL,
    `low_maps_position`  point        NOT NULL                COMMENT 'Starting position on map.',
    `high_maps_id`       int          NULL     DEFAULT NULL,
    `high_maps_position` point        NOT NULL                COMMENT 'Starting position on map.',

    CONSTRAINT `factions_pk` PRIMARY KEY (`id`)
) ENGINE InnoDB CHARACTER SET utf8 COMMENT 'Contains server''s factions.';

CREATE UNIQUE INDEX `factions_name_idx` ON `factions` (`name`);
CREATE UNIQUE INDEX `factions_tag_idx` ON `factions` (`tag`);
