package com.mentormentee.eAuctionHouse_be.service.mapper;

public interface EntityMapper<D, E> {
    E toEntity(D dto);
    D toDto(E entity);
}