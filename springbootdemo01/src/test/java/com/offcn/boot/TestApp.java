package com.offcn.boot;

import com.offcn.HelloApplication;
import com.offcn.dao.MUserMapper;
import com.offcn.dao.UserDao;
import com.offcn.entity.User;
import com.offcn.pojo.MUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApp {

    @Autowired
    MUserMapper mUserMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test01(){

        List<MUser> mUserList = mUserMapper.getMUserList();
        for (MUser mUser:mUserList) {
            System.out.println(mUser);
        }
    }

    @Test
    public void test02(){
        redisTemplate.opsForValue().set("user","xiaoming");
        String s = (String)redisTemplate.opsForValue().get("user");
        System.out.println(s);

        MUser mUser = new MUser();
        mUser.setId(5);
        mUser.setUsername("xiaohong");
        mUser.setAge(22);
        redisTemplate.opsForValue().set("muser",mUser);
       MUser muser = (MUser)redisTemplate.opsForValue().get("muser");
        System.out.println(muser);

    }
}
