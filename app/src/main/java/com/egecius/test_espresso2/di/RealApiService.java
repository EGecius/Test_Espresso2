package com.egecius.test_espresso2.di;

import com.egecius.test_espresso2.ApiService;

class RealApiService implements ApiService {

    @Override
    public String getString() {
        return "from RealApiService";
    }
}
