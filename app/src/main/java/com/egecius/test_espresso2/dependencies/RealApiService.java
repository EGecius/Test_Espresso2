package com.egecius.test_espresso2.dependencies;

public class RealApiService implements ApiService {

    @Override
    public String getString() {
        return "from RealApiService";
    }
}
