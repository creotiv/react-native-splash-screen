package com.creotiv.RNSplashScreen;

import android.app.Activity;
import android.R;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class RNSplashScreenModule extends ReactContextBaseJavaModule {
  private Activity activity;

  public RNSoundModule(ReactApplicationContext context, Activity activity) {
    super(context);
    this.activity = activity;
    setBackground();
  }

  protected setBackground() {
    // set theme background
    this.activity.getWindow().setBackgroundDrawableResource(R.drawable.background_splash);
  }

  @Override
  public String getName() {
    return "RNSplashScreen";
  }

  @ReactMethod
  public void hide() {
    // set empty drawable;
    this.activity.getWindow().setBackgroundDrawableResource(0);
    this.activity.recreate();
  }

}
