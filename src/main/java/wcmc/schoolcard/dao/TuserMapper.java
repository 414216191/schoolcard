package wcmc.schoolcard.dao;

import java.math.BigDecimal;
import java.util.List;

import wcmc.schoolcard.dto.Tuser;

public interface TuserMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Tuser record);

    int insertSelective(Tuser record);

    Tuser selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);
    
    List<Tuser> selectAllUser();
}