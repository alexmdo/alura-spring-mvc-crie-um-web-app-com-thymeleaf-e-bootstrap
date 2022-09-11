package br.com.alura.mudi.controller;

import br.com.alura.mudi.controller.form.NewOrderForm;
import br.com.alura.mudi.repository.OrderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/form")
    public String form() {
        return "order/form";
    }

    @PostMapping("/new")
    public String newOrder(NewOrderForm newOrderForm) {
        orderRepository.save(newOrderForm.convert());
        return "order/form";
    }


}
