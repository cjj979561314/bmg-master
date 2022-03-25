package com.bmg.mall.service;

import com.bmg.mall.entity.RankDTO;

import java.util.List;
public interface GoodsRankService {
    List<RankDTO> SelectRankByGoodsId();
}
