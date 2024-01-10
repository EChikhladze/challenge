// Generated by view binder compiler. Do not edit!
package com.example.challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.challenge.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemConnectionLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView imvProfile;

  @NonNull
  public final TextView tvFullName;

  private ItemConnectionLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView imvProfile, @NonNull TextView tvFullName) {
    this.rootView = rootView;
    this.imvProfile = imvProfile;
    this.tvFullName = tvFullName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemConnectionLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemConnectionLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_connection_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemConnectionLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imvProfile;
      AppCompatImageView imvProfile = ViewBindings.findChildViewById(rootView, id);
      if (imvProfile == null) {
        break missingId;
      }

      id = R.id.tvFullName;
      TextView tvFullName = ViewBindings.findChildViewById(rootView, id);
      if (tvFullName == null) {
        break missingId;
      }

      return new ItemConnectionLayoutBinding((ConstraintLayout) rootView, imvProfile, tvFullName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
