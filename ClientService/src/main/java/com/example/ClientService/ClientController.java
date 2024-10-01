package com.example.ClientService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/create")
    public String createClient(@RequestBody ClientRequest clientRequest) {
        boolean success = clientService.createClient(clientRequest);
        return success ? "Usuario creado exitosamente." : "Error al crear el usuario.";
    }
}