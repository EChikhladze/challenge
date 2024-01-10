package com.example.challenge.data.model.log_in;

import com.squareup.moshi.Json;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J2\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/example/challenge/data/model/log_in/LogInDto;", "", "needsMfa", "", "accessToken", "", "refreshToken", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getNeedsMfa", "()Ljava/lang/Boolean;", "setNeedsMfa", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getRefreshToken", "setRefreshToken", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/example/challenge/data/model/log_in/LogInDto;", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class LogInDto {
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean needsMfa;
    @org.jetbrains.annotations.Nullable
    private java.lang.String accessToken;
    @org.jetbrains.annotations.Nullable
    private java.lang.String refreshToken;
    
    public LogInDto(@com.squareup.moshi.Json(name = "needsMfa")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean needsMfa, @com.squareup.moshi.Json(name = "AccessToken")
    @org.jetbrains.annotations.Nullable
    java.lang.String accessToken, @com.squareup.moshi.Json(name = "RefreshToken")
    @org.jetbrains.annotations.Nullable
    java.lang.String refreshToken) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getNeedsMfa() {
        return null;
    }
    
    public final void setNeedsMfa(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void setAccessToken(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRefreshToken() {
        return null;
    }
    
    public final void setRefreshToken(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public LogInDto() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.challenge.data.model.log_in.LogInDto copy(@com.squareup.moshi.Json(name = "needsMfa")
    @org.jetbrains.annotations.Nullable
    java.lang.Boolean needsMfa, @com.squareup.moshi.Json(name = "AccessToken")
    @org.jetbrains.annotations.Nullable
    java.lang.String accessToken, @com.squareup.moshi.Json(name = "RefreshToken")
    @org.jetbrains.annotations.Nullable
    java.lang.String refreshToken) {
        return null;
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