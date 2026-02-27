package com.clevertap.android.sdk.pushnotification.fcm;

import U1.g;
import U8.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.firebase.messaging.FirebaseMessaging;
import com.paymaya.domain.store.C1258f0;
import g0.InterfaceC1492a;
import g0.InterfaceC1493b;
import g0.e;
import g0.h;
import h0.InterfaceC1530a;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"unused"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FcmPushProvider implements InterfaceC1492a {
    private InterfaceC1530a handler;

    @SuppressLint({"unused"})
    public FcmPushProvider(InterfaceC1493b interfaceC1493b, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.handler = new c(interfaceC1493b, context, cleverTapInstanceConfig);
    }

    @Override // g0.InterfaceC1492a
    @NonNull
    public h getPushType() {
        this.handler.getClass();
        return e.f16773a;
    }

    @Override // g0.InterfaceC1492a
    public boolean isAvailable() {
        c cVar = (c) this.handler;
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) cVar.f5964b;
        try {
            Context context = (Context) cVar.c;
            try {
                String str = GooglePlayServicesUtil.GMS_ERROR_DIALOG;
                if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                    g gVarE = g.e();
                    gVarE.a();
                    if (!TextUtils.isEmpty(gVarE.c.e)) {
                        return true;
                    }
                    cleverTapInstanceConfig.e("PushProvider", "FCMThe FCM sender ID is not set. Unable to register for FCM.");
                    return false;
                }
            } catch (ClassNotFoundException unused) {
            }
            cleverTapInstanceConfig.e("PushProvider", "FCMGoogle Play services is currently unavailable.");
        } catch (Throwable th2) {
            cleverTapInstanceConfig.f("FCMUnable to register with FCM.", th2);
        }
        return false;
    }

    @Override // g0.InterfaceC1492a
    public boolean isSupported() {
        Context context = (Context) ((c) this.handler).c;
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            try {
                context.getPackageManager().getPackageInfo("com.google.market", 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused2) {
                return false;
            }
        }
    }

    @Override // g0.InterfaceC1492a
    public int minSDKSupportVersionCode() {
        return 0;
    }

    @Override // g0.InterfaceC1492a
    public void requestToken() {
        c cVar = (c) this.handler;
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) cVar.f5964b;
        try {
            cleverTapInstanceConfig.e("PushProvider", "FCMRequesting FCM token using googleservices.json");
            FirebaseMessaging.c().e().addOnCompleteListener(new C1258f0(cVar, 10));
        } catch (Throwable th2) {
            cleverTapInstanceConfig.f("FCMError requesting FCM token", th2);
            ((g0.g) ((InterfaceC1493b) cVar.f5965d)).e(null);
        }
    }

    public void setHandler(InterfaceC1530a interfaceC1530a) {
        this.handler = interfaceC1530a;
    }
}
