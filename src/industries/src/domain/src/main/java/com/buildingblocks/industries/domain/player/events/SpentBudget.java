package com.buildingblocks.industries.domain.player.events;

import com.buildingblocks.shared.domain.generic.DomainEvent;

public class SpentBudget extends DomainEvent {

    public SpentBudget() {
        super(EventsEnum.SPENT_BUDGET.name());
    }
}
