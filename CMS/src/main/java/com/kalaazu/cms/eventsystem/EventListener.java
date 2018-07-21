package com.kalaazu.cms.eventsystem;

/**
 * Event listener.
 * ===============
 *
 * Subscribes to the event bus and listens for events.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public class EventListener extends com.kalaazu.eventsystem.EventListener {
    @Override
    public void initialize() {

    }

    @Override
    public String domain() {
        return "cms";
    }
}
