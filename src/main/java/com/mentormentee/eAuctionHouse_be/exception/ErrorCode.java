package com.mentormentee.eAuctionHouse_be.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    PARENT_CATEGORY_NOT_FOUND("parentcategorynotfound", "Parent category not found"),
    CATEGORY_NOT_FOUND("categorynotfound", "Category not found"),
    PRODUCT_NOT_FOUND("productnotfound", "Product not found"),
    USER_NOT_FOUND("usernotfound", "User not found"),
    INVALID_REQUEST("invalidrequest", "Invalid request");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
