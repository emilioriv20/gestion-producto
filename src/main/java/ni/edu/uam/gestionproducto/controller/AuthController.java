package ni.edu.uam.gestionproducto.controller;

import ni.edu.uam.gestionproducto.service.TokenService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/login")
    public Map<String, String> login(Authentication authentication) {
        String token = tokenService.generarToken(authentication); // Pass full Authentication object
        return Map.of("token", token);
    }
}