package com.example.case_study.controller;

import com.example.case_study.dto.CustomerDto;
import com.example.case_study.model.customer.Customer;
import com.example.case_study.model.customer.CustomerType;
import com.example.case_study.service.ICustomerService;
import com.example.case_study.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@Scope
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;
    @ModelAttribute("customerTypes")
    public List<CustomerType> findAllCustomerType() {
        return this.iCustomerTypeService.findAll();
    }
    @GetMapping("/customer")
    public String goCustomer(@PageableDefault(3) Pageable pageable, Optional<String> name, Model model) {
        String searchName = name.orElse("");
        Page<Customer> customers = iCustomerService.findAll(searchName, pageable);
        model.addAttribute("customers", customers);
        model.addAttribute("searchName", searchName);
        model.addAttribute("customerTypeList", iCustomerTypeService.findAll());
        return "customer/list";
    }

    @GetMapping("/customer/create")
    public String goCreate(Model model) {
        model.addAttribute("customerDto", new CustomerDto());
        return "customer/create";
    }

    @PostMapping("/customer/create")
    public String save(@Valid @ModelAttribute CustomerDto customerDto, BindingResult bindingResult, Model model) {
        model.addAttribute("customerTypeList", iCustomerTypeService.findAll());
        if (bindingResult.hasFieldErrors()) {
            return "customer/create";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        customer.setCustomerTypes(new CustomerType(Integer.parseInt(customerDto.getCustomerTypes())));
        iCustomerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("/delete/{id}")
    public String goDelete(@PathVariable Integer id) {
        iCustomerService.deleteCustomer(id);
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable Integer id, Model model) {
        Customer customer = iCustomerService.findByIdd(id);
        model.addAttribute("customer", customer);
        model.addAttribute("customerTypeList", iCustomerTypeService.findAll());
        return "customer/edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Customer customer) {
        iCustomerService.edit(customer);
        return "redirect:/customer";
    }


}
