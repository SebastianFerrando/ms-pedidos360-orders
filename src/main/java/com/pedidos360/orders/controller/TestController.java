package com.pedidos360.orders.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    // Endpoint público (no requiere token)
    @GetMapping("/publico")
    public Map<String, String> publico() {
        return Map.of("mensaje", "API de Pedidos360 funcionando correctamente (Público)");
    }

    // Endpoint protegido (requiere JWT de Azure AD)
    @GetMapping("/pedidos")
    public Map<String, String> pedidos() {
        return Map.of("mensaje", "Acceso concedido a la gestión de pedidos (Protegido)");
    }
}