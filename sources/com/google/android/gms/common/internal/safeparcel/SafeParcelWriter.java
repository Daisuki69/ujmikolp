package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.NonNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(@NonNull Parcel parcel) {
        return zza(parcel, 20293);
    }

    public static void finishObjectHeader(@NonNull Parcel parcel, int i) {
        zzb(parcel, i);
    }

    public static void writeBigDecimal(@NonNull Parcel parcel, int i, @NonNull BigDecimal bigDecimal, boolean z4) {
        if (bigDecimal == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzb(parcel, iZza);
        }
    }

    public static void writeBigDecimalArray(@NonNull Parcel parcel, int i, @NonNull BigDecimal[] bigDecimalArr, boolean z4) {
        if (bigDecimalArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i4 = 0; i4 < length; i4++) {
            parcel.writeByteArray(bigDecimalArr[i4].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i4].scale());
        }
        zzb(parcel, iZza);
    }

    public static void writeBigInteger(@NonNull Parcel parcel, int i, @NonNull BigInteger bigInteger, boolean z4) {
        if (bigInteger == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzb(parcel, iZza);
        }
    }

    public static void writeBigIntegerArray(@NonNull Parcel parcel, int i, @NonNull BigInteger[] bigIntegerArr, boolean z4) {
        if (bigIntegerArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzb(parcel, iZza);
    }

    public static void writeBoolean(@NonNull Parcel parcel, int i, boolean z4) {
        zzc(parcel, i, 4);
        parcel.writeInt(z4 ? 1 : 0);
    }

    public static void writeBooleanArray(@NonNull Parcel parcel, int i, @NonNull boolean[] zArr, boolean z4) {
        if (zArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeBooleanArray(zArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeBooleanList(@NonNull Parcel parcel, int i, @NonNull List<Boolean> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeInt(list.get(i4).booleanValue() ? 1 : 0);
        }
        zzb(parcel, iZza);
    }

    public static void writeBooleanObject(@NonNull Parcel parcel, int i, @NonNull Boolean bool, boolean z4) {
        if (bool != null) {
            zzc(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z4) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeBundle(@NonNull Parcel parcel, int i, @NonNull Bundle bundle, boolean z4) {
        if (bundle == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeBundle(bundle);
            zzb(parcel, iZza);
        }
    }

    public static void writeByte(@NonNull Parcel parcel, int i, byte b8) {
        zzc(parcel, i, 4);
        parcel.writeInt(b8);
    }

    public static void writeByteArray(@NonNull Parcel parcel, int i, @NonNull byte[] bArr, boolean z4) {
        if (bArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeByteArray(bArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeByteArrayArray(@NonNull Parcel parcel, int i, @NonNull byte[][] bArr, boolean z4) {
        if (bArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzb(parcel, iZza);
    }

    public static void writeByteArraySparseArray(@NonNull Parcel parcel, int i, @NonNull SparseArray<byte[]> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeInt(sparseArray.keyAt(i4));
            parcel.writeByteArray(sparseArray.valueAt(i4));
        }
        zzb(parcel, iZza);
    }

    public static void writeChar(@NonNull Parcel parcel, int i, char c) {
        zzc(parcel, i, 4);
        parcel.writeInt(c);
    }

    public static void writeCharArray(@NonNull Parcel parcel, int i, @NonNull char[] cArr, boolean z4) {
        if (cArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeCharArray(cArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeDouble(@NonNull Parcel parcel, int i, double d10) {
        zzc(parcel, i, 8);
        parcel.writeDouble(d10);
    }

    public static void writeDoubleArray(@NonNull Parcel parcel, int i, @NonNull double[] dArr, boolean z4) {
        if (dArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeDoubleArray(dArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeDoubleList(@NonNull Parcel parcel, int i, @NonNull List<Double> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeDouble(list.get(i4).doubleValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeDoubleObject(@NonNull Parcel parcel, int i, @NonNull Double d10, boolean z4) {
        if (d10 != null) {
            zzc(parcel, i, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z4) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeDoubleSparseArray(@NonNull Parcel parcel, int i, @NonNull SparseArray<Double> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeInt(sparseArray.keyAt(i4));
            parcel.writeDouble(sparseArray.valueAt(i4).doubleValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeFloat(@NonNull Parcel parcel, int i, float f) {
        zzc(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void writeFloatArray(@NonNull Parcel parcel, int i, @NonNull float[] fArr, boolean z4) {
        if (fArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeFloatArray(fArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeFloatList(@NonNull Parcel parcel, int i, @NonNull List<Float> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeFloat(list.get(i4).floatValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeFloatObject(@NonNull Parcel parcel, int i, @NonNull Float f, boolean z4) {
        if (f != null) {
            zzc(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z4) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeFloatSparseArray(@NonNull Parcel parcel, int i, @NonNull SparseArray<Float> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeInt(sparseArray.keyAt(i4));
            parcel.writeFloat(sparseArray.valueAt(i4).floatValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeIBinder(@NonNull Parcel parcel, int i, @NonNull IBinder iBinder, boolean z4) {
        if (iBinder == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeStrongBinder(iBinder);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderArray(@NonNull Parcel parcel, int i, @NonNull IBinder[] iBinderArr, boolean z4) {
        if (iBinderArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeBinderArray(iBinderArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderList(@NonNull Parcel parcel, int i, @NonNull List<IBinder> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeBinderList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderSparseArray(@NonNull Parcel parcel, int i, @NonNull SparseArray<IBinder> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeInt(sparseArray.keyAt(i4));
            parcel.writeStrongBinder(sparseArray.valueAt(i4));
        }
        zzb(parcel, iZza);
    }

    public static void writeInt(@NonNull Parcel parcel, int i, int i4) {
        zzc(parcel, i, 4);
        parcel.writeInt(i4);
    }

    public static void writeIntArray(@NonNull Parcel parcel, int i, @NonNull int[] iArr, boolean z4) {
        if (iArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeIntArray(iArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeIntegerList(@NonNull Parcel parcel, int i, @NonNull List<Integer> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeInt(list.get(i4).intValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeIntegerObject(@NonNull Parcel parcel, int i, @NonNull Integer num, boolean z4) {
        if (num != null) {
            zzc(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z4) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeList(@NonNull Parcel parcel, int i, @NonNull List list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeLong(@NonNull Parcel parcel, int i, long j) {
        zzc(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void writeLongArray(@NonNull Parcel parcel, int i, @NonNull long[] jArr, boolean z4) {
        if (jArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeLongArray(jArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeLongList(@NonNull Parcel parcel, int i, @NonNull List<Long> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeLong(list.get(i4).longValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeLongObject(@NonNull Parcel parcel, int i, @NonNull Long l6, boolean z4) {
        if (l6 != null) {
            zzc(parcel, i, 8);
            parcel.writeLong(l6.longValue());
        } else if (z4) {
            zzc(parcel, i, 0);
        }
    }

    public static void writeParcel(@NonNull Parcel parcel, int i, @NonNull Parcel parcel2, boolean z4) {
        if (parcel2 == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzb(parcel, iZza);
        }
    }

    public static void writeParcelArray(@NonNull Parcel parcel, int i, @NonNull Parcel[] parcelArr, boolean z4) {
        if (parcelArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelList(@NonNull Parcel parcel, int i, @NonNull List<Parcel> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            Parcel parcel2 = list.get(i4);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelSparseArray(@NonNull Parcel parcel, int i, @NonNull SparseArray<Parcel> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeInt(sparseArray.keyAt(i4));
            Parcel parcelValueAt = sparseArray.valueAt(i4);
            if (parcelValueAt != null) {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelable(@NonNull Parcel parcel, int i, @NonNull Parcelable parcelable, int i4, boolean z4) {
        if (parcelable == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcelable.writeToParcel(parcel, i4);
            zzb(parcel, iZza);
        }
    }

    public static void writePendingIntent(@NonNull Parcel parcel, int i, @NonNull PendingIntent pendingIntent, boolean z4) {
        if (pendingIntent == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzb(parcel, iZza);
        }
    }

    public static void writeShort(@NonNull Parcel parcel, int i, short s9) {
        zzc(parcel, i, 4);
        parcel.writeInt(s9);
    }

    public static void writeSparseBooleanArray(@NonNull Parcel parcel, int i, @NonNull SparseBooleanArray sparseBooleanArray, boolean z4) {
        if (sparseBooleanArray == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzb(parcel, iZza);
        }
    }

    public static void writeSparseIntArray(@NonNull Parcel parcel, int i, @NonNull SparseIntArray sparseIntArray, boolean z4) {
        if (sparseIntArray == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeInt(sparseIntArray.keyAt(i4));
            parcel.writeInt(sparseIntArray.valueAt(i4));
        }
        zzb(parcel, iZza);
    }

    public static void writeSparseLongArray(@NonNull Parcel parcel, int i, @NonNull SparseLongArray sparseLongArray, boolean z4) {
        if (sparseLongArray == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeInt(sparseLongArray.keyAt(i4));
            parcel.writeLong(sparseLongArray.valueAt(i4));
        }
        zzb(parcel, iZza);
    }

    public static void writeString(@NonNull Parcel parcel, int i, @NonNull String str, boolean z4) {
        if (str == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeString(str);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringArray(@NonNull Parcel parcel, int i, @NonNull String[] strArr, boolean z4) {
        if (strArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeStringArray(strArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringList(@NonNull Parcel parcel, int i, @NonNull List<String> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i, 0);
            }
        } else {
            int iZza = zza(parcel, i);
            parcel.writeStringList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringSparseArray(@NonNull Parcel parcel, int i, @NonNull SparseArray<String> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeInt(sparseArray.keyAt(i4));
            parcel.writeString(sparseArray.valueAt(i4));
        }
        zzb(parcel, iZza);
    }

    public static <T extends Parcelable> void writeTypedArray(@NonNull Parcel parcel, int i, @NonNull T[] tArr, int i4, boolean z4) {
        if (tArr == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t5 : tArr) {
            if (t5 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t5, i4);
            }
        }
        zzb(parcel, iZza);
    }

    public static <T extends Parcelable> void writeTypedList(@NonNull Parcel parcel, int i, @NonNull List<T> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            T t5 = list.get(i4);
            if (t5 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t5, 0);
            }
        }
        zzb(parcel, iZza);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(@NonNull Parcel parcel, int i, @NonNull SparseArray<T> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeInt(sparseArray.keyAt(i4));
            T tValueAt = sparseArray.valueAt(i4);
            if (tValueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, tValueAt, 0);
            }
        }
        zzb(parcel, iZza);
    }

    private static int zza(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    private static void zzc(Parcel parcel, int i, int i4) {
        parcel.writeInt(i | (i4 << 16));
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
