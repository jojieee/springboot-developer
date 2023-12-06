package me.jiwonjo.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자
@AllArgsConstructor
@Getter
@Entity // Member객체를 jpa가 관리하는 엔티티로 지정 즉, Member 클래스와 실제 데이터베이스의 테이블을 매핑시킴
// @Entity(name = "member_list") 테이블을 지정하고 싶으면 name파라미터에 값을 지정
public class Member {
    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id; // DB 테이블의 'id' 컬럼과 매칭

    @Column(name = "name", nullable = false) // name이라는 not null 컬럼과 매핑
    private String name; // DB 테이블의 'name' 컬럼과 매칭
}