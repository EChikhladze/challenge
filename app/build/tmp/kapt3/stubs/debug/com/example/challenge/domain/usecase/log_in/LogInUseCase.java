package com.example.challenge.domain.usecase.log_in;

import com.example.challenge.domain.repository.log_in.LogInRepository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/challenge/domain/usecase/log_in/LogInUseCase;", "", "logInRepository", "Lcom/example/challenge/domain/repository/log_in/LogInRepository;", "(Lcom/example/challenge/domain/repository/log_in/LogInRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/challenge/data/common/Resource;", "Lcom/example/challenge/domain/model/log_in/GetToken;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LogInUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.challenge.domain.repository.log_in.LogInRepository logInRepository = null;
    
    @javax.inject.Inject
    public LogInUseCase(@org.jetbrains.annotations.NotNull
    com.example.challenge.domain.repository.log_in.LogInRepository logInRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.challenge.data.common.Resource<com.example.challenge.domain.model.log_in.GetToken>>> $completion) {
        return null;
    }
}