package pm.bank.acct.dao;

import pm.bank.acct.bean.AcctInfo;

public interface AcctInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AcctInfo record);

    int insertSelective(AcctInfo record);

    AcctInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AcctInfo record);

    int updateByPrimaryKey(AcctInfo record);
}