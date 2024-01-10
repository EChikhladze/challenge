package com.example.challenge.data.repository.log_in;

import com.example.challenge.data.common.HandleResponse;
import com.example.challenge.data.common.Resource;
import com.example.challenge.data.service.log_in.LogInService;
import com.example.challenge.domain.model.log_in.GetToken;
import com.example.challenge.domain.repository.log_in.LogInRepository;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J-\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/challenge/data/repository/log_in/LogInRepositoryImpl;", "Lcom/example/challenge/domain/repository/log_in/LogInRepository;", "logInService", "Lcom/example/challenge/data/service/log_in/LogInService;", "handleResponse", "Lcom/example/challenge/data/common/HandleResponse;", "(Lcom/example/challenge/data/service/log_in/LogInService;Lcom/example/challenge/data/common/HandleResponse;)V", "logIn", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/challenge/data/common/Resource;", "Lcom/example/challenge/domain/model/log_in/GetToken;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LogInRepositoryImpl implements com.example.challenge.domain.repository.log_in.LogInRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.challenge.data.service.log_in.LogInService logInService = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.challenge.data.common.HandleResponse handleResponse = null;
    
    @javax.inject.Inject
    public LogInRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.challenge.data.service.log_in.LogInService logInService, @org.jetbrains.annotations.NotNull
    com.example.challenge.data.common.HandleResponse handleResponse) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object logIn(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.challenge.data.common.Resource<com.example.challenge.domain.model.log_in.GetToken>>> $completion) {
        return null;
    }
}