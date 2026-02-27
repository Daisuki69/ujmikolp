package com.shield.android.f;

import android.app.Activity;
import android.app.Application;
import android.util.Pair;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.shield.android.ShieldCallback;
import com.shield.android.common.ShieldModule;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface c {
    @AnyThread
    void H(String str);

    @AnyThread
    void T();

    void a(Application application, ShieldModule shieldModule);

    @AnyThread
    void a(ShieldCallback<Boolean> shieldCallback, String str);

    @AnyThread
    void a(@NonNull com.shield.android.d.h hVar);

    @AnyThread
    void a(@NonNull WeakReference<Activity> weakReference, @NonNull ShieldModule shieldModule, @NonNull String str);

    @AnyThread
    void a(boolean z4, @NonNull ShieldCallback<Boolean> shieldCallback);

    @AnyThread
    void b(ShieldCallback<Boolean> shieldCallback);

    @AnyThread
    void b(@NonNull String str, @Nullable HashMap<String, String> map);

    @AnyThread
    void b(@NonNull String str, @Nullable HashMap<String, String> map, @NonNull ShieldCallback<Boolean> shieldCallback);

    @AnyThread
    void c(@NonNull String str, @Nullable HashMap<String, String> map, @NonNull ShieldCallback<Pair<com.shield.android.internal.e, JSONObject>> shieldCallback);

    @AnyThread
    void cf();

    @AnyThread
    void cg();

    @AnyThread
    void d(@NonNull String str, @Nullable HashMap<String, String> map, @NonNull ShieldCallback<Pair<com.shield.android.internal.e, JSONObject>> shieldCallback);

    @AnyThread
    void s(boolean z4);

    @AnyThread
    void sendAttributes(@NonNull String str, @Nullable HashMap<String, String> map, @NonNull ShieldCallback<Boolean> shieldCallback);

    @AnyThread
    void t(boolean z4);
}
