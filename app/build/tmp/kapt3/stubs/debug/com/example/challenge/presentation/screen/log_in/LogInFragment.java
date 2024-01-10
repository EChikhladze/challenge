package com.example.challenge.presentation.screen.log_in;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.example.challenge.databinding.FragmentLogInBinding;
import com.example.challenge.presentation.base.BaseFragment;
import com.example.challenge.presentation.event.log_in.LogInEvent;
import com.example.challenge.presentation.state.log_in.LogInState;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/example/challenge/presentation/screen/log_in/LogInFragment;", "Lcom/example/challenge/presentation/base/BaseFragment;", "Lcom/example/challenge/databinding/FragmentLogInBinding;", "()V", "viewModel", "Lcom/example/challenge/presentation/screen/log_in/LogInViewModel;", "getViewModel", "()Lcom/example/challenge/presentation/screen/log_in/LogInViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bind", "", "bindObserves", "bindViewActionListeners", "handleLogInState", "logInState", "Lcom/example/challenge/presentation/state/log_in/LogInState;", "handleNavigationEvents", "event", "Lcom/example/challenge/presentation/screen/log_in/LogInViewModel$LogInUiEvent;", "logIn", "app_debug"})
public final class LogInFragment extends com.example.challenge.presentation.base.BaseFragment<com.example.challenge.databinding.FragmentLogInBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    
    public LogInFragment() {
        super(null);
    }
    
    private final com.example.challenge.presentation.screen.log_in.LogInViewModel getViewModel() {
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
    
    private final void logIn() {
    }
    
    private final void handleLogInState(com.example.challenge.presentation.state.log_in.LogInState logInState) {
    }
    
    private final void handleNavigationEvents(com.example.challenge.presentation.screen.log_in.LogInViewModel.LogInUiEvent event) {
    }
}