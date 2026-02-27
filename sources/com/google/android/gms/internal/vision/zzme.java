package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzme {
    public abstract int zza(int i, byte[] bArr, int i4, int i6);

    public abstract int zza(CharSequence charSequence, byte[] bArr, int i, int i4);

    public final boolean zza(byte[] bArr, int i, int i4) {
        return zza(0, bArr, i, i4) == 0;
    }

    public abstract String zzb(byte[] bArr, int i, int i4) throws zzjk;
}
