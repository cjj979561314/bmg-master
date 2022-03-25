package com.bmg.mall.dao;

import com.bmg.mall.entity.RankDTO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsRankMapper {
   @Results({
                    @Result(property = "goodsName", column = "goods_name")
            })
    @Select("select goods_name,goods_id,count(goods_id) as total from bmg_order_item group by goods_id order by total desc limit 1,5;")
    List<RankDTO> SelectRankByGoodsId();
}
