package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzccq implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzccq(zzcbd zzcbdVar) {
        Context context = zzcbdVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcbdVar.zzs().afmaVersion);
        this.zzc = new WeakReference(zzcbdVar);
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract boolean zze(String str);

    public boolean zzf(String str, String[] strArr) {
        return zze(str);
    }

    public boolean zzg(String str, String[] strArr, zzcci zzcciVar) {
        return zze(str);
    }

    public void zzh(int i) {
    }

    public void zzi(int i) {
    }

    public void zzj(int i) {
    }

    public void zzk(int i) {
    }

    public abstract void zzl();

    public final void zzm(String str, String str2, long j, long j6, boolean z4, long j7, long j9, long j10, int i, int i4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzccl(this, str, str2, j, j6, j7, j9, j10, z4, i, i4));
    }

    public final void zzn(String str, String str2, int i, int i4, long j, long j6, boolean z4, int i6, int i10) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzccm(this, str, str2, i, i4, j, j6, z4, i6, i10));
    }

    public final void zzo(String str, String str2, int i) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzccn(this, str, str2, i));
    }

    public final void zzp(String str, String str2, long j) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcco(this, str, str2, j));
    }

    public final void zzq(String str, @Nullable String str2, String str3, @Nullable String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzccp(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void zzw(String str, Map map) {
        zzcbd zzcbdVar = (zzcbd) this.zzc.get();
        if (zzcbdVar != null) {
            zzcbdVar.zze("onPrecacheEvent", map);
        }
    }
}
