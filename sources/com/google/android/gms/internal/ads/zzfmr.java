package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import dOYHB6.yFtIp6.ht2aO8;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmr {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfmr zza = new zzfmr();
    private WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static zzfmr zza() {
        return zza;
    }

    public final void zzb(Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        ht2aO8.registerReceiver(context, new zzfmq(this), intentFilter);
    }

    public final void zzc() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.zzb.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        zzd(this.zzc, zIsDeviceLocked);
        this.zzd = zIsDeviceLocked;
    }

    public final void zzd(boolean z4, boolean z5) {
        if ((z5 || z4) == (this.zzd || this.zzc)) {
            return;
        }
        Iterator it = zzfmh.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfln) it.next()).zzg().zzg(z5 || z4);
        }
    }

    public final /* synthetic */ void zze(boolean z4) {
        this.zzc = z4;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzd;
    }
}
