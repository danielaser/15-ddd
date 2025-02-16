package com.buildingblocks.industries.domain.resourceMarket.events;

import com.buildingblocks.shared.domain.generic.DomainEvent;

public class UpdatedResourcePrice extends DomainEvent {

    public UpdatedResourcePrice() {
        super(EventsEnum.UPDATED_RESOURCE_PRICE.name());
    }
}
