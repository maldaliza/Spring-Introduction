// 회원 리포지토리 인터페이스
package hello.hellospring.repository;

import hello.hellospring.domain.Member;     // domain 패키지의 Member 클래스를 불러옴

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);         // 찾는 값이 없는 경우 null을 반환한다. Optional을 통해 null을 감싸서 반환한다.
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
