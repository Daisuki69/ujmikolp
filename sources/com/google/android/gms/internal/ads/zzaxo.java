package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import bg.AbstractC0963F0;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxo {
    public static String zza(Context context, String str, List list, Executor executor) throws ExecutionException, InterruptedException, PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzgpm zzgpmVarZze = zzgpm.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaxn
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzgpm zzgpmVar = zzgpmVarZze;
                if (list2 == null) {
                    zzgpmVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ApkChecksum apkChecksumC = AbstractC0963F0.c(list2.get(i));
                        if (apkChecksumC.getType() == 8) {
                            zzgpmVar.zza(zzawa.zza(apkChecksumC.getValue()));
                            return;
                        }
                    }
                    zzgpmVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzgpmVar.zza((Object) null);
                }
            }
        });
        return (String) zzgpmVarZze.get();
    }
}
