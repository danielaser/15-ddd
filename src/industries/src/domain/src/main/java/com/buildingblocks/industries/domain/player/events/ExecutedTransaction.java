package com.buildingblocks.industries.domain.player.events;

import com.buildingblocks.shared.domain.generic.DomainEvent;

public class ExecutedTransaction extends DomainEvent {

    public ExecutedTransaction() {
        super(EventsEnum.EXECUTED_TRANSACTION.name());
    }
}
