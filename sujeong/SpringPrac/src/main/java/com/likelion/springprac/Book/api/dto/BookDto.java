package com.likelion.springprac.Book.api.dto;

import lombok.Builder;

@Builder
public record BookDto(
        Long id,
        String title,
        String writer
) {
}