package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
final class zzdp<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Object zzd = new Object();

    @NullableDecl
    transient int[] zza;

    @NullableDecl
    transient Object[] zzb;

    @NullableDecl
    transient Object[] zzc;

    @NullableDecl
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;

    @NullableDecl
    private transient Set<K> zzh;

    @NullableDecl
    private transient Set<Map.Entry<K, V>> zzi;

    @NullableDecl
    private transient Collection<V> zzj;

    public zzdp() {
        zzde.zza(true, (Object) "Expected size must be >= 0");
        this.zzf = zzfc.zza(3, 1, 1073741823);
    }

    public static int zzb(int i, int i4) {
        return i - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzi() {
        return (1 << (this.zzf & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zza()) {
            return;
        }
        zzc();
        Map<K, V> mapZzb = zzb();
        if (mapZzb != null) {
            this.zzf = zzfc.zza(size(), 3, 1073741823);
            mapZzb.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(this.zzb, 0, this.zzg, (Object) null);
        Arrays.fill(this.zzc, 0, this.zzg, (Object) null);
        Object obj = this.zze;
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(this.zza, 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        Map<K, V> mapZzb = zzb();
        return mapZzb != null ? mapZzb.containsKey(obj) : zza(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        Map<K, V> mapZzb = zzb();
        if (mapZzb != null) {
            return mapZzb.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (zzcz.zza(obj, this.zzc[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.zzi;
        if (set != null) {
            return set;
        }
        zzdt zzdtVar = new zzdt(this);
        this.zzi = zzdtVar;
        return zzdtVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(@NullableDecl Object obj) {
        Map<K, V> mapZzb = zzb();
        if (mapZzb != null) {
            return mapZzb.get(obj);
        }
        int iZza = zza(obj);
        if (iZza == -1) {
            return null;
        }
        return (V) this.zzc[iZza];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.zzh;
        if (set != null) {
            return set;
        }
        zzdv zzdvVar = new zzdv(this);
        this.zzh = zzdvVar;
        return zzdvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public final V put(@NullableDecl K k8, @NullableDecl V v7) {
        int i;
        int i4 = 1;
        if (zza()) {
            zzde.zzb(zza(), "Arrays already allocated");
            int i6 = this.zzf;
            int iMax = Math.max(i6 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            int iMax2 = Math.max(4, (iMax <= ((int) (((double) iHighestOneBit) * 1.0d)) || (iHighestOneBit = iHighestOneBit << 1) > 0) ? iHighestOneBit : 1073741824);
            this.zze = zzea.zza(iMax2);
            zzb(iMax2 - 1);
            this.zza = new int[i6];
            this.zzb = new Object[i6];
            this.zzc = new Object[i6];
        }
        Map<K, V> mapZzb = zzb();
        if (mapZzb != null) {
            return mapZzb.put(k8, v7);
        }
        int[] iArr = this.zza;
        Object[] objArr = this.zzb;
        Object[] objArr2 = this.zzc;
        int i10 = this.zzg;
        int i11 = i10 + 1;
        int iZza = zzec.zza(k8);
        int iZzi = zzi();
        int i12 = iZza & iZzi;
        int iZza2 = zzea.zza(this.zze, i12);
        if (iZza2 == 0) {
            if (i11 > iZzi) {
                iZzi = zza(iZzi, zzea.zzb(iZzi), iZza, i10);
            } else {
                zzea.zza(this.zze, i12, i11);
            }
            i = 1;
        } else {
            int i13 = ~iZzi;
            int i14 = iZza & i13;
            int i15 = 0;
            while (true) {
                int i16 = iZza2 - i4;
                int i17 = iArr[i16];
                i = i4;
                if ((i17 & i13) == i14 && zzcz.zza(k8, objArr[i16])) {
                    V v8 = (V) objArr2[i16];
                    objArr2[i16] = v7;
                    return v8;
                }
                int i18 = i17 & iZzi;
                int i19 = i15 + 1;
                if (i18 != 0) {
                    iZza2 = i18;
                    i15 = i19;
                    i4 = i;
                } else {
                    if (i19 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzi() + 1, 1.0f);
                        int iZzd = zzd();
                        while (iZzd >= 0) {
                            linkedHashMap.put(this.zzb[iZzd], this.zzc[iZzd]);
                            iZzd = zza(iZzd);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzc();
                        return (V) linkedHashMap.put(k8, v7);
                    }
                    if (i11 > iZzi) {
                        iZzi = zza(iZzi, zzea.zzb(iZzi), iZza, i10);
                    } else {
                        iArr[i16] = zzea.zza(i17, i11, iZzi);
                    }
                }
            }
        }
        int length = this.zza.length;
        if (i11 > length) {
            int i20 = i;
            int iMin = Math.min(1073741823, (Math.max(i20, length >>> 1) + length) | i20);
            if (iMin != length) {
                this.zza = Arrays.copyOf(this.zza, iMin);
                this.zzb = Arrays.copyOf(this.zzb, iMin);
                this.zzc = Arrays.copyOf(this.zzc, iMin);
            }
        }
        this.zza[i10] = zzea.zza(iZza, 0, iZzi);
        this.zzb[i10] = k8;
        this.zzc[i10] = v7;
        this.zzg = i11;
        zzc();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map<K, V> mapZzb = zzb();
        if (mapZzb != null) {
            return mapZzb.remove(obj);
        }
        V v7 = (V) zzb(obj);
        if (v7 == zzd) {
            return null;
        }
        return v7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapZzb = zzb();
        return mapZzb != null ? mapZzb.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzdx zzdxVar = new zzdx(this);
        this.zzj = zzdxVar;
        return zzdxVar;
    }

    public final boolean zza() {
        return this.zze == null;
    }

    public final void zzc() {
        this.zzf += 32;
    }

    public final int zzd() {
        return isEmpty() ? -1 : 0;
    }

    public final Iterator<K> zze() {
        Map<K, V> mapZzb = zzb();
        return mapZzb != null ? mapZzb.keySet().iterator() : new zzds(this);
    }

    public final Iterator<Map.Entry<K, V>> zzf() {
        Map<K, V> mapZzb = zzb();
        return mapZzb != null ? mapZzb.entrySet().iterator() : new zzdr(this);
    }

    public final Iterator<V> zzg() {
        Map<K, V> mapZzb = zzb();
        return mapZzb != null ? mapZzb.values().iterator() : new zzdu(this);
    }

    private final int zza(int i, int i4, int i6, int i10) {
        Object objZza = zzea.zza(i4);
        int i11 = i4 - 1;
        if (i10 != 0) {
            zzea.zza(objZza, i6 & i11, i10 + 1);
        }
        Object obj = this.zze;
        int[] iArr = this.zza;
        for (int i12 = 0; i12 <= i; i12++) {
            int iZza = zzea.zza(obj, i12);
            while (iZza != 0) {
                int i13 = iZza - 1;
                int i14 = iArr[i13];
                int i15 = ((~i) & i14) | i12;
                int i16 = i15 & i11;
                int iZza2 = zzea.zza(objZza, i16);
                zzea.zza(objZza, i16, iZza);
                iArr[i13] = zzea.zza(i15, iZza2, i11);
                iZza = i14 & i;
            }
        }
        this.zze = objZza;
        zzb(i11);
        return i11;
    }

    public static /* synthetic */ int zzd(zzdp zzdpVar) {
        int i = zzdpVar.zzg;
        zzdpVar.zzg = i - 1;
        return i;
    }

    @NullableDecl
    public final Map<K, V> zzb() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    private final void zzb(int i) {
        this.zzf = zzea.zza(this.zzf, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    public final Object zzb(@NullableDecl Object obj) {
        if (zza()) {
            return zzd;
        }
        int iZzi = zzi();
        int iZza = zzea.zza(obj, null, iZzi, this.zze, this.zza, this.zzb, null);
        if (iZza == -1) {
            return zzd;
        }
        Object obj2 = this.zzc[iZza];
        zza(iZza, iZzi);
        this.zzg--;
        zzc();
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zza(@NullableDecl Object obj) {
        if (zza()) {
            return -1;
        }
        int iZza = zzec.zza(obj);
        int iZzi = zzi();
        int iZza2 = zzea.zza(this.zze, iZza & iZzi);
        if (iZza2 == 0) {
            return -1;
        }
        int i = ~iZzi;
        int i4 = iZza & i;
        do {
            int i6 = iZza2 - 1;
            int i10 = this.zza[i6];
            if ((i10 & i) == i4 && zzcz.zza(obj, this.zzb[i6])) {
                return i6;
            }
            iZza2 = i10 & iZzi;
        } while (iZza2 != 0);
        return -1;
    }

    public final void zza(int i, int i4) {
        int size = size();
        int i6 = size - 1;
        if (i < i6) {
            Object[] objArr = this.zzb;
            Object obj = objArr[i6];
            objArr[i] = obj;
            Object[] objArr2 = this.zzc;
            objArr2[i] = objArr2[i6];
            objArr[i6] = null;
            objArr2[i6] = null;
            int[] iArr = this.zza;
            iArr[i] = iArr[i6];
            iArr[i6] = 0;
            int iZza = zzec.zza(obj) & i4;
            int iZza2 = zzea.zza(this.zze, iZza);
            if (iZza2 == size) {
                zzea.zza(this.zze, iZza, i + 1);
                return;
            }
            while (true) {
                int i10 = iZza2 - 1;
                int[] iArr2 = this.zza;
                int i11 = iArr2[i10];
                int i12 = i11 & i4;
                if (i12 == size) {
                    iArr2[i10] = zzea.zza(i11, i + 1, i4);
                    return;
                }
                iZza2 = i12;
            }
        } else {
            this.zzb[i] = null;
            this.zzc[i] = null;
            this.zza[i] = 0;
        }
    }

    public final int zza(int i) {
        int i4 = i + 1;
        if (i4 < this.zzg) {
            return i4;
        }
        return -1;
    }
}
