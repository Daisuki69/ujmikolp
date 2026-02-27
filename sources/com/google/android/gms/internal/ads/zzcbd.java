package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public interface zzcbd extends zzcgc, zzcgf, zzbmh {
    Context getContext();

    void setBackgroundColor(int i);

    void zzA(int i);

    void zzB(int i);

    @Nullable
    zzcas zzdr();

    void zzds(boolean z4);

    @Nullable
    zzcfq zzh();

    @Nullable
    zzbcu zzi();

    @Nullable
    Activity zzj();

    @Nullable
    com.google.android.gms.ads.internal.zza zzk();

    void zzl();

    String zzm();

    @Nullable
    String zzn();

    void zzo(int i);

    int zzp();

    zzbcv zzq();

    @Nullable
    zzccq zzr(String str);

    VersionInfoParcel zzs();

    void zzt(String str, zzccq zzccqVar);

    void zzu(boolean z4, long j);

    void zzv(int i);

    void zzw(zzcfq zzcfqVar);

    int zzx();

    int zzy();

    void zzz();
}
