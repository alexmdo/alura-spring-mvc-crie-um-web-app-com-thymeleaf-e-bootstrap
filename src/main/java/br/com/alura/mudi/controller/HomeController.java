package br.com.alura.mudi.controller;

import br.com.alura.mudi.model.Order;
import br.com.alura.mudi.model.OrderStatus;
import br.com.alura.mudi.repository.OrderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    private final OrderRepository orderRepository;

    public HomeController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public String home(Model model) {
        List<Order> orders = orderRepository.findAll();
        model.addAttribute("orders", orders);

        return "home";
    }

    @GetMapping("/{status}")
    public String byStatus(@PathVariable String status, Model model) {
        List<Order> orders = orderRepository.findByStatus(OrderStatus.valueOf(status.toUpperCase()));
        model.addAttribute("orders", orders);
        model.addAttribute("status", status);

        return "home";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String illegalArgumentExceptionHandler() {
        return "redirect:/home";
    }

}
