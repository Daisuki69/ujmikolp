package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbbz {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public /* synthetic */ zzbbz(int i, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzbd.zzb().zza(this);
    }

    public static zzbbz zzh(int i, String str, int i4, int i6) {
        return new zzbbv(1, str, Integer.valueOf(i4), Integer.valueOf(i6));
    }

    public static zzbbz zzi(int i, String str, long j, long j6) {
        return new zzbbw(1, str, Long.valueOf(j), Long.valueOf(j6));
    }

    public static zzbbz zzj(int i, String str, float f, float f3) {
        return new zzbbx(1, str, Float.valueOf(f), Float.valueOf(f3));
    }

    public static zzbbz zzk(int i, String str) {
        zzbby zzbbyVar = new zzbby(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzb(zzbbyVar);
        return zzbbyVar;
    }

    public static zzbbz zzl(int i, String str) {
        zzbby zzbbyVar = new zzbby(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzc(zzbbyVar);
        return zzbbyVar;
    }

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    public abstract Object zzc(JSONObject jSONObject);

    public abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final Object zzf() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzb() ? this.zzd : this.zzc;
    }

    public final Object zzg() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
