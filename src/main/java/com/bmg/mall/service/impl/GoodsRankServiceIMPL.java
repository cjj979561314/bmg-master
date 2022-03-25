package com.bmg.mall.service.impl;

import com.bmg.mall.dao.GoodsRankMapper;
import com.bmg.mall.entity.RankDTO;
import com.bmg.mall.service.GoodsRankService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsRankServiceIMPL implements GoodsRankService {
@Resource
private GoodsRankMapper goodsRankMapper;

    @Override
    public List<RankDTO> SelectRankByGoodsId() {
        return goodsRankMapper.SelectRankByGoodsId();
    }
}
