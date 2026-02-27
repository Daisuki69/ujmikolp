package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfjm {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final zzgpe zzc;

    @Nullable
    private final zzfjn zzd;

    public zzfjm(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzgpe zzgpeVar, @Nullable zzfjn zzfjnVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzgpeVar;
        this.zzd = zzfjnVar;
    }

    private final S1.y zze(final String str, final long j, final int i) {
        final String strQ;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i > zzxVar.zza()) {
            zzfjn zzfjnVar = this.zzd;
            if (zzfjnVar == null || !zzxVar.zzd()) {
                return zzgot.zza(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
            }
            zzfjnVar.zza(str, "", 2);
            return zzgot.zza(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjp)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i));
            String strValueOf = String.valueOf(builderClearQuery.build());
            strQ = We.s.q(new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length()), strValueOf, "&", encodedQuery);
        } else {
            strQ = str;
        }
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzfjl
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzb(i, j, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        if (j == 0) {
            zzgpe zzgpeVar = this.zzc;
            return zzgot.zzj(zzgpeVar.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjk
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzd(strQ);
                }
            }), zzgobVar, zzgpeVar);
        }
        zzgpe zzgpeVar2 = this.zzc;
        return zzgot.zzj(zzgpeVar2.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(strQ);
            }
        }, j, TimeUnit.MILLISECONDS), zzgobVar, zzgpeVar2);
    }

    public final S1.y zza(String str) {
        try {
            return zze(str, 0L, 1);
        } catch (NullPointerException | RejectedExecutionException unused) {
            return zzgot.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
        }
    }

    public final /* synthetic */ S1.y zzb(int i, long j, String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return zzgot.zza(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        long jZzb = zzxVar.zzb();
        if (i != 1) {
            jZzb = (long) (zzxVar.zzc() * j);
        }
        return zze(str, jZzb, i + 1);
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        return this.zzb.zza(str);
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzd(String str) {
        return this.zzb.zza(str);
    }
}
