package com.thecommerce.app.common.util;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Schema
public class Response<T> {

    private final boolean success;
    private final T response;
    private final String message;

    public static <T> Response<T> success() {
        return new Response<>(true, null, null);
    }

    public static <T> Response<T> success(final T response) {
        return new Response<>(true, response, null);
    }

    public static Response<Void> error(final String message) {
        return new Response<>(false, null, message);
    }

}
