package com.egecius.test_espresso2.di;

import com.egecius.test_espresso2.MainActivity;

import dagger.Component;

@Component (modules = MainActivityModule.class)
public interface ApplicationComponent {

    void injects(MainActivity mainActivity);
}