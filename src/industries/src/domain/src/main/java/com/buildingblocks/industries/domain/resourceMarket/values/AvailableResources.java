package com.buildingblocks.industries.domain.resourceMarket.values;

import com.buildingblocks.industries.domain.industry.values.Level;
import com.buildingblocks.shared.domain.generic.IValueObject;
import com.buildingblocks.shared.domain.utils.ValueValidator;

import java.util.List;

public class AvailableResources implements IValueObject {
    private final List<String> value;

    private AvailableResources(List<String> value) {
        this.value = value;
        validate();
    }

    public static AvailableResources of(List<String> value) {
        return new AvailableResources(value);
    }

    @Override
    public void validate() {
        ValueValidator.validateListNotEmpty(value, "AvailableResources");
    }

    public List<String> getValue() {
        return value;
    }
}
