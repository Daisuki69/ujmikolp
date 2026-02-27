package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1vSDK implements AFa1zSDK {
    private final AFa1zSDK AFInAppEventType = this;

    public enum AFa1vSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");

        private final String afErrorLogForExcManagerOnly;
        private final String init;

        AFa1vSDK(String str, String str2) {
            this.afErrorLogForExcManagerOnly = str;
            this.init = str2;
        }
    }

    public interface AFa1zSDK {
        Class<?> AFInAppEventType(String str) throws ClassNotFoundException;
    }

    @Override // com.appsflyer.internal.AFb1vSDK.AFa1zSDK
    public final Class<?> AFInAppEventType(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public final String values() {
        for (AFa1vSDK aFa1vSDK : AFa1vSDK.values()) {
            if (values(aFa1vSDK.init)) {
                return aFa1vSDK.afErrorLogForExcManagerOnly;
            }
        }
        return AFa1vSDK.DEFAULT.afErrorLogForExcManagerOnly;
    }

    private boolean values(String str) {
        try {
            this.AFInAppEventType.AFInAppEventType(str);
            StringBuilder sb2 = new StringBuilder("Class: ");
            sb2.append(str);
            sb2.append(" is found.");
            AFLogger.afRDLog(sb2.toString());
            return true;
        } catch (ClassNotFoundException e) {
            StringBuilder sb3 = new StringBuilder("Class: ");
            sb3.append(str);
            sb3.append(" is  not found. (Platform extension)");
            AFLogger.afErrorLogForExcManagerOnly(sb3.toString(), e, true);
            return false;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return false;
        }
    }
}
