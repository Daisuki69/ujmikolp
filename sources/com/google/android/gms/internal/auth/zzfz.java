package com.google.android.gms.internal.auth;

import We.s;
import androidx.media3.common.C;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i, int i4, zzfw zzfwVar, boolean z4, boolean z5, int[] iArr2, int i6, int i10, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i4;
        this.zzh = z4;
        this.zzi = iArr2;
        this.zzj = i6;
        this.zzk = i10;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
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

    private final void zzB(Object obj, Object obj2, int i) {
        long jZzv = zzv(i) & 1048575;
        if (zzG(obj2, i)) {
            Object objZzf = zzhi.zzf(obj, jZzv);
            Object objZzf2 = zzhi.zzf(obj2, jZzv);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, jZzv, zzez.zzg(objZzf, objZzf2));
                zzD(obj, i);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, jZzv, objZzf2);
                zzD(obj, i);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int iZzv = zzv(i);
        int i4 = this.zzc[i];
        long j = iZzv & 1048575;
        if (zzJ(obj2, i4, i)) {
            Object objZzf = zzJ(obj, i4, i) ? zzhi.zzf(obj, j) : null;
            Object objZzf2 = zzhi.zzf(obj2, j);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, j, zzez.zzg(objZzf, objZzf2));
                zzE(obj, i4, i);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, j, objZzf2);
                zzE(obj, i4, i);
            }
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzs = zzs(i);
        long j = 1048575 & iZzs;
        if (j == 1048575) {
            return;
        }
        zzhi.zzn(obj, j, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i4) {
        zzhi.zzn(obj, zzs(i4) & 1048575, i);
    }

    private final boolean zzF(Object obj, Object obj2, int i) {
        return zzG(obj, i) == zzG(obj2, i);
    }

    private final boolean zzG(Object obj, int i) {
        int iZzs = zzs(i);
        long j = iZzs & 1048575;
        if (j != 1048575) {
            return (zzhi.zzc(obj, j) & (1 << (iZzs >>> 20))) != 0;
        }
        int iZzv = zzv(i);
        long j6 = iZzv & 1048575;
        switch (zzu(iZzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j6)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j6)) != 0;
            case 2:
                return zzhi.zzd(obj, j6) != 0;
            case 3:
                return zzhi.zzd(obj, j6) != 0;
            case 4:
                return zzhi.zzc(obj, j6) != 0;
            case 5:
                return zzhi.zzd(obj, j6) != 0;
            case 6:
                return zzhi.zzc(obj, j6) != 0;
            case 7:
                return zzhi.zzt(obj, j6);
            case 8:
                Object objZzf = zzhi.zzf(obj, j6);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzee) {
                    return !zzee.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j6) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j6));
            case 11:
                return zzhi.zzc(obj, j6) != 0;
            case 12:
                return zzhi.zzc(obj, j6) != 0;
            case 13:
                return zzhi.zzc(obj, j6) != 0;
            case 14:
                return zzhi.zzd(obj, j6) != 0;
            case 15:
                return zzhi.zzc(obj, j6) != 0;
            case 16:
                return zzhi.zzd(obj, j6) != 0;
            case 17:
                return zzhi.zzf(obj, j6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i, int i4, int i6, int i10) {
        return i4 == 1048575 ? zzG(obj, i) : (i6 & i10) != 0;
    }

    private static boolean zzI(Object obj, int i, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i & 1048575));
    }

    private final boolean zzJ(Object obj, int i, int i4) {
        return zzhi.zzc(obj, (long) (zzs(i4) & 1048575)) == i;
    }

    public static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzgzVarZzc = zzgz.zzc();
        zzeuVar.zzc = zzgzVarZzc;
        return zzgzVarZzc;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.auth.zzfz zzk(com.google.android.gms.internal.auth.zzgg r33, com.google.android.gms.internal.auth.zzgb r34, com.google.android.gms.internal.auth.zzfk r35, com.google.android.gms.internal.auth.zzgy r36, com.google.android.gms.internal.auth.zzel r37, com.google.android.gms.internal.auth.zzfr r38) {
        /*
            Method dump skipped, instruction units count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzk(com.google.android.gms.internal.auth.zzgg, com.google.android.gms.internal.auth.zzgb, com.google.android.gms.internal.auth.zzfk, com.google.android.gms.internal.auth.zzgy, com.google.android.gms.internal.auth.zzel, com.google.android.gms.internal.auth.zzfr):com.google.android.gms.internal.auth.zzfz");
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzhi.zzf(obj, j)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i, int i4, int i6, long j, zzds zzdsVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzz = zzz(i6);
        Object object = unsafe.getObject(obj, j);
        if (!((zzfq) object).zze()) {
            zzfq zzfqVarZzb = zzfq.zza().zzb();
            zzfr.zza(zzfqVarZzb, object);
            unsafe.putObject(obj, j, zzfqVarZzb);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i, int i4, int i6, int i10, int i11, int i12, int i13, long j, int i14, zzds zzdsVar) throws IOException {
        Object object;
        Unsafe unsafe = zzb;
        long j6 = this.zzc[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i))));
                unsafe.putInt(obj, j6, i10);
                return i + 8;
            case 52:
                if (i11 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i))));
                unsafe.putInt(obj, j6, i10);
                return i + 4;
            case 53:
            case 54:
                if (i11 != 0) {
                    return i;
                }
                int iZzm = zzdt.zzm(bArr, i, zzdsVar);
                unsafe.putObject(obj, j, Long.valueOf(zzdsVar.zzb));
                unsafe.putInt(obj, j6, i10);
                return iZzm;
            case 55:
            case 62:
                if (i11 != 0) {
                    return i;
                }
                int iZzj = zzdt.zzj(bArr, i, zzdsVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzdsVar.zza));
                unsafe.putInt(obj, j6, i10);
                return iZzj;
            case 56:
            case 65:
                if (i11 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzdt.zzn(bArr, i)));
                unsafe.putInt(obj, j6, i10);
                return i + 8;
            case 57:
            case 64:
                if (i11 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzdt.zzb(bArr, i)));
                unsafe.putInt(obj, j6, i10);
                return i + 4;
            case 58:
                if (i11 != 0) {
                    return i;
                }
                int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzdsVar.zzb != 0));
                unsafe.putInt(obj, j6, i10);
                return iZzm2;
            case 59:
                if (i11 != 2) {
                    return i;
                }
                int iZzj2 = zzdt.zzj(bArr, i, zzdsVar);
                int i15 = zzdsVar.zza;
                if (i15 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i12 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 && !zzhm.zzd(bArr, iZzj2, iZzj2 + i15)) {
                        throw zzfa.zzb();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i15, zzez.zzb));
                    iZzj2 += i15;
                }
                unsafe.putInt(obj, j6, i10);
                return iZzj2;
            case 60:
                if (i11 != 2) {
                    return i;
                }
                int iZzd = zzdt.zzd(zzy(i14), bArr, i, i4, zzdsVar);
                object = unsafe.getInt(obj, j6) == i10 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, zzdsVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                }
                unsafe.putInt(obj, j6, i10);
                return iZzd;
            case 61:
                if (i11 != 2) {
                    return i;
                }
                int iZza = zzdt.zza(bArr, i, zzdsVar);
                unsafe.putObject(obj, j, zzdsVar.zzc);
                unsafe.putInt(obj, j6, i10);
                return iZza;
            case 63:
                if (i11 != 0) {
                    return i;
                }
                int iZzj3 = zzdt.zzj(bArr, i, zzdsVar);
                int i16 = zzdsVar.zza;
                zzex zzexVarZzx = zzx(i14);
                if (zzexVarZzx != null && !zzexVarZzx.zza()) {
                    zzc(obj).zzf(i6, Long.valueOf(i16));
                    return iZzj3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i16));
                unsafe.putInt(obj, j6, i10);
                return iZzj3;
            case 66:
                if (i11 != 0) {
                    return i;
                }
                int iZzj4 = zzdt.zzj(bArr, i, zzdsVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                unsafe.putInt(obj, j6, i10);
                return iZzj4;
            case 67:
                if (i11 != 0) {
                    return i;
                }
                int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
                unsafe.putObject(obj, j, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                unsafe.putInt(obj, j6, i10);
                return iZzm3;
            case 68:
                if (i11 == 3) {
                    int iZzc = zzdt.zzc(zzy(i14), bArr, i, i4, (i6 & (-8)) | 4, zzdsVar);
                    object = unsafe.getInt(obj, j6) == i10 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j6, i10);
                    return iZzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
    private final int zzo(Object obj, byte[] bArr, int i, int i4, zzds zzdsVar) throws IOException {
        Unsafe unsafe;
        int i6;
        int i10;
        int i11;
        int i12;
        Object obj2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zzfz<T> zzfzVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i19 = i4;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i20 = -1;
        int iZzm = i;
        int i21 = -1;
        int i22 = 0;
        int i23 = 0;
        int i24 = 1048575;
        while (iZzm < i19) {
            int iZzk = iZzm + 1;
            int i25 = bArr2[iZzm];
            if (i25 < 0) {
                iZzk = zzdt.zzk(i25, bArr2, iZzk, zzdsVar2);
                i25 = zzdsVar2.zza;
            }
            int i26 = iZzk;
            int i27 = i25 >>> 3;
            int i28 = i25 & 7;
            int iZzr = i27 > i21 ? zzfzVar.zzr(i27, i22 / 3) : zzfzVar.zzq(i27);
            if (iZzr == i20) {
                unsafe = unsafe2;
                i6 = i25;
                i10 = i20;
                i11 = i27;
                i12 = 0;
                obj2 = obj3;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i29 = iArr[iZzr + 1];
                int iZzu = zzu(i29);
                int i30 = i25;
                int i31 = iZzr;
                long j = i29 & 1048575;
                if (iZzu <= 17) {
                    int i32 = iArr[i31 + 2];
                    int i33 = 1 << (i32 >>> 20);
                    int i34 = i32 & 1048575;
                    if (i34 != i24) {
                        int i35 = 1048575;
                        if (i24 != 1048575) {
                            unsafe2.putInt(obj3, i24, i23);
                            i35 = 1048575;
                        }
                        if (i34 != i35) {
                            i23 = unsafe2.getInt(obj3, i34);
                        }
                        i24 = i34;
                    }
                    switch (iZzu) {
                        case 0:
                            i18 = i31;
                            if (i28 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                zzhi.zzl(obj3, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i26)));
                                iZzm = i26 + 8;
                                i23 |= i33;
                                i19 = i4;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                            }
                            break;
                        case 1:
                            i18 = i31;
                            if (i28 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                zzhi.zzm(obj3, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i26)));
                                iZzm = i26 + 4;
                                i23 |= i33;
                                i19 = i4;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i18 = i31;
                            if (i28 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                int iZzm2 = zzdt.zzm(bArr2, i26, zzdsVar2);
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                unsafe3.putLong(obj4, j, zzdsVar2.zzb);
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i23 |= i33;
                                iZzm = iZzm2;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                                i19 = i4;
                            }
                            break;
                        case 4:
                        case 11:
                            i18 = i31;
                            if (i28 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                int iZzj = zzdt.zzj(bArr2, i26, zzdsVar2);
                                unsafe2.putInt(obj3, j, zzdsVar2.zza);
                                i23 |= i33;
                                i19 = i4;
                                iZzm = iZzj;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i18 = i31;
                            if (i28 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj5 = obj3;
                                unsafe4.putLong(obj5, j, zzdt.zzn(bArr2, i26));
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                iZzm = i26 + 8;
                                i23 |= i33;
                                i19 = i4;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i18 = i31;
                            if (i28 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                unsafe2.putInt(obj3, j, zzdt.zzb(bArr2, i26));
                                iZzm = i26 + 4;
                                i23 |= i33;
                                i19 = i4;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                            }
                            break;
                        case 7:
                            i18 = i31;
                            if (i28 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzm(bArr2, i26, zzdsVar2);
                                zzhi.zzk(obj3, j, zzdsVar2.zzb != 0);
                                i23 |= i33;
                                i19 = i4;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                            }
                            break;
                        case 8:
                            i18 = i31;
                            if (i28 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                iZzm = (536870912 & i29) == 0 ? zzdt.zzg(bArr2, i26, zzdsVar2) : zzdt.zzh(bArr2, i26, zzdsVar2);
                                unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                i23 |= i33;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                            }
                            break;
                        case 9:
                            i18 = i31;
                            if (i28 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzd(zzfzVar.zzy(i18), bArr2, i26, i19, zzdsVar2);
                                Object object = unsafe2.getObject(obj3, j);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj3, j, zzez.zzg(object, zzdsVar2.zzc));
                                }
                                i23 |= i33;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                            }
                            break;
                        case 10:
                            i18 = i31;
                            if (i28 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zza(bArr2, i26, zzdsVar2);
                                unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                i23 |= i33;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                            }
                            break;
                        case 12:
                            i18 = i31;
                            if (i28 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzj(bArr2, i26, zzdsVar2);
                                unsafe2.putInt(obj3, j, zzdsVar2.zza);
                                i23 |= i33;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                            }
                            break;
                        case 15:
                            i18 = i31;
                            if (i28 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzj(bArr2, i26, zzdsVar2);
                                unsafe2.putInt(obj3, j, zzei.zzb(zzdsVar2.zza));
                                i23 |= i33;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                            }
                            break;
                        case 16:
                            if (i28 != 0) {
                                i18 = i31;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i11 = i27;
                                i12 = i18;
                                i10 = -1;
                                i6 = i30 == true ? 1 : 0;
                            } else {
                                int iZzm3 = zzdt.zzm(bArr2, i26, zzdsVar2);
                                Unsafe unsafe5 = unsafe2;
                                Object obj6 = obj3;
                                i18 = i31;
                                unsafe5.putLong(obj6, j, zzei.zzc(zzdsVar2.zzb));
                                unsafe2 = unsafe5;
                                obj3 = obj6;
                                i23 |= i33;
                                iZzm = iZzm3;
                                i21 = i27;
                                i22 = i18;
                                i20 = -1;
                            }
                            break;
                        default:
                            i18 = i31;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i11 = i27;
                            i12 = i18;
                            i10 = -1;
                            i6 = i30 == true ? 1 : 0;
                            break;
                    }
                } else {
                    i12 = i31;
                    if (iZzu != 27) {
                        i13 = i26;
                        Unsafe unsafe6 = unsafe2;
                        if (iZzu <= 49) {
                            i14 = i23;
                            unsafe = unsafe6;
                            i10 = -1;
                            i16 = i24;
                            int iZzp = zzfzVar.zzp(obj, bArr, i13, i4, i30 == true ? 1 : 0, i27, i28, i12, i29, iZzu, j, zzdsVar);
                            i15 = i30 == true ? 1 : 0;
                            i17 = i27;
                            if (iZzp != i13) {
                                zzfzVar = this;
                                obj3 = obj;
                                zzdsVar2 = zzdsVar;
                                iZzm = iZzp;
                                i22 = i12;
                                i21 = i17;
                                i24 = i16;
                                i20 = i10;
                                i23 = i14;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i19 = i4;
                            } else {
                                obj2 = obj;
                                i26 = iZzp;
                                i11 = i17;
                                i6 = i15;
                            }
                        } else {
                            i14 = i23;
                            unsafe = unsafe6;
                            i10 = -1;
                            i15 = i30 == true ? 1 : 0;
                            i16 = i24;
                            i17 = i27;
                            if (iZzu != 50) {
                                i11 = i17;
                                int iZzn = zzn(obj, bArr, i13, i4, i15 == true ? 1 : 0, i11, i28, i29, iZzu, j, i12, zzdsVar);
                                obj2 = obj;
                                i6 = i15 == true ? 1 : 0;
                                i12 = i12;
                                if (iZzn != i13) {
                                    zzfzVar = this;
                                    zzdsVar2 = zzdsVar;
                                    i21 = i11;
                                    iZzm = iZzn;
                                    i22 = i12;
                                    obj3 = obj2;
                                    i24 = i16;
                                    i20 = i10;
                                    i23 = i14;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i19 = i4;
                                } else {
                                    i26 = iZzn;
                                }
                            } else if (i28 == 2) {
                                int iZzm4 = zzm(obj, bArr, i13, i4, i12, j, zzdsVar);
                                i12 = i12;
                                if (iZzm4 != i13) {
                                    zzfzVar = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    zzdsVar2 = zzdsVar;
                                    iZzm = iZzm4;
                                    i22 = i12;
                                    i21 = i17;
                                    i24 = i16;
                                    i20 = -1;
                                    i23 = i14;
                                    unsafe2 = unsafe;
                                    i19 = i4;
                                } else {
                                    obj2 = obj;
                                    i26 = iZzm4;
                                    i11 = i17;
                                    i6 = i15;
                                }
                            } else {
                                i12 = i12;
                                obj2 = obj;
                                i26 = i13;
                                i11 = i17;
                                i6 = i15;
                            }
                        }
                    } else if (i28 == 2) {
                        zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj3, j);
                        if (!zzeyVarZzd.zzc()) {
                            int size = zzeyVarZzd.size();
                            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j, zzeyVarZzd);
                        }
                        int iZze = zzdt.zze(zzfzVar.zzy(i12), i30 == true ? 1 : 0, bArr2, i26, i4, zzeyVarZzd, zzdsVar2);
                        bArr2 = bArr;
                        zzdsVar2 = zzdsVar;
                        iZzm = iZze;
                        i22 = i12;
                        unsafe2 = unsafe2;
                        i21 = i27;
                        i20 = -1;
                        obj3 = obj;
                        i19 = i4;
                    } else {
                        i13 = i26;
                        i16 = i24;
                        i14 = i23;
                        unsafe = unsafe2;
                        i17 = i27;
                        i10 = -1;
                        i15 = i30 == true ? 1 : 0;
                        obj2 = obj;
                        i26 = i13;
                        i11 = i17;
                        i6 = i15;
                    }
                    i24 = i16;
                    i23 = i14;
                }
            }
            int iZzi = zzdt.zzi(i6 == true ? 1 : 0, bArr, i26, i4, zzc(obj2), zzdsVar);
            bArr2 = bArr;
            zzdsVar2 = zzdsVar;
            i21 = i11;
            i22 = i12;
            obj3 = obj2;
            i20 = i10;
            unsafe2 = unsafe;
            i19 = i4;
            iZzm = iZzi;
            zzfzVar = this;
        }
        Object obj7 = obj3;
        Unsafe unsafe7 = unsafe2;
        int i36 = i19;
        int i37 = i24;
        int i38 = i23;
        if (i37 != 1048575) {
            unsafe7.putInt(obj7, i37, i38);
        }
        if (iZzm == i36) {
            return iZzm;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i, int i4, int i6, int i10, int i11, int i12, long j, int i13, long j6, zzds zzdsVar) throws IOException {
        int iZzl;
        Unsafe unsafe = zzb;
        zzey zzeyVarZzd = (zzey) unsafe.getObject(obj, j6);
        if (!zzeyVarZzd.zzc()) {
            int size = zzeyVarZzd.size();
            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j6, zzeyVarZzd);
        }
        zzey zzeyVar = zzeyVarZzd;
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    zzej zzejVar = (zzej) zzeyVar;
                    int iZzj = zzdt.zzj(bArr, i, zzdsVar);
                    int i14 = zzdsVar.zza + iZzj;
                    while (iZzj < i14) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj)));
                        iZzj += 8;
                    }
                    if (iZzj == i14) {
                        return iZzj;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVar;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i)));
                    int i15 = i + 8;
                    while (i15 < i4) {
                        int iZzj2 = zzdt.zzj(bArr, i15, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return i15;
                        }
                        zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj2)));
                        i15 = iZzj2 + 8;
                    }
                    return i15;
                }
                return i;
            case 19:
            case 36:
                if (i11 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVar;
                    int iZzj3 = zzdt.zzj(bArr, i, zzdsVar);
                    int i16 = zzdsVar.zza + iZzj3;
                    while (iZzj3 < i16) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i16) {
                        return iZzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVar;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i)));
                    int i17 = i + 4;
                    while (i17 < i4) {
                        int iZzj4 = zzdt.zzj(bArr, i17, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return i17;
                        }
                        zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj4)));
                        i17 = iZzj4 + 4;
                    }
                    return i17;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVar;
                    int iZzj5 = zzdt.zzj(bArr, i, zzdsVar);
                    int i18 = zzdsVar.zza + iZzj5;
                    while (iZzj5 < i18) {
                        iZzj5 = zzdt.zzm(bArr, iZzj5, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (iZzj5 == i18) {
                        return iZzj5;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVar;
                    int iZzm = zzdt.zzm(bArr, i, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (iZzm < i4) {
                        int iZzj6 = zzdt.zzj(bArr, iZzm, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzdt.zzm(bArr, iZzj6, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return iZzm;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return zzdt.zzf(bArr, i, zzeyVar, zzdsVar);
                }
                if (i11 == 0) {
                    return zzdt.zzl(i6, bArr, i, i4, zzeyVar, zzdsVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVar;
                    int iZzj7 = zzdt.zzj(bArr, i, zzdsVar);
                    int i19 = zzdsVar.zza + iZzj7;
                    while (iZzj7 < i19) {
                        zzflVar3.zze(zzdt.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i19) {
                        return iZzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVar;
                    zzflVar4.zze(zzdt.zzn(bArr, i));
                    int i20 = i + 8;
                    while (i20 < i4) {
                        int iZzj8 = zzdt.zzj(bArr, i20, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return i20;
                        }
                        zzflVar4.zze(zzdt.zzn(bArr, iZzj8));
                        i20 = iZzj8 + 8;
                    }
                    return i20;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    zzev zzevVar = (zzev) zzeyVar;
                    int iZzj9 = zzdt.zzj(bArr, i, zzdsVar);
                    int i21 = zzdsVar.zza + iZzj9;
                    while (iZzj9 < i21) {
                        zzevVar.zze(zzdt.zzb(bArr, iZzj9));
                        iZzj9 += 4;
                    }
                    if (iZzj9 == i21) {
                        return iZzj9;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVar;
                    zzevVar2.zze(zzdt.zzb(bArr, i));
                    int i22 = i + 4;
                    while (i22 < i4) {
                        int iZzj10 = zzdt.zzj(bArr, i22, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return i22;
                        }
                        zzevVar2.zze(zzdt.zzb(bArr, iZzj10));
                        i22 = iZzj10 + 4;
                    }
                    return i22;
                }
                return i;
            case 25:
            case 42:
                if (i11 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVar;
                    int iZzj11 = zzdt.zzj(bArr, i, zzdsVar);
                    int i23 = zzdsVar.zza + iZzj11;
                    while (iZzj11 < i23) {
                        iZzj11 = zzdt.zzm(bArr, iZzj11, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (iZzj11 == i23) {
                        return iZzj11;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVar;
                    int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (iZzm2 < i4) {
                        int iZzj12 = zzdt.zzj(bArr, iZzm2, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzdt.zzm(bArr, iZzj12, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return i;
            case 26:
                if (i11 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZzj13 = zzdt.zzj(bArr, i, zzdsVar);
                        int i24 = zzdsVar.zza;
                        if (i24 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i24 == 0) {
                            zzeyVar.add("");
                        } else {
                            zzeyVar.add(new String(bArr, iZzj13, i24, zzez.zzb));
                            iZzj13 += i24;
                        }
                        while (iZzj13 < i4) {
                            int iZzj14 = zzdt.zzj(bArr, iZzj13, zzdsVar);
                            if (i6 != zzdsVar.zza) {
                                return iZzj13;
                            }
                            iZzj13 = zzdt.zzj(bArr, iZzj14, zzdsVar);
                            int i25 = zzdsVar.zza;
                            if (i25 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i25 == 0) {
                                zzeyVar.add("");
                            } else {
                                zzeyVar.add(new String(bArr, iZzj13, i25, zzez.zzb));
                                iZzj13 += i25;
                            }
                        }
                        return iZzj13;
                    }
                    int iZzj15 = zzdt.zzj(bArr, i, zzdsVar);
                    int i26 = zzdsVar.zza;
                    if (i26 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i26 == 0) {
                        zzeyVar.add("");
                    } else {
                        int i27 = iZzj15 + i26;
                        if (!zzhm.zzd(bArr, iZzj15, i27)) {
                            throw zzfa.zzb();
                        }
                        zzeyVar.add(new String(bArr, iZzj15, i26, zzez.zzb));
                        iZzj15 = i27;
                    }
                    while (iZzj15 < i4) {
                        int iZzj16 = zzdt.zzj(bArr, iZzj15, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzdt.zzj(bArr, iZzj16, zzdsVar);
                        int i28 = zzdsVar.zza;
                        if (i28 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i28 == 0) {
                            zzeyVar.add("");
                        } else {
                            int i29 = iZzj15 + i28;
                            if (!zzhm.zzd(bArr, iZzj15, i29)) {
                                throw zzfa.zzb();
                            }
                            zzeyVar.add(new String(bArr, iZzj15, i28, zzez.zzb));
                            iZzj15 = i29;
                        }
                    }
                    return iZzj15;
                }
                return i;
            case 27:
                if (i11 == 2) {
                    return zzdt.zze(zzy(i12), i6, bArr, i, i4, zzeyVar, zzdsVar);
                }
                return i;
            case 28:
                if (i11 == 2) {
                    int iZzj17 = zzdt.zzj(bArr, i, zzdsVar);
                    int i30 = zzdsVar.zza;
                    if (i30 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i30 > bArr.length - iZzj17) {
                        throw zzfa.zzf();
                    }
                    if (i30 == 0) {
                        zzeyVar.add(zzee.zzb);
                    } else {
                        zzeyVar.add(zzee.zzk(bArr, iZzj17, i30));
                        iZzj17 += i30;
                    }
                    while (iZzj17 < i4) {
                        int iZzj18 = zzdt.zzj(bArr, iZzj17, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzdt.zzj(bArr, iZzj18, zzdsVar);
                        int i31 = zzdsVar.zza;
                        if (i31 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i31 > bArr.length - iZzj17) {
                            throw zzfa.zzf();
                        }
                        if (i31 == 0) {
                            zzeyVar.add(zzee.zzb);
                        } else {
                            zzeyVar.add(zzee.zzk(bArr, iZzj17, i31));
                            iZzj17 += i31;
                        }
                    }
                    return iZzj17;
                }
                return i;
            case 30:
            case 44:
                if (i11 != 2) {
                    if (i11 == 0) {
                        iZzl = zzdt.zzl(i6, bArr, i, i4, zzeyVar, zzdsVar);
                    }
                    return i;
                }
                iZzl = zzdt.zzf(bArr, i, zzeyVar, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object objZzd = zzgj.zzd(i10, zzeyVar, zzx(i12), zzgzVar, this.zzm);
                if (objZzd == null) {
                    return iZzl;
                }
                zzeuVar.zzc = (zzgz) objZzd;
                return iZzl;
            case 33:
            case 47:
                if (i11 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVar;
                    int iZzj19 = zzdt.zzj(bArr, i, zzdsVar);
                    int i32 = zzdsVar.zza + iZzj19;
                    while (iZzj19 < i32) {
                        iZzj19 = zzdt.zzj(bArr, iZzj19, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (iZzj19 == i32) {
                        return iZzj19;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVar;
                    int iZzj20 = zzdt.zzj(bArr, i, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (iZzj20 < i4) {
                        int iZzj21 = zzdt.zzj(bArr, iZzj20, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzj20;
                        }
                        iZzj20 = zzdt.zzj(bArr, iZzj21, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return iZzj20;
                }
                return i;
            case 34:
            case 48:
                if (i11 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVar;
                    int iZzj22 = zzdt.zzj(bArr, i, zzdsVar);
                    int i33 = zzdsVar.zza + iZzj22;
                    while (iZzj22 < i33) {
                        iZzj22 = zzdt.zzm(bArr, iZzj22, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (iZzj22 == i33) {
                        return iZzj22;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVar;
                    int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (iZzm3 < i4) {
                        int iZzj23 = zzdt.zzj(bArr, iZzm3, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzdt.zzm(bArr, iZzj23, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return iZzm3;
                }
                return i;
            default:
                if (i11 == 3) {
                    zzgh zzghVarZzy = zzy(i12);
                    int i34 = (i6 & (-8)) | 4;
                    int iZzc = zzdt.zzc(zzghVarZzy, bArr, i, i4, i34, zzdsVar);
                    zzgh zzghVar = zzghVarZzy;
                    zzds zzdsVar2 = zzdsVar;
                    zzeyVar.add(zzdsVar2.zzc);
                    while (iZzc < i4) {
                        int iZzj24 = zzdt.zzj(bArr, iZzc, zzdsVar2);
                        if (i6 != zzdsVar2.zza) {
                            return iZzc;
                        }
                        zzgh zzghVar2 = zzghVar;
                        zzds zzdsVar3 = zzdsVar2;
                        iZzc = zzdt.zzc(zzghVar2, bArr, iZzj24, i4, i34, zzdsVar3);
                        zzeyVar.add(zzdsVar3.zzc);
                        zzghVar = zzghVar2;
                        zzdsVar2 = zzdsVar3;
                    }
                    return iZzc;
                }
                return i;
        }
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, 0);
    }

    private final int zzr(int i, int i4) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, i4);
    }

    private final int zzs(int i) {
        return this.zzc[i + 2];
    }

    private final int zzt(int i, int i4) {
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

    private static int zzu(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzv(int i) {
        return this.zzc[i + 1];
    }

    private static long zzw(Object obj, long j) {
        return ((Long) zzhi.zzf(obj, j)).longValue();
    }

    private final zzex zzx(int i) {
        int i4 = i / 3;
        return (zzex) this.zzd[i4 + i4 + 1];
    }

    private final zzgh zzy(int i) {
        int i4 = i / 3;
        int i6 = i4 + i4;
        zzgh zzghVar = (zzgh) this.zzd[i6];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i6 + 1]);
        this.zzd[i6] = zzghVarZzb;
        return zzghVarZzb;
    }

    private final Object zzz(int i) {
        int i4 = i / 3;
        return this.zzd[i4 + i4];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i;
        int iZzc;
        int i4;
        int iZzc2;
        int length = this.zzc.length;
        int i6 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzv = zzv(i10);
            int i11 = this.zzc[i10];
            long j = 1048575 & iZzv;
            int iHashCode = 37;
            switch (zzu(iZzv)) {
                case 0:
                    i = i6 * 53;
                    iZzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j)));
                    i6 = iZzc + i;
                    break;
                case 1:
                    i = i6 * 53;
                    iZzc = Float.floatToIntBits(zzhi.zzb(obj, j));
                    i6 = iZzc + i;
                    break;
                case 2:
                    i = i6 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i6 = iZzc + i;
                    break;
                case 3:
                    i = i6 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i6 = iZzc + i;
                    break;
                case 4:
                    i4 = i6 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i6 = i4 + iZzc2;
                    break;
                case 5:
                    i = i6 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i6 = iZzc + i;
                    break;
                case 6:
                    i4 = i6 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i6 = i4 + iZzc2;
                    break;
                case 7:
                    i = i6 * 53;
                    iZzc = zzez.zza(zzhi.zzt(obj, j));
                    i6 = iZzc + i;
                    break;
                case 8:
                    i = i6 * 53;
                    iZzc = ((String) zzhi.zzf(obj, j)).hashCode();
                    i6 = iZzc + i;
                    break;
                case 9:
                    Object objZzf = zzhi.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i6 = (i6 * 53) + iHashCode;
                    break;
                case 10:
                    i = i6 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i6 = iZzc + i;
                    break;
                case 11:
                    i4 = i6 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i6 = i4 + iZzc2;
                    break;
                case 12:
                    i4 = i6 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i6 = i4 + iZzc2;
                    break;
                case 13:
                    i4 = i6 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i6 = i4 + iZzc2;
                    break;
                case 14:
                    i = i6 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i6 = iZzc + i;
                    break;
                case 15:
                    i4 = i6 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i6 = i4 + iZzc2;
                    break;
                case 16:
                    i = i6 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i6 = iZzc + i;
                    break;
                case 17:
                    Object objZzf2 = zzhi.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i6 = (i6 * 53) + iHashCode;
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
                    i = i6 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i6 = iZzc + i;
                    break;
                case 50:
                    i = i6 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i6 = iZzc + i;
                    break;
                case 51:
                    if (zzJ(obj, i11, i10)) {
                        i = i6 * 53;
                        iZzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j)).doubleValue()));
                        i6 = iZzc + i;
                    }
                    break;
                case 52:
                    if (zzJ(obj, i11, i10)) {
                        i = i6 * 53;
                        iZzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j)).floatValue());
                        i6 = iZzc + i;
                    }
                    break;
                case 53:
                    if (zzJ(obj, i11, i10)) {
                        i = i6 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i6 = iZzc + i;
                    }
                    break;
                case 54:
                    if (zzJ(obj, i11, i10)) {
                        i = i6 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i6 = iZzc + i;
                    }
                    break;
                case 55:
                    if (zzJ(obj, i11, i10)) {
                        i4 = i6 * 53;
                        iZzc2 = zzl(obj, j);
                        i6 = i4 + iZzc2;
                    }
                    break;
                case 56:
                    if (zzJ(obj, i11, i10)) {
                        i = i6 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i6 = iZzc + i;
                    }
                    break;
                case 57:
                    if (zzJ(obj, i11, i10)) {
                        i4 = i6 * 53;
                        iZzc2 = zzl(obj, j);
                        i6 = i4 + iZzc2;
                    }
                    break;
                case 58:
                    if (zzJ(obj, i11, i10)) {
                        i = i6 * 53;
                        iZzc = zzez.zza(((Boolean) zzhi.zzf(obj, j)).booleanValue());
                        i6 = iZzc + i;
                    }
                    break;
                case 59:
                    if (zzJ(obj, i11, i10)) {
                        i = i6 * 53;
                        iZzc = ((String) zzhi.zzf(obj, j)).hashCode();
                        i6 = iZzc + i;
                    }
                    break;
                case 60:
                    if (zzJ(obj, i11, i10)) {
                        i = i6 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i6 = iZzc + i;
                    }
                    break;
                case 61:
                    if (zzJ(obj, i11, i10)) {
                        i = i6 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i6 = iZzc + i;
                    }
                    break;
                case 62:
                    if (zzJ(obj, i11, i10)) {
                        i4 = i6 * 53;
                        iZzc2 = zzl(obj, j);
                        i6 = i4 + iZzc2;
                    }
                    break;
                case 63:
                    if (zzJ(obj, i11, i10)) {
                        i4 = i6 * 53;
                        iZzc2 = zzl(obj, j);
                        i6 = i4 + iZzc2;
                    }
                    break;
                case 64:
                    if (zzJ(obj, i11, i10)) {
                        i4 = i6 * 53;
                        iZzc2 = zzl(obj, j);
                        i6 = i4 + iZzc2;
                    }
                    break;
                case 65:
                    if (zzJ(obj, i11, i10)) {
                        i = i6 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i6 = iZzc + i;
                    }
                    break;
                case 66:
                    if (zzJ(obj, i11, i10)) {
                        i4 = i6 * 53;
                        iZzc2 = zzl(obj, j);
                        i6 = i4 + iZzc2;
                    }
                    break;
                case 67:
                    if (zzJ(obj, i11, i10)) {
                        i = i6 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i6 = iZzc + i;
                    }
                    break;
                case 68:
                    if (zzJ(obj, i11, i10)) {
                        i = i6 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i6 = iZzc + i;
                    }
                    break;
            }
        }
        return this.zzm.zza(obj).hashCode() + (i6 * 53);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0088. Please report as an issue. */
    public final int zzb(Object obj, byte[] bArr, int i, int i4, int i6, zzds zzdsVar) throws IOException {
        int i10;
        zzfz<T> zzfzVar;
        Unsafe unsafe;
        int i11;
        Object obj2;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr2;
        int i16;
        Unsafe unsafe2;
        int i17;
        zzds zzdsVar2;
        int iZzj;
        int i18;
        int i19;
        zzds zzdsVar3;
        int i20;
        Object obj3;
        Unsafe unsafe3;
        byte[] bArr3;
        zzds zzdsVar4;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        zzfz<T> zzfzVar2 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i26 = i4;
        zzds zzdsVar5 = zzdsVar;
        Unsafe unsafe4 = zzb;
        int i27 = -1;
        int i28 = i;
        int i29 = -1;
        int i30 = 0;
        int i31 = 0;
        int iZzr = 0;
        int i32 = 1048575;
        while (true) {
            if (i28 < i26) {
                int iZzk = i28 + 1;
                int i33 = bArr4[i28];
                if (i33 < 0) {
                    iZzk = zzdt.zzk(i33, bArr4, iZzk, zzdsVar5);
                    i33 = zzdsVar5.zza;
                }
                int i34 = i33;
                int i35 = iZzk;
                int i36 = (i34 == true ? 1 : 0) >>> 3;
                int i37 = (i34 == true ? 1 : 0) & 7;
                iZzr = i36 > i29 ? zzfzVar2.zzr(i36, iZzr / 3) : zzfzVar2.zzq(i36);
                if (iZzr == i27) {
                    i10 = i6;
                    zzfzVar = zzfzVar2;
                    i12 = i35;
                    i13 = i36;
                    unsafe = unsafe4;
                    i14 = i27;
                    i30 = i34 == true ? 1 : 0;
                    iZzr = 0;
                    i11 = 1048575;
                    obj2 = obj4;
                } else {
                    int[] iArr = zzfzVar2.zzc;
                    int i38 = iArr[iZzr + 1];
                    int iZzu = zzu(i38);
                    int i39 = i34 == true ? 1 : 0;
                    long j = i38 & 1048575;
                    if (iZzu <= 17) {
                        int i40 = iArr[iZzr + 2];
                        int i41 = 1 << (i40 >>> 20);
                        int i42 = i40 & 1048575;
                        if (i42 != i32) {
                            i15 = 1048575;
                            if (i32 != 1048575) {
                                unsafe4.putInt(obj4, i32, i31);
                            }
                            i32 = i42;
                            i31 = unsafe4.getInt(obj4, i42);
                        } else {
                            i15 = 1048575;
                        }
                        switch (iZzu) {
                            case 0:
                                bArr3 = bArr;
                                i16 = i15;
                                zzdsVar4 = zzdsVar;
                                obj3 = obj4;
                                unsafe3 = unsafe4;
                                i17 = i35;
                                i13 = i36;
                                if (i37 == 1) {
                                    zzhi.zzl(obj3, j, Double.longBitsToDouble(zzdt.zzn(bArr3, i17)));
                                    i28 = i17 + 8;
                                    i31 |= i41;
                                    i26 = i4;
                                    unsafe4 = unsafe3;
                                    bArr4 = bArr3;
                                    zzdsVar5 = zzdsVar4;
                                    obj4 = obj3;
                                    i30 = i39 == true ? 1 : 0;
                                    i29 = i13;
                                    i27 = -1;
                                } else {
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 1:
                                bArr3 = bArr;
                                i16 = i15;
                                zzdsVar4 = zzdsVar;
                                obj3 = obj4;
                                unsafe3 = unsafe4;
                                i17 = i35;
                                i13 = i36;
                                if (i37 == 5) {
                                    zzhi.zzm(obj3, j, Float.intBitsToFloat(zzdt.zzb(bArr3, i17)));
                                    i28 = i17 + 4;
                                    i31 |= i41;
                                    i26 = i4;
                                    unsafe4 = unsafe3;
                                    bArr4 = bArr3;
                                    zzdsVar5 = zzdsVar4;
                                    obj4 = obj3;
                                    i30 = i39 == true ? 1 : 0;
                                    i29 = i13;
                                    i27 = -1;
                                } else {
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i16 = i15;
                                unsafe2 = unsafe4;
                                i17 = i35;
                                i13 = i36;
                                zzdsVar4 = zzdsVar;
                                if (i37 == 0) {
                                    int iZzm = zzdt.zzm(bArr3, i17, zzdsVar4);
                                    unsafe2.putLong(obj, j, zzdsVar4.zzb);
                                    obj3 = obj;
                                    i31 |= i41;
                                    i26 = i4;
                                    unsafe4 = unsafe2;
                                    i28 = iZzm;
                                    bArr4 = bArr3;
                                    zzdsVar5 = zzdsVar4;
                                    obj4 = obj3;
                                    i30 = i39 == true ? 1 : 0;
                                    i29 = i13;
                                    i27 = -1;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i16 = i15;
                                unsafe2 = unsafe4;
                                i17 = i35;
                                i13 = i36;
                                zzdsVar2 = zzdsVar;
                                if (i37 == 0) {
                                    iZzj = zzdt.zzj(bArr2, i17, zzdsVar2);
                                    unsafe2.putInt(obj4, j, zzdsVar2.zza);
                                    i31 |= i41;
                                    i26 = i4;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i30 = i39;
                                    i29 = i13;
                                    i27 = -1;
                                    i28 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i16 = i15;
                                unsafe2 = unsafe4;
                                i13 = i36;
                                zzdsVar2 = zzdsVar;
                                if (i37 == 1) {
                                    Object obj5 = obj4;
                                    unsafe2.putLong(obj5, j, zzdt.zzn(bArr2, i35));
                                    unsafe2 = unsafe2;
                                    obj4 = obj5;
                                    iZzj = i35 + 8;
                                    i31 |= i41;
                                    i26 = i4;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i30 = i39;
                                    i29 = i13;
                                    i27 = -1;
                                    i28 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    i17 = i35;
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i16 = i15;
                                unsafe2 = unsafe4;
                                i18 = i35;
                                i13 = i36;
                                zzdsVar2 = zzdsVar;
                                if (i37 == 5) {
                                    unsafe2.putInt(obj4, j, zzdt.zzb(bArr2, i18));
                                    iZzj = i18 + 4;
                                    i31 |= i41;
                                    i26 = i4;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i30 = i39;
                                    i29 = i13;
                                    i27 = -1;
                                    i28 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i17 = i18;
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i16 = i15;
                                unsafe2 = unsafe4;
                                i18 = i35;
                                i13 = i36;
                                zzdsVar2 = zzdsVar;
                                if (i37 == 0) {
                                    iZzj = zzdt.zzm(bArr2, i18, zzdsVar2);
                                    i39 = i39 == true ? 1 : 0;
                                    zzhi.zzk(obj4, j, zzdsVar2.zzb != 0);
                                    i31 |= i41;
                                    i26 = i4;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i30 = i39;
                                    i29 = i13;
                                    i27 = -1;
                                    i28 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    i39 = i39 == true ? 1 : 0;
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i17 = i18;
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i16 = i15;
                                unsafe2 = unsafe4;
                                i19 = i39 == true ? 1 : 0;
                                i18 = i35;
                                i13 = i36;
                                zzdsVar3 = zzdsVar;
                                if (i37 == 2) {
                                    iZzj = (536870912 & i38) == 0 ? zzdt.zzg(bArr2, i18, zzdsVar3) : zzdt.zzh(bArr2, i18, zzdsVar3);
                                    unsafe2.putObject(obj4, j, zzdsVar3.zzc);
                                    i31 |= i41;
                                    i26 = i4;
                                    i30 = i19 == true ? 1 : 0;
                                    zzdsVar5 = zzdsVar3;
                                    i29 = i13;
                                    i27 = -1;
                                    unsafe4 = unsafe2;
                                    i28 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i39 = i19;
                                    i17 = i18;
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                i20 = i4;
                                i16 = i15;
                                unsafe2 = unsafe4;
                                i19 = i39 == true ? 1 : 0;
                                i18 = i35;
                                i13 = i36;
                                zzdsVar3 = zzdsVar;
                                if (i37 == 2) {
                                    iZzj = zzdt.zzd(zzfzVar2.zzy(iZzr), bArr2, i18, i20, zzdsVar3);
                                    if ((i31 & i41) == 0) {
                                        unsafe2.putObject(obj4, j, zzdsVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j, zzez.zzg(unsafe2.getObject(obj4, j), zzdsVar3.zzc));
                                    }
                                    i31 |= i41;
                                    i30 = i19;
                                    i26 = i20;
                                    zzdsVar5 = zzdsVar3;
                                    i29 = i13;
                                    i27 = -1;
                                    unsafe4 = unsafe2;
                                    i28 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i39 = i19;
                                    i17 = i18;
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 10:
                                bArr2 = bArr;
                                i20 = i4;
                                i16 = i15;
                                unsafe2 = unsafe4;
                                i19 = i39 == true ? 1 : 0;
                                i18 = i35;
                                i13 = i36;
                                zzdsVar3 = zzdsVar;
                                if (i37 == 2) {
                                    iZzj = zzdt.zza(bArr2, i18, zzdsVar3);
                                    unsafe2.putObject(obj4, j, zzdsVar3.zzc);
                                    i31 |= i41;
                                    i30 = i19;
                                    i26 = i20;
                                    zzdsVar5 = zzdsVar3;
                                    i29 = i13;
                                    i27 = -1;
                                    unsafe4 = unsafe2;
                                    i28 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i39 = i19;
                                    i17 = i18;
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 12:
                                bArr2 = bArr;
                                i20 = i4;
                                i16 = i15;
                                unsafe2 = unsafe4;
                                i18 = i35;
                                i13 = i36;
                                zzdsVar3 = zzdsVar;
                                if (i37 == 0) {
                                    iZzj = zzdt.zzj(bArr2, i18, zzdsVar3);
                                    int i43 = zzdsVar3.zza;
                                    zzex zzexVarZzx = zzfzVar2.zzx(iZzr);
                                    if (zzexVarZzx == null || zzexVarZzx.zza()) {
                                        i19 = i39 == true ? 1 : 0;
                                        unsafe2.putInt(obj4, j, i43);
                                        i31 |= i41;
                                        i30 = i19;
                                        i26 = i20;
                                        zzdsVar5 = zzdsVar3;
                                        i29 = i13;
                                        i27 = -1;
                                        unsafe4 = unsafe2;
                                        i28 = iZzj;
                                        bArr4 = bArr2;
                                    } else {
                                        zzgz zzgzVarZzc = zzc(obj4);
                                        Long lValueOf = Long.valueOf(i43);
                                        i19 = i39 == true ? 1 : 0;
                                        zzgzVarZzc.zzf(i19 == true ? 1 : 0, lValueOf);
                                        i30 = i19;
                                        i26 = i20;
                                        zzdsVar5 = zzdsVar3;
                                        i29 = i13;
                                        i27 = -1;
                                        unsafe4 = unsafe2;
                                        i28 = iZzj;
                                        bArr4 = bArr2;
                                    }
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i17 = i18;
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i16 = i15;
                                unsafe2 = unsafe4;
                                i18 = i35;
                                i13 = i36;
                                zzdsVar2 = zzdsVar;
                                if (i37 == 0) {
                                    iZzj = zzdt.zzj(bArr2, i18, zzdsVar2);
                                    unsafe2.putInt(obj4, j, zzei.zzb(zzdsVar2.zza));
                                    i31 |= i41;
                                    unsafe4 = unsafe2;
                                    i26 = i4;
                                    zzdsVar5 = zzdsVar2;
                                    i30 = i39;
                                    i29 = i13;
                                    i27 = -1;
                                    i28 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i17 = i18;
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            case 16:
                                i16 = i15;
                                i18 = i35;
                                i13 = i36;
                                if (i37 == 0) {
                                    int iZzm2 = zzdt.zzm(bArr, i18, zzdsVar);
                                    Object obj6 = obj4;
                                    Unsafe unsafe5 = unsafe4;
                                    unsafe5.putLong(obj6, j, zzei.zzc(zzdsVar.zzb));
                                    obj4 = obj6;
                                    i31 |= i41;
                                    unsafe4 = unsafe5;
                                    i28 = iZzm2;
                                    bArr4 = bArr;
                                    i26 = i4;
                                    zzdsVar5 = zzdsVar;
                                    i30 = i39 == true ? 1 : 0;
                                    i29 = i13;
                                    i27 = -1;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe4;
                                    i17 = i18;
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                            default:
                                if (i37 == 3) {
                                    i13 = i36;
                                    iZzj = zzdt.zzc(zzfzVar2.zzy(iZzr), bArr, i35, i4, (i36 << 3) | 4, zzdsVar);
                                    bArr2 = bArr;
                                    if ((i31 & i41) == 0) {
                                        unsafe4.putObject(obj4, j, zzdsVar.zzc);
                                    } else {
                                        unsafe4.putObject(obj4, j, zzez.zzg(unsafe4.getObject(obj4, j), zzdsVar.zzc));
                                    }
                                    i31 |= i41;
                                    zzdsVar5 = zzdsVar;
                                    i26 = i4;
                                    i30 = i39;
                                    i29 = i13;
                                    i27 = -1;
                                    i28 = iZzj;
                                    bArr4 = bArr2;
                                } else {
                                    i16 = i15;
                                    i18 = i35;
                                    i13 = i36;
                                    obj3 = obj4;
                                    unsafe3 = unsafe4;
                                    i17 = i18;
                                    i10 = i6;
                                    zzfzVar = zzfzVar2;
                                    i12 = i17;
                                    obj2 = obj3;
                                    i30 = i39;
                                    i11 = i16;
                                    i14 = -1;
                                    unsafe = unsafe3;
                                }
                                break;
                        }
                    } else {
                        obj3 = obj4;
                        Unsafe unsafe6 = unsafe4;
                        i13 = i36;
                        if (iZzu == 27) {
                            if (i37 == 2) {
                                zzey zzeyVarZzd = (zzey) unsafe6.getObject(obj3, j);
                                if (!zzeyVarZzd.zzc()) {
                                    int size = zzeyVarZzd.size();
                                    zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                                    unsafe6.putObject(obj3, j, zzeyVarZzd);
                                }
                                unsafe4 = unsafe6;
                                int iZze = zzdt.zze(zzfzVar2.zzy(iZzr), i39 == true ? 1 : 0, bArr, i35, i4, zzeyVarZzd, zzdsVar);
                                bArr4 = bArr;
                                i26 = i4;
                                zzdsVar5 = zzdsVar;
                                i28 = iZze;
                                obj4 = obj3;
                                i30 = i39 == true ? 1 : 0;
                                i29 = i13;
                                i27 = -1;
                            } else {
                                i21 = i35;
                                i22 = i32;
                                i23 = i31;
                                i24 = iZzr;
                                i25 = i39 == true ? 1 : 0;
                                i11 = 1048575;
                                i14 = -1;
                                unsafe = unsafe6;
                            }
                        } else if (iZzu <= 49) {
                            int i44 = i32;
                            i23 = i31;
                            i11 = 1048575;
                            i14 = -1;
                            unsafe = unsafe6;
                            int iZzp = zzfzVar2.zzp(obj3, bArr, i35, i4, i39 == true ? 1 : 0, i13, i37, iZzr, i38, iZzu, j, zzdsVar);
                            i24 = iZzr;
                            if (iZzp != i35) {
                                zzfzVar2 = this;
                                obj4 = obj;
                                bArr4 = bArr;
                                i32 = i44;
                                i26 = i4;
                                i28 = iZzp;
                                i30 = i39 == true ? 1 : 0;
                                iZzr = i24;
                                i31 = i23;
                                unsafe4 = unsafe;
                                i27 = i14;
                                i29 = i13;
                                zzdsVar5 = zzdsVar;
                            } else {
                                zzfzVar = this;
                                obj2 = obj;
                                i32 = i44;
                                i12 = iZzp;
                                i30 = i39 == true ? 1 : 0;
                                iZzr = i24;
                                i31 = i23;
                                i10 = i6;
                            }
                        } else {
                            i21 = i35;
                            i22 = i32;
                            i23 = i31;
                            i24 = iZzr;
                            i11 = 1048575;
                            i14 = -1;
                            i25 = i39 == true ? 1 : 0;
                            unsafe = unsafe6;
                            if (iZzu != 50) {
                                i30 = i25 == true ? 1 : 0;
                                int iZzn = zzn(obj, bArr, i21, i4, i30 == true ? 1 : 0, i13, i37, i38, iZzu, j, i24, zzdsVar);
                                obj2 = obj;
                                zzfzVar = this;
                                if (iZzn != i21) {
                                    bArr4 = bArr;
                                    i32 = i22;
                                    i26 = i4;
                                    zzfzVar2 = zzfzVar;
                                    i28 = iZzn;
                                    obj4 = obj2;
                                    iZzr = i24;
                                    i31 = i23;
                                    unsafe4 = unsafe;
                                    i27 = i14;
                                    i29 = i13;
                                    zzdsVar5 = zzdsVar;
                                } else {
                                    i32 = i22;
                                    i12 = iZzn;
                                    iZzr = i24;
                                    i31 = i23;
                                    i10 = i6;
                                }
                            } else if (i37 == 2) {
                                int iZzm3 = zzm(obj, bArr, i21, i4, i24, j, zzdsVar);
                                if (iZzm3 != i21) {
                                    zzfzVar2 = this;
                                    obj4 = obj;
                                    bArr4 = bArr;
                                    i32 = i22;
                                    i26 = i4;
                                    zzdsVar5 = zzdsVar;
                                    i28 = iZzm3;
                                    i30 = i25 == true ? 1 : 0;
                                    iZzr = i24;
                                    i31 = i23;
                                    unsafe4 = unsafe;
                                    i27 = -1;
                                    i29 = i13;
                                } else {
                                    obj2 = obj;
                                    i32 = i22;
                                    i10 = i6;
                                    i12 = iZzm3;
                                    i30 = i25 == true ? 1 : 0;
                                    iZzr = i24;
                                    i31 = i23;
                                    zzfzVar = this;
                                }
                            }
                        }
                        zzfzVar = this;
                        obj2 = obj;
                        i32 = i22;
                        i10 = i6;
                        i12 = i21;
                        i30 = i25;
                        iZzr = i24;
                        i31 = i23;
                    }
                }
                if (i30 != i10 || i10 == 0) {
                    int i45 = i30;
                    int iZzi = zzdt.zzi(i45 == true ? 1 : 0, bArr, i12, i4, zzc(obj2), zzdsVar);
                    i30 = i45 == true ? 1 : 0;
                    zzdsVar5 = zzdsVar;
                    i26 = i4;
                    zzfzVar2 = zzfzVar;
                    obj4 = obj2;
                    unsafe4 = unsafe;
                    i27 = i14;
                    i29 = i13;
                    i28 = iZzi;
                    bArr4 = bArr;
                } else {
                    i26 = i4;
                    i28 = i12;
                }
            } else {
                i10 = i6;
                zzfzVar = zzfzVar2;
                unsafe = unsafe4;
                i11 = 1048575;
                obj2 = obj4;
            }
        }
        if (i32 != i11) {
            unsafe.putInt(obj2, i32, i31);
        }
        for (int i46 = zzfzVar.zzj; i46 < zzfzVar.zzk; i46++) {
            int i47 = zzfzVar.zzi[i46];
            int i48 = zzfzVar.zzc[i47];
            Object objZzf = zzhi.zzf(obj2, zzfzVar.zzv(i47) & i11);
            if (objZzf != null && zzfzVar.zzx(i47) != null) {
                throw null;
            }
        }
        if (i10 == 0) {
            if (i28 != i26) {
                throw zzfa.zzd();
            }
        } else if (i28 > i26 || i30 != i10) {
            throw zzfa.zzd();
        }
        return i28;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i;
        int i4 = this.zzj;
        while (true) {
            i = this.zzk;
            if (i4 >= i) {
                break;
            }
            long jZzv = zzv(this.zzi[i4]) & 1048575;
            Object objZzf = zzhi.zzf(obj, jZzv);
            if (objZzf != null) {
                ((zzfq) objZzf).zzc();
                zzhi.zzp(obj, jZzv, objZzf);
            }
            i4++;
        }
        int length = this.zzi.length;
        while (i < length) {
            this.zzl.zza(obj, this.zzi[i]);
            i++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzv = zzv(i);
            long j = 1048575 & iZzv;
            int i4 = this.zzc[i];
            switch (zzu(iZzv)) {
                case 0:
                    if (zzG(obj2, i)) {
                        zzhi.zzl(obj, j, zzhi.zza(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 1:
                    if (zzG(obj2, i)) {
                        zzhi.zzm(obj, j, zzhi.zzb(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 2:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 3:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 4:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 5:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 6:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 7:
                    if (zzG(obj2, i)) {
                        zzhi.zzk(obj, j, zzhi.zzt(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 8:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 11:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 12:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 13:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 14:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 15:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 16:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
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
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j);
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
                    if (zzJ(obj2, i4, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i4, i);
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
                    if (zzJ(obj2, i4, i)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i4, i);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i, int i4, zzds zzdsVar) throws IOException {
        if (this.zzh) {
            zzo(obj, bArr, i, i4, zzdsVar);
        } else {
            zzb(obj, bArr, i, i4, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzh;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzv = zzv(i);
            long j = iZzv & 1048575;
            switch (zzu(iZzv)) {
                case 0:
                    if (!zzF(obj, obj2, i) || Double.doubleToLongBits(zzhi.zza(obj, j)) != Double.doubleToLongBits(zzhi.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzF(obj, obj2, i) || Float.floatToIntBits(zzhi.zzb(obj, j)) != Float.floatToIntBits(zzhi.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzF(obj, obj2, i) || zzhi.zzt(obj, j) != zzhi.zzt(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
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
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
                    break;
                case 50:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
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
                    long jZzs = zzs(i) & 1048575;
                    if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.auth.zzgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzi(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzi(java.lang.Object):boolean");
    }
}
