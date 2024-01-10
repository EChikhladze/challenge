package com.example.challenge.presentation.screen.splash;

import androidx.lifecycle.ViewModel;
import com.example.challenge.domain.usecase.datastore.GetTokenUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.SharedFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/challenge/presentation/screen/splash/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "getTokenUseCase", "Lcom/example/challenge/domain/usecase/datastore/GetTokenUseCase;", "(Lcom/example/challenge/domain/usecase/datastore/GetTokenUseCase;)V", "_uiEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/challenge/presentation/screen/splash/SplashViewModel$SplashUiEvent;", "uiEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getUiEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "readSession", "", "SplashUiEvent", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SplashViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.challenge.domain.usecase.datastore.GetTokenUseCase getTokenUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.challenge.presentation.screen.splash.SplashViewModel.SplashUiEvent> _uiEvent = null;
    
    @javax.inject.Inject
    public SplashViewModel(@org.jetbrains.annotations.NotNull
    com.example.challenge.domain.usecase.datastore.GetTokenUseCase getTokenUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.challenge.presentation.screen.splash.SplashViewModel.SplashUiEvent> getUiEvent() {
        return null;
    }
    
    private final void readSession() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/challenge/presentation/screen/splash/SplashViewModel$SplashUiEvent;", "", "NavigateToConnections", "NavigateToLogIn", "Lcom/example/challenge/presentation/screen/splash/SplashViewModel$SplashUiEvent$NavigateToConnections;", "Lcom/example/challenge/presentation/screen/splash/SplashViewModel$SplashUiEvent$NavigateToLogIn;", "app_debug"})
    public static abstract interface SplashUiEvent {
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/example/challenge/presentation/screen/splash/SplashViewModel$SplashUiEvent$NavigateToConnections;", "Lcom/example/challenge/presentation/screen/splash/SplashViewModel$SplashUiEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class NavigateToConnections implements com.example.challenge.presentation.screen.splash.SplashViewModel.SplashUiEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.example.challenge.presentation.screen.splash.SplashViewModel.SplashUiEvent.NavigateToConnections INSTANCE = null;
            
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/example/challenge/presentation/screen/splash/SplashViewModel$SplashUiEvent$NavigateToLogIn;", "Lcom/example/challenge/presentation/screen/splash/SplashViewModel$SplashUiEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class NavigateToLogIn implements com.example.challenge.presentation.screen.splash.SplashViewModel.SplashUiEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.example.challenge.presentation.screen.splash.SplashViewModel.SplashUiEvent.NavigateToLogIn INSTANCE = null;
            
            private NavigateToLogIn() {
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