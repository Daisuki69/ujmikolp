package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzanr {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzanr(int i, int i4, int i6) {
        this.zza = i != Integer.MIN_VALUE ? We.s.o(new StringBuilder(String.valueOf(i).length() + 1), "/", i) : "";
        this.zzb = i4;
        this.zzc = i6;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void zza() {
        int i = this.zzd;
        int i4 = i == Integer.MIN_VALUE ? this.zzb : i + this.zzc;
        this.zzd = i4;
        String str = this.zza;
        this.zze = androidx.camera.core.impl.a.o(new StringBuilder(str.length() + String.valueOf(i4).length()), str, i4);
    }

    public final int zzb() {
        zzd();
        return this.zzd;
    }

    public final String zzc() {
        zzd();
        return this.zze;
    }
}
