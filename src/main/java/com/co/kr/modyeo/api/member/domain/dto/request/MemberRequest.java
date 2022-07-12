package com.co.kr.modyeo.api.member.domain.dto.request;

import com.co.kr.modyeo.api.category.domain.dto.request.CategoryRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class MemberRequest {

    private Long memberId;

    private List<Long> categoryIdList = new ArrayList<>();

    public MemberRequest(Long memberId, List<Long> categoryIdList) {
        this.memberId = memberId;
        this.categoryIdList = categoryIdList;
    }
}
