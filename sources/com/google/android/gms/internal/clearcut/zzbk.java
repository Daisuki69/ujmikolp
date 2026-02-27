package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbk {
    private static volatile boolean zzft = true;
    private int zzfq;
    private int zzfr;
    private boolean zzfs;

    private zzbk() {
        this.zzfq = 100;
        this.zzfr = Integer.MAX_VALUE;
        this.zzfs = false;
    }

    public static long zza(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int zzm(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int zzaf();

    public abstract int zzl(int i) throws zzco;

    public static zzbk zza(byte[] bArr, int i, int i4, boolean z4) {
        zzbm zzbmVar = new zzbm(bArr, 0, i4, false);
        try {
            zzbmVar.zzl(i4);
            return zzbmVar;
        } catch (zzco e) {
            throw new IllegalArgumentException(e);
        }
    }
}
