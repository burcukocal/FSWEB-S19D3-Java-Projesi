package com.workintech.token.repository;

import com.workintech.token.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
public interface MemberRepository extends JpaRepository<Member, Integer>{
    @Query("SELECT m FROM Member m WHERE m.email = :email")
    Optional<Member> findMemberByEmail(String email);
}
