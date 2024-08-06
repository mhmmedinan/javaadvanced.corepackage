package io.github.minan65.corepackage.crossCuttingConcerns.exceptions.details;

import org.springframework.http.HttpStatus;

public class AuthenticationProblemDetails extends ProblemDetails {
    public AuthenticationProblemDetails() {
        setTitle("Not Authenticated");
        setType("http://kodlama.io/exceptions/notauthenticated");
        setStatus(HttpStatus.UNAUTHORIZED.toString());
    }
}