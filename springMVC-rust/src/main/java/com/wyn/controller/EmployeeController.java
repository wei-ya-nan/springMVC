package com.wyn.controller;

import com.wyn.bean.Employee;
import com.wyn.dao.EmployeeDao;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author wei-ya-nan
 * @version 1.0
 * @date 2022/2/16
 */
@Controller
public class EmployeeController {
    @Autowired()
    private EmployeeDao employeeDao;

    //查询所有
    @GetMapping("/emp")
    public String emp(@NotNull Model model) {
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("all", all);
//        System.out.println(all.toString());
        return "emp_list";
    }

    //根据id删除
    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/emp";
    }

    //添加
    @PostMapping("/addEmp")
    public String addEmp(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emp";
    }

    //update
    @RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
    public String getEmpById(@PathVariable Integer id, @NotNull Model Model) {
        Employee employee = employeeDao.get(id);
        Model.addAttribute(employee);
        return "emp_update";
    }

    //update 根据put方法
    @PutMapping("/emp")
    public String udpateEmp(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emp";
    }


}
