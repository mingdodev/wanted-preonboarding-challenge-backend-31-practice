package com.example.wanted.be31.global.response;

import com.example.wanted.be31.global.exception.ErrorMessage;
import jakarta.annotation.Nullable;

public record ErrorResponse(
        boolean success,
        ErrorInfo error
) {
    public static ErrorResponse of(ErrorMessage errorMessage) {
        return new ErrorResponse(false, new ErrorInfo(
                errorMessage.code(),
                errorMessage.message(),
                null
        ));
    }

    public static ErrorResponse of(ErrorMessage errorMessage, @Nullable Object details) {
        return new ErrorResponse(false, new ErrorInfo(
                errorMessage.code(),
                errorMessage.message(),
                details
        ));
    }

    public record ErrorInfo(String code, String message, @Nullable Object details) {}

}
