package br.com.alura.mudi.controller;

import br.com.alura.mudi.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Order order = new Order(
                "Apple iMac (de 24 polegadas, Processador M1 da Apple com CPU 8‑core e GPU 8‑core, 8 GB RAM, 256 GB) - Azul",
                new BigDecimal("20099.00"),
                LocalDate.now(),
                "https://www.amazon.com.br/Apple-iMac-24-polegadas-Processador-GPU-8%E2%80%91core/dp/B09B2QNHJB/?_encoding=UTF8&pd_rd_w=wIBhl&content-id=amzn1.sym.07271deb-23ee-498c-8f97-f25954bcc083&pf_rd_p=07271deb-23ee-498c-8f97-f25954bcc083&pf_rd_r=4143VEP2FRTZ4Y5PV7HK&pd_rd_wg=p4VZr&pd_rd_r=1181a7a8-4152-4fa7-a24e-759d1b58d718&ref_=pd_gw_ci_mcx_mr_hp_atf_m",
                "https://m.media-amazon.com/images/I/31YzO1KJyVS._AC_.jpg",
                "Apple iMac (de 24 polegadas, Processador M1 da Apple com CPU 8‑core e GPU 8‑core, 8 GB RAM, 256 GB) - Azul");

        List<Order> orders = Arrays.asList(order);
        model.addAttribute("orders", orders);

        return "home";
    }

}
