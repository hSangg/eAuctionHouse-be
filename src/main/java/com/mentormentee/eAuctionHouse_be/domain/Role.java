package com.mentormentee.eAuctionHouse_be.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "roles")
public class Role {

    @Id
    private UUID id;

    private String name;

    private String description;
}
