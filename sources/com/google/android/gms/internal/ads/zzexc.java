package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzexc implements zzhpx {
    public static zzeus zza(Context context, zzbyk zzbykVar, zzbyl zzbylVar, Object obj, zzevu zzevuVar, zzewo zzewoVar, zzhpr zzhprVar, zzhpr zzhprVar2, zzhpr zzhprVar3, zzhpr zzhprVar4, zzhpr zzhprVar5, zzhpr zzhprVar6, zzhpr zzhprVar7, Executor executor, zzfib zzfibVar, zzdsm zzdsmVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzewh) obj);
        hashSet.add(zzevuVar);
        hashSet.add(zzewoVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgl)).booleanValue()) {
            hashSet.add((zzeup) zzhprVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgm)).booleanValue()) {
            hashSet.add((zzeup) zzhprVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgo)).booleanValue()) {
            hashSet.add((zzeup) zzhprVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgp)).booleanValue()) {
            hashSet.add((zzeup) zzhprVar5.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdu)).booleanValue()) {
            hashSet.add((zzeup) zzhprVar7.zzb());
        }
        return new zzeus(context, executor, hashSet, zzfibVar, zzdsmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
