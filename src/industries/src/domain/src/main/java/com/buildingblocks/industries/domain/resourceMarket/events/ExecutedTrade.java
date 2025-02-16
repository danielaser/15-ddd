package com.buildingblocks.industries.domain.resourceMarket.events;

import com.buildingblocks.shared.domain.generic.DomainEvent;

public class ExecutedTrade extends DomainEvent {

    public ExecutedTrade() {
        super(EventsEnum.EXECUTED_TRADE.name());
    }
}
