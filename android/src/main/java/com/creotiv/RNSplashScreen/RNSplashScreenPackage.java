package com.creotiv.RNSplashScreen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

public class RNSplashScreenPackage implements ReactPackage {

  private Activity activity;
  private RNSplashScreenModule mModuleInstance;

  public RNSplashScreenPackage(Activity activity) {
    super();
    this.activity = activity;
  }
    
  @Override
  public List<NativeModule> createNativeModules (ReactApplicationContext context) {
    List<NativeModule> modules = new ArrayList<>();
    mModuleInstance = new RNSplashScreenModule(context, this.activity);
    modules.add(mModuleInstance);
    return modules;
  }

  @Override
  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext context) {
    return Collections.emptyList();
  }
}
