package com.egecius.test_espresso2.di.real.subcomponent;


import com.egecius.test_espresso2.app.DetailActivity;

import dagger.Subcomponent;

@Subcomponent (modules = MySubcomponentModule.class)
public interface MySubcomponent {

    void inject(DetailActivity detailActivity);

}
