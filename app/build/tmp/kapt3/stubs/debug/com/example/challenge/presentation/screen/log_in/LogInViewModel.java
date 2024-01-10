package com.example.challenge.presentation.screen.log_in;

import androidx.lifecycle.ViewModel;
import com.example.challenge.data.common.Resource;
import com.example.challenge.domain.usecase.datastore.SaveTokenUseCase;
import com.example.challenge.domain.usecase.log_in.LogInUseCase;
import com.example.challenge.domain.usecase.validator.EmailValidatorUseCase;
import com.example.challenge.domain.usecase.validator.PasswordValidatorUseCase;
import com.example.challenge.presentation.event.log_in.LogInEvent;
import com.example.challenge.presentation.state.log_in.LogInState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.SharedFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eJ\u0012\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/example/challenge/presentation/screen/log_in/LogInViewModel;", "Landroidx/lifecycle/ViewModel;", "logInUseCase", "Lcom/example/challenge/domain/usecase/log_in/LogInUseCase;", "saveTokenUseCase", "Lcom/example/challenge/domain/usecase/datastore/SaveTokenUseCase;", "emailValidator", "Lcom/example/challenge/domain/usecase/validator/EmailValidatorUseCase;", "passwordValidator", "Lcom/example/challenge/domain/usecase/validator/PasswordValidatorUseCase;", "(Lcom/example/challenge/domain/usecase/log_in/LogInUseCase;Lcom/example/challenge/domain/usecase/datastore/SaveTokenUseCase;Lcom/example/challenge/domain/usecase/validator/EmailValidatorUseCase;Lcom/example/challenge/domain/usecase/validator/PasswordValidatorUseCase;)V", "_logInState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/challenge/presentation/state/log_in/LogInState;", "_uiEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/challenge/presentation/screen/log_in/LogInViewModel$LogInUiEvent;", "logInState", "Lkotlinx/coroutines/flow/SharedFlow;", "getLogInState", "()Lkotlinx/coroutines/flow/SharedFlow;", "uiEvent", "getUiEvent", "logIn", "", "email", "", "password", "onEvent", "event", "Lcom/example/challenge/presentation/event/log_in/LogInEvent;", "updateErrorMessage", "message", "validateForm", "LogInUiEvent", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LogInViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.challenge.domain.usecase.log_in.LogInUseCase logInUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.challenge.domain.usecase.datastore.SaveTokenUseCase saveTokenUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.challenge.domain.usecase.validator.EmailValidatorUseCase emailValidator = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.challenge.domain.usecase.validator.PasswordValidatorUseCase passwordValidator = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.challenge.presentation.state.log_in.LogInState> _logInState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.challenge.presentation.state.log_in.LogInState> logInState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.challenge.presentation.screen.log_in.LogInViewModel.LogInUiEvent> _uiEvent = null;
    
    @javax.inject.Inject
    public LogInViewModel(@org.jetbrains.annotations.NotNull
    com.example.challenge.domain.usecase.log_in.LogInUseCase logInUseCase, @org.jetbrains.annotations.NotNull
    com.example.challenge.domain.usecase.datastore.SaveTokenUseCase saveTokenUseCase, @org.jetbrains.annotations.NotNull
    com.example.challenge.domain.usecase.validator.EmailValidatorUseCase emailValidator, @org.jetbrains.annotations.NotNull
    com.example.challenge.domain.usecase.validator.PasswordValidatorUseCase passwordValidator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.challenge.presentation.state.log_in.LogInState> getLogInState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.challenge.presentation.screen.log_in.LogInViewModel.LogInUiEvent> getUiEvent() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.example.challenge.presentation.event.log_in.LogInEvent event) {
    }
    
    private final void logIn(java.lang.String email, java.lang.String password) {
    }
    
    private final void validateForm(java.lang.String email, java.lang.String password) {
    }
    
    private final void updateErrorMessage(java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/challenge/presentation/screen/log_in/LogInViewModel$LogInUiEvent;", "", "NavigateToConnections", "Lcom/example/challenge/presentation/screen/log_in/LogInViewModel$LogInUiEvent$NavigateToConnections;", "app_debug"})
    public static abstract interface LogInUiEvent {
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/example/challenge/presentation/screen/log_in/LogInViewModel$LogInUiEvent$NavigateToConnections;", "Lcom/example/challenge/presentation/screen/log_in/LogInViewModel$LogInUiEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class NavigateToConnections implements com.example.challenge.presentation.screen.log_in.LogInViewModel.LogInUiEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.example.challenge.presentation.screen.log_in.LogInViewModel.LogInUiEvent.NavigateToConnections INSTANCE = null;
            
            private NavigateToConnections() {
                super();
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
    }
}