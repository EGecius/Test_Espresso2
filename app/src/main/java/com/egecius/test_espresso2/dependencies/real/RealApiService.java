package com.egecius.test_espresso2.dependencies.real;

import com.egecius.test_espresso2.dependencies.ApiService;

public class RealApiService implements ApiService {

    @Override
    public String getString() {
        return "from RealApiService";
    }
}
