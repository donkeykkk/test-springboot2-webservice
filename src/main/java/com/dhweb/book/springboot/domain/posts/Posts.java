package com.dhweb.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // lombok 의 Getter annotation
@NoArgsConstructor // lombok 의 Constructor annotation
@Entity // 테이블과 링크될 클래임을 나타냄. 기본 값으로 CamelCase 이름을 under_score 네이밍으로 테이블 이름을 매칭함.
public class Posts {

    @Id // PK 선언
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increments 를 위함.
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
