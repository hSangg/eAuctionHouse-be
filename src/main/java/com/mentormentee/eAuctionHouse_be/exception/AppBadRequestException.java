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

    public AppBadRequestException(String code, String message) {
        super(message);
        this.code = code;
        this.errorCode = null;
    }

    public AppBadRequestException(String code, ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = code;
        this.errorCode = errorCode;
    }
}
