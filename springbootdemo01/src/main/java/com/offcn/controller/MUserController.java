package com.offcn.controller;

import com.offcn.dao.MUserMapper;
import com.offcn.pojo.MUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/muser")
public class MUserController {

    @Resource
    private MUserMapper mUserMapper;
    //添加
    @RequestMapping("/saveInfo")
    @ResponseBody
    public String saveInfo(){
        MUser mUser = new MUser();
        mUser.setAge(22);
        mUser.setUsername("小红");
        mUserMapper.saveInfo(mUser);
        return "success";
    }


    //查询
    @RequestMapping("/getMUserList")
    public String getMUserList(Model model){
        List<MUser> Musers =  mUserMapper.getMUserList();
        model.addAttribute("Musers",Musers);
        return "user";
    }

}
