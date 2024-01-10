// Generated by Dagger (https://dagger.dev).
package com.example.challenge.di;

import com.example.challenge.domain.repository.log_in.LogInRepository;
import com.example.challenge.domain.usecase.log_in.LogInUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class UseCaseModule_ProvideLogInUseCaseFactory implements Factory<LogInUseCase> {
  private final Provider<LogInRepository> logInRepositoryProvider;

  public UseCaseModule_ProvideLogInUseCaseFactory(
      Provider<LogInRepository> logInRepositoryProvider) {
    this.logInRepositoryProvider = logInRepositoryProvider;
  }

  @Override
  public LogInUseCase get() {
    return provideLogInUseCase(logInRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideLogInUseCaseFactory create(
      Provider<LogInRepository> logInRepositoryProvider) {
    return new UseCaseModule_ProvideLogInUseCaseFactory(logInRepositoryProvider);
  }

  public static LogInUseCase provideLogInUseCase(LogInRepository logInRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideLogInUseCase(logInRepository));
  }
}