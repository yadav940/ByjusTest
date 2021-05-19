package com.example.byjustest.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.byjustest.viewmodel.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {
    // Responsible for doing dependency for ViewModelFactory class

    @Binds // Provides instance of ViewModelProviderFactory
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);
}
