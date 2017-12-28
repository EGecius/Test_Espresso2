package com.egecius.test_espresso2.di;

import com.egecius.test_espresso2.app.MainActivity;
import com.egecius.test_espresso2.di.real.subcomponent.MySubcomponent;
import com.egecius.test_espresso2.di.real.subcomponent.MySubcomponentModule;

public interface AppComponent {

    void inject(MainActivity mainActivity);

    MySubcomponent plus(MySubcomponentModule module);
}
