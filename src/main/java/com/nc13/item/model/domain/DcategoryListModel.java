package com.nc13.item.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DcategoryListModel {
    private Long id; // 댓글 고유

    private String name;
}
