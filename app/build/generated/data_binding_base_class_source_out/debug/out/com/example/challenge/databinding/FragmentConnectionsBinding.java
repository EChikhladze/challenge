// Generated by view binder compiler. Do not edit!
package com.example.challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.challenge.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentConnectionsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnLogOut;

  @NonNull
  public final LoaderBinding loaderInclude;

  @NonNull
  public final RecyclerView recyclerConnections;

  private FragmentConnectionsBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnLogOut, @NonNull LoaderBinding loaderInclude,
      @NonNull RecyclerView recyclerConnections) {
    this.rootView = rootView;
    this.btnLogOut = btnLogOut;
    this.loaderInclude = loaderInclude;
    this.recyclerConnections = recyclerConnections;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentConnectionsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentConnectionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_connections, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentConnectionsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLogOut;
      AppCompatButton btnLogOut = ViewBindings.findChildViewById(rootView, id);
      if (btnLogOut == null) {
        break missingId;
      }

      id = R.id.loaderInclude;
      View loaderInclude = ViewBindings.findChildViewById(rootView, id);
      if (loaderInclude == null) {
        break missingId;
      }
      LoaderBinding binding_loaderInclude = LoaderBinding.bind(loaderInclude);

      id = R.id.recyclerConnections;
      RecyclerView recyclerConnections = ViewBindings.findChildViewById(rootView, id);
      if (recyclerConnections == null) {
        break missingId;
      }

      return new FragmentConnectionsBinding((ConstraintLayout) rootView, btnLogOut,
          binding_loaderInclude, recyclerConnections);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
