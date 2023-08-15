package kr.co.seomarket.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MemberStore {
    private final MemberRepository memberRepository;

    public List<MemberDto> findAll(){
        return MemberEntity.toDtoList(memberRepository.findAll());
    }

    public MemberDto findById(String compCd, String memberId) {
        MemberId id = new MemberId(compCd, memberId);

        MemberDto dto = memberRepository.findById(id).get().toDto();
        return dto;
    }

    public MemberDto saveMember(MemberDto dto) {
        MemberEntity domain = dto.toDomain();
        return memberRepository.save(domain).toDto();
    }

    public void deleteMember(String compCd, String memberId) {
        MemberId id = new MemberId(compCd, memberId);

        memberRepository.deleteById(id);
    }
}
