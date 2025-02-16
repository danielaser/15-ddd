package com.buildingblocks.industries.domain.resourceMarket.values;

import com.buildingblocks.shared.domain.generic.IValueObject;
import com.buildingblocks.shared.domain.utils.ValueValidator;

public class tradeType implements IValueObject {
    private final String value;

    private tradeType(String value) {
        this.value = value;
        validate();
    }

    public static tradeType of(String value) {
        return new tradeType(value);
    }

    @Override
    public void validate() {
        ValueValidator.validateStringNotEmpty(value, "tradeType");
        ValueValidator.validateStringNotBlank(value, "tradeType");
        ValueValidator.validateSpecialCharacters(value, "tradeType");
        ValueValidator.validateTradeType(value, "tradeType");
    }

    public String getValue() {
        return value;
    }
}
