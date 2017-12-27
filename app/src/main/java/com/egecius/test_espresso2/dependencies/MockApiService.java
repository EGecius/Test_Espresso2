package com.egecius.test_espresso2.dependencies;

public class MockApiService implements ApiService {

    @Override
    public String getString() {
        return "from MockApiService";
    }
}
