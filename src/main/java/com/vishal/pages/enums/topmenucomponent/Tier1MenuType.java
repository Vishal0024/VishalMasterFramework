package com.vishal.pages.enums.topmenucomponent;

public enum Tier1MenuType {

    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave"),
    TIME("Time");

    private final String name;

    public String getName() {
        return name;
    }

    Tier1MenuType(String name) {
        this.name = name;
    }
}
