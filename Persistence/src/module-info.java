module kalaazu.persistence {
    exports com.manulaiko.kalaazu.persistence;
    exports com.manulaiko.kalaazu.persistence.database.entities;

    exports com.manulaiko.kalaazu.persistence.database.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database to speedment;

    exports com.manulaiko.kalaazu.persistence.database.entities.accounts.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_banks.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_banks_logs.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_clans_roles.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations_accounts_items.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_destroys.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_drones.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_galaxygates.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_hangars.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_history.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_items.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_messages.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_pets.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_quests.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_rankings.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_ships.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_skills.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_skylabs.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_techfactories.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_techfactory_items.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_applications.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_banks.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_banks_logs.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations_items.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations_logs.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_diplomacies.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_messages.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_news.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_ranking.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_roles.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_roles_permissions.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.collectables.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.events.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.factions.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_gg_spins.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_gg_waves.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_probabilities.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_spawns.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_spins.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_stages.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_stages_spawns.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_waves.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.invitation_codes.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.invitation_codes_redeem_logs.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.items.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.key_value.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.levels.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.levels_upgrades.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.maps.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.maps_npcs.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.maps_portals.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.maps_stations.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.moderators.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.moderators_logs.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.moderators_roles.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.moderators_roles_permissions.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.news.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.npcs.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.permissions.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.quests.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.quests_conditions.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.ranks.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards_collectables.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards_galaxygates.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards_npcs.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards_quests.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards_ships.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards_vouchers.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.server_logs.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.ships.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.skilltree_levels.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.skilltree_skills.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.skilltree_unlocks.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.skylab_modules.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.techfactory_costs.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.techfactory_drones.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.techfactory_items.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.trade_items.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.users.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.vouchers.generated to speedment;
    exports com.manulaiko.kalaazu.persistence.database.entities.vouchers_redeem_logs.generated to speedment;

    opens com.manulaiko.kalaazu.persistence.database.entities.accounts.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_banks.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_banks_logs.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_clans_roles.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations_accounts_items.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_destroys.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_drones.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_galaxygates.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_hangars.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_history.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_items.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_messages.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_pets.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_quests.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_rankings.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_ships.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_skills.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_skylabs.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_techfactories.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.accounts_techfactory_items.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans_applications.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans_banks.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans_banks_logs.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations_items.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations_logs.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans_diplomacies.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans_messages.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans_news.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans_ranking.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans_roles.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.clans_roles_permissions.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.collectables.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.events.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.factions.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.galaxygates.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.galaxygates_gg_spins.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.galaxygates_gg_waves.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.galaxygates_probabilities.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.galaxygates_spawns.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.galaxygates_spins.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.galaxygates_stages.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.galaxygates_stages_spawns.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.galaxygates_waves.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.invitation_codes.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.invitation_codes_redeem_logs.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.items.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.key_value.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.levels.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.levels_upgrades.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.maps.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.maps_npcs.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.maps_portals.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.maps_stations.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.moderators.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.moderators_logs.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.moderators_roles.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.moderators_roles_permissions.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.news.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.npcs.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.permissions.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.quests.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.quests_conditions.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.ranks.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.rewards.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.rewards_collectables.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.rewards_galaxygates.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.rewards_npcs.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.rewards_quests.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.rewards_ships.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.rewards_vouchers.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.server_logs.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.ships.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.skilltree_levels.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.skilltree_skills.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.skilltree_unlocks.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.skylab_modules.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.techfactory_costs.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.techfactory_drones.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.techfactory_items.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.trade_items.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.users.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.vouchers.generated to speedment;
    opens com.manulaiko.kalaazu.persistence.database.entities.vouchers_redeem_logs.generated to speedment;

    exports com.manulaiko.kalaazu.persistence.database.entities.accounts;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_banks;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_banks_logs;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_clans_roles;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations_accounts_items;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_destroys;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_drones;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_galaxygates;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_hangars;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_history;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_items;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_messages;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_pets;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_quests;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_rankings;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_ships;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_skills;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_skylabs;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_techfactories;
    exports com.manulaiko.kalaazu.persistence.database.entities.accounts_techfactory_items;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_applications;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_banks;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_banks_logs;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations_items;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations_logs;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_diplomacies;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_messages;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_news;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_ranking;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_roles;
    exports com.manulaiko.kalaazu.persistence.database.entities.clans_roles_permissions;
    exports com.manulaiko.kalaazu.persistence.database.entities.collectables;
    exports com.manulaiko.kalaazu.persistence.database.entities.events;
    exports com.manulaiko.kalaazu.persistence.database.entities.factions;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_gg_spins;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_gg_waves;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_probabilities;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_spawns;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_spins;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_stages;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_stages_spawns;
    exports com.manulaiko.kalaazu.persistence.database.entities.galaxygates_waves;
    exports com.manulaiko.kalaazu.persistence.database.entities.invitation_codes;
    exports com.manulaiko.kalaazu.persistence.database.entities.invitation_codes_redeem_logs;
    exports com.manulaiko.kalaazu.persistence.database.entities.items;
    exports com.manulaiko.kalaazu.persistence.database.entities.key_value;
    exports com.manulaiko.kalaazu.persistence.database.entities.levels;
    exports com.manulaiko.kalaazu.persistence.database.entities.levels_upgrades;
    exports com.manulaiko.kalaazu.persistence.database.entities.maps;
    exports com.manulaiko.kalaazu.persistence.database.entities.maps_npcs;
    exports com.manulaiko.kalaazu.persistence.database.entities.maps_portals;
    exports com.manulaiko.kalaazu.persistence.database.entities.maps_stations;
    exports com.manulaiko.kalaazu.persistence.database.entities.moderators;
    exports com.manulaiko.kalaazu.persistence.database.entities.moderators_logs;
    exports com.manulaiko.kalaazu.persistence.database.entities.moderators_roles;
    exports com.manulaiko.kalaazu.persistence.database.entities.moderators_roles_permissions;
    exports com.manulaiko.kalaazu.persistence.database.entities.news;
    exports com.manulaiko.kalaazu.persistence.database.entities.npcs;
    exports com.manulaiko.kalaazu.persistence.database.entities.permissions;
    exports com.manulaiko.kalaazu.persistence.database.entities.quests;
    exports com.manulaiko.kalaazu.persistence.database.entities.quests_conditions;
    exports com.manulaiko.kalaazu.persistence.database.entities.ranks;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards_collectables;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards_galaxygates;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards_npcs;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards_ships;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards_quests;
    exports com.manulaiko.kalaazu.persistence.database.entities.rewards_vouchers;
    exports com.manulaiko.kalaazu.persistence.database.entities.server_logs;
    exports com.manulaiko.kalaazu.persistence.database.entities.ships;
    exports com.manulaiko.kalaazu.persistence.database.entities.skilltree_levels;
    exports com.manulaiko.kalaazu.persistence.database.entities.skilltree_skills;
    exports com.manulaiko.kalaazu.persistence.database.entities.skilltree_unlocks;
    exports com.manulaiko.kalaazu.persistence.database.entities.skylab_modules;
    exports com.manulaiko.kalaazu.persistence.database.entities.techfactory_costs;
    exports com.manulaiko.kalaazu.persistence.database.entities.techfactory_drones;
    exports com.manulaiko.kalaazu.persistence.database.entities.techfactory_items;
    exports com.manulaiko.kalaazu.persistence.database.entities.trade_items;
    exports com.manulaiko.kalaazu.persistence.database.entities.users;
    exports com.manulaiko.kalaazu.persistence.database.entities.vouchers;
    exports com.manulaiko.kalaazu.persistence.database.entities.vouchers_redeem_logs;
    
    requires kalaazu;
    requires org.mariadb.jdbc;
    requires java.sql;
    requires speedment;
}