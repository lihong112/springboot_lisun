package com.sunli.sale.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunli.sale.domain.PreviousSale;
import com.sunli.sale.dto.reqDTO.PreviousSaleSelectListDTO;
import com.sunli.sale.mappers.PreviousSaleMapper;
import com.sunli.sale.service.PreviousSaleService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class PreviousSaleServiceImpl implements PreviousSaleService {
    @Resource
    private PreviousSaleMapper previousSaleMapper;
    @Override
    public int insert(PreviousSale previousSale) {
        previousSale.setCreateTime(new Date());
        return previousSaleMapper.insert(previousSale);
    }

    @Override
    public PageInfo<PreviousSale> selectList(PreviousSaleSelectListDTO dto) {
        Example example = new Example(PreviousSale.class);
        Example.Criteria criteria = example.createCriteria();
        if(dto.getSpendingTime2()!=null && dto.getSpendingTime1()!=null){
            criteria.andBetween("spendingTime",dto.getSpendingTime1(),dto.getSpendingTime2());
        }
        if(StringUtil.isNotEmpty(dto.getName())){
            criteria.andLike("name",dto.getName());
        }
        if(dto.getMoney1()!=null && dto.getMoney2()!=null){
            criteria.andBetween("money",dto.getMoney1(),dto.getMoney2());
        }
        if(dto.getType()!=null){
            criteria.andEqualTo("type",dto.getType());
        }
        Integer pageNum=dto.getPageNum()!=null?dto.getPageNum():1;
        Integer pageSize=dto.getPageSize()!=null?dto.getPageSize():10;
        PageHelper.startPage(pageNum,pageSize);
        List<PreviousSale> previousSales = previousSaleMapper.selectByExample(example);
        return new PageInfo<PreviousSale>(previousSales);
    }

    @Override
    public int updateOne(PreviousSale previousSale) {
        Long id = previousSale.getId();
        PreviousSale sale = previousSaleMapper.selectByPrimaryKey(id);
        if(StringUtil.isNotEmpty(previousSale.getName()))
            sale.setName(previousSale.getName());
        if (StringUtil.isNotEmpty(previousSale.getRemark()))
            sale.setRemark(previousSale.getRemark());
        if (previousSale.getMoney()!=null)
            sale.setMoney(previousSale.getMoney());
        if (previousSale.getType()!=null)
            sale.setType(previousSale.getType());
        if (previousSale.getSpendingTime()!=null)
            sale.setSpendingTime(previousSale.getSpendingTime());
        sale.setModifyTime(new Date());
        int i = previousSaleMapper.updateByPrimaryKey(sale);
        return i;
    }

    @Override
    public int deleteOne(Integer id) {
        return previousSaleMapper.deleteByPrimaryKey(id);
    }
}
