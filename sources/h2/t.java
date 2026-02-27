package h2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f16913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U1.g f16914b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TaskCompletionSource f16915d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f16916g;
    public final TaskCompletionSource h;

    public t(U1.g gVar) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = new Object();
        this.c = obj;
        this.f16915d = new TaskCompletionSource();
        this.e = false;
        this.f = false;
        this.h = new TaskCompletionSource();
        gVar.a();
        Context context = gVar.f5904a;
        this.f16914b = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f16913a = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.f = false;
                boolValueOf = null;
            } else {
                this.f = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f16916g = boolValueOf;
        synchronized (obj) {
            try {
                if (a()) {
                    this.f16915d.trySetResult(null);
                    this.e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zK;
        Boolean bool = this.f16916g;
        if (bool != null) {
            zK = bool.booleanValue();
        } else {
            try {
                zK = this.f16914b.k();
            } catch (IllegalStateException unused) {
                zK = false;
            }
        }
        String strL = We.s.l("Crashlytics automatic data collection ", zK ? "ENABLED" : "DISABLED", " by ", this.f16916g == null ? "global Firebase setting" : this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strL, null);
        }
        return zK;
    }
}
