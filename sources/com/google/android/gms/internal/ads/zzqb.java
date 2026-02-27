package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqb extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzu zzc;

    public zzqb(int i, zzu zzuVar, boolean z4) {
        super(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 25), "AudioTrack write failed: ", i));
        this.zzb = z4;
        this.zza = i;
        this.zzc = zzuVar;
    }
}
