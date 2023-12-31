package me.yuni.springboot3.DAO;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본 생성자
@AllArgsConstructor
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id; //DB 테이블의 'id'칼럼과 매칭

    @Column(name = "name",nullable = false)
    private String name; //DB 테이블의 'name' 칼럼과 매칭
}
