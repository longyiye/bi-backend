package com.yiye.model.vo;

import lombok.Data;

/**
 * Bi 的返回结果
 */
@Data
public class BiResponseVO {

    private String genChart;

    private String genResult;

    private Long chartId;  // 新生成的图表 id
}