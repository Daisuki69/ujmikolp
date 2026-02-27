package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeee {
    private final String zzc;

    @Nullable
    private zzfcm zzd = null;

    @Nullable
    private zzfcj zze = null;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzv zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzeee(String str) {
        this.zzc = str;
    }

    private final synchronized void zzj(zzfcj zzfcjVar, int i) {
        Map map = this.zzb;
        String strZzl = zzl(zzfcjVar);
        if (map.containsKey(strZzl)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = zzfcjVar.zzv;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzv zzvVar = new com.google.android.gms.ads.internal.client.zzv(zzfcjVar.zzE, 0L, null, bundle, zzfcjVar.zzF, zzfcjVar.zzG, zzfcjVar.zzH, zzfcjVar.zzI);
        try {
            this.zza.add(i, zzvVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(strZzl, zzvVar);
    }

    private final void zzk(zzfcj zzfcjVar, long j, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar, boolean z4) {
        Map map = this.zzb;
        String strZzl = zzl(zzfcjVar);
        if (map.containsKey(strZzl)) {
            if (this.zze == null) {
                this.zze = zzfcjVar;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(strZzl);
            zzvVar.zzb = j;
            zzvVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhh)).booleanValue() && z4) {
                this.zzf = zzvVar;
            }
        }
    }

    private static String zzl(zzfcj zzfcjVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdZ)).booleanValue() ? zzfcjVar.zzap : zzfcjVar.zzw;
    }

    public final void zza(zzfcm zzfcmVar) {
        this.zzd = zzfcmVar;
    }

    public final void zzb(zzfcj zzfcjVar) {
        zzj(zzfcjVar, this.zza.size());
    }

    public final synchronized void zzc(String str, List list) {
        Map map = this.zzb;
        if (map.containsKey(str)) {
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(str);
            List list2 = this.zza;
            int iIndexOf = list2.indexOf(zzvVar);
            try {
                list2.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj((zzfcj) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void zzd(zzfcj zzfcjVar, long j, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfcjVar, j, null, true);
    }

    public final void zze(zzfcj zzfcjVar, long j, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzk(zzfcjVar, j, zzeVar, false);
    }

    public final zzcvl zzf() {
        return new zzcvl(this.zze, "", this, this.zzd, this.zzc);
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzv zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final void zzi(zzfcj zzfcjVar) {
        Map map = this.zzb;
        Object obj = map.get(zzl(zzfcjVar));
        List list = this.zza;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.zzf);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) list.get(iIndexOf);
            zzvVar.zzb = 0L;
            zzvVar.zzc = null;
        }
    }
}
