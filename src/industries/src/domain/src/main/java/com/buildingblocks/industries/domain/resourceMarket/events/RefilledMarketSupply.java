package com.buildingblocks.industries.domain.resourceMarket.events;

import com.buildingblocks.shared.domain.generic.DomainEvent;

public class RefilledMarketSupply extends DomainEvent {

    public RefilledMarketSupply() {
        super(EventsEnum.REFILLED_MARKET_SUPPLY.name());
    }
}
