package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgjz extends zzgjv implements List, RandomAccess {
    private static final zzgme zza = new zzgjx(zzglk.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzgjz zzi() {
        return zzglk.zza;
    }

    public static zzgjz zzj(Object obj) {
        Object[] objArr = {obj};
        zzgli.zza(objArr, 1);
        return zzt(objArr, 1);
    }

    public static zzgjz zzk(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgli.zza(objArr, 2);
        return zzt(objArr, 2);
    }

    public static zzgjz zzl(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgli.zza(objArr, 3);
        return zzt(objArr, 3);
    }

    public static zzgjz zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgli.zza(objArr, 5);
        return zzt(objArr, 5);
    }

    public static zzgjz zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        zzgli.zza(objArr, 6);
        return zzt(objArr, 6);
    }

    @SafeVarargs
    public static zzgjz zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzgli.zza(objArr2, i);
        return zzt(objArr2, i);
    }

    public static zzgjz zzp(Iterable iterable) {
        iterable.getClass();
        return zzq((Collection) iterable);
    }

    public static zzgjz zzq(Collection collection) {
        if (!(collection instanceof zzgjv)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgli.zza(array, length);
            return zzt(array, length);
        }
        zzgjz zzgjzVarZze = ((zzgjv) collection).zze();
        if (!zzgjzVarZze.zzf()) {
            return zzgjzVarZze;
        }
        Object[] array2 = zzgjzVarZze.toArray();
        return zzt(array2, array2.length);
    }

    public static zzgjz zzr(Object[] objArr) {
        if (objArr.length == 0) {
            return zzglk.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgli.zza(objArr2, length);
        return zzt(objArr2, length);
    }

    public static zzgjz zzs(Comparator comparator, Iterable iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : zzgkp.zza(((zzgjz) iterable).listIterator(0))).toArray();
        int length = array.length;
        zzgli.zza(array, length);
        Arrays.sort(array, comparator);
        return zzt(array, length);
    }

    public static zzgjz zzt(Object[] objArr, int i) {
        return i == 0 ? zzglk.zza : new zzglk(objArr, i);
    }

    public static zzgjw zzv(int i) {
        zzgiz.zzb(i, "expectedSize");
        return new zzgjw(i);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgjv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!Objects.equals(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    /* JADX INFO: renamed from: zza */
    public final zzgmd iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    @Deprecated
    public final zzgjz zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public int zzg(Object[] objArr, int i) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i + i4] = get(i4);
        }
        return i + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzgjz subList(int i, int i4) {
        zzghc.zzo(i, i4, size());
        int i6 = i4 - i;
        return i6 == size() ? this : i6 == 0 ? zzglk.zza : new zzgjy(this, i, i6);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzgme listIterator(int i) {
        zzghc.zzn(i, size(), "index");
        return isEmpty() ? zza : new zzgjx(this, i);
    }
}
