package com.example.trueCaller;

import com.example.trueCaller.model.ContactTrie;
import lombok.Getter;

public class GlobalContacts {

    private GlobalContacts() {}

    public static GlobalContacts INSTANCE = new GlobalContacts();

    @Getter
    private ContactTrie contactTrie = new ContactTrie();
}
