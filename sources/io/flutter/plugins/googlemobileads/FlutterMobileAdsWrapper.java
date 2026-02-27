package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.webviewflutter.I;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterMobileAdsWrapper {
    private static final String TAG = "FlutterMobileAdsWrapper";

    public void disableMediationInitialization(@NonNull Context context) {
        MobileAds.disableMediationAdapterInitialization(context);
    }

    public RequestConfiguration getRequestConfiguration() {
        return MobileAds.getRequestConfiguration();
    }

    public String getVersionString() {
        return MobileAds.getVersion().toString();
    }

    public void initialize(@NonNull final Context context, @NonNull final OnInitializationCompleteListener onInitializationCompleteListener) {
        new Thread(new Runnable() { // from class: io.flutter.plugins.googlemobileads.FlutterMobileAdsWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                MobileAds.initialize(context, onInitializationCompleteListener);
            }
        }).start();
    }

    public void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        MobileAds.openAdInspector(context, onAdInspectorClosedListener);
    }

    public void openDebugMenu(Context context, String str) {
        MobileAds.openDebugMenu(context, str);
    }

    public void registerWebView(int i, FlutterEngine flutterEngine) {
        WebView webViewA = I.a(flutterEngine, i);
        if (webViewA != null) {
            MobileAds.registerWebView(webViewA);
            return;
        }
        Log.w(TAG, "MobileAds.registerWebView unable to find webView with id: " + i);
    }

    public void setAppMuted(boolean z4) {
        MobileAds.setAppMuted(z4);
    }

    public void setAppVolume(double d10) {
        MobileAds.setAppVolume((float) d10);
    }
}
