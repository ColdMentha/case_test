package com.convert.demo.util;

public enum Currency {

	EUR("EUR","Euro"),
	GBP("GBP","British Pound Sterling"),
	UAH("UAH","Ukrainian Hryvnia"),
	USD("USD","United States Dollar");
	
	private final String code;
	private final String description;

	Currency(String code, String description) {
		this.code = code;
        this.description = description;
	}

	public static Currency fromCode(String code) {
		for (Currency cur : Currency.values()) {
			if (cur.name().equals(code)) {
				return cur;
			}
		}
		throw new IllegalArgumentException(code);
	}

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
