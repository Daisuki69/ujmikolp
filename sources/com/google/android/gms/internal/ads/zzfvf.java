package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfvf implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzfvf(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzfvf zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzfvf(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        ExecutorService executorService = (ExecutorService) this.zza.zzb();
        zzfui zzfuiVar = (zzfui) this.zzb.zzb();
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        androidx.media3.datasource.cache.c.A(sb2, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
        sb2.append(")");
        return new zzfvk(executorService, sb2.toString(), zzfuiVar.zzl());
    }
}
