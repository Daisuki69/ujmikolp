package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class zzbm extends zzbk {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzfu;
    private int zzfv;
    private int zzfw;
    private int zzfx;

    private zzbm(byte[] bArr, int i, int i4, boolean z4) {
        super();
        this.zzfx = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i4 + i;
        this.pos = i;
        this.zzfw = i;
        this.zzfu = z4;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbk
    public final int zzaf() {
        return this.pos - this.zzfw;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbk
    public final int zzl(int i) throws zzco {
        if (i < 0) {
            throw new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzaf = i + zzaf();
        int i4 = this.zzfx;
        if (iZzaf > i4) {
            throw zzco.zzbl();
        }
        this.zzfx = iZzaf;
        int i6 = this.limit + this.zzfv;
        this.limit = i6;
        int i10 = i6 - this.zzfw;
        if (i10 <= iZzaf) {
            this.zzfv = 0;
            return i4;
        }
        int i11 = i10 - iZzaf;
        this.zzfv = i11;
        this.limit = i6 - i11;
        return i4;
    }
}
