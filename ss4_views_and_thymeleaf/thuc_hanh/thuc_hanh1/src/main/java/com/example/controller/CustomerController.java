package com.example.controller;

import com.example.modle.Customer;
import com.example.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @GetMapping("")
    public String index(Model model) {
        List<Customer> customerList = iCustomerService.findAll();
        model.addAttribute("customers", customerList);
        return "index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customer",new  Customer());
return "create";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("customer", iCustomerService.findById(id));
        return "/edit";
    }
    @PostMapping("/save")
    public String save(Customer customer) {
        customer.setId((int) (Math.random() * 10000));
        iCustomerService.save(customer);
        return "redirect:/customer";

    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("customers", iCustomerService.findById(id));
        return "index";
    }
    @PostMapping("/update")
    public String update(Customer customer) {
        iCustomerService.update(customer.getId(), customer);
        return "redirect:/customer";
    }
    @PostMapping("delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        iCustomerService.remove(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customer";
    }
//    redirect.addFlashAttribute(messageName, messageContent).
}
