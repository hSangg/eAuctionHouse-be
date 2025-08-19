package com.mentormentee.eAuctionHouse_be.exception;

import lombok.Getter;

@Getter
public class AppBadRequestException extends RuntimeException {
    private final String code;
    private final ErrorCode errorCode;

    public AppBadRequestException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.errorCode = errorCode;
    }
}
