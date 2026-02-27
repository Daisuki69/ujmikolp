package com.google.android.gms.internal.ads;

import androidx.media3.extractor.ts.PsExtractor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzamg {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;
    private int zzf;

    public zzamg(int i) {
    }

    public final void zza() {
        this.zze = false;
        this.zza = 0;
        this.zzf = 0;
    }

    public final boolean zzb(int i, int i4) {
        int i6 = this.zzf;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i == 179 || i == 181) {
                            this.zza -= i4;
                            this.zze = false;
                            return true;
                        }
                    } else if ((i & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                        zzds.zzc("H263Reader", "Unexpected start code value");
                        zza();
                    } else {
                        this.zzb = this.zza;
                        this.zzf = 4;
                    }
                } else if (i > 31) {
                    zzds.zzc("H263Reader", "Unexpected start code value");
                    zza();
                } else {
                    this.zzf = 3;
                }
            } else if (i != 181) {
                zzds.zzc("H263Reader", "Unexpected start code value");
                zza();
            } else {
                this.zzf = 2;
            }
        } else if (i == 176) {
            this.zzf = 1;
            this.zze = true;
        }
        zzc(zzd, 0, 3);
        return false;
    }

    public final void zzc(byte[] bArr, int i, int i4) {
        if (this.zze) {
            int i6 = i4 - i;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i10 = this.zza + i6;
            if (length < i10) {
                this.zzc = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i, this.zzc, this.zza, i6);
            this.zza += i6;
        }
    }
}
