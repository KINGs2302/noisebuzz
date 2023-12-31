// Generated by view binder compiler. Do not edit!
package com.example.music_player.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.music_player.R;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final Button favoritebtn;

  @NonNull
  public final RecyclerView musicRv;

  @NonNull
  public final NavigationView navView;

  @NonNull
  public final Button playlistbtn;

  @NonNull
  public final Button shufflebtn;

  @NonNull
  public final TextView totalSongs;

  private ActivityMainBinding(@NonNull DrawerLayout rootView, @NonNull Button favoritebtn,
      @NonNull RecyclerView musicRv, @NonNull NavigationView navView, @NonNull Button playlistbtn,
      @NonNull Button shufflebtn, @NonNull TextView totalSongs) {
    this.rootView = rootView;
    this.favoritebtn = favoritebtn;
    this.musicRv = musicRv;
    this.navView = navView;
    this.playlistbtn = playlistbtn;
    this.shufflebtn = shufflebtn;
    this.totalSongs = totalSongs;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.favoritebtn;
      Button favoritebtn = ViewBindings.findChildViewById(rootView, id);
      if (favoritebtn == null) {
        break missingId;
      }

      id = R.id.musicRv;
      RecyclerView musicRv = ViewBindings.findChildViewById(rootView, id);
      if (musicRv == null) {
        break missingId;
      }

      id = R.id.navView;
      NavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      id = R.id.playlistbtn;
      Button playlistbtn = ViewBindings.findChildViewById(rootView, id);
      if (playlistbtn == null) {
        break missingId;
      }

      id = R.id.shufflebtn;
      Button shufflebtn = ViewBindings.findChildViewById(rootView, id);
      if (shufflebtn == null) {
        break missingId;
      }

      id = R.id.totalSongs;
      TextView totalSongs = ViewBindings.findChildViewById(rootView, id);
      if (totalSongs == null) {
        break missingId;
      }

      return new ActivityMainBinding((DrawerLayout) rootView, favoritebtn, musicRv, navView,
          playlistbtn, shufflebtn, totalSongs);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
