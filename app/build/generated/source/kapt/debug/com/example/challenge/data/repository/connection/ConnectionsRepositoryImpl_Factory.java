// Generated by Dagger (https://dagger.dev).
package com.example.challenge.data.repository.connection;

import com.example.challenge.data.common.HandleResponse;
import com.example.challenge.data.service.connection.ConnectionsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ConnectionsRepositoryImpl_Factory implements Factory<ConnectionsRepositoryImpl> {
  private final Provider<ConnectionsService> connectionsServiceProvider;

  private final Provider<HandleResponse> handleResponseProvider;

  public ConnectionsRepositoryImpl_Factory(Provider<ConnectionsService> connectionsServiceProvider,
      Provider<HandleResponse> handleResponseProvider) {
    this.connectionsServiceProvider = connectionsServiceProvider;
    this.handleResponseProvider = handleResponseProvider;
  }

  @Override
  public ConnectionsRepositoryImpl get() {
    return newInstance(connectionsServiceProvider.get(), handleResponseProvider.get());
  }

  public static ConnectionsRepositoryImpl_Factory create(
      Provider<ConnectionsService> connectionsServiceProvider,
      Provider<HandleResponse> handleResponseProvider) {
    return new ConnectionsRepositoryImpl_Factory(connectionsServiceProvider, handleResponseProvider);
  }

  public static ConnectionsRepositoryImpl newInstance(ConnectionsService connectionsService,
      HandleResponse handleResponse) {
    return new ConnectionsRepositoryImpl(connectionsService, handleResponse);
  }
}