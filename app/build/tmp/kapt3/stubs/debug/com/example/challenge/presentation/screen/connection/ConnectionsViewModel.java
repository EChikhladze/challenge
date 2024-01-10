package com.example.challenge.presentation.screen.connection;

import androidx.lifecycle.ViewModel;
import com.example.challenge.data.common.Resource;
import com.example.challenge.domain.usecase.connection.GetConnectionsUseCase;
import com.example.challenge.domain.usecase.datastore.ClearDataStoreUseCase;
import com.example.challenge.presentation.event.conection.ConnectionEvent;
import com.example.challenge.presentation.state.connection.ConnectionState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.SharedFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/example/challenge/presentation/screen/connection/ConnectionsViewModel;", "Landroidx/lifecycle/ViewModel;", "getConnectionsUseCase", "Lcom/example/challenge/domain/usecase/connection/GetConnectionsUseCase;", "clearDataStoreUseCase", "Lcom/example/challenge/domain/usecase/datastore/ClearDataStoreUseCase;", "(Lcom/example/challenge/domain/usecase/connection/GetConnectionsUseCase;Lcom/example/challenge/domain/usecase/datastore/ClearDataStoreUseCase;)V", "_connectionState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/challenge/presentation/state/connection/ConnectionState;", "_uiEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/challenge/presentation/screen/connection/ConnectionsViewModel$ConnectionUiEvent;", "connectionState", "Lkotlinx/coroutines/flow/SharedFlow;", "getConnectionState", "()Lkotlinx/coroutines/flow/SharedFlow;", "uiEvent", "getUiEvent", "fetchConnections", "", "logOut", "onEvent", "event", "Lcom/example/challenge/presentation/event/conection/ConnectionEvent;", "updateErrorMessage", "message", "", "ConnectionUiEvent", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ConnectionsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.challenge.domain.usecase.connection.GetConnectionsUseCase getConnectionsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.challenge.domain.usecase.datastore.ClearDataStoreUseCase clearDataStoreUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.challenge.presentation.state.connection.ConnectionState> _connectionState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.challenge.presentation.state.connection.ConnectionState> connectionState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.challenge.presentation.screen.connection.ConnectionsViewModel.ConnectionUiEvent> _uiEvent = null;
    
    @javax.inject.Inject
    public ConnectionsViewModel(@org.jetbrains.annotations.NotNull
    com.example.challenge.domain.usecase.connection.GetConnectionsUseCase getConnectionsUseCase, @org.jetbrains.annotations.NotNull
    com.example.challenge.domain.usecase.datastore.ClearDataStoreUseCase clearDataStoreUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.challenge.presentation.state.connection.ConnectionState> getConnectionState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.challenge.presentation.screen.connection.ConnectionsViewModel.ConnectionUiEvent> getUiEvent() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.example.challenge.presentation.event.conection.ConnectionEvent event) {
    }
    
    private final void fetchConnections() {
    }
    
    private final void logOut() {
    }
    
    private final void updateErrorMessage(java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/challenge/presentation/screen/connection/ConnectionsViewModel$ConnectionUiEvent;", "", "NavigateToLogIn", "Lcom/example/challenge/presentation/screen/connection/ConnectionsViewModel$ConnectionUiEvent$NavigateToLogIn;", "app_debug"})
    public static abstract interface ConnectionUiEvent {
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/challenge/presentation/screen/connection/ConnectionsViewModel$ConnectionUiEvent$NavigateToLogIn;", "Lcom/example/challenge/presentation/screen/connection/ConnectionsViewModel$ConnectionUiEvent;", "()V", "app_debug"})
        public static final class NavigateToLogIn implements com.example.challenge.presentation.screen.connection.ConnectionsViewModel.ConnectionUiEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.example.challenge.presentation.screen.connection.ConnectionsViewModel.ConnectionUiEvent.NavigateToLogIn INSTANCE = null;
            
            private NavigateToLogIn() {
                super();
            }
        }
    }
}