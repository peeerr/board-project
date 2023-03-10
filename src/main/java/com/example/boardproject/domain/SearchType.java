package com.example.boardproject.domain;

import lombok.Getter;

public enum SearchType {

    TITLE("제목"),
    CONTENT("본문"),
    USERNAME("작성자");

    @Getter
    private final String description;

    SearchType(String description) {
        this.description = description;
    }
}
