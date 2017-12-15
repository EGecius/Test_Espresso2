package com.egecius.test_espresso2;

class MockApiService implements ApiService {

    @Override
    public String getString() {
        return "from MockApiService";
    }
}
