package com.javapandeng.controller;

import com.javapandeng.base.BaseController;
import com.javapandeng.po.Delivery;
import com.javapandeng.service.DeliveryService;
import com.javapandeng.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类目c层
 */
@Controller
@RequestMapping("/delivery")
public class DeliveryController extends BaseController {

    @Autowired
    private DeliveryService deliveryService;


    @RequestMapping("/findBySql")
    public String findBySql(Model model, Delivery delivery){
        String sql = "select * from delivery where 1=1";
        Pager<Delivery> pagers = deliveryService.findBySqlRerturnEntity(sql);
        model.addAttribute("pagers",pagers);
        model.addAttribute("obj",delivery);
        return "delivery/delivery";
    }


    @RequestMapping(value = "/add")
    public String add(){
        return "delivery/add";
    }


    @RequestMapping("/exAdd")
    public String exAdd(Delivery delivery){
        deliveryService.insert(delivery);
        return "redirect:/delivery/findBySql.action";
    }


    @RequestMapping(value = "/update")
    public String update(Integer id,Model model){
        Delivery obj = deliveryService.load(id);
        model.addAttribute("obj",obj);
        return "delivery/update";
    }


    @RequestMapping("/exUpdate")
    public String exUpdate(Delivery delivery){
        deliveryService.updateById(delivery);
        return "redirect:/delivery/findBySql.action";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        //删除本身
        deliveryService.deleteById(id);
        return "redirect:/delivery/findBySql.action";
    }
}
