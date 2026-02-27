package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbp implements zzfr {
    private final zzbn zzfo;

    private zzbp(zzbn zzbnVar) {
        zzbn zzbnVar2 = (zzbn) zzci.zza(zzbnVar, "output");
        this.zzfo = zzbnVar2;
        zzbnVar2.zzfz = this;
    }

    public static zzbp zza(zzbn zzbnVar) {
        zzbp zzbpVar = zzbnVar.zzfz;
        return zzbpVar != null ? zzbpVar : new zzbp(zzbnVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzaa(int i) throws IOException {
        this.zzfo.zzb(i, 3);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzab(int i) throws IOException {
        this.zzfo.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final int zzaj() {
        return zzcg.zzg.zzko;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, long j) throws IOException {
        this.zzfo.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int i, int i4) throws IOException {
        this.zzfo.zzc(i, i4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzd(int i, int i4) throws IOException {
        this.zzfo.zzd(i, i4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zze(int i, int i4) throws IOException {
        this.zzfo.zze(i, i4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzf(int i, int i4) throws IOException {
        this.zzfo.zzf(i, i4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzg(int i, List<Double> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zza(i, list.get(i4).doubleValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzb = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzb += zzbn.zzb(list.get(i6).doubleValue());
        }
        this.zzfo.zzo(iZzb);
        while (i4 < list.size()) {
            this.zzfo.zza(list.get(i4).doubleValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzh(int i, List<Integer> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zzc(i, list.get(i4).intValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzx = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzx += zzbn.zzx(list.get(i6).intValue());
        }
        this.zzfo.zzo(iZzx);
        while (i4 < list.size()) {
            this.zzfo.zzn(list.get(i4).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzi(int i, long j) throws IOException {
        this.zzfo.zza(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzj(int i, long j) throws IOException {
        this.zzfo.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzk(int i, List<Integer> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zzf(i, list.get(i4).intValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzw = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzw += zzbn.zzw(list.get(i6).intValue());
        }
        this.zzfo.zzo(iZzw);
        while (i4 < list.size()) {
            this.zzfo.zzq(list.get(i4).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzl(int i, List<Long> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zzc(i, list.get(i4).longValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzi = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzi += zzbn.zzi(list.get(i6).longValue());
        }
        this.zzfo.zzo(iZzi);
        while (i4 < list.size()) {
            this.zzfo.zzd(list.get(i4).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzm(int i, int i4) throws IOException {
        this.zzfo.zzf(i, i4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzn(int i, int i4) throws IOException {
        this.zzfo.zzc(i, i4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, double d10) throws IOException {
        this.zzfo.zza(i, d10);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, Object obj, zzef zzefVar) throws IOException {
        zzbn zzbnVar = this.zzfo;
        zzbnVar.zzb(i, 3);
        zzefVar.zza((zzdo) obj, zzbnVar.zzfz);
        zzbnVar.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int i, long j) throws IOException {
        this.zzfo.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzd(int i, List<Long> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zza(i, list.get(i4).longValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzf = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzf += zzbn.zzf(list.get(i6).longValue());
        }
        this.zzfo.zzo(iZzf);
        while (i4 < list.size()) {
            this.zzfo.zzb(list.get(i4).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zze(int i, List<Long> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zzc(i, list.get(i4).longValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzh = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzh += zzbn.zzh(list.get(i6).longValue());
        }
        this.zzfo.zzo(iZzh);
        while (i4 < list.size()) {
            this.zzfo.zzd(list.get(i4).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzf(int i, List<Float> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zza(i, list.get(i4).floatValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzb = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzb += zzbn.zzb(list.get(i6).floatValue());
        }
        this.zzfo.zzo(iZzb);
        while (i4 < list.size()) {
            this.zzfo.zza(list.get(i4).floatValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzi(int i, List<Boolean> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zzb(i, list.get(i4).booleanValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzb = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzb += zzbn.zzb(list.get(i6).booleanValue());
        }
        this.zzfo.zzo(iZzb);
        while (i4 < list.size()) {
            this.zzfo.zza(list.get(i4).booleanValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzj(int i, List<Integer> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zzd(i, list.get(i4).intValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzt = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzt += zzbn.zzt(list.get(i6).intValue());
        }
        this.zzfo.zzo(iZzt);
        while (i4 < list.size()) {
            this.zzfo.zzo(list.get(i4).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzm(int i, List<Integer> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zze(i, list.get(i4).intValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzu = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzu += zzbn.zzu(list.get(i6).intValue());
        }
        this.zzfo.zzo(iZzu);
        while (i4 < list.size()) {
            this.zzfo.zzp(list.get(i4).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzn(int i, List<Long> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zzb(i, list.get(i4).longValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzg = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzg += zzbn.zzg(list.get(i6).longValue());
        }
        this.zzfo.zzo(iZzg);
        while (i4 < list.size()) {
            this.zzfo.zzc(list.get(i4).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, float f) throws IOException {
        this.zzfo.zza(i, f);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, List<zzbb> list) throws IOException {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.zzfo.zza(i, list.get(i4));
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int i, List<Long> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zza(i, list.get(i4).longValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZze = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZze += zzbn.zze(list.get(i6).longValue());
        }
        this.zzfo.zzo(iZze);
        while (i4 < list.size()) {
            this.zzfo.zzb(list.get(i4).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, long j) throws IOException {
        this.zzfo.zza(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, List<?> list, zzef zzefVar) throws IOException {
        for (int i4 = 0; i4 < list.size(); i4++) {
            zzb(i, list.get(i4), zzefVar);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, zzbb zzbbVar) throws IOException {
        this.zzfo.zza(i, zzbbVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, List<Integer> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zzf(i, list.get(i4).intValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzv = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzv += zzbn.zzv(list.get(i6).intValue());
        }
        this.zzfo.zzo(iZzv);
        while (i4 < list.size()) {
            this.zzfo.zzq(list.get(i4).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final <K, V> void zza(int i, zzdh<K, V> zzdhVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zzfo.zzb(i, 2);
            this.zzfo.zzo(zzdg.zza(zzdhVar, entry.getKey(), entry.getValue()));
            zzdg.zza(this.zzfo, zzdhVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, boolean z4) throws IOException {
        this.zzfo.zzb(i, z4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzbb) {
            this.zzfo.zzb(i, (zzbb) obj);
        } else {
            this.zzfo.zzb(i, (zzdo) obj);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, Object obj, zzef zzefVar) throws IOException {
        this.zzfo.zza(i, (zzdo) obj, zzefVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, String str) throws IOException {
        this.zzfo.zza(i, str);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, List<String> list) throws IOException {
        int i4 = 0;
        if (!(list instanceof zzcx)) {
            while (i4 < list.size()) {
                this.zzfo.zza(i, list.get(i4));
                i4++;
            }
            return;
        }
        zzcx zzcxVar = (zzcx) list;
        while (i4 < list.size()) {
            Object raw = zzcxVar.getRaw(i4);
            if (raw instanceof String) {
                this.zzfo.zza(i, (String) raw);
            } else {
                this.zzfo.zza(i, (zzbb) raw);
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, List<?> list, zzef zzefVar) throws IOException {
        for (int i4 = 0; i4 < list.size(); i4++) {
            zza(i, list.get(i4), zzefVar);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, List<Integer> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zzfo.zzc(i, list.get(i4).intValue());
                i4++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzs = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzs += zzbn.zzs(list.get(i6).intValue());
        }
        this.zzfo.zzo(iZzs);
        while (i4 < list.size()) {
            this.zzfo.zzn(list.get(i4).intValue());
            i4++;
        }
    }
}
