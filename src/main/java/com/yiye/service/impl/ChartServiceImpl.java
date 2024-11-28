package com.yiye.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yiye.model.entity.Chart;
import com.yiye.service.ChartService;
import com.yiye.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author longyiye
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-11-28 21:15:21
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




