package com.offcn.dao;

import com.offcn.pojo.MUser;

import java.util.List;

public interface MUserMapper {
    void saveInfo(MUser mUser);

    List<MUser> getMUserList();

}
