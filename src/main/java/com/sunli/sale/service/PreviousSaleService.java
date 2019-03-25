package com.sunli.sale.service;

import com.github.pagehelper.PageInfo;
import com.sunli.sale.domain.PreviousSale;
import com.sunli.sale.dto.reqDTO.PreviousSaleSelectListDTO;

import java.util.List;

public interface PreviousSaleService {
    int insert(PreviousSale previousSale);
    PageInfo<PreviousSale> selectList(PreviousSaleSelectListDTO dto);
    int updateOne(PreviousSale previousSale);
    int deleteOne(Integer id);
}
