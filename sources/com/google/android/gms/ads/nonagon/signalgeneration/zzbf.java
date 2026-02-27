package com.google.android.gms.ads.nonagon.signalgeneration;

import S1.y;
import android.os.Bundle;
import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcuw;
import com.google.android.gms.internal.ads.zzcux;
import com.google.android.gms.internal.ads.zzcvj;
import com.google.android.gms.internal.ads.zzdeo;
import com.google.android.gms.internal.ads.zzdru;
import com.google.android.gms.internal.ads.zzfhb;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzgot;
import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqf;
import com.google.android.gms.internal.ads.zzhqg;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbf implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;
    private final zzhqg zzf;
    private final zzhqg zzg;
    private final zzhqg zzh;
    private final zzhqg zzi;

    private zzbf(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar5;
        this.zzf = zzhqgVar6;
        this.zzg = zzhqgVar7;
        this.zzh = zzhqgVar8;
        this.zzi = zzhqgVar9;
    }

    public static zzbf zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7, zzhqg zzhqgVar8, zzhqg zzhqgVar9) {
        return new zzbf(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7, zzhqgVar8, zzhqgVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        y yVarZzi;
        zzau zzauVar = (zzau) this.zza.zzb();
        zzfhh zzfhhVar = (zzfhh) this.zzb.zzb();
        zzbh zzbhVarZzb = ((zzbi) this.zzc).zzb();
        zzcuw zzcuwVarZzb = ((zzcux) this.zzd).zzb();
        zzdeo zzdeoVar = (zzdeo) this.zze.zzb();
        zzb zzbVar = (zzb) this.zzf.zzb();
        zzbyi zzbyiVar = (zzbyi) this.zzg.zzb();
        int iIntValue = ((Integer) this.zzh.zzb()).intValue();
        Bundle bundle = ((zzcvj) this.zzi).zza().zzt;
        zzbj zzbjVarZzb = null;
        if (iIntValue == 1 && zzbyiVar != null) {
            c.v(bundle, zzdru.READ_FROM_DISK_START.zza());
            zzbjVarZzb = zzbVar.zzb(zzbyiVar, zzauVar, bundle);
            c.v(bundle, zzdru.READ_FROM_DISK_END.zza());
        }
        if (zzbjVarZzb != null) {
            zzdeoVar.zza(zzbjVarZzb);
            yVarZzi = zzgot.zza(zzbjVarZzb);
        } else {
            yVarZzi = zzfhhVar.zza(zzfhb.GENERATE_SIGNALS, zzcuwVarZzb.zzb()).zzc(zzbhVarZzb).zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS).zzi();
            zzgot.zzq(yVarZzi, new zzaw(zzdeoVar), zzbzh.zza);
        }
        zzhqf.zzb(yVarZzi);
        return yVarZzi;
    }
}
