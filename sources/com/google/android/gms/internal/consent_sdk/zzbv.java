package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.annotation.UiThread;
import androidx.media3.datasource.cache.c;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@UiThread
public final class zzbv extends WebView {
    private final Handler zza;
    private final zzcb zzb;
    private boolean zzc;

    public zzbv(zzbx zzbxVar, Handler handler, zzcb zzcbVar) {
        super(zzbxVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzcbVar;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(zzbv zzbvVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onTouchEvent(motionEvent);
    }

    public final void zzc() {
        final zzcb zzcbVar = this.zzb;
        Objects.requireNonNull(zzcbVar);
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbs
            @Override // java.lang.Runnable
            public final void run() {
                zzcbVar.zzd();
            }
        });
    }

    public final void zzd(String str, String str2) {
        final String strL = c.l(str, "(", str2, ");");
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbr
            @Override // java.lang.Runnable
            public final void run() {
                zzct.zza(this.zza, strL);
            }
        });
    }
}
