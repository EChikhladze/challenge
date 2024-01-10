package com.example.challenge.di;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.example.challenge.data.common.HandleResponse;
import com.example.challenge.data.repository.connection.ConnectionsRepositoryImpl;
import com.example.challenge.data.repository.datastore.DataStoreRepositoryImpl;
import com.example.challenge.data.repository.log_in.LogInRepositoryImpl;
import com.example.challenge.data.service.connection.ConnectionsService;
import com.example.challenge.data.service.log_in.LogInService;
import com.example.challenge.domain.repository.connection.ConnectionsRepository;
import com.example.challenge.domain.repository.datastore.DataStoreRepository;
import com.example.challenge.domain.repository.log_in.LogInRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/challenge/di/RepositoryModule;", "", "()V", "provideConnectionsRepository", "Lcom/example/challenge/domain/repository/connection/ConnectionsRepository;", "connectionsService", "Lcom/example/challenge/data/service/connection/ConnectionsService;", "handleResponse", "Lcom/example/challenge/data/common/HandleResponse;", "provideDataStoreRepository", "Lcom/example/challenge/domain/repository/datastore/DataStoreRepository;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "provideLogInRepository", "Lcom/example/challenge/domain/repository/log_in/LogInRepository;", "logInService", "Lcom/example/challenge/data/service/log_in/LogInService;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.challenge.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.challenge.domain.repository.log_in.LogInRepository provideLogInRepository(@org.jetbrains.annotations.NotNull
    com.example.challenge.data.service.log_in.LogInService logInService, @org.jetbrains.annotations.NotNull
    com.example.challenge.data.common.HandleResponse handleResponse) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.challenge.domain.repository.datastore.DataStoreRepository provideDataStoreRepository(@org.jetbrains.annotations.NotNull
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.challenge.domain.repository.connection.ConnectionsRepository provideConnectionsRepository(@org.jetbrains.annotations.NotNull
    com.example.challenge.data.service.connection.ConnectionsService connectionsService, @org.jetbrains.annotations.NotNull
    com.example.challenge.data.common.HandleResponse handleResponse) {
        return null;
    }
}