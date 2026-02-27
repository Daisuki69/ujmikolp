package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbg {
    private static volatile zzcy<Boolean> zza = zzcy.zzc();
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & TsExtractor.TS_STREAM_TYPE_AC3) != 0;
    }

    public static boolean zza(Context context, Uri uri) {
        ProviderInfo providerInfoResolveContentProvider;
        String authority = uri.getAuthority();
        boolean z4 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb2 = new StringBuilder(c.c(91, authority));
            sb2.append(authority);
            sb2.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb2.toString());
            return false;
        }
        if (zza.zza()) {
            return zza.zzb().booleanValue();
        }
        synchronized (zzb) {
            try {
                if (zza.zza()) {
                    return zza.zzb().booleanValue();
                }
                if ("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                    if (zza(context)) {
                        z4 = true;
                    }
                }
                zza = zzcy.zza(Boolean.valueOf(z4));
                return zza.zzb().booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
