package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import We.s;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzfp<T> implements zzge<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzgs zzl;
    private final zzdt zzm;

    private zzfp(int[] iArr, Object[] objArr, int i, int i4, zzfm zzfmVar, boolean z4, int[] iArr2, int i6, int i10, zzfs zzfsVar, zzez zzezVar, zzgs zzgsVar, zzdt zzdtVar, zzfh zzfhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i4;
        boolean z5 = false;
        if (zzdtVar != null && (zzfmVar instanceof zzed)) {
            z5 = true;
        }
        this.zzh = z5;
        this.zzi = iArr2;
        this.zzj = i6;
        this.zzk = i10;
        this.zzl = zzgsVar;
        this.zzm = zzdtVar;
        this.zzg = zzfmVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzge zzgeVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZze = zzgeVarZzv.zze();
                    zzgeVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzgeVarZzv.zze();
                zzgeVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgeVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i4 = this.zzc[i];
        if (zzM(obj2, i4, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzge zzgeVarZzv = zzv(i);
            if (!zzM(obj, i4, i)) {
                if (zzL(object)) {
                    Object objZze = zzgeVarZzv.zze();
                    zzgeVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i4, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzgeVarZzv.zze();
                zzgeVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgeVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzp = zzp(i);
        long j = 1048575 & iZzp;
        if (j == 1048575) {
            return;
        }
        zzgz.zzq(obj, j, (1 << (iZzp >>> 20)) | zzgz.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i4) {
        zzgz.zzq(obj, zzp(i4) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i4, Object obj2) {
        zzb.putObject(obj, zzs(i4) & 1048575, obj2);
        zzE(obj, i, i4);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int iZzp = zzp(i);
        long j = iZzp & 1048575;
        if (j != 1048575) {
            return (zzgz.zzc(obj, j) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j6 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzgz.zza(obj, j6)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgz.zzb(obj, j6)) != 0;
            case 2:
                return zzgz.zzd(obj, j6) != 0;
            case 3:
                return zzgz.zzd(obj, j6) != 0;
            case 4:
                return zzgz.zzc(obj, j6) != 0;
            case 5:
                return zzgz.zzd(obj, j6) != 0;
            case 6:
                return zzgz.zzc(obj, j6) != 0;
            case 7:
                return zzgz.zzw(obj, j6);
            case 8:
                Object objZzf = zzgz.zzf(obj, j6);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzdf) {
                    return !zzdf.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgz.zzf(obj, j6) != null;
            case 10:
                return !zzdf.zzb.equals(zzgz.zzf(obj, j6));
            case 11:
                return zzgz.zzc(obj, j6) != 0;
            case 12:
                return zzgz.zzc(obj, j6) != 0;
            case 13:
                return zzgz.zzc(obj, j6) != 0;
            case 14:
                return zzgz.zzd(obj, j6) != 0;
            case 15:
                return zzgz.zzc(obj, j6) != 0;
            case 16:
                return zzgz.zzd(obj, j6) != 0;
            case 17:
                return zzgz.zzf(obj, j6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i4, int i6, int i10) {
        return i4 == 1048575 ? zzI(obj, i) : (i6 & i10) != 0;
    }

    private static boolean zzK(Object obj, int i, zzge zzgeVar) {
        return zzgeVar.zzk(zzgz.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzeh) {
            return ((zzeh) obj).zzY();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i4) {
        return zzgz.zzc(obj, (long) (zzp(i4) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzgz.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzhh zzhhVar) throws IOException {
        if (obj instanceof String) {
            zzhhVar.zzG(i, (String) obj);
        } else {
            zzhhVar.zzd(i, (zzdf) obj);
        }
    }

    public static zzgt zzd(Object obj) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar != zzgt.zzc()) {
            return zzgtVar;
        }
        zzgt zzgtVarZzf = zzgt.zzf();
        zzehVar.zzc = zzgtVarZzf;
        return zzgtVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp zzl(java.lang.Class r32, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj r33, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfs r34, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez r35, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgs r36, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt r37, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfh r38) {
        /*
            Method dump skipped, instruction units count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzl(java.lang.Class, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfs, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgs, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfh):com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzgz.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzgz.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzgz.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i4) {
        int length = (this.zzc.length / 3) - 1;
        while (i4 <= length) {
            int i6 = (length + i4) >>> 1;
            int i10 = i6 * 3;
            int i11 = this.zzc[i10];
            if (i == i11) {
                return i10;
            }
            if (i < i11) {
                length = i6 - 1;
            } else {
                i4 = i6 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzgz.zzf(obj, j)).longValue();
    }

    private final zzel zzu(int i) {
        int i4 = i / 3;
        return (zzel) this.zzd[i4 + i4 + 1];
    }

    private final zzge zzv(int i) {
        Object[] objArr = this.zzd;
        int i4 = i / 3;
        int i6 = i4 + i4;
        zzge zzgeVar = (zzge) objArr[i6];
        if (zzgeVar != null) {
            return zzgeVar;
        }
        zzge zzgeVarZzb = zzfu.zza().zzb((Class) objArr[i6 + 1]);
        this.zzd[i6] = zzgeVarZzb;
        return zzgeVarZzb;
    }

    private final Object zzw(int i) {
        int i4 = i / 3;
        return this.zzd[i4 + i4];
    }

    private final Object zzx(Object obj, int i) {
        zzge zzgeVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzgeVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgeVarZzv.zze();
        if (object != null) {
            zzgeVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i, int i4) {
        zzge zzgeVarZzv = zzv(i4);
        if (!zzM(obj, i, i4)) {
            return zzgeVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i4) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgeVarZzv.zze();
        if (object != null) {
            zzgeVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbX = s.x("Field ", str, " for ", name, " not found. Known fields are ");
            sbX.append(string);
            throw new RuntimeException(sbX.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0211  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i4;
        int iFloatToIntBits;
        int iZzc;
        int i6;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int iZzs = zzs(i11);
            int[] iArr = this.zzc;
            int i12 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i13 = iArr[i11];
            long j = i12;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i = i10 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzgz.zza(obj, j));
                    byte[] bArr = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i + iZzc;
                    break;
                case 1:
                    i4 = i10 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzgz.zzb(obj, j));
                    i10 = iFloatToIntBits + i4;
                    break;
                case 2:
                    i = i10 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr2 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i + iZzc;
                    break;
                case 3:
                    i = i10 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr3 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i + iZzc;
                    break;
                case 4:
                    i = i10 * 53;
                    iZzc = zzgz.zzc(obj, j);
                    i10 = i + iZzc;
                    break;
                case 5:
                    i = i10 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr4 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i + iZzc;
                    break;
                case 6:
                    i = i10 * 53;
                    iZzc = zzgz.zzc(obj, j);
                    i10 = i + iZzc;
                    break;
                case 7:
                    i4 = i10 * 53;
                    iFloatToIntBits = zzep.zza(zzgz.zzw(obj, j));
                    i10 = iFloatToIntBits + i4;
                    break;
                case 8:
                    i4 = i10 * 53;
                    iFloatToIntBits = ((String) zzgz.zzf(obj, j)).hashCode();
                    i10 = iFloatToIntBits + i4;
                    break;
                case 9:
                    i6 = i10 * 53;
                    Object objZzf = zzgz.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i10 = i6 + iHashCode;
                    break;
                case 10:
                    i4 = i10 * 53;
                    iFloatToIntBits = zzgz.zzf(obj, j).hashCode();
                    i10 = iFloatToIntBits + i4;
                    break;
                case 11:
                    i = i10 * 53;
                    iZzc = zzgz.zzc(obj, j);
                    i10 = i + iZzc;
                    break;
                case 12:
                    i = i10 * 53;
                    iZzc = zzgz.zzc(obj, j);
                    i10 = i + iZzc;
                    break;
                case 13:
                    i = i10 * 53;
                    iZzc = zzgz.zzc(obj, j);
                    i10 = i + iZzc;
                    break;
                case 14:
                    i = i10 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr5 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i + iZzc;
                    break;
                case 15:
                    i = i10 * 53;
                    iZzc = zzgz.zzc(obj, j);
                    i10 = i + iZzc;
                    break;
                case 16:
                    i = i10 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr6 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i + iZzc;
                    break;
                case 17:
                    i6 = i10 * 53;
                    Object objZzf2 = zzgz.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i10 = i6 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i4 = i10 * 53;
                    iFloatToIntBits = zzgz.zzf(obj, j).hashCode();
                    i10 = iFloatToIntBits + i4;
                    break;
                case 50:
                    i4 = i10 * 53;
                    iFloatToIntBits = zzgz.zzf(obj, j).hashCode();
                    i10 = iFloatToIntBits + i4;
                    break;
                case 51:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i + iZzc;
                    }
                    break;
                case 52:
                    if (zzM(obj, i13, i11)) {
                        i4 = i10 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i10 = iFloatToIntBits + i4;
                    }
                    break;
                case 53:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i + iZzc;
                    }
                    break;
                case 54:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i + iZzc;
                    }
                    break;
                case 55:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        iZzc = zzo(obj, j);
                        i10 = i + iZzc;
                    }
                    break;
                case 56:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i + iZzc;
                    }
                    break;
                case 57:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        iZzc = zzo(obj, j);
                        i10 = i + iZzc;
                    }
                    break;
                case 58:
                    if (zzM(obj, i13, i11)) {
                        i4 = i10 * 53;
                        iFloatToIntBits = zzep.zza(zzN(obj, j));
                        i10 = iFloatToIntBits + i4;
                    }
                    break;
                case 59:
                    if (zzM(obj, i13, i11)) {
                        i4 = i10 * 53;
                        iFloatToIntBits = ((String) zzgz.zzf(obj, j)).hashCode();
                        i10 = iFloatToIntBits + i4;
                    }
                    break;
                case 60:
                    if (zzM(obj, i13, i11)) {
                        i4 = i10 * 53;
                        iFloatToIntBits = zzgz.zzf(obj, j).hashCode();
                        i10 = iFloatToIntBits + i4;
                    }
                    break;
                case 61:
                    if (zzM(obj, i13, i11)) {
                        i4 = i10 * 53;
                        iFloatToIntBits = zzgz.zzf(obj, j).hashCode();
                        i10 = iFloatToIntBits + i4;
                    }
                    break;
                case 62:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        iZzc = zzo(obj, j);
                        i10 = i + iZzc;
                    }
                    break;
                case 63:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        iZzc = zzo(obj, j);
                        i10 = i + iZzc;
                    }
                    break;
                case 64:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        iZzc = zzo(obj, j);
                        i10 = i + iZzc;
                    }
                    break;
                case 65:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i + iZzc;
                    }
                    break;
                case 66:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        iZzc = zzo(obj, j);
                        i10 = i + iZzc;
                    }
                    break;
                case 67:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzM(obj, i13, i11)) {
                        i4 = i10 * 53;
                        iFloatToIntBits = zzgz.zzf(obj, j).hashCode();
                        i10 = iFloatToIntBits + i4;
                    }
                    break;
            }
        }
        int iHashCode2 = ((zzeh) obj).zzc.hashCode() + (i10 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzed) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x046b, code lost:
    
        r3 = r14;
        r14 = r7;
        r7 = r9;
        r9 = r3;
        r4 = r41;
        r3 = r8;
        r6 = r10;
        r8 = r11;
        r15 = r21;
        r13 = r24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0c0f A[PHI: r0 r2 r7 r8 r11 r13 r14 r18 r25 r30
  0x0c0f: PHI (r0v34 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>) = 
  (r0v2 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r0v2 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r0v2 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r0v2 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r0v32 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
  (r0v2 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp<T>)
 binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r2v112 byte[]) = (r2v76 byte[]), (r2v78 byte[]), (r2v81 byte[]), (r2v92 byte[]), (r2v106 byte[]), (r2v118 byte[]) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r7v127 int) = (r7v73 int), (r7v74 int), (r7v76 int), (r7v103 int), (r7v121 int), (r7v132 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r8v96 int) = (r8v61 int), (r8v62 int), (r8v64 int), (r8v73 int), (r8v91 int), (r8v101 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r11v67 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu) = 
  (r11v35 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r11v36 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r11v38 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r11v58 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r11v66 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r11v70 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
 binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r13v71 int) = (r13v39 int), (r13v40 int), (r13v42 int), (r13v51 int), (r13v67 int), (r13v76 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r14v61 int) = (r14v47 int), (r14v47 int), (r14v47 int), (r14v47 int), (r14v60 int), (r14v47 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r18v60 int) = (r18v26 int), (r18v27 int), (r18v29 int), (r18v36 int), (r18v57 int), (r18v65 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r25v61 int) = (r25v33 int), (r25v34 int), (r25v36 int), (r25v43 int), (r25v54 int), (r25v65 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r30v35 int) = (r30v7 int), (r30v8 int), (r30v10 int), (r30v17 int), (r30v28 int), (r30v39 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0ef7 A[PHI: r2 r5 r7 r13 r14 r18
  0x0ef7: PHI (r2v154 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu) = 
  (r2v124 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r2v125 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r2v126 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r2v127 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r2v128 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r2v129 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r2v142 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
  (r2v155 com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu)
 binds: [B:555:0x0ee0, B:552:0x0ebd, B:549:0x0e9e, B:546:0x0e7f, B:543:0x0e60, B:540:0x0e40, B:500:0x0d2a, B:486:0x0ca3] A[DONT_GENERATE, DONT_INLINE]
  0x0ef7: PHI (r5v150 byte[]) = 
  (r5v127 byte[])
  (r5v128 byte[])
  (r5v129 byte[])
  (r5v130 byte[])
  (r5v131 byte[])
  (r5v132 byte[])
  (r5v140 byte[])
  (r5v151 byte[])
 binds: [B:555:0x0ee0, B:552:0x0ebd, B:549:0x0e9e, B:546:0x0e7f, B:543:0x0e60, B:540:0x0e40, B:500:0x0d2a, B:486:0x0ca3] A[DONT_GENERATE, DONT_INLINE]
  0x0ef7: PHI (r7v157 int) = (r7v135 int), (r7v136 int), (r7v137 int), (r7v138 int), (r7v139 int), (r7v140 int), (r7v146 int), (r7v158 int) binds: [B:555:0x0ee0, B:552:0x0ebd, B:549:0x0e9e, B:546:0x0e7f, B:543:0x0e60, B:540:0x0e40, B:500:0x0d2a, B:486:0x0ca3] A[DONT_GENERATE, DONT_INLINE]
  0x0ef7: PHI (r13v97 int) = (r13v78 int), (r13v79 int), (r13v80 int), (r13v81 int), (r13v82 int), (r13v83 int), (r13v91 int), (r13v98 int) binds: [B:555:0x0ee0, B:552:0x0ebd, B:549:0x0e9e, B:546:0x0e7f, B:543:0x0e60, B:540:0x0e40, B:500:0x0d2a, B:486:0x0ca3] A[DONT_GENERATE, DONT_INLINE]
  0x0ef7: PHI (r14v80 int) = (r14v65 int), (r14v66 int), (r14v67 int), (r14v68 int), (r14v69 int), (r14v70 int), (r14v75 int), (r14v81 int) binds: [B:555:0x0ee0, B:552:0x0ebd, B:549:0x0e9e, B:546:0x0e7f, B:543:0x0e60, B:540:0x0e40, B:500:0x0d2a, B:486:0x0ca3] A[DONT_GENERATE, DONT_INLINE]
  0x0ef7: PHI (r18v93 int) = (r18v68 int), (r18v69 int), (r18v70 int), (r18v71 int), (r18v72 int), (r18v73 int), (r18v83 int), (r18v94 int) binds: [B:555:0x0ee0, B:552:0x0ebd, B:549:0x0e9e, B:546:0x0e7f, B:543:0x0e60, B:540:0x0e40, B:500:0x0d2a, B:486:0x0ca3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0f21 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0f30  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0f6d  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0c12 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0efa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0c2e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0f15 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu r43) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        return ((zzeh) this.zzg).zzK();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            int i4 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i6 = iArr[i];
            long j = i4;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzgz.zzo(obj, j, zzgz.zza(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i)) {
                        zzgz.zzp(obj, j, zzgz.zzb(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i)) {
                        zzgz.zzm(obj, j, zzgz.zzw(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzeo zzeoVarZzd = (zzeo) zzgz.zzf(obj, j);
                    zzeo zzeoVar = (zzeo) zzgz.zzf(obj2, j);
                    int size = zzeoVarZzd.size();
                    int size2 = zzeoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzeoVarZzd.zzc()) {
                            zzeoVarZzd = zzeoVarZzd.zzd(size2 + size);
                        }
                        zzeoVarZzd.addAll(zzeoVar);
                    }
                    if (size > 0) {
                        zzeoVar = zzeoVarZzd;
                    }
                    zzgz.zzs(obj, j, zzeoVar);
                    break;
                case 50:
                    int i10 = zzgg.zza;
                    zzgz.zzs(obj, j, zzfh.zza(zzgz.zzf(obj, j), zzgz.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i6, i)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzE(obj, i6, i);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i6, i)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzE(obj, i6, i);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzgg.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zzgg.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzh(Object obj, byte[] bArr, int i, int i4, zzcu zzcuVar) throws IOException {
        zzc(obj, bArr, i, i4, 0, zzcuVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r20, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzi(java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzgz.zza(obj, j)) != Double.doubleToLongBits(zzgz.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzgz.zzb(obj, j)) != Float.floatToIntBits(zzgz.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzgz.zzd(obj, j) != zzgz.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzgz.zzd(obj, j) != zzgz.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzgz.zzc(obj, j) != zzgz.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzgz.zzd(obj, j) != zzgz.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzgz.zzc(obj, j) != zzgz.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzgz.zzw(obj, j) != zzgz.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzgz.zzc(obj, j) != zzgz.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzgz.zzc(obj, j) != zzgz.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzgz.zzc(obj, j) != zzgz.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzgz.zzd(obj, j) != zzgz.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzgz.zzc(obj, j) != zzgz.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzgz.zzd(obj, j) != zzgz.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzE = zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j));
                    break;
                case 50:
                    zZzE = zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzp = zzp(i) & 1048575;
                    if (zzgz.zzc(obj, jZzp) != zzgz.zzc(obj2, jZzp) || !zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzeh) obj).zzc.equals(((zzeh) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzed) obj).zzb.equals(((zzed) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzk(java.lang.Object):boolean");
    }
}
