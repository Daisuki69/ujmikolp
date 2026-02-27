package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfjr {
    private final zzehk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfcv zzf;
    private final zzfcw zzg;
    private final Clock zzh;
    private final zzauu zzi;

    @VisibleForTesting
    public zzfjr(zzehk zzehkVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, @Nullable zzfcv zzfcvVar, @Nullable zzfcw zzfcwVar, Clock clock, zzauu zzauuVar) {
        this.zza = zzehkVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfcvVar;
        this.zzg = zzfcwVar;
        this.zzh = clock;
        this.zzi = zzauuVar;
    }

    public static String zzd(String str, String str2, @Nullable String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static String zzg(@Nullable String str) {
        return TextUtils.isEmpty(str) ? "" : com.google.android.gms.ads.internal.util.client.zzl.zzj() ? "fakeForAdDebugLog" : str;
    }

    public final List zza(zzfcu zzfcuVar, @Nullable zzfcj zzfcjVar, List list) {
        return zzb(zzfcuVar, zzfcjVar, false, "", "", list, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzfcu r11, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzfcj r12, boolean r13, @androidx.annotation.Nullable java.lang.String r14, @androidx.annotation.Nullable java.lang.String r15, java.util.List r16, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzcum r17) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjr.zzb(com.google.android.gms.internal.ads.zzfcu, com.google.android.gms.internal.ads.zzfcj, boolean, java.lang.String, java.lang.String, java.util.List, com.google.android.gms.internal.ads.zzcum):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[LOOP:0: B:13:0x005a->B:15:0x0060, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzc(com.google.android.gms.internal.ads.zzfcj r11, java.util.List r12, com.google.android.gms.internal.ads.zzbvh r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r10.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r13.zzb()     // Catch: android.os.RemoteException -> Lab
            int r13 = r13.zzc()     // Catch: android.os.RemoteException -> Lab
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lab
            com.google.android.gms.internal.ads.zzbbz r4 = com.google.android.gms.internal.ads.zzbci.zzdX
            com.google.android.gms.internal.ads.zzbcg r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.zzfcw r4 = r10.zzg
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.zzgha r4 = com.google.android.gms.internal.ads.zzgha.zzc()
            goto L3c
        L32:
            com.google.android.gms.internal.ads.zzfcv r4 = r4.zza
        L34:
            com.google.android.gms.internal.ads.zzgha r4 = com.google.android.gms.internal.ads.zzgha.zzd(r4)
            goto L3c
        L39:
            com.google.android.gms.internal.ads.zzfcv r4 = r10.zzf
            goto L34
        L3c:
            com.google.android.gms.internal.ads.zzfjq r5 = com.google.android.gms.internal.ads.zzfjq.zza
            com.google.android.gms.internal.ads.zzgha r5 = r4.zzb(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zza(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfjp r7 = com.google.android.gms.internal.ads.zzfjp.zza
            com.google.android.gms.internal.ads.zzgha r4 = r4.zzb(r7)
            java.lang.Object r4 = r4.zza(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L5a:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Laa
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzd(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzd(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzd(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzd(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzd(r6, r7, r13)
            java.lang.String r7 = r10.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzd(r6, r8, r7)
            android.content.Context r7 = r10.zze
            boolean r8 = r11.zzW
            java.util.Map r9 = r11.zzaw
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbxt.zza(r6, r7, r8, r9)
            r0.add(r6)
            goto L5a
        Laa:
            return r0
        Lab:
            r11 = move-exception
            int r12 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r12 = "Unable to determine award type and amount."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjr.zzc(com.google.android.gms.internal.ads.zzfcj, java.util.List, com.google.android.gms.internal.ads.zzbvh):java.util.List");
    }
}
