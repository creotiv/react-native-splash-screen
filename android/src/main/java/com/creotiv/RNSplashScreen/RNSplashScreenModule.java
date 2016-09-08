package com.creotiv.RNSplashScreen;

import android.app.Activity;

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

  public RNSplashScreenModule(ReactApplicationContext context) {
    super(context);
    setBackground();
  }

  protected void setBackground() {
    Activity cur = getCurrentActivity();
    // set theme background
    int drawableId = cur.getResources().getIdentifier("background_splash", "drawable", cur.getClass().getPackage().getName());
    if (drawableId == 0) {
        drawableId = cur.getResources().getIdentifier("background_splash", "drawable", cur.getPackageName());
    }
    cur.getWindow().setBackgroundDrawableResource(drawableId);
  }

  @Override
  public String getName() {
    return "RNSplashScreen";
  }

  @ReactMethod
  public void hide() {
    // set empty drawable;
    getCurrentActivity().getWindow().setBackgroundDrawableResource(0);
    getCurrentActivity().recreate();
  }

}
