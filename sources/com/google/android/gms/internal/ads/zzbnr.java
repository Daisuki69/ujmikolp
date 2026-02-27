package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbnr implements zzbmi, zzbnq {
    private final zzbnq zza;
    private final HashSet zzb = new HashSet();

    public zzbnr(zzbnq zzbnqVar) {
        this.zza = zzbnqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi, com.google.android.gms.internal.ads.zzbmt
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi, com.google.android.gms.internal.ads.zzbmt
    public final /* synthetic */ void zzb(String str, JSONObject jSONObject) {
        AbstractC1176j.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi, com.google.android.gms.internal.ads.zzbmt
    public final /* synthetic */ void zzc(String str, String str2) {
        AbstractC1176j.b(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi, com.google.android.gms.internal.ads.zzbmh
    public final /* synthetic */ void zzd(String str, JSONObject jSONObject) {
        AbstractC1176j.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi, com.google.android.gms.internal.ads.zzbmh
    public final /* synthetic */ void zze(String str, Map map) {
        AbstractC1176j.d(this, str, map);
    }

    public final void zzf() {
        HashSet<AbstractMap.SimpleEntry> hashSet = this.zzb;
        for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbjl) simpleEntry.getValue()).toString())));
            this.zza.zzn((String) simpleEntry.getKey(), (zzbjl) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final void zzm(String str, zzbjl zzbjlVar) {
        this.zza.zzm(str, zzbjlVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbjlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final void zzn(String str, zzbjl zzbjlVar) {
        this.zza.zzn(str, zzbjlVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbjlVar));
    }
}
