package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadm {
    private final zzef zza = new zzef(10);

    private final boolean zzb(zzacv zzacvVar, int i) throws IOException {
        int i4;
        int i6 = 0;
        do {
            int i10 = i6 % 10;
            if (i10 == 0) {
                if (i6 != 0) {
                    zzef zzefVar = this.zza;
                    System.arraycopy(zzefVar.zzi(), 10, zzefVar.zzi(), 0, 9);
                }
                i4 = 0;
            } else {
                i4 = i10;
            }
            int i11 = i6 != 0 ? 1 : 10;
            try {
                zzef zzefVar2 = this.zza;
                int i12 = i10 + 10;
                zzacvVar.zzi(zzefVar2.zzi(), i12 - i11, i11);
                zzefVar2.zzh(i4);
                zzefVar2.zzf(i12);
                if (zzefVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzadp.zza(zzefVar2.zzr()) != -1) {
                    return false;
                }
                if (i6 == 0) {
                    zzefVar2.zzc(20);
                }
                i6++;
            } catch (EOFException unused) {
            }
        } while (i6 <= i);
        return false;
    }

    @Nullable
    public final zzao zza(zzacv zzacvVar, @Nullable zzagd zzagdVar, int i) throws IOException {
        zzao zzaoVarZza = null;
        int i4 = 0;
        while (zzb(zzacvVar, i)) {
            zzef zzefVar = this.zza;
            int iZzg = zzefVar.zzg();
            zzefVar.zzk(6);
            int iZzG = zzefVar.zzG();
            int i6 = iZzG + 10;
            if (zzaoVarZza == null) {
                byte[] bArr = new byte[i6];
                System.arraycopy(zzefVar.zzi(), iZzg, bArr, 0, 10);
                zzacvVar.zzi(bArr, 10, iZzG);
                zzaoVarZza = zzagg.zza(bArr, i6, zzagdVar, new zzafr());
            } else {
                zzacvVar.zzk(iZzG);
            }
            i4 += i6;
        }
        zzacvVar.zzl();
        zzacvVar.zzk(i4);
        return zzaoVarZza;
    }
}
