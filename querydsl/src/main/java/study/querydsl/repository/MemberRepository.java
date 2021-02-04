package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> , MemberRepositoryCustom {
    // 쿼리 메소드 기능 - 메소드 이름으로 쿼리 생성
    List<Member> findByUsername(String username);
}
