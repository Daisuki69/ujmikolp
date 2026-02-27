package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Hex;
import dOYHB6.yFtIp6.svM7M6;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfpr {

    @VisibleForTesting
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzaxq zzd;

    public zzfpr(@NonNull Context context, zzaxq zzaxqVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfps.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfps.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzaxqVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int iZza = this.zzd.zza();
        return androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(iZza).length() + 6), "FBAMTD", iZza);
    }

    private final String zzf() {
        int iZza = this.zzd.zza();
        return androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(iZza).length() + 6), "LATMTD", iZza);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(@androidx.annotation.NonNull com.google.android.gms.internal.ads.zzaxs r9, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzfpx r10) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfpr.zza(com.google.android.gms.internal.ads.zzaxs, com.google.android.gms.internal.ads.zzfpx):boolean");
    }

    @Nullable
    public final zzfpq zzb(int i) {
        zzaxw zzaxwVarZzc = zzc(1);
        if (zzaxwVarZzc == null) {
            return null;
        }
        String strZza = zzaxwVarZzc.zza();
        File fileZza = zzfps.zza(strZza, "pcam.jar", zzd());
        if (!fileZza.exists()) {
            fileZza = zzfps.zza(strZza, "pcam", zzd());
        }
        return new zzfpq(zzaxwVarZzc, fileZza, zzfps.zza(strZza, "pcbc", zzd()), zzfps.zza(strZza, "pcopt", zzd()));
    }

    @Nullable
    @VisibleForTesting
    public final zzaxw zzc(int i) {
        String string = i == 1 ? svM7M6.getString(this.zzc, zzf(), null) : svM7M6.getString(this.zzc, zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzhhb zzhhbVar = zzhhb.zzb;
            zzaxw zzaxwVarZzg = zzaxw.zzg(zzhhb.zzr(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZza = zzaxwVarZzg.zza();
            File fileZza = zzfps.zza(strZza, "pcam.jar", zzd());
            if (!fileZza.exists()) {
                fileZza = zzfps.zza(strZza, "pcam", zzd());
            }
            File fileZza2 = zzfps.zza(strZza, "pcbc", zzd());
            if (fileZza.exists()) {
                if (fileZza2.exists()) {
                    return zzaxwVarZzg;
                }
            }
        } catch (zzhiw unused) {
        }
        return null;
    }
}
