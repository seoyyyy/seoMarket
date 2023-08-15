package kr.co.seomarket.member;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import kr.co.seomarket.global.base.BaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@Entity
@IdClass(MemberId.class)
@Table(name = "member")
@Setter
@Getter
public class MemberEntity extends BaseEntity {
    @Id
    @NotNull
    private String compCd;
    @Id
    @NotNull
    private String memberId;
    private String username;
    @NotNull
    private String password;
    private String phone;
    private String role;
    private String gender;

    public MemberDto toDto() {
        MemberDto target = new MemberDto();
        BeanUtils.copyProperties(this, target);
        target.setPassword(null);
        return target;
    }

    public static List<MemberDto> toDtoList(List<MemberEntity> list) {
        List<MemberDto> dtos = new ArrayList<>();

        MemberDto target;
        for (MemberEntity member : list) {
            target = new MemberDto();
            BeanUtils.copyProperties(member, target);
            target.setPassword(null);
            dtos.add(target);
        }

        return dtos;
    }
}
