package com.google.android.gms.internal.measurement;

import androidx.camera.video.AudioStats;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzae implements Iterable, zzao, zzak {
    final SortedMap zza;
    final Map zzb;

    public zzae() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (zzh() != zzaeVar.zzh()) {
            return false;
        }
        SortedMap sortedMap = this.zza;
        if (sortedMap.isEmpty()) {
            return zzaeVar.zza.isEmpty();
        }
        for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!zzl(iIntValue).equals(zzaeVar.zzl(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzad(this);
    }

    public final String toString() {
        return zzs(",");
    }

    public final List zzb() {
        ArrayList arrayList = new ArrayList(zzh());
        for (int i = 0; i < zzh(); i++) {
            arrayList.add(zzl(i));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return zzs(",");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? zzba.zza(str, this, zzgVar, list) : a.a(this, new zzas(str), zzgVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        SortedMap sortedMap = this.zza;
        return sortedMap.size() == 1 ? zzl(0).zzd() : sortedMap.size() <= 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final Iterator zzg() {
        return this.zza.keySet().iterator();
    }

    public final int zzh() {
        SortedMap sortedMap = this.zza;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final int zzi() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzj(String str) {
        return SessionDescription.ATTR_LENGTH.equals(str) || this.zzb.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzao zzk(String str) {
        zzao zzaoVar;
        return SessionDescription.ATTR_LENGTH.equals(str) ? new zzah(Double.valueOf(zzh())) : (!zzj(str) || (zzaoVar = (zzao) this.zzb.get(str)) == null) ? zzao.zzf : zzaoVar;
    }

    public final zzao zzl(int i) {
        zzao zzaoVar;
        if (i < zzh()) {
            return (!zzo(i) || (zzaoVar = (zzao) this.zza.get(Integer.valueOf(i))) == null) ? zzao.zzf : zzaoVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zzm(String str, zzao zzaoVar) {
        if (zzaoVar == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzaoVar);
        }
    }

    public final void zzn(int i, zzao zzaoVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
        }
        if (zzaoVar == null) {
            this.zza.remove(Integer.valueOf(i));
        } else {
            this.zza.put(Integer.valueOf(i), zzaoVar);
        }
    }

    public final boolean zzo(int i) {
        if (i >= 0) {
            SortedMap sortedMap = this.zza;
            if (i <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i));
            }
        }
        throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
    }

    public final void zzp() {
        this.zza.clear();
    }

    public final void zzq(int i, zzao zzaoVar) {
        if (i < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 21), "Invalid value index: ", i));
        }
        if (i >= zzh()) {
            zzn(i, zzaoVar);
            return;
        }
        SortedMap sortedMap = this.zza;
        for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i; iIntValue--) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            zzao zzaoVar2 = (zzao) sortedMap.get(numValueOf);
            if (zzaoVar2 != null) {
                zzn(iIntValue + 1, zzaoVar2);
                sortedMap.remove(numValueOf);
            }
        }
        zzn(i, zzaoVar);
    }

    public final void zzr(int i) {
        SortedMap sortedMap = this.zza;
        int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i4 = i - 1;
            Integer numValueOf = Integer.valueOf(i4);
            if (sortedMap.containsKey(numValueOf) || i4 < 0) {
                return;
            }
            sortedMap.put(numValueOf, zzao.zzf);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            zzao zzaoVar = (zzao) sortedMap.get(numValueOf2);
            if (zzaoVar != null) {
                sortedMap.put(Integer.valueOf(i - 1), zzaoVar);
                sortedMap.remove(numValueOf2);
            }
        }
    }

    public final String zzs(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.zza.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= zzh()) {
                    break;
                }
                zzao zzaoVarZzl = zzl(i);
                sb2.append(str2);
                if (!(zzaoVarZzl instanceof zzat) && !(zzaoVarZzl instanceof zzam)) {
                    sb2.append(zzaoVarZzl.zzc());
                }
                i++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof zzak) {
                zzaeVar.zza.put((Integer) entry.getKey(), (zzao) entry.getValue());
            } else {
                zzaeVar.zza.put((Integer) entry.getKey(), ((zzao) entry.getValue()).zzt());
            }
        }
        return zzaeVar;
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                zzn(i, (zzao) list.get(i));
            }
        }
    }
}
