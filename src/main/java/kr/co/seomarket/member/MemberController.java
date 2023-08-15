package kr.co.seomarket.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService service;
    @GetMapping
    public List<MemberDto> findAllMembers() {
        return service.findAll();
    }

    @PostMapping
    public MemberDto saveMember(@RequestBody MemberDto dto) {
        return service.saveMember(dto);
    }

    @DeleteMapping
    public void deleteMember(@RequestBody MemberDto dto) {
        service.deleteMember(dto);
    }
}
