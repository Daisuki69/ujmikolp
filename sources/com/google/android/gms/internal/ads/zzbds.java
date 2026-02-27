package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzbds {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbds(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbds zza(String str, boolean z4) {
        return new zzbds(str, Boolean.valueOf(z4), 1);
    }

    public static zzbds zzb(String str, long j) {
        return new zzbds(str, Long.valueOf(j), 2);
    }

    public static zzbds zzc(String str, double d10) {
        return new zzbds(str, Double.valueOf(d10), 3);
    }

    public static zzbds zzd(String str, String str2) {
        return new zzbds("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzbey zzbeyVarZza = zzbfa.zza();
        if (zzbeyVarZza != null) {
            int i = this.zzc - 1;
            return i != 0 ? i != 1 ? i != 2 ? zzbeyVarZza.zzd(this.zza, (String) this.zzb) : zzbeyVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue()) : zzbeyVarZza.zzb(this.zza, ((Long) this.zzb).longValue()) : zzbeyVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbfa.zzb() != null) {
            zzbfa.zzb().zza();
        }
        return this.zzb;
    }
}
