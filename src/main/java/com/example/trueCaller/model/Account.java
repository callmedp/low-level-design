package com.example.trueCaller.model;



import orestes.bloomfilter.CountingBloomFilter;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

public class Account {

    private Integer id;
    private Integer phoneNo;
    private String email;
    private String userName;
    private String password;
    private LocalDateTime lastAccessed;
    private Contact contact;
    private PersonalInfo personalInfo;
    private SocialInfo socialInfo;
    private UserCategory userCategory;
    private Map<String, User> contacts;
    private CountingBloomFilter<String> blockContacts;
    private Set<String> blockedSet;
    private ContactTrie contactTrie;


}
