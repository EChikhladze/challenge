package com.example.challenge.presentation.screen.connection;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.example.challenge.databinding.ItemConnectionLayoutBinding;
import com.example.challenge.presentation.model.connection.Connection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/challenge/presentation/screen/connection/ConnectionsRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/challenge/presentation/model/connection/Connection;", "Lcom/example/challenge/presentation/screen/connection/ConnectionsRecyclerAdapter$ConnectionsViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ConnectionsDiffUtil", "ConnectionsViewHolder", "app_debug"})
public final class ConnectionsRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.challenge.presentation.model.connection.Connection, com.example.challenge.presentation.screen.connection.ConnectionsRecyclerAdapter.ConnectionsViewHolder> {
    
    public ConnectionsRecyclerAdapter() {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.challenge.presentation.screen.connection.ConnectionsRecyclerAdapter.ConnectionsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.challenge.presentation.screen.connection.ConnectionsRecyclerAdapter.ConnectionsViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/challenge/presentation/screen/connection/ConnectionsRecyclerAdapter$ConnectionsDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/challenge/presentation/model/connection/Connection;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class ConnectionsDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.challenge.presentation.model.connection.Connection> {
        
        public ConnectionsDiffUtil() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.example.challenge.presentation.model.connection.Connection oldItem, @org.jetbrains.annotations.NotNull
        com.example.challenge.presentation.model.connection.Connection newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.example.challenge.presentation.model.connection.Connection oldItem, @org.jetbrains.annotations.NotNull
        com.example.challenge.presentation.model.connection.Connection newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/challenge/presentation/screen/connection/ConnectionsRecyclerAdapter$ConnectionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/challenge/databinding/ItemConnectionLayoutBinding;", "(Lcom/example/challenge/presentation/screen/connection/ConnectionsRecyclerAdapter;Lcom/example/challenge/databinding/ItemConnectionLayoutBinding;)V", "model", "Lcom/example/challenge/presentation/model/connection/Connection;", "bind", "", "app_debug"})
    public final class ConnectionsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.challenge.databinding.ItemConnectionLayoutBinding binding = null;
        private com.example.challenge.presentation.model.connection.Connection model;
        
        public ConnectionsViewHolder(@org.jetbrains.annotations.NotNull
        com.example.challenge.databinding.ItemConnectionLayoutBinding binding) {
            super(null);
        }
        
        public final void bind() {
        }
    }
}