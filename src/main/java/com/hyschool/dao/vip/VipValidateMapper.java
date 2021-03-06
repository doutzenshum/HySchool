package com.hyschool.dao.vip;

import com.hyschool.bean.vip.VipValidate;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VipValidateMapper {

    void createVipValidate(VipValidate vipValidate);

    void updateVipValidate(VipValidate vipValidate);

    VipValidate findByEmail(@Param("email")String email);

    VipValidate findByValidateCode(@Param("validateCode")String validateCode);

}