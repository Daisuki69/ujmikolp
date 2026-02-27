package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class zzci extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzci() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zzci zzciVar, int i) {
        return zzciVar.zzB()[i];
    }

    public static /* synthetic */ Object zzi(zzci zzciVar) {
        Object obj = zzciVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzci zzciVar, int i) {
        return zzciVar.zzC()[i];
    }

    public static /* synthetic */ void zzn(zzci zzciVar, int i, Object obj) {
        zzciVar.zzC()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int iZza = zzck.zza(obj);
        int iZzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzc = zzcj.zzc(obj2, iZza & iZzv);
        if (iZzc != 0) {
            int i = ~iZzv;
            int i4 = iZza & i;
            do {
                int i6 = iZzc - 1;
                int i10 = zzA()[i6];
                if ((i10 & i) == i4 && zzax.zza(obj, zzB()[i6])) {
                    return i6;
                }
                iZzc = i10 & iZzv;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzx(int i, int i4, int i6, int i10) {
        int i11 = i4 - 1;
        Object objZzd = zzcj.zzd(i4);
        if (i10 != 0) {
            zzcj.zze(objZzd, i6 & i11, i10 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        for (int i12 = 0; i12 <= i; i12++) {
            int iZzc = zzcj.zzc(obj, i12);
            while (iZzc != 0) {
                int i13 = iZzc - 1;
                int i14 = iArrZzA[i13];
                int i15 = ((~i) & i14) | i12;
                int i16 = i15 & i11;
                int iZzc2 = zzcj.zzc(objZzd, i16);
                zzcj.zze(objZzd, i16, iZzc);
                iArrZzA[i13] = ((~i11) & i15) | (iZzc2 & i11);
                iZzc = i14 & i;
            }
        }
        this.zze = objZzd;
        zzz(i11);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int iZzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZzb = zzcj.zzb(obj, null, iZzv, obj2, zzA(), zzB(), null);
            if (iZzb != -1) {
                Object obj3 = zzC()[iZzb];
                zzq(iZzb, iZzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzdw.zza(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.containsKey(obj) : zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (zzax.zza(obj, zzC()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzcc zzccVar = new zzcc(this);
        this.zzi = zzccVar;
        return zzccVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzw = zzw(obj);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzcf zzcfVar = new zzcf(this);
        this.zzh = zzcfVar;
        return zzcfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        if (zzr()) {
            zzaz.zzf(zzr(), "Arrays already allocated");
            int i4 = this.zzf;
            int iMax = Math.max(i4 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzcj.zzd(iMax2);
            zzz(iMax2 - 1);
            this.zza = new int[i4];
            this.zzb = new Object[i4];
            this.zzc = new Object[i4];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i6 = this.zzg;
        int i10 = i6 + 1;
        int iZza = zzck.zza(obj);
        int iZzv = zzv();
        int i11 = iZza & iZzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzc = zzcj.zzc(obj3, i11);
        if (iZzc == 0) {
            if (i10 > iZzv) {
                iZzv = zzx(iZzv, zzcj.zza(iZzv), iZza, i6);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzcj.zze(obj4, i11, i10);
            }
            i = 1;
        } else {
            int i12 = ~iZzv;
            int i13 = iZza & i12;
            int i14 = 0;
            while (true) {
                int i15 = iZzc - 1;
                int i16 = iArrZzA[i15];
                i = 1;
                int i17 = i16 & i12;
                if (i17 == i13 && zzax.zza(obj, objArrZzB[i15])) {
                    Object obj5 = objArrZzC[i15];
                    objArrZzC[i15] = obj2;
                    return obj5;
                }
                int i18 = i16 & iZzv;
                i14++;
                if (i18 != 0) {
                    iZzc = i18;
                } else {
                    if (i14 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                        int iZze = zze();
                        while (iZze >= 0) {
                            linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                            iZze = zzf(iZze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i10 > iZzv) {
                        iZzv = zzx(iZzv, zzcj.zza(iZzv), iZza, i6);
                    } else {
                        iArrZzA[i15] = (i10 & iZzv) | i17;
                    }
                }
            }
        }
        int length = zzA().length;
        if (i10 > length) {
            int i19 = i;
            int iMin = Math.min(1073741823, (Math.max(i19, length >>> 1) + length) | i19);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzA(), iMin);
                this.zzb = Arrays.copyOf(zzB(), iMin);
                this.zzc = Arrays.copyOf(zzC(), iMin);
            }
        }
        zzA()[i6] = (~iZzv) & iZza;
        zzB()[i6] = obj;
        zzC()[i6] = obj2;
        this.zzg = i10;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzy = zzy(obj);
        if (objZzy == zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzch zzchVar = new zzch(this);
        this.zzj = zzchVar;
        return zzchVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i) {
        int i4 = i + 1;
        if (i4 < this.zzg) {
            return i4;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i) {
        this.zzf = zzdw.zza(i, 1, 1073741823);
    }

    public final void zzq(int i, int i4) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i6 = size - 1;
        if (i >= i6) {
            objArrZzB[i] = null;
            objArrZzC[i] = null;
            iArrZzA[i] = 0;
            return;
        }
        int i10 = i + 1;
        Object obj2 = objArrZzB[i6];
        objArrZzB[i] = obj2;
        objArrZzC[i] = objArrZzC[i6];
        objArrZzB[i6] = null;
        objArrZzC[i6] = null;
        iArrZzA[i] = iArrZzA[i6];
        iArrZzA[i6] = 0;
        int iZza = zzck.zza(obj2) & i4;
        int iZzc = zzcj.zzc(obj, iZza);
        if (iZzc == size) {
            zzcj.zze(obj, iZza, i10);
            return;
        }
        while (true) {
            int i11 = iZzc - 1;
            int i12 = iArrZzA[i11];
            int i13 = i12 & i4;
            if (i13 == size) {
                iArrZzA[i11] = (i12 & (~i4)) | (i4 & i10);
                return;
            }
            iZzc = i13;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzci(int i) {
        zzp(12);
    }
}
