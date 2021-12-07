package com.coderm.mb.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class IdUtils {

    public static String getId() {
        return UUID.randomUUID().toString().replace("-","");
    }

}

