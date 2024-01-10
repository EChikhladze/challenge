// Generated by Dagger (https://dagger.dev).
package com.example.challenge.di;

import com.example.challenge.data.common.HandleResponse;
import com.example.challenge.data.service.connection.ConnectionsService;
import com.example.challenge.domain.repository.connection.ConnectionsRepository;
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
public final class RepositoryModule_ProvideConnectionsRepositoryFactory implements Factory<ConnectionsRepository> {
  private final Provider<ConnectionsService> connectionsServiceProvider;

  private final Provider<HandleResponse> handleResponseProvider;

  public RepositoryModule_ProvideConnectionsRepositoryFactory(
      Provider<ConnectionsService> connectionsServiceProvider,
      Provider<HandleResponse> handleResponseProvider) {
    this.connectionsServiceProvider = connectionsServiceProvider;
    this.handleResponseProvider = handleResponseProvider;
  }

  @Override
  public ConnectionsRepository get() {
    return provideConnectionsRepository(connectionsServiceProvider.get(), handleResponseProvider.get());
  }

  public static RepositoryModule_ProvideConnectionsRepositoryFactory create(
      Provider<ConnectionsService> connectionsServiceProvider,
      Provider<HandleResponse> handleResponseProvider) {
    return new RepositoryModule_ProvideConnectionsRepositoryFactory(connectionsServiceProvider, handleResponseProvider);
  }

  public static ConnectionsRepository provideConnectionsRepository(
      ConnectionsService connectionsService, HandleResponse handleResponse) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideConnectionsRepository(connectionsService, handleResponse));
  }
}
