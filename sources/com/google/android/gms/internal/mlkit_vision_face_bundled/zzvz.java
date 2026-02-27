package com.google.android.gms.internal.mlkit_vision_face_bundled;

import We.s;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzvz<T> implements zzwh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzxc.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzvw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzwv zzl;
    private final zzui zzm;

    private zzvz(int[] iArr, Object[] objArr, int i, int i4, zzvw zzvwVar, boolean z4, int[] iArr2, int i6, int i10, zzwc zzwcVar, zzvj zzvjVar, zzwv zzwvVar, zzui zzuiVar, zzvr zzvrVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i4;
        boolean z5 = false;
        if (zzuiVar != null && (zzvwVar instanceof zzus)) {
            z5 = true;
        }
        this.zzh = z5;
        this.zzi = iArr2;
        this.zzj = i6;
        this.zzk = i10;
        this.zzl = zzwvVar;
        this.zzm = zzuiVar;
        this.zzg = zzvwVar;
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
            zzwh zzwhVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZze = zzwhVarZzv.zze();
                    zzwhVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzwhVarZzv.zze();
                zzwhVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzwhVarZzv.zzg(object2, object);
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
            zzwh zzwhVarZzv = zzv(i);
            if (!zzM(obj, i4, i)) {
                if (zzL(object)) {
                    Object objZze = zzwhVarZzv.zze();
                    zzwhVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i4, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzwhVarZzv.zze();
                zzwhVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzwhVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzp = zzp(i);
        long j = 1048575 & iZzp;
        if (j == 1048575) {
            return;
        }
        zzxc.zzq(obj, j, (1 << (iZzp >>> 20)) | zzxc.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i4) {
        zzxc.zzq(obj, zzp(i4) & 1048575, i);
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
            return (zzxc.zzc(obj, j) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j6 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzxc.zza(obj, j6)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzxc.zzb(obj, j6)) != 0;
            case 2:
                return zzxc.zzd(obj, j6) != 0;
            case 3:
                return zzxc.zzd(obj, j6) != 0;
            case 4:
                return zzxc.zzc(obj, j6) != 0;
            case 5:
                return zzxc.zzd(obj, j6) != 0;
            case 6:
                return zzxc.zzc(obj, j6) != 0;
            case 7:
                return zzxc.zzw(obj, j6);
            case 8:
                Object objZzf = zzxc.zzf(obj, j6);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zztu) {
                    return !zztu.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzxc.zzf(obj, j6) != null;
            case 10:
                return !zztu.zzb.equals(zzxc.zzf(obj, j6));
            case 11:
                return zzxc.zzc(obj, j6) != 0;
            case 12:
                return zzxc.zzc(obj, j6) != 0;
            case 13:
                return zzxc.zzc(obj, j6) != 0;
            case 14:
                return zzxc.zzd(obj, j6) != 0;
            case 15:
                return zzxc.zzc(obj, j6) != 0;
            case 16:
                return zzxc.zzd(obj, j6) != 0;
            case 17:
                return zzxc.zzf(obj, j6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i4, int i6, int i10) {
        return i4 == 1048575 ? zzI(obj, i) : (i6 & i10) != 0;
    }

    private static boolean zzK(Object obj, int i, zzwh zzwhVar) {
        return zzwhVar.zzk(zzxc.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzuw) {
            return ((zzuw) obj).zzI();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i4) {
        return zzxc.zzc(obj, (long) (zzp(i4) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzxc.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzxi zzxiVar) throws IOException {
        if (obj instanceof String) {
            zzxiVar.zzG(i, (String) obj);
        } else {
            zzxiVar.zzd(i, (zztu) obj);
        }
    }

    public static zzww zzd(Object obj) {
        zzuw zzuwVar = (zzuw) obj;
        zzww zzwwVar = zzuwVar.zzc;
        if (zzwwVar != zzww.zzc()) {
            return zzwwVar;
        }
        zzww zzwwVarZzf = zzww.zzf();
        zzuwVar.zzc = zzwwVarZzf;
        return zzwwVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz zzl(java.lang.Class r32, com.google.android.gms.internal.mlkit_vision_face_bundled.zzvt r33, com.google.android.gms.internal.mlkit_vision_face_bundled.zzwc r34, com.google.android.gms.internal.mlkit_vision_face_bundled.zzvj r35, com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv r36, com.google.android.gms.internal.mlkit_vision_face_bundled.zzui r37, com.google.android.gms.internal.mlkit_vision_face_bundled.zzvr r38) {
        /*
            Method dump skipped, instruction units count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz.zzl(java.lang.Class, com.google.android.gms.internal.mlkit_vision_face_bundled.zzvt, com.google.android.gms.internal.mlkit_vision_face_bundled.zzwc, com.google.android.gms.internal.mlkit_vision_face_bundled.zzvj, com.google.android.gms.internal.mlkit_vision_face_bundled.zzwv, com.google.android.gms.internal.mlkit_vision_face_bundled.zzui, com.google.android.gms.internal.mlkit_vision_face_bundled.zzvr):com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzxc.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzxc.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzxc.zzf(obj, j)).intValue();
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
        return ((Long) zzxc.zzf(obj, j)).longValue();
    }

    private final zzva zzu(int i) {
        int i4 = i / 3;
        return (zzva) this.zzd[i4 + i4 + 1];
    }

    private final zzwh zzv(int i) {
        Object[] objArr = this.zzd;
        int i4 = i / 3;
        int i6 = i4 + i4;
        zzwh zzwhVar = (zzwh) objArr[i6];
        if (zzwhVar != null) {
            return zzwhVar;
        }
        zzwh zzwhVarZzb = zzwe.zza().zzb((Class) objArr[i6 + 1]);
        this.zzd[i6] = zzwhVarZzb;
        return zzwhVarZzb;
    }

    private final Object zzw(int i) {
        int i4 = i / 3;
        return this.zzd[i4 + i4];
    }

    private final Object zzx(Object obj, int i) {
        zzwh zzwhVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzwhVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzwhVarZzv.zze();
        if (object != null) {
            zzwhVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i, int i4) {
        zzwh zzwhVarZzv = zzv(i4);
        if (!zzM(obj, i, i4)) {
            return zzwhVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i4) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzwhVarZzv.zze();
        if (object != null) {
            zzwhVarZzv.zzg(objZze, object);
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
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
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
                    jDoubleToLongBits = Double.doubleToLongBits(zzxc.zza(obj, j));
                    byte[] bArr = zzvc.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i + iZzc;
                    break;
                case 1:
                    i4 = i10 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzxc.zzb(obj, j));
                    i10 = iFloatToIntBits + i4;
                    break;
                case 2:
                    i = i10 * 53;
                    jDoubleToLongBits = zzxc.zzd(obj, j);
                    byte[] bArr2 = zzvc.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i + iZzc;
                    break;
                case 3:
                    i = i10 * 53;
                    jDoubleToLongBits = zzxc.zzd(obj, j);
                    byte[] bArr3 = zzvc.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i + iZzc;
                    break;
                case 4:
                    i = i10 * 53;
                    iZzc = zzxc.zzc(obj, j);
                    i10 = i + iZzc;
                    break;
                case 5:
                    i = i10 * 53;
                    jDoubleToLongBits = zzxc.zzd(obj, j);
                    byte[] bArr4 = zzvc.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i + iZzc;
                    break;
                case 6:
                    i = i10 * 53;
                    iZzc = zzxc.zzc(obj, j);
                    i10 = i + iZzc;
                    break;
                case 7:
                    i4 = i10 * 53;
                    iFloatToIntBits = zzvc.zza(zzxc.zzw(obj, j));
                    i10 = iFloatToIntBits + i4;
                    break;
                case 8:
                    i4 = i10 * 53;
                    iFloatToIntBits = ((String) zzxc.zzf(obj, j)).hashCode();
                    i10 = iFloatToIntBits + i4;
                    break;
                case 9:
                    i6 = i10 * 53;
                    Object objZzf = zzxc.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i10 = i6 + iHashCode;
                    break;
                case 10:
                    i4 = i10 * 53;
                    iFloatToIntBits = zzxc.zzf(obj, j).hashCode();
                    i10 = iFloatToIntBits + i4;
                    break;
                case 11:
                    i = i10 * 53;
                    iZzc = zzxc.zzc(obj, j);
                    i10 = i + iZzc;
                    break;
                case 12:
                    i = i10 * 53;
                    iZzc = zzxc.zzc(obj, j);
                    i10 = i + iZzc;
                    break;
                case 13:
                    i = i10 * 53;
                    iZzc = zzxc.zzc(obj, j);
                    i10 = i + iZzc;
                    break;
                case 14:
                    i = i10 * 53;
                    jDoubleToLongBits = zzxc.zzd(obj, j);
                    byte[] bArr5 = zzvc.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i + iZzc;
                    break;
                case 15:
                    i = i10 * 53;
                    iZzc = zzxc.zzc(obj, j);
                    i10 = i + iZzc;
                    break;
                case 16:
                    i = i10 * 53;
                    jDoubleToLongBits = zzxc.zzd(obj, j);
                    byte[] bArr6 = zzvc.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i + iZzc;
                    break;
                case 17:
                    i6 = i10 * 53;
                    Object objZzf2 = zzxc.zzf(obj, j);
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
                    iFloatToIntBits = zzxc.zzf(obj, j).hashCode();
                    i10 = iFloatToIntBits + i4;
                    break;
                case 50:
                    i4 = i10 * 53;
                    iFloatToIntBits = zzxc.zzf(obj, j).hashCode();
                    i10 = iFloatToIntBits + i4;
                    break;
                case 51:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzvc.zzb;
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
                        byte[] bArr8 = zzvc.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i + iZzc;
                    }
                    break;
                case 54:
                    if (zzM(obj, i13, i11)) {
                        i = i10 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzvc.zzb;
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
                        byte[] bArr10 = zzvc.zzb;
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
                        iFloatToIntBits = zzvc.zza(zzN(obj, j));
                        i10 = iFloatToIntBits + i4;
                    }
                    break;
                case 59:
                    if (zzM(obj, i13, i11)) {
                        i4 = i10 * 53;
                        iFloatToIntBits = ((String) zzxc.zzf(obj, j)).hashCode();
                        i10 = iFloatToIntBits + i4;
                    }
                    break;
                case 60:
                    if (zzM(obj, i13, i11)) {
                        i4 = i10 * 53;
                        iFloatToIntBits = zzxc.zzf(obj, j).hashCode();
                        i10 = iFloatToIntBits + i4;
                    }
                    break;
                case 61:
                    if (zzM(obj, i13, i11)) {
                        i4 = i10 * 53;
                        iFloatToIntBits = zzxc.zzf(obj, j).hashCode();
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
                        byte[] bArr11 = zzvc.zzb;
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
                        byte[] bArr12 = zzvc.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzM(obj, i13, i11)) {
                        i4 = i10 * 53;
                        iFloatToIntBits = zzxc.zzf(obj, j).hashCode();
                        i10 = iFloatToIntBits + i4;
                    }
                    break;
            }
        }
        int iHashCode2 = ((zzuw) obj).zzc.hashCode() + (i10 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzus) obj).zzb.zza.hashCode() : iHashCode2;
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
  0x0c0f: PHI (r0v34 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>) = 
  (r0v2 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
  (r0v2 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
  (r0v2 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
  (r0v2 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
  (r0v32 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
  (r0v2 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
 binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r2v112 byte[]) = (r2v76 byte[]), (r2v78 byte[]), (r2v81 byte[]), (r2v92 byte[]), (r2v106 byte[]), (r2v118 byte[]) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r7v127 int) = (r7v73 int), (r7v74 int), (r7v76 int), (r7v103 int), (r7v121 int), (r7v132 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r8v96 int) = (r8v61 int), (r8v62 int), (r8v64 int), (r8v73 int), (r8v91 int), (r8v101 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r11v67 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj) = 
  (r11v35 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
  (r11v36 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
  (r11v38 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
  (r11v58 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
  (r11v66 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
  (r11v70 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
 binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r13v71 int) = (r13v39 int), (r13v40 int), (r13v42 int), (r13v51 int), (r13v67 int), (r13v76 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r14v61 int) = (r14v47 int), (r14v47 int), (r14v47 int), (r14v47 int), (r14v60 int), (r14v47 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r18v60 int) = (r18v26 int), (r18v27 int), (r18v29 int), (r18v36 int), (r18v57 int), (r18v65 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r25v61 int) = (r25v33 int), (r25v34 int), (r25v36 int), (r25v43 int), (r25v54 int), (r25v65 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]
  0x0c0f: PHI (r30v35 int) = (r30v7 int), (r30v8 int), (r30v10 int), (r30v17 int), (r30v28 int), (r30v39 int) binds: [B:459:0x0be5, B:443:0x0b82, B:426:0x0b25, B:350:0x0995, B:216:0x06eb, B:196:0x0668] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0ef7 A[PHI: r2 r5 r7 r13 r14 r18
  0x0ef7: PHI (r2v154 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj) = 
  (r2v124 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
  (r2v125 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
  (r2v126 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
  (r2v127 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
  (r2v128 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
  (r2v129 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
  (r2v142 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
  (r2v155 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
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
    public final int zzc(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.mlkit_vision_face_bundled.zztj r43) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_face_bundled.zztj):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final Object zze() {
        return ((zzuw) this.zzg).zzy();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
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
                        zzxc.zzo(obj, j, zzxc.zza(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i)) {
                        zzxc.zzp(obj, j, zzxc.zzb(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i)) {
                        zzxc.zzr(obj, j, zzxc.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i)) {
                        zzxc.zzr(obj, j, zzxc.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i)) {
                        zzxc.zzq(obj, j, zzxc.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i)) {
                        zzxc.zzr(obj, j, zzxc.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i)) {
                        zzxc.zzq(obj, j, zzxc.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i)) {
                        zzxc.zzm(obj, j, zzxc.zzw(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i)) {
                        zzxc.zzs(obj, j, zzxc.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzxc.zzs(obj, j, zzxc.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i)) {
                        zzxc.zzq(obj, j, zzxc.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i)) {
                        zzxc.zzq(obj, j, zzxc.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i)) {
                        zzxc.zzq(obj, j, zzxc.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i)) {
                        zzxc.zzr(obj, j, zzxc.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i)) {
                        zzxc.zzq(obj, j, zzxc.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i)) {
                        zzxc.zzr(obj, j, zzxc.zzd(obj2, j));
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
                    zzvb zzvbVarZzd = (zzvb) zzxc.zzf(obj, j);
                    zzvb zzvbVar = (zzvb) zzxc.zzf(obj2, j);
                    int size = zzvbVarZzd.size();
                    int size2 = zzvbVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzvbVarZzd.zzc()) {
                            zzvbVarZzd = zzvbVarZzd.zzd(size2 + size);
                        }
                        zzvbVarZzd.addAll(zzvbVar);
                    }
                    if (size > 0) {
                        zzvbVar = zzvbVarZzd;
                    }
                    zzxc.zzs(obj, j, zzvbVar);
                    break;
                case 50:
                    int i10 = zzwj.zza;
                    zzxc.zzs(obj, j, zzvr.zza(zzxc.zzf(obj, j), zzxc.zzf(obj2, j)));
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
                        zzxc.zzs(obj, j, zzxc.zzf(obj2, j));
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
                        zzxc.zzs(obj, j, zzxc.zzf(obj2, j));
                        zzE(obj, i6, i);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzwj.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zzwj.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final void zzh(Object obj, byte[] bArr, int i, int i4, zztj zztjVar) throws IOException {
        zzc(obj, bArr, i, i4, 0, zztjVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0238  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r21, com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz.zzi(java.lang.Object, com.google.android.gms.internal.mlkit_vision_face_bundled.zzxi):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzI;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzxc.zza(obj, j)) != Double.doubleToLongBits(zzxc.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzxc.zzb(obj, j)) != Float.floatToIntBits(zzxc.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzxc.zzd(obj, j) != zzxc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzxc.zzd(obj, j) != zzxc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzxc.zzc(obj, j) != zzxc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzxc.zzd(obj, j) != zzxc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzxc.zzc(obj, j) != zzxc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzxc.zzw(obj, j) != zzxc.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zzwj.zzI(zzxc.zzf(obj, j), zzxc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zzwj.zzI(zzxc.zzf(obj, j), zzxc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zzwj.zzI(zzxc.zzf(obj, j), zzxc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzxc.zzc(obj, j) != zzxc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzxc.zzc(obj, j) != zzxc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzxc.zzc(obj, j) != zzxc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzxc.zzd(obj, j) != zzxc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzxc.zzc(obj, j) != zzxc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzxc.zzd(obj, j) != zzxc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zzwj.zzI(zzxc.zzf(obj, j), zzxc.zzf(obj2, j))) {
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
                    zZzI = zzwj.zzI(zzxc.zzf(obj, j), zzxc.zzf(obj2, j));
                    break;
                case 50:
                    zZzI = zzwj.zzI(zzxc.zzf(obj, j), zzxc.zzf(obj2, j));
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
                    if (zzxc.zzc(obj, jZzp) != zzxc.zzc(obj2, jZzp) || !zzwj.zzI(zzxc.zzf(obj, j), zzxc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzI) {
                return false;
            }
        }
        if (!((zzuw) obj).zzc.equals(((zzuw) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzus) obj).zzb.equals(((zzus) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz.zzk(java.lang.Object):boolean");
    }
}
