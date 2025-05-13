package com.example.wanted.be31.global.response;

import java.util.List;

public record PaginationResponse<T>(
        List<T> items,
        Pagination pagination
) {
    public record Pagination(
            int totalItems,
            int totalPages,
            int currentPage,
            int perPage
    ) {}
}
