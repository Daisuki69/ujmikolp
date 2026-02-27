package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzej implements zzdl {

    @GuardedBy("messagePool")
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzej(Handler handler) {
        this.zzb = handler;
    }

    public static /* synthetic */ void zzn(zzei zzeiVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzeiVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static zzei zzo() {
        zzei zzeiVar;
        List list = zza;
        synchronized (list) {
            try {
                zzeiVar = list.isEmpty() ? new zzei(null) : (zzei) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzb(int i) {
        return this.zzb.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final zzdk zzc(int i) {
        Handler handler = this.zzb;
        zzei zzeiVarZzo = zzo();
        zzeiVarZzo.zzb(handler.obtainMessage(i), this);
        return zzeiVarZzo;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final zzdk zzd(int i, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzei zzeiVarZzo = zzo();
        zzeiVarZzo.zzb(handler.obtainMessage(i, obj), this);
        return zzeiVarZzo;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final zzdk zze(int i, int i4, int i6) {
        Handler handler = this.zzb;
        zzei zzeiVarZzo = zzo();
        zzeiVarZzo.zzb(handler.obtainMessage(i, i4, i6), this);
        return zzeiVarZzo;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final zzdk zzf(int i, int i4, int i6, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzei zzeiVarZzo = zzo();
        zzeiVarZzo.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzeiVarZzo;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzg(zzdk zzdkVar) {
        return ((zzei) zzdkVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzh(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzi(int i, int i4) {
        return this.zzb.sendEmptyMessageDelayed(1, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final void zzk(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final void zzl(@Nullable Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzm(Runnable runnable) {
        return this.zzb.post(runnable);
    }
}
