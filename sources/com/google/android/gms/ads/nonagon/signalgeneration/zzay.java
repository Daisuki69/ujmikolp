package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbyi;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzay {
    private final String zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final zzbyi zzc;

    public /* synthetic */ zzay(zzax zzaxVar, byte[] bArr) {
        this.zza = zzaxVar.zzd();
        this.zzb = zzaxVar.zze();
        this.zzc = zzaxVar.zzf();
    }

    public final Set zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzbbn.zza.EnumC0026zza zzc() {
        /*
            r5 = this;
            java.lang.String r0 = r5.zza
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            r4 = 3
            switch(r1) {
                case -1999289321: goto L2b;
                case -1372958932: goto L21;
                case 543046670: goto L17;
                case 1951953708: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L35
        Ld:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 0
            goto L36
        L17:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r4
            goto L36
        L21:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r3
            goto L36
        L2b:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r2
            goto L36
        L35:
            r0 = -1
        L36:
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L47
            if (r0 == r2) goto L44
            if (r0 == r4) goto L41
            com.google.android.gms.internal.ads.zzbbn$zza$zza r0 = com.google.android.gms.internal.ads.zzbbn.zza.EnumC0026zza.AD_INITIATER_UNSPECIFIED
            return r0
        L41:
            com.google.android.gms.internal.ads.zzbbn$zza$zza r0 = com.google.android.gms.internal.ads.zzbbn.zza.EnumC0026zza.REWARD_BASED_VIDEO_AD
            return r0
        L44:
            com.google.android.gms.internal.ads.zzbbn$zza$zza r0 = com.google.android.gms.internal.ads.zzbbn.zza.EnumC0026zza.AD_LOADER
            return r0
        L47:
            com.google.android.gms.internal.ads.zzbbn$zza$zza r0 = com.google.android.gms.internal.ads.zzbbn.zza.EnumC0026zza.INTERSTITIAL
            return r0
        L4a:
            com.google.android.gms.internal.ads.zzbbn$zza$zza r0 = com.google.android.gms.internal.ads.zzbbn.zza.EnumC0026zza.BANNER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzay.zzc():com.google.android.gms.internal.ads.zzbbn$zza$zza");
    }

    @Nullable
    public final String zzd() {
        return this.zzb;
    }

    @Nullable
    public final zzbyi zze() {
        return this.zzc;
    }
}
