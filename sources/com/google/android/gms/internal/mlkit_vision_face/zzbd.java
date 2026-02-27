package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class zzbd extends AbstractMap implements Serializable {
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

    public zzbd() {
        zzo(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    public static /* synthetic */ int zzb(zzbd zzbdVar) {
        int i = zzbdVar.zzg;
        zzbdVar.zzg = i - 1;
        return i;
    }

    public static /* synthetic */ Object zzg(zzbd zzbdVar, int i) {
        return zzbdVar.zzA()[i];
    }

    public static /* synthetic */ Object zzj(zzbd zzbdVar, int i) {
        return zzbdVar.zzB()[i];
    }

    public static /* synthetic */ Object zzk(zzbd zzbdVar) {
        Object obj = zzbdVar.zze;
        obj.getClass();
        return obj;
    }

    public static /* synthetic */ void zzm(zzbd zzbdVar, int i, Object obj) {
        zzbdVar.zzB()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv(Object obj) {
        if (zzq()) {
            return -1;
        }
        int iZza = zzbf.zza(obj);
        int iZzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int iZzc = zzbe.zzc(obj2, iZza & iZzu);
        if (iZzc != 0) {
            int i = ~iZzu;
            int i4 = iZza & i;
            do {
                int i6 = iZzc - 1;
                int i10 = zzz()[i6];
                if ((i10 & i) == i4 && zzx.zza(obj, zzA()[i6])) {
                    return i6;
                }
                iZzc = i10 & iZzu;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzw(int i, int i4, int i6, int i10) {
        Object objZzd = zzbe.zzd(i4);
        int i11 = i4 - 1;
        if (i10 != 0) {
            zzbe.zze(objZzd, i6 & i11, i10 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] iArrZzz = zzz();
        for (int i12 = 0; i12 <= i; i12++) {
            int iZzc = zzbe.zzc(obj, i12);
            while (iZzc != 0) {
                int i13 = iZzc - 1;
                int i14 = iArrZzz[i13];
                int i15 = ((~i) & i14) | i12;
                int i16 = i15 & i11;
                int iZzc2 = zzbe.zzc(objZzd, i16);
                zzbe.zze(objZzd, i16, iZzc);
                iArrZzz[i13] = ((~i11) & i15) | (iZzc2 & i11);
                iZzc = i14 & i;
            }
        }
        this.zze = objZzd;
        zzy(i11);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzx(Object obj) {
        if (zzq()) {
            return zzd;
        }
        int iZzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int iZzb = zzbe.zzb(obj, null, iZzu, obj2, zzz(), zzA(), null);
        if (iZzb == -1) {
            return zzd;
        }
        Object obj3 = zzB()[iZzb];
        zzp(iZzb, iZzu);
        this.zzg--;
        zzn();
        return obj3;
    }

    private final void zzy(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
            return;
        }
        zzn();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzcn.zza(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzA(), 0, this.zzg, (Object) null);
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzz(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.containsKey(obj) : zzv(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (zzx.zza(obj, zzB()[i])) {
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
        zzay zzayVar = new zzay(this);
        this.zzi = zzayVar;
        return zzayVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzv = zzv(obj);
        if (iZzv == -1) {
            return null;
        }
        return zzB()[iZzv];
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
        zzba zzbaVar = new zzba(this);
        this.zzh = zzbaVar;
        return zzbaVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        if (zzq()) {
            zzab.zzd(zzq(), "Arrays already allocated");
            int i4 = this.zzf;
            int iMax = Math.max(i4 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzbe.zzd(iMax2);
            zzy(iMax2 - 1);
            this.zza = new int[i4];
            this.zzb = new Object[i4];
            this.zzc = new Object[i4];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzz = zzz();
        Object[] objArrZzA = zzA();
        Object[] objArrZzB = zzB();
        int i6 = this.zzg;
        int i10 = i6 + 1;
        int iZza = zzbf.zza(obj);
        int iZzu = zzu();
        int i11 = iZza & iZzu;
        Object obj3 = this.zze;
        obj3.getClass();
        int iZzc = zzbe.zzc(obj3, i11);
        if (iZzc == 0) {
            if (i10 > iZzu) {
                iZzu = zzw(iZzu, zzbe.zza(iZzu), iZza, i6);
            } else {
                Object obj4 = this.zze;
                obj4.getClass();
                zzbe.zze(obj4, i11, i10);
            }
            i = 1;
        } else {
            int i12 = ~iZzu;
            int i13 = iZza & i12;
            int i14 = 0;
            while (true) {
                int i15 = iZzc - 1;
                int i16 = iArrZzz[i15];
                i = 1;
                int i17 = i16 & i12;
                if (i17 == i13 && zzx.zza(obj, objArrZzA[i15])) {
                    Object obj5 = objArrZzB[i15];
                    objArrZzB[i15] = obj2;
                    return obj5;
                }
                int i18 = i16 & iZzu;
                i14++;
                if (i18 != 0) {
                    iZzc = i18;
                } else {
                    if (i14 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                        int iZze = zze();
                        while (iZze >= 0) {
                            linkedHashMap.put(zzA()[iZze], zzB()[iZze]);
                            iZze = zzf(iZze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzn();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i10 > iZzu) {
                        iZzu = zzw(iZzu, zzbe.zza(iZzu), iZza, i6);
                    } else {
                        iArrZzz[i15] = (i10 & iZzu) | i17;
                    }
                }
            }
        }
        int length = zzz().length;
        if (i10 > length) {
            int i19 = i;
            int iMin = Math.min(1073741823, (Math.max(i19, length >>> 1) + length) | i19);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzz(), iMin);
                this.zzb = Arrays.copyOf(zzA(), iMin);
                this.zzc = Arrays.copyOf(zzB(), iMin);
            }
        }
        zzz()[i6] = (~iZzu) & iZza;
        zzA()[i6] = obj;
        zzB()[i6] = obj2;
        this.zzg = i10;
        zzn();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzx = zzx(obj);
        if (objZzx == zzd) {
            return null;
        }
        return objZzx;
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
        zzbc zzbcVar = new zzbc(this);
        this.zzj = zzbcVar;
        return zzbcVar;
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

    public final void zzn() {
        this.zzf += 32;
    }

    public final void zzo(int i) {
        this.zzf = zzcn.zza(12, 1, 1073741823);
    }

    public final void zzp(int i, int i4) {
        Object obj = this.zze;
        obj.getClass();
        int[] iArrZzz = zzz();
        Object[] objArrZzA = zzA();
        Object[] objArrZzB = zzB();
        int size = size();
        int i6 = size - 1;
        if (i >= i6) {
            objArrZzA[i] = null;
            objArrZzB[i] = null;
            iArrZzz[i] = 0;
            return;
        }
        Object obj2 = objArrZzA[i6];
        objArrZzA[i] = obj2;
        objArrZzB[i] = objArrZzB[i6];
        objArrZzA[i6] = null;
        objArrZzB[i6] = null;
        iArrZzz[i] = iArrZzz[i6];
        iArrZzz[i6] = 0;
        int iZza = zzbf.zza(obj2) & i4;
        int iZzc = zzbe.zzc(obj, iZza);
        if (iZzc == size) {
            zzbe.zze(obj, iZza, i + 1);
            return;
        }
        while (true) {
            int i10 = iZzc - 1;
            int i11 = iArrZzz[i10];
            int i12 = i11 & i4;
            if (i12 == size) {
                iArrZzz[i10] = ((i + 1) & i4) | (i11 & (~i4));
                return;
            }
            iZzc = i12;
        }
    }

    public final boolean zzq() {
        return this.zze == null;
    }

    public zzbd(int i) {
        zzo(12);
    }
}
