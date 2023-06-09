// Generated by view binder compiler. Do not edit!
package com.example.seprojectfinal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.seprojectfinal.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView bottomNavigationViewView;

  @NonNull
  public final Button buttonSignIn;

  @NonNull
  public final EditText editTextEmailAddressSignIn;

  @NonNull
  public final EditText editTextTextPasswordSignIn;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView textViewForgotPass;

  @NonNull
  public final TextView textViewRegister;

  private ActivitySignInBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView bottomNavigationViewView, @NonNull Button buttonSignIn,
      @NonNull EditText editTextEmailAddressSignIn, @NonNull EditText editTextTextPasswordSignIn,
      @NonNull ImageView imageView2, @NonNull TextView textViewForgotPass,
      @NonNull TextView textViewRegister) {
    this.rootView = rootView;
    this.bottomNavigationViewView = bottomNavigationViewView;
    this.buttonSignIn = buttonSignIn;
    this.editTextEmailAddressSignIn = editTextEmailAddressSignIn;
    this.editTextTextPasswordSignIn = editTextTextPasswordSignIn;
    this.imageView2 = imageView2;
    this.textViewForgotPass = textViewForgotPass;
    this.textViewRegister = textViewRegister;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomNavigationViewView;
      BottomNavigationView bottomNavigationViewView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationViewView == null) {
        break missingId;
      }

      id = R.id.buttonSignIn;
      Button buttonSignIn = ViewBindings.findChildViewById(rootView, id);
      if (buttonSignIn == null) {
        break missingId;
      }

      id = R.id.editTextEmailAddressSignIn;
      EditText editTextEmailAddressSignIn = ViewBindings.findChildViewById(rootView, id);
      if (editTextEmailAddressSignIn == null) {
        break missingId;
      }

      id = R.id.editTextTextPasswordSignIn;
      EditText editTextTextPasswordSignIn = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPasswordSignIn == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.textViewForgotPass;
      TextView textViewForgotPass = ViewBindings.findChildViewById(rootView, id);
      if (textViewForgotPass == null) {
        break missingId;
      }

      id = R.id.textViewRegister;
      TextView textViewRegister = ViewBindings.findChildViewById(rootView, id);
      if (textViewRegister == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ConstraintLayout) rootView, bottomNavigationViewView,
          buttonSignIn, editTextEmailAddressSignIn, editTextTextPasswordSignIn, imageView2,
          textViewForgotPass, textViewRegister);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
