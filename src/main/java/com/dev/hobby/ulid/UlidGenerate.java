package com.dev.hobby.ulid;

import com.github.f4b6a3.ulid.UlidCreator;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UlidGenerate {

    public String generate() {
        return UlidCreator.getUlid().toString();
    }
}