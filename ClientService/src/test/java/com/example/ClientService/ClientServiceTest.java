package com.example.ClientService;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientServiceTest {

    private final ClientService clientService = new ClientService();

    @Test
    public void testCreateClientSuccess() {
        ClientRequest request = new ClientRequest();
        request.setNombre("Juan");
        request.setApellidoPaterno("Pérez");
        request.setApellidoMaterno("García");
        request.setDocumentoIdentidad("12345678");

        assertTrue(clientService.createClient(request));
    }

    @Test
    public void testCreateClientFailure() {
        ClientRequest request = new ClientRequest();
        request.setNombre("Juan");
        request.setApellidoPaterno("Pérez");
        request.setApellidoMaterno("García");
        request.setDocumentoIdentidad(""); // Documento vacío

        assertFalse(clientService.createClient(request));
    }
}

