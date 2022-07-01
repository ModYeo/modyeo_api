package com.co.kr.modyeo.member.domain.dto.request;

import com.co.kr.modyeo.member.domain.entity.Category;
import com.co.kr.modyeo.member.domain.entity.Team;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class TeamRequest {

    private Long id;

    private String name;

    private List<CategoryDto> categoryDtoList = new ArrayList<>();

    @Builder
    public TeamRequest(Long id, String name, List<CategoryDto> categoryDtoList) {
        this.id = id;
        this.name = name;
        this.categoryDtoList = categoryDtoList;
    }

    public Team toEntity(){
        return Team.of()
                .id(this.id)
                .name(this.name)
                .build();
    }

    @Data
    @NoArgsConstructor
    public static class CategoryDto{
        private Long id;
        private String name;

        @Builder
        public CategoryDto(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Category toEntity(){
            return Category.of()
                    .id(this.id)
                    .name(this.name)
                    .build();
        }
    }
}