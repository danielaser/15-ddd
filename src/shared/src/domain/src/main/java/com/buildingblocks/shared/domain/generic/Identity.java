package com.buildingblocks.shared.domain.generic;

import java.util.UUID;

public abstract class Identity {
    private final String value;

    protected Identity() {
        this.value = UUID.randomUUID().toString();
    }

    public Identity(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
