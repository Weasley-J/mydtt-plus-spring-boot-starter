package com.example.domain.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 商品物流模板
 * </p>
 */
@Data

@NoArgsConstructor
@AllArgsConstructor

public class ItemCarriage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */

    private Integer id;

    /**
     * itemId 关联商品itemInfo表
     */
    private Integer itemId;

    /**
     * 模板id 关联goods_carriage_template
     */
    private Integer templateId;

    /**
     * 模板类型 1:b2c 2:O2O配送 3:自提
     */
    private Integer templateType;

    /**
     * 操作时间
     */
    private LocalDateTime createTime;
}
