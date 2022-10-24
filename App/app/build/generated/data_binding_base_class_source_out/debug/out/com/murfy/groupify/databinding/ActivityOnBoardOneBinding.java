// Generated by view binder compiler. Do not edit!
package com.murfy.groupify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.murfy.groupify.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOnBoardOneBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView background;

  @NonNull
  public final ImageView foreground;

  @NonNull
  public final ImageView onBoardOneDots;

  @NonNull
  public final ImageButton onBoardOneNext;

  @NonNull
  public final TextView onBoardinOneText;

  @NonNull
  public final TextView skip;

  private ActivityOnBoardOneBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView background, @NonNull ImageView foreground,
      @NonNull ImageView onBoardOneDots, @NonNull ImageButton onBoardOneNext,
      @NonNull TextView onBoardinOneText, @NonNull TextView skip) {
    this.rootView = rootView;
    this.background = background;
    this.foreground = foreground;
    this.onBoardOneDots = onBoardOneDots;
    this.onBoardOneNext = onBoardOneNext;
    this.onBoardinOneText = onBoardinOneText;
    this.skip = skip;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOnBoardOneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOnBoardOneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_on_board_one, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOnBoardOneBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.background;
      ImageView background = ViewBindings.findChildViewById(rootView, id);
      if (background == null) {
        break missingId;
      }

      id = R.id.foreground;
      ImageView foreground = ViewBindings.findChildViewById(rootView, id);
      if (foreground == null) {
        break missingId;
      }

      id = R.id.onBoardOneDots;
      ImageView onBoardOneDots = ViewBindings.findChildViewById(rootView, id);
      if (onBoardOneDots == null) {
        break missingId;
      }

      id = R.id.onBoardOneNext;
      ImageButton onBoardOneNext = ViewBindings.findChildViewById(rootView, id);
      if (onBoardOneNext == null) {
        break missingId;
      }

      id = R.id.onBoardinOneText;
      TextView onBoardinOneText = ViewBindings.findChildViewById(rootView, id);
      if (onBoardinOneText == null) {
        break missingId;
      }

      id = R.id.skip;
      TextView skip = ViewBindings.findChildViewById(rootView, id);
      if (skip == null) {
        break missingId;
      }

      return new ActivityOnBoardOneBinding((ConstraintLayout) rootView, background, foreground,
          onBoardOneDots, onBoardOneNext, onBoardinOneText, skip);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
