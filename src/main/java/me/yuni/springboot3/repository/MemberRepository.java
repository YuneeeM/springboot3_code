package me.yuni.springboot3.repository;

import me.yuni.springboot3.DAO.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
