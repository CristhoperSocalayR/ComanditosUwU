package edu.pe.vallegrande.Reniec.service;

import edu.pe.vallegrande.Reniec.model.User;
import edu.pe.vallegrande.Reniec.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private final WebClient webClient;

    @Autowired
    public UserService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://dniruc.apisperu.com/api/v1").build();
    }

    public Mono<User> getUserByDni(String dni) {
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6Imp1bGlvLnF1aXNwZUB2YWxsZWdyYW5kZS5lZHUucGUifQ.6M-P2QMMvKFZEeMvTUXvkOooM02N_pWqt0OdlaYW3PM";
        return webClient.get()
                .uri("/dni/{dni}?token={token}", dni, token)
                .retrieve()
                .bodyToMono(User.class)
                .flatMap(fetchedUser -> {
                    User userToSave = User.builder()
                            .id(fetchedUser.getId())
                            .dni(dni)
                            .nombres(fetchedUser.getNombres())
                            .apellidoPaterno(fetchedUser.getApellidoPaterno())
                            .apellidoMaterno(fetchedUser.getApellidoMaterno())
                            .codVerifica(fetchedUser.getCodVerifica())
                            .success(fetchedUser.getSuccess())
                            .build();
                    return userRepository.save(userToSave);
                });
    }

    public Mono<User> createUser(User newUser) {
        return userRepository.save(newUser);
    }
}