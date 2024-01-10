package com.example.challenge.presentation.event.conection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/challenge/presentation/event/conection/ConnectionEvent;", "", "()V", "FetchConnections", "LogOut", "ResetErrorMessage", "Lcom/example/challenge/presentation/event/conection/ConnectionEvent$FetchConnections;", "Lcom/example/challenge/presentation/event/conection/ConnectionEvent$LogOut;", "Lcom/example/challenge/presentation/event/conection/ConnectionEvent$ResetErrorMessage;", "app_debug"})
public abstract class ConnectionEvent {
    
    private ConnectionEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/challenge/presentation/event/conection/ConnectionEvent$FetchConnections;", "Lcom/example/challenge/presentation/event/conection/ConnectionEvent;", "()V", "app_debug"})
    public static final class FetchConnections extends com.example.challenge.presentation.event.conection.ConnectionEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.example.challenge.presentation.event.conection.ConnectionEvent.FetchConnections INSTANCE = null;
        
        private FetchConnections() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/challenge/presentation/event/conection/ConnectionEvent$LogOut;", "Lcom/example/challenge/presentation/event/conection/ConnectionEvent;", "()V", "app_debug"})
    public static final class LogOut extends com.example.challenge.presentation.event.conection.ConnectionEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.example.challenge.presentation.event.conection.ConnectionEvent.LogOut INSTANCE = null;
        
        private LogOut() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/challenge/presentation/event/conection/ConnectionEvent$ResetErrorMessage;", "Lcom/example/challenge/presentation/event/conection/ConnectionEvent;", "()V", "app_debug"})
    public static final class ResetErrorMessage extends com.example.challenge.presentation.event.conection.ConnectionEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.example.challenge.presentation.event.conection.ConnectionEvent.ResetErrorMessage INSTANCE = null;
        
        private ResetErrorMessage() {
        }
    }
}