package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeuy implements zzeun {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final String zzh;
    public final String zzi;
    public final ArrayList zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final boolean zzn;
    public final String zzo;
    public final long zzp;
    public final boolean zzq;
    public final String zzr;
    public final int zzs;
    public final String zzt;

    public zzeuy(boolean z4, boolean z5, String str, boolean z8, boolean z9, boolean z10, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z11, String str6, long j, boolean z12, String str7, int i, String str8, String str9, String str10) {
        this.zza = z4;
        this.zzb = z5;
        this.zzc = str;
        this.zzd = z8;
        this.zze = z9;
        this.zzf = z10;
        this.zzg = str2;
        this.zzh = str8;
        this.zzj = arrayList;
        this.zzk = str3;
        this.zzl = str4;
        this.zzm = str5;
        this.zzn = z11;
        this.zzo = str6;
        this.zzp = j;
        this.zzq = z12;
        this.zzr = str7;
        this.zzs = i;
        this.zzt = str10;
        this.zzi = str9;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0072  */
    @Override // com.google.android.gms.internal.ads.zzeun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuy.zza(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuu) obj).zzb;
        bundle.putBoolean("simulator", this.zzd);
        bundle.putInt("build_api_level", this.zzs);
        ArrayList<String> arrayList = this.zzj;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", this.zzo);
    }
}
