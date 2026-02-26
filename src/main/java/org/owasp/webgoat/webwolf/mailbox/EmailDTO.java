package org.owasp.webgoat.webwolf.mailbox;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;

public record EmailDTO(
    @NotBlank String contents,
    @NotBlank String title,
    @NotBlank String recipient
) {}
