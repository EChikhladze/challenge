package com.example.challenge.presentation.screen.connection;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.challenge.databinding.FragmentConnectionsBinding;
import com.example.challenge.presentation.base.BaseFragment;
import com.example.challenge.presentation.event.conection.ConnectionEvent;
import com.example.challenge.presentation.state.connection.ConnectionState;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/example/challenge/presentation/screen/connection/ConnectionsFragment;", "Lcom/example/challenge/presentation/base/BaseFragment;", "Lcom/example/challenge/databinding/FragmentConnectionsBinding;", "()V", "connectionsRecyclerAdapter", "Lcom/example/challenge/presentation/screen/connection/ConnectionsRecyclerAdapter;", "viewModel", "Lcom/example/challenge/presentation/screen/connection/ConnectionsViewModel;", "getViewModel", "()Lcom/example/challenge/presentation/screen/connection/ConnectionsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bind", "", "bindObserves", "bindViewActionListeners", "handleConnectionState", "state", "Lcom/example/challenge/presentation/state/connection/ConnectionState;", "handleNavigationEvents", "event", "Lcom/example/challenge/presentation/screen/connection/ConnectionsViewModel$ConnectionUiEvent;", "app_debug"})
public final class ConnectionsFragment extends com.example.challenge.presentation.base.BaseFragment<com.example.challenge.databinding.FragmentConnectionsBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.challenge.presentation.screen.connection.ConnectionsRecyclerAdapter connectionsRecyclerAdapter;
    
    public ConnectionsFragment() {
        super(null);
    }
    
    private final com.example.challenge.presentation.screen.connection.ConnectionsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void bind() {
    }
    
    @java.lang.Override
    public void bindViewActionListeners() {
    }
    
    @java.lang.Override
    public void bindObserves() {
    }
    
    private final void handleConnectionState(com.example.challenge.presentation.state.connection.ConnectionState state) {
    }
    
    private final void handleNavigationEvents(com.example.challenge.presentation.screen.connection.ConnectionsViewModel.ConnectionUiEvent event) {
    }
}