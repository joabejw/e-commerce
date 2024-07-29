package com.e_commerce.e_commerce.domain.user;

import javax.lang.model.element.NestingKind;

public record RegisterDTO(String login, String password, UserRole role) {
}
