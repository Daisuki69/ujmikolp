package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzdsg;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzfcu;
import com.google.android.gms.internal.ads.zzfdc;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaa {
    public static boolean zza(zzfcu zzfcuVar) {
        return zzg(zzfcuVar.zza.zza) != 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String zzb(@androidx.annotation.Nullable java.lang.String r1) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto La
            java.lang.String r1 = "unspecified"
            return r1
        La:
            int r0 = r1.hashCode()
            switch(r0) {
                case 1743582862: goto L63;
                case 1743582863: goto L59;
                case 1743582864: goto L4f;
                case 1743582865: goto L45;
                case 1743582866: goto L3b;
                case 1743582867: goto L31;
                case 1743582868: goto L27;
                case 1743582869: goto L1d;
                case 1743582870: goto L12;
                default: goto L11;
            }
        L11:
            goto L6d
        L12:
            java.lang.String r0 = "requester_type_8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 8
            goto L6e
        L1d:
            java.lang.String r0 = "requester_type_7"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 7
            goto L6e
        L27:
            java.lang.String r0 = "requester_type_6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 6
            goto L6e
        L31:
            java.lang.String r0 = "requester_type_5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 5
            goto L6e
        L3b:
            java.lang.String r0 = "requester_type_4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 4
            goto L6e
        L45:
            java.lang.String r0 = "requester_type_3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 3
            goto L6e
        L4f:
            java.lang.String r0 = "requester_type_2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 2
            goto L6e
        L59:
            java.lang.String r0 = "requester_type_1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 1
            goto L6e
        L63:
            java.lang.String r0 = "requester_type_0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 0
            goto L6e
        L6d:
            r0 = -1
        L6e:
            switch(r0) {
                case 0: goto L8a;
                case 1: goto L87;
                case 2: goto L84;
                case 3: goto L81;
                case 4: goto L7e;
                case 5: goto L7b;
                case 6: goto L78;
                case 7: goto L75;
                case 8: goto L72;
                default: goto L71;
            }
        L71:
            return r1
        L72:
            java.lang.String r1 = "8"
            return r1
        L75:
            java.lang.String r1 = "7"
            return r1
        L78:
            java.lang.String r1 = "6"
            return r1
        L7b:
            java.lang.String r1 = "5"
            return r1
        L7e:
            java.lang.String r1 = "4"
            return r1
        L81:
            java.lang.String r1 = "3"
            return r1
        L84:
            java.lang.String r1 = "2"
            return r1
        L87:
            java.lang.String r1 = "1"
            return r1
        L8a:
            java.lang.String r1 = "0"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(java.lang.String):java.lang.String");
    }

    @Nullable
    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfig zzd(android.os.Bundle r1) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(android.os.Bundle):com.google.android.gms.internal.ads.zzfig");
    }

    public static void zze(final zzdsr zzdsrVar, @Nullable zzdsg zzdsgVar, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhq)).booleanValue()) {
            final zzdsg zzdsgVar2 = null;
            zzbzh.zza.execute(new Runnable(zzdsgVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
                private final /* synthetic */ String zzb;
                private final /* synthetic */ Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaa.zzf(this.zza, null, this.zzb, this.zzc);
                }
            });
        }
    }

    public static /* synthetic */ void zzf(zzdsr zzdsrVar, zzdsg zzdsgVar, String str, Pair[] pairArr) {
        ConcurrentHashMap concurrentHashMapZzd = zzdsrVar.zzd();
        zzh(concurrentHashMapZzd, "action", str);
        for (Pair pair : pairArr) {
            zzh(concurrentHashMapZzd, (String) pair.first, (String) pair.second);
        }
        zzdsrVar.zzb(concurrentHashMapZzd);
    }

    public static int zzg(zzfdc zzfdcVar) {
        if (zzfdcVar.zzs) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfdcVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzh(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
