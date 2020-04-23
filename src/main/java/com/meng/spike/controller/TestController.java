package com.meng.spike.controller;

import com.meng.spike.service.GoodsStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class TestController {

    @Autowired
    private GoodsStoreService goodsStoreService;

    /**
     * 进入测试页面
     * @param model
     * @return
     */
    @GetMapping("")
    public String Index(Model model){
        return "index";
    }

    /**
     * 秒杀提交
     * @param code
     * @param num
     * @return
     */
    @PostMapping("secKill")
    @ResponseBody
    public String secKill(@RequestParam(value="code",required=true) String code, @RequestParam(value="num",required=true) Integer num){
        String reString = goodsStoreService.updateGoodsStore(code, num);
        return reString;
    }
}