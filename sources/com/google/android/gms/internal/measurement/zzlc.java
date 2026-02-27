package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class zzlc extends zzlg {
    private final int zzc;

    public zzlc(byte[] bArr, int i, int i4) {
        super(bArr);
        zzlh.zzj(0, i4, bArr.length);
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zza(int i) {
        int i4 = this.zzc;
        if (((i4 - (i + 1)) | i) >= 0) {
            return ((zzlg) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 11), "Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(androidx.media3.datasource.cache.c.n(new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i4).length()), "Index > length: ", i, ", ", i4));
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zzb(int i) {
        return ((zzlg) this).zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final int zzd() {
        return 0;
    }
}
