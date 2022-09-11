package br.com.alura.mudi.controller;

import br.com.alura.mudi.model.Order;
import br.com.alura.mudi.repository.OrderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    private final OrderRepository orderRepository;

    public HomeController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/home")
    public String home(Model model) {
        List<Order> orders = orderRepository.findAll();
        model.addAttribute("orders", orders);

        return "home";
    }

}
