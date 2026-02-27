package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfv extends zzfs {
    private final zzfu zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private byte[] zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzfv(final byte[] bArr) {
        zzfu zzfuVar = new zzfu() { // from class: com.google.android.gms.internal.ads.zzft
            @Override // com.google.android.gms.internal.ads.zzfu
            public final /* synthetic */ byte[] zza(Uri uri) {
                return bArr;
            }
        };
        super(false);
        this.zza = zzfuVar;
        zzghc.zza(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        int i6 = this.zze;
        if (i6 == 0) {
            return -1;
        }
        int iMin = Math.min(i4, i6);
        byte[] bArr2 = this.zzc;
        bArr2.getClass();
        System.arraycopy(bArr2, this.zzd, bArr, i, iMin);
        this.zzd += iMin;
        this.zze -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws IOException {
        zzf(zzgeVar);
        Uri uri = zzgeVar.zza;
        this.zzb = uri;
        byte[] bArrZza = this.zza.zza(uri);
        this.zzc = bArrZza;
        long j = zzgeVar.zze;
        int length = bArrZza.length;
        if (j > length) {
            throw new zzgb(2008);
        }
        int i = (int) j;
        this.zzd = i;
        int i4 = length - i;
        this.zze = i4;
        long j6 = zzgeVar.zzf;
        if (j6 != -1) {
            this.zze = (int) Math.min(i4, j6);
        }
        this.zzf = true;
        zzg(zzgeVar);
        return j6 != -1 ? j6 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
            zzi();
        }
        this.zzb = null;
        this.zzc = null;
    }
}
