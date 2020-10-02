package com.example.dagger.di;

import com.example.dagger.di.auth.AuthModule;
import com.example.dagger.di.auth.AuthScope;
import com.example.dagger.di.auth.AuthViewModelsModule;
import com.example.dagger.di.main.MainFragmentBuildersModule;
import com.example.dagger.di.main.MainModule;
import com.example.dagger.di.main.MainScope;
import com.example.dagger.ui.auth.AuthActivity;
import com.example.dagger.ui.main.MainActivity;
import com.example.dagger.di.main.MainViewModelsModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

}
