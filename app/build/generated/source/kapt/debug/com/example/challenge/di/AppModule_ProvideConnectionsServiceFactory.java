// Generated by Dagger (https://dagger.dev).
package com.example.challenge.di;

import com.example.challenge.data.service.connection.ConnectionsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideConnectionsServiceFactory implements Factory<ConnectionsService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideConnectionsServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ConnectionsService get() {
    return provideConnectionsService(retrofitProvider.get());
  }

  public static AppModule_ProvideConnectionsServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideConnectionsServiceFactory(retrofitProvider);
  }

  public static ConnectionsService provideConnectionsService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideConnectionsService(retrofit));
  }
}
