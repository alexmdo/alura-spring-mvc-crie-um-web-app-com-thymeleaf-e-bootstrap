package br.com.alura.mudi.controller;

import br.com.alura.mudi.controller.form.NewOrderForm;
import br.com.alura.mudi.repository.OrderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/order")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/form")
    public String form(NewOrderForm newOrderForm) {
        return "order/form";
    }

    @PostMapping("/new")
    public String newOrder(@Valid NewOrderForm newOrderForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "order/form";
        }

        orderRepository.save(newOrderForm.convert());
        return "redirect:/home";
    }


}
