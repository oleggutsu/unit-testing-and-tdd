package com.acme.banking.dbo.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

import static java.util.Collections.unmodifiableCollection;

public class Client {
    private UUID id;
    private String name;
    private Collection<Account> accounts = new ArrayList<>(); //TODO

    public Client(UUID id, String name) {
        if (id == null) return; //throw IllegalArgumentException
        if (name == null || "".equals(name)) return;

        this.id = id;
        this.name = name;
}

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Account> getAccounts() {
        return unmodifiableCollection(accounts);
    }
}
