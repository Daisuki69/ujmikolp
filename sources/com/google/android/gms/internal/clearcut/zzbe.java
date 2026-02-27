package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.ads.AbstractC1173g;

/* JADX INFO: loaded from: classes3.dex */
final class zzbe extends zzbi {
    private final int zzfm;
    private final int zzfn;

    public zzbe(byte[] bArr, int i, int i4) {
        super(bArr);
        zzbb.zzb(i, i + i4, bArr.length);
        this.zzfm = i;
        this.zzfn = i4;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbi, com.google.android.gms.internal.clearcut.zzbb
    public final int size() {
        return this.zzfn;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbi
    public final int zzac() {
        return this.zzfm;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbi, com.google.android.gms.internal.clearcut.zzbb
    public final byte zzj(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzfp[this.zzfm + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC1173g.q(22, i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC1173g.p(40, i, size, "Index > length: ", ", "));
    }
}
