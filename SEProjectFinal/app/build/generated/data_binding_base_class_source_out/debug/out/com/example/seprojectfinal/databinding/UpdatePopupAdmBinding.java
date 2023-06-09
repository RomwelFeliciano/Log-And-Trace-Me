// Generated by view binder compiler. Do not edit!
package com.example.seprojectfinal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.seprojectfinal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UpdatePopupAdmBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnUpdateAdm;

  @NonNull
  public final EditText editTextFNameGlideAdm;

  @NonNull
  public final EditText editTextLNameGlideAdm;

  @NonNull
  public final EditText editTextUNameGlideAdm;

  private UpdatePopupAdmBinding(@NonNull LinearLayout rootView, @NonNull Button btnUpdateAdm,
      @NonNull EditText editTextFNameGlideAdm, @NonNull EditText editTextLNameGlideAdm,
      @NonNull EditText editTextUNameGlideAdm) {
    this.rootView = rootView;
    this.btnUpdateAdm = btnUpdateAdm;
    this.editTextFNameGlideAdm = editTextFNameGlideAdm;
    this.editTextLNameGlideAdm = editTextLNameGlideAdm;
    this.editTextUNameGlideAdm = editTextUNameGlideAdm;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UpdatePopupAdmBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UpdatePopupAdmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.update_popup_adm, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UpdatePopupAdmBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnUpdateAdm;
      Button btnUpdateAdm = ViewBindings.findChildViewById(rootView, id);
      if (btnUpdateAdm == null) {
        break missingId;
      }

      id = R.id.editTextFNameGlideAdm;
      EditText editTextFNameGlideAdm = ViewBindings.findChildViewById(rootView, id);
      if (editTextFNameGlideAdm == null) {
        break missingId;
      }

      id = R.id.editTextLNameGlideAdm;
      EditText editTextLNameGlideAdm = ViewBindings.findChildViewById(rootView, id);
      if (editTextLNameGlideAdm == null) {
        break missingId;
      }

      id = R.id.editTextUNameGlideAdm;
      EditText editTextUNameGlideAdm = ViewBindings.findChildViewById(rootView, id);
      if (editTextUNameGlideAdm == null) {
        break missingId;
      }

      return new UpdatePopupAdmBinding((LinearLayout) rootView, btnUpdateAdm, editTextFNameGlideAdm,
          editTextLNameGlideAdm, editTextUNameGlideAdm);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
