package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzamy extends zzacg {
    public zzamy(zzel zzelVar, long j, long j6) {
        super(new zzacb(), new zzamx(zzelVar, null), j, 0L, j + 1, 0L, j6, 188L, 1000);
    }

    public static /* synthetic */ int zzh(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
