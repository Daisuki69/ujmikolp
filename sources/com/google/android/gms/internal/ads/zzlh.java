package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlh {
    private final zzlg zza;
    private final zzlf zzb;
    private final zzbe zzc;
    private int zzd;

    @Nullable
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzlh(zzlf zzlfVar, zzlg zzlgVar, zzbe zzbeVar, int i, zzdb zzdbVar, Looper looper) {
        this.zzb = zzlfVar;
        this.zza = zzlgVar;
        this.zzc = zzbeVar;
        this.zzf = looper;
        this.zzg = i;
    }

    public final zzlg zza() {
        return this.zza;
    }

    public final zzlh zzb(int i) {
        zzghc.zzh(!this.zzh);
        this.zzd = i;
        return this;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzlh zzd(@Nullable Object obj) {
        zzghc.zzh(!this.zzh);
        this.zze = obj;
        return this;
    }

    @Nullable
    public final Object zze() {
        return this.zze;
    }

    public final Looper zzf() {
        return this.zzf;
    }

    public final zzlh zzg() {
        zzghc.zzh(!this.zzh);
        this.zzh = true;
        this.zzb.zzk(this);
        return this;
    }

    public final synchronized boolean zzh() {
        return false;
    }

    public final synchronized void zzi(boolean z4) {
        this.zzi = z4 | this.zzi;
        notifyAll();
    }
}
