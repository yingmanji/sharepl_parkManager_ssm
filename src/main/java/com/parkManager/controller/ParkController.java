package com.parkManager.controller;

import com.parkManager.entitiy.ParkinglotCustom;
import com.parkManager.service.UserParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 樱满集0_0 on 2017/9/9.
 */

@Controller
public class ParkController{

    @Autowired
    private UserParkingService userParkingService;

    @RequestMapping(value = "queryUserParkingById.action",method = {RequestMethod.GET,RequestMethod.POST})
    public String queryUserParkingById(Model model, HttpServletRequest request, @RequestParam(value = "id",defaultValue = "2") Integer id)throws Exception{

        List<ParkinglotCustom> parkinglotCustoms=userParkingService.selectUsersParkinglot(id);

        model.addAttribute("ParkinglotCustoms",parkinglotCustoms);

        return "parks/parksList";

    }

}
