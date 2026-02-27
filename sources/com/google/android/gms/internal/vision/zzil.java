package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzil implements zzmr {
    private final zzii zza;

    private zzil(zzii zziiVar) {
        zzii zziiVar2 = (zzii) zzjf.zza(zziiVar, "output");
        this.zza = zziiVar2;
        zziiVar2.zza = this;
    }

    public static zzil zza(zzii zziiVar) {
        zzil zzilVar = zziiVar.zza;
        return zzilVar != null ? zzilVar : new zzil(zziiVar);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i, long j) throws IOException {
        this.zza.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzc(int i, long j) throws IOException {
        this.zza.zza(i, j);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zze(int i, int i4) throws IOException {
        this.zza.zzc(i, i4);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzf(int i, int i4) throws IOException {
        this.zza.zzd(i, i4);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzg(int i, List<Double> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zza.zza(i, list.get(i4).doubleValue());
                i4++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int iZzb = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzb += zzii.zzb(list.get(i6).doubleValue());
        }
        this.zza.zzb(iZzb);
        while (i4 < list.size()) {
            this.zza.zza(list.get(i4).doubleValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzh(int i, List<Integer> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zza.zzb(i, list.get(i4).intValue());
                i4++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int iZzk = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzk += zzii.zzk(list.get(i6).intValue());
        }
        this.zza.zzb(iZzk);
        while (i4 < list.size()) {
            this.zza.zza(list.get(i4).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzi(int i, List<Boolean> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zza.zza(i, list.get(i4).booleanValue());
                i4++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int iZzb = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzb += zzii.zzb(list.get(i6).booleanValue());
        }
        this.zza.zzb(iZzb);
        while (i4 < list.size()) {
            this.zza.zza(list.get(i4).booleanValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzj(int i, List<Integer> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zza.zzc(i, list.get(i4).intValue());
                i4++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int iZzg = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzg += zzii.zzg(list.get(i6).intValue());
        }
        this.zza.zzb(iZzg);
        while (i4 < list.size()) {
            this.zza.zzb(list.get(i4).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzk(int i, List<Integer> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zza.zze(i, list.get(i4).intValue());
                i4++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int iZzj = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzj += zzii.zzj(list.get(i6).intValue());
        }
        this.zza.zzb(iZzj);
        while (i4 < list.size()) {
            this.zza.zzd(list.get(i4).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzl(int i, List<Long> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zza.zzc(i, list.get(i4).longValue());
                i4++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int iZzh = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzh += zzii.zzh(list.get(i6).longValue());
        }
        this.zza.zzb(iZzh);
        while (i4 < list.size()) {
            this.zza.zzc(list.get(i4).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzm(int i, List<Integer> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zza.zzd(i, list.get(i4).intValue());
                i4++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int iZzh = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzh += zzii.zzh(list.get(i6).intValue());
        }
        this.zza.zzb(iZzh);
        while (i4 < list.size()) {
            this.zza.zzc(list.get(i4).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzn(int i, List<Long> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zza.zzb(i, list.get(i4).longValue());
                i4++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int iZzf = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzf += zzii.zzf(list.get(i6).longValue());
        }
        this.zza.zzb(iZzf);
        while (i4 < list.size()) {
            this.zza.zzb(list.get(i4).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzc(int i, int i4) throws IOException {
        this.zza.zzb(i, i4);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzd(int i, int i4) throws IOException {
        this.zza.zze(i, i4);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zze(int i, long j) throws IOException {
        this.zza.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzf(int i, List<Float> list, boolean z4) throws IOException {
        int i4 = 0;
        if (!z4) {
            while (i4 < list.size()) {
                this.zza.zza(i, list.get(i4).floatValue());
                i4++;
            }
            return;
        }
        this.zza.zza(i, 2);
        int iZzb = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iZzb += zzii.zzb(list.get(i6).floatValue());
        }
        this.zza.zzb(iZzb);
        while (i4 < list.size()) {
            this.zza.zza(list.get(i4).floatValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final int zza() {
        return zzmq.zza;
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i, int i4) throws IOException {
        this.zza.zzb(i, i4);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzc(int i, List<Long> list, boolean z4) throws IOException {
        int i4 = 0;
        if (z4) {
            this.zza.zza(i, 2);
            int iZzd = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzd += zzii.zzd(list.get(i6).longValue());
            }
            this.zza.zzb(iZzd);
            while (i4 < list.size()) {
                this.zza.zza(list.get(i4).longValue());
                i4++;
            }
            return;
        }
        while (i4 < list.size()) {
            this.zza.zza(i, list.get(i4).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzd(int i, List<Long> list, boolean z4) throws IOException {
        int i4 = 0;
        if (z4) {
            this.zza.zza(i, 2);
            int iZze = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZze += zzii.zze(list.get(i6).longValue());
            }
            this.zza.zzb(iZze);
            while (i4 < list.size()) {
                this.zza.zza(list.get(i4).longValue());
                i4++;
            }
            return;
        }
        while (i4 < list.size()) {
            this.zza.zza(i, list.get(i4).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zze(int i, List<Long> list, boolean z4) throws IOException {
        int i4 = 0;
        if (z4) {
            this.zza.zza(i, 2);
            int iZzg = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzg += zzii.zzg(list.get(i6).longValue());
            }
            this.zza.zzb(iZzg);
            while (i4 < list.size()) {
                this.zza.zzc(list.get(i4).longValue());
                i4++;
            }
            return;
        }
        while (i4 < list.size()) {
            this.zza.zzc(i, list.get(i4).longValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i, int i4) throws IOException {
        this.zza.zze(i, i4);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i, Object obj, zzlc zzlcVar) throws IOException {
        zzii zziiVar = this.zza;
        zziiVar.zza(i, 3);
        zzlcVar.zza((zzkk) obj, zziiVar.zza);
        zziiVar.zza(i, 4);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i, long j) throws IOException {
        this.zza.zza(i, j);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i, float f) throws IOException {
        this.zza.zza(i, f);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i, double d10) throws IOException {
        this.zza.zza(i, d10);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i) throws IOException {
        this.zza.zza(i, 4);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i, boolean z4) throws IOException {
        this.zza.zza(i, z4);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i, List<Integer> list, boolean z4) throws IOException {
        int i4 = 0;
        if (z4) {
            this.zza.zza(i, 2);
            int iZzi = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzi += zzii.zzi(list.get(i6).intValue());
            }
            this.zza.zzb(iZzi);
            while (i4 < list.size()) {
                this.zza.zzd(list.get(i4).intValue());
                i4++;
            }
            return;
        }
        while (i4 < list.size()) {
            this.zza.zze(i, list.get(i4).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i, String str) throws IOException {
        this.zza.zza(i, str);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i, zzht zzhtVar) throws IOException {
        this.zza.zza(i, zzhtVar);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i, Object obj, zzlc zzlcVar) throws IOException {
        this.zza.zza(i, (zzkk) obj, zzlcVar);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i) throws IOException {
        this.zza.zza(i, 3);
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzht) {
            this.zza.zzb(i, (zzht) obj);
        } else {
            this.zza.zza(i, (zzkk) obj);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i, List<Integer> list, boolean z4) throws IOException {
        int i4 = 0;
        if (z4) {
            this.zza.zza(i, 2);
            int iZzf = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZzf += zzii.zzf(list.get(i6).intValue());
            }
            this.zza.zzb(iZzf);
            while (i4 < list.size()) {
                this.zza.zza(list.get(i4).intValue());
                i4++;
            }
            return;
        }
        while (i4 < list.size()) {
            this.zza.zzb(i, list.get(i4).intValue());
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i, List<zzht> list) throws IOException {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.zza.zza(i, list.get(i4));
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zzb(int i, List<?> list, zzlc zzlcVar) throws IOException {
        for (int i4 = 0; i4 < list.size(); i4++) {
            zzb(i, list.get(i4), zzlcVar);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i, List<String> list) throws IOException {
        int i4 = 0;
        if (list instanceof zzjv) {
            zzjv zzjvVar = (zzjv) list;
            while (i4 < list.size()) {
                Object objZzb = zzjvVar.zzb(i4);
                if (objZzb instanceof String) {
                    this.zza.zza(i, (String) objZzb);
                } else {
                    this.zza.zza(i, (zzht) objZzb);
                }
                i4++;
            }
            return;
        }
        while (i4 < list.size()) {
            this.zza.zza(i, list.get(i4));
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final void zza(int i, List<?> list, zzlc zzlcVar) throws IOException {
        for (int i4 = 0; i4 < list.size(); i4++) {
            zza(i, list.get(i4), zzlcVar);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzmr
    public final <K, V> void zza(int i, zzkf<K, V> zzkfVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zza(i, 2);
            this.zza.zzb(zzkc.zza(zzkfVar, entry.getKey(), entry.getValue()));
            zzkc.zza(this.zza, zzkfVar, entry.getKey(), entry.getValue());
        }
    }
}
