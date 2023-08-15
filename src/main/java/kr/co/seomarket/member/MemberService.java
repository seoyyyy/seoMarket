package kr.co.seomarket.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {
    private final MemberStore memberStore;
    private final PasswordEncoder passwordEncoder;

    public List<MemberDto> findAll() {
        return memberStore.findAll();
    }

    public MemberDto findByMemberId(String compCd, String memberId) {
        return memberStore.findById(compCd, memberId);
    }

    public MemberDto saveMember(MemberDto dto) {
        if(dto.getPassword() != null) {
            dto.setPassword(passwordEncoder.encode(dto.getPassword()));
        }
        return memberStore.saveMember(dto);
    }

    public void deleteMember(MemberDto dto) {
        memberStore.deleteMember(dto.getCompCd(), dto.getMemberId());
    }
}
