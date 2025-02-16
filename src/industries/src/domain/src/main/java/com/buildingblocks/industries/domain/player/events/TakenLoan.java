package com.buildingblocks.industries.domain.player.events;

import com.buildingblocks.shared.domain.generic.DomainEvent;

public class TakenLoan extends DomainEvent {

    public TakenLoan() {
        super(EventsEnum.TAKEN_LOAN.name());
    }
}
