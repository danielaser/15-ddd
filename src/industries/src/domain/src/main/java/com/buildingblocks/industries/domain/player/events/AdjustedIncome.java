package com.buildingblocks.industries.domain.player.events;

import com.buildingblocks.shared.domain.generic.DomainEvent;

public class AdjustedIncome extends DomainEvent {

    public AdjustedIncome() {
        super(EventsEnum.ADJUSTED_INCOME.name());
    }
}
