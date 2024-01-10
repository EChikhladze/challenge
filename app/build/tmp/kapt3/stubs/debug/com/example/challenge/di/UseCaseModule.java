package com.example.challenge.di;

import com.example.challenge.domain.repository.connection.ConnectionsRepository;
import com.example.challenge.domain.repository.datastore.DataStoreRepository;
import com.example.challenge.domain.repository.log_in.LogInRepository;
import com.example.challenge.domain.usecase.connection.GetConnectionsUseCase;
import com.example.challenge.domain.usecase.datastore.ClearDataStoreUseCase;
import com.example.challenge.domain.usecase.datastore.GetTokenUseCase;
import com.example.challenge.domain.usecase.datastore.SaveTokenUseCase;
import com.example.challenge.domain.usecase.log_in.LogInUseCase;
import com.example.challenge.domain.usecase.validator.EmailValidatorUseCase;
import com.example.challenge.domain.usecase.validator.PasswordValidatorUseCase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/example/challenge/di/UseCaseModule;", "", "()V", "provideClearDataStoreUseCase", "Lcom/example/challenge/domain/usecase/datastore/ClearDataStoreUseCase;", "dataStoreRepository", "Lcom/example/challenge/domain/repository/datastore/DataStoreRepository;", "provideEmailValidatorUseCase", "Lcom/example/challenge/domain/usecase/validator/EmailValidatorUseCase;", "provideGetConnectionsUseCase", "Lcom/example/challenge/domain/usecase/connection/GetConnectionsUseCase;", "connectionsRepository", "Lcom/example/challenge/domain/repository/connection/ConnectionsRepository;", "provideGetTokenUseCase", "Lcom/example/challenge/domain/usecase/datastore/GetTokenUseCase;", "provideLogInUseCase", "Lcom/example/challenge/domain/usecase/log_in/LogInUseCase;", "logInRepository", "Lcom/example/challenge/domain/repository/log_in/LogInRepository;", "providePasswordValidatorUseCase", "Lcom/example/challenge/domain/usecase/validator/PasswordValidatorUseCase;", "provideSaveTokenUseCase", "Lcom/example/challenge/domain/usecase/datastore/SaveTokenUseCase;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class UseCaseModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.challenge.di.UseCaseModule INSTANCE = null;
    
    private UseCaseModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.challenge.domain.usecase.validator.EmailValidatorUseCase provideEmailValidatorUseCase() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.challenge.domain.usecase.validator.PasswordValidatorUseCase providePasswordValidatorUseCase() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.challenge.domain.usecase.datastore.SaveTokenUseCase provideSaveTokenUseCase(@org.jetbrains.annotations.NotNull
    com.example.challenge.domain.repository.datastore.DataStoreRepository dataStoreRepository) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.challenge.domain.usecase.connection.GetConnectionsUseCase provideGetConnectionsUseCase(@org.jetbrains.annotations.NotNull
    com.example.challenge.domain.repository.connection.ConnectionsRepository connectionsRepository) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.challenge.domain.usecase.datastore.ClearDataStoreUseCase provideClearDataStoreUseCase(@org.jetbrains.annotations.NotNull
    com.example.challenge.domain.repository.datastore.DataStoreRepository dataStoreRepository) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.challenge.domain.usecase.datastore.GetTokenUseCase provideGetTokenUseCase(@org.jetbrains.annotations.NotNull
    com.example.challenge.domain.repository.datastore.DataStoreRepository dataStoreRepository) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.challenge.domain.usecase.log_in.LogInUseCase provideLogInUseCase(@org.jetbrains.annotations.NotNull
    com.example.challenge.domain.repository.log_in.LogInRepository logInRepository) {
        return null;
    }
}