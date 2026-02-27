package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import bg.AbstractC0963F0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzatp implements PackageManager$OnChecksumsReadyListener {
    final zzgpm zza = zzgpm.zze();

    public final void onChecksumsReady(List list) {
        int size;
        int i;
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            size = list.size();
        } catch (Throwable unused) {
        }
        for (i = 0; i < size; i++) {
            ApkChecksum apkChecksumC = AbstractC0963F0.c(list.get(i));
            if (apkChecksumC.getType() == 8) {
                zzgpm zzgpmVar = this.zza;
                zzgmk zzgmkVarZzi = zzgmk.zzn().zzi();
                byte[] value = apkChecksumC.getValue();
                zzgpmVar.zza(zzgmkVarZzi.zzj(value, 0, value.length));
                return;
            }
            this.zza.zza("");
        }
        this.zza.zza("");
    }
}
