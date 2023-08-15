package kr.co.seomarket.member;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@RequiredArgsConstructor
@AllArgsConstructor
public class MemberId implements Serializable {
    private String compCd;
    private String memberId;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
