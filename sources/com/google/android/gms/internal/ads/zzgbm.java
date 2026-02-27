package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgbm {
    private final File zza;
    private final zzfoc zzb;
    private final zzgea zzc;

    public zzgbm(File file, zzfoc zzfocVar, zzgea zzgeaVar) {
        this.zza = file;
        this.zzb = zzfocVar;
        this.zzc = zzgeaVar;
    }

    public final boolean zza(byte[] bArr) {
        boolean zZza;
        try {
            File file = this.zza;
            zzgmr.zzb(file);
            zzgmr.zza(bArr, file);
            zZza = this.zzb.zza(file);
        } catch (IOException | GeneralSecurityException e) {
            this.zzc.zzd(2027, e);
            zZza = false;
        }
        try {
            this.zza.delete();
        } catch (SecurityException unused) {
        }
        return zZza;
    }
}
