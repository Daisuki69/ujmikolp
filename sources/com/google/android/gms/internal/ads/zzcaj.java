package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcaj extends TextureView implements zzcbg {
    protected final zzcax zza;
    protected final zzcbh zzb;

    public zzcaj(Context context) {
        super(context);
        this.zza = new zzcax();
        this.zzb = new zzcbh(context, this);
    }

    public void zzA(int i) {
    }

    public void zzB(int i) {
    }

    public void zzC(int i) {
    }

    public abstract String zza();

    public abstract void zzb(zzcai zzcaiVar);

    public abstract void zzc(@Nullable String str);

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract void zzi(int i);

    public abstract void zzj(float f, float f3);

    public abstract int zzk();

    public abstract int zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract int zzp();

    public abstract void zzq();

    @Nullable
    public Integer zzw() {
        return null;
    }

    public void zzx(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        zzc(str);
    }

    public void zzy(int i) {
    }

    public void zzz(int i) {
    }
}
