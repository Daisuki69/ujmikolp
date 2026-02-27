package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes3.dex */
final class zzeg extends zzei {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzeg(byte[] bArr, int i, int i4, boolean z4, zzef zzefVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i) throws zzfa {
        int i4 = this.zze;
        this.zze = 0;
        int i6 = this.zzc + this.zzd;
        this.zzc = i6;
        if (i6 <= 0) {
            this.zzd = 0;
            return i4;
        }
        this.zzd = i6;
        this.zzc = 0;
        return i4;
    }
}
