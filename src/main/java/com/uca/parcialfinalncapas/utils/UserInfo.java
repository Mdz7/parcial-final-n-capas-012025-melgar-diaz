package com.uca.parcialfinalncapas.utils;

import com.uca.parcialfinalncapas.entities.User;

import java.util.List;

public record UserInfo(
        List<String> roles,
        User currentUser,
        User requestedUser
) {
}

