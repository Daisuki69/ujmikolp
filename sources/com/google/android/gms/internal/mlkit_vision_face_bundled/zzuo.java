package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.core.impl.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzuo extends zzth implements RandomAccess, zzvb {
    private float[] zza;
    private int zzb;

    static {
        new zzuo(new float[0], 0, false);
    }

    public zzuo() {
        this(new float[10], 0, true);
    }

    private final String zzg(int i) {
        return a.c(i, this.zzb, "Index:", ", Size:");
    }

    private final void zzh(int i) {
        if (i < 0 || i >= this.zzb) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i4;
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i < 0 || i > (i4 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
        int i6 = i + 1;
        float[] fArr = this.zza;
        if (i4 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i6, i4 - i);
        } else {
            float[] fArr2 = new float[a.a(i4, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zza, i, fArr2, i6, this.zzb - i);
            this.zza = fArr2;
        }
        this.zza[i] = fFloatValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzvc.zzb;
        collection.getClass();
        if (!(collection instanceof zzuo)) {
            return super.addAll(collection);
        }
        zzuo zzuoVar = (zzuo) collection;
        int i = zzuoVar.zzb;
        if (i == 0) {
            return false;
        }
        int i4 = this.zzb;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        float[] fArr = this.zza;
        if (i6 > fArr.length) {
            this.zza = Arrays.copyOf(fArr, i6);
        }
        System.arraycopy(zzuoVar.zza, 0, this.zza, this.zzb, zzuoVar.zzb);
        this.zzb = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuo)) {
            return super.equals(obj);
        }
        zzuo zzuoVar = (zzuo) obj;
        if (this.zzb != zzuoVar.zzb) {
            return false;
        }
        float[] fArr = zzuoVar.zza;
        for (int i = 0; i < this.zzb; i++) {
            if (Float.floatToIntBits(this.zza[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzh(i);
        return Float.valueOf(this.zza[i]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.zzb; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zza[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.zzb;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.zza[i4] == fFloatValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzh(i);
        float[] fArr = this.zza;
        float f = fArr[i];
        if (i < this.zzb - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        zza();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zza;
        System.arraycopy(fArr, i4, fArr, i, this.zzb - i4);
        this.zzb -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        zzh(i);
        float[] fArr = this.zza;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvb
    public final /* bridge */ /* synthetic */ zzvb zzd(int i) {
        if (i >= this.zzb) {
            return new zzuo(Arrays.copyOf(this.zza, i), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i) {
        zzh(i);
        return this.zza[i];
    }

    public final void zzf(float f) {
        zza();
        int i = this.zzb;
        float[] fArr = this.zza;
        if (i == fArr.length) {
            float[] fArr2 = new float[a.a(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zza = fArr2;
        }
        float[] fArr3 = this.zza;
        int i4 = this.zzb;
        this.zzb = i4 + 1;
        fArr3[i4] = f;
    }

    private zzuo(float[] fArr, int i, boolean z4) {
        super(z4);
        this.zza = fArr;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
