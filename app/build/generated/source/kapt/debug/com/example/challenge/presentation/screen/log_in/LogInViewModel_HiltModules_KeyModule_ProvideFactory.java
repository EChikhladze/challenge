// Generated by Dagger (https://dagger.dev).
package com.example.challenge.presentation.screen.log_in;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class LogInViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static LogInViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(LogInViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final LogInViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LogInViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}