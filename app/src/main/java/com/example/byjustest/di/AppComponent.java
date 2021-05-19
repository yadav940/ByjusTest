package com.example.byjustest.di;

import android.app.Application;

import com.example.byjustest.BaseApplication;
import com.example.byjustest.viewmodel.ViewModelProviderFactory;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton // Scoped application wise : AppComponent owns the singleton scope
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                //ActivityBuildersModule.class,
                AppModule.class,
                ViewModelProviderFactory.class,
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        com.example.byjustest.di.AppComponent build();
    }
}
