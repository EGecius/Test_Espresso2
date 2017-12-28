package com.egecius.test_espresso2.dependencies.mock;

import com.egecius.test_espresso2.dependencies.ApiService;

public class MockApiService implements ApiService {

    @Override
    public String getString() {
        return "from MockApiService";
    }
}
