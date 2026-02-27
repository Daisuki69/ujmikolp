package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzajp {
    public static void zza(zzajq zzajqVar, zzaju zzajuVar, zzdf zzdfVar) {
        for (int i = 0; i < zzajqVar.zza(); i++) {
            long jZzb = zzajqVar.zzb(i);
            List listZzc = zzajqVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i == zzajqVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzajqVar.zzb(i + 1) - zzajqVar.zzb(i);
                if (jZzb2 > 0) {
                    zzdfVar.zza(new zzajn(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
