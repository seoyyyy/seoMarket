package kr.co.seomarket.member;

import kr.co.seomarket.global.base.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@ToString
public class MemberDto extends BaseEntity {
    private String compCd;
    private String memberId;
    private String password;
    private String username;
    private String phone;
    private String role;
    private String gender;

    public MemberEntity toDomain() {
        MemberEntity target = new MemberEntity();

        BeanUtils.copyProperties(this, target);
        return target;
    }
}
