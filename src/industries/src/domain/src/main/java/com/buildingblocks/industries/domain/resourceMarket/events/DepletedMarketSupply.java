package com.buildingblocks.industries.domain.resourceMarket.events;

import com.buildingblocks.shared.domain.generic.DomainEvent;

public class DepletedMarketSupply extends DomainEvent {

    public DepletedMarketSupply() {
        super(EventsEnum.DEPLETED_MARKET_SUPPLY.name());
    }
}
