package com.example.ClientService;


import org.springframework.stereotype.Service;

@Service
public class ClientService {

    // Método que simula la creación de un cliente
    public boolean createClient(ClientRequest clientRequest) {
        // Aquí simplemente simulo un éxito si el documento de identidad no está vacío
        return clientRequest.getDocumentoIdentidad() != null && !clientRequest.getDocumentoIdentidad().isEmpty();
    }
}
