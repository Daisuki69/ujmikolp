package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeat implements zzfgm {
    protected final Context zza;
    protected final String zzb;

    public zzeat(Context context, String str, zzbvd zzbvdVar, int i) {
        this.zza = context;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfgm
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzeas zza(zzear zzearVar) throws zzdwz {
        return zzc(zzearVar.zza, zzearVar.zzb, zzearVar.zzc, zzearVar.zzd, zzearVar.zze, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0197, code lost:
    
        r12.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021c, code lost:
    
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(r3.toString());
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r4.append("Received error HTTP response code: ");
        r4.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0256, code lost:
    
        throw new com.google.android.gms.internal.ads.zzdwz(1, r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0277, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzeas zzc(java.lang.String r19, int r20, java.util.Map r21, byte[] r22, java.lang.String r23, long r24) throws java.net.MalformedURLException, com.google.android.gms.internal.ads.zzdwz {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeat.zzc(java.lang.String, int, java.util.Map, byte[], java.lang.String, long):com.google.android.gms.internal.ads.zzeas");
    }
}
