package com.google.android.gms.internal.vision;

import androidx.camera.core.impl.a;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzlb<E> extends zzhj<E> implements RandomAccess {
    private static final zzlb<Object> zza;
    private E[] zzb;
    private int zzc;

    static {
        zzlb<Object> zzlbVar = new zzlb<>(new Object[0], 0);
        zza = zzlbVar;
        zzlbVar.zzb();
    }

    public zzlb() {
        this(new Object[10], 0);
    }

    private final void zzb(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
    }

    private final String zzc(int i) {
        return AbstractC1173g.p(35, i, this.zzc, "Index:", ", Size:");
    }

    public static <E> zzlb<E> zzd() {
        return (zzlb<E>) zza;
    }

    @Override // com.google.android.gms.internal.vision.zzhj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zzc();
        int i = this.zzc;
        E[] eArr = this.zzb;
        if (i == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        eArr2[i4] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzb(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.vision.zzhj, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zzc();
        zzb(i);
        E[] eArr = this.zzb;
        E e = eArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.vision.zzhj, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zzc();
        zzb(i);
        E[] eArr = this.zzb;
        E e7 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.vision.zzjl
    public final /* synthetic */ zzjl zza(int i) {
        if (i >= this.zzc) {
            return new zzlb(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzlb(E[] eArr, int i) {
        this.zzb = eArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.vision.zzhj, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i4;
        zzc();
        if (i >= 0 && i <= (i4 = this.zzc)) {
            E[] eArr = this.zzb;
            if (i4 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i4 - i);
            } else {
                E[] eArr2 = (E[]) new Object[a.a(i4, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.zzb, i, eArr2, i + 1, this.zzc - i);
                this.zzb = eArr2;
            }
            this.zzb[i] = e;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzc(i));
    }
}
