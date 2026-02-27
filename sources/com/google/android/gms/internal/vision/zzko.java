package com.google.android.gms.internal.vision;

import We.s;
import androidx.camera.video.AudioStats;
import androidx.media3.common.C;
import androidx.media3.datasource.cache.c;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzko<T> implements zzlc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzma.zzc();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzkk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzks zzo;
    private final zzju zzp;
    private final zzlu<?, ?> zzq;
    private final zziq<?> zzr;
    private final zzkh zzs;

    private zzko(int[] iArr, Object[] objArr, int i, int i4, zzkk zzkkVar, boolean z4, boolean z5, int[] iArr2, int i6, int i10, zzks zzksVar, zzju zzjuVar, zzlu<?, ?> zzluVar, zziq<?> zziqVar, zzkh zzkhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i4;
        this.zzi = zzkkVar instanceof zzjb;
        this.zzj = z4;
        this.zzh = zziqVar != null && zziqVar.zza(zzkkVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i6;
        this.zzn = i10;
        this.zzo = zzksVar;
        this.zzp = zzjuVar;
        this.zzq = zzluVar;
        this.zzr = zziqVar;
        this.zzg = zzkkVar;
        this.zzs = zzkhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.android.gms.internal.vision.zzko<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.vision.zzki r33, com.google.android.gms.internal.vision.zzks r34, com.google.android.gms.internal.vision.zzju r35, com.google.android.gms.internal.vision.zzlu<?, ?> r36, com.google.android.gms.internal.vision.zziq<?> r37, com.google.android.gms.internal.vision.zzkh r38) {
        /*
            Method dump skipped, instruction units count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Class, com.google.android.gms.internal.vision.zzki, com.google.android.gms.internal.vision.zzks, com.google.android.gms.internal.vision.zzju, com.google.android.gms.internal.vision.zzlu, com.google.android.gms.internal.vision.zziq, com.google.android.gms.internal.vision.zzkh):com.google.android.gms.internal.vision.zzko");
    }

    private final zzjg zzc(int i) {
        return (zzjg) this.zzd[((i / 3) << 1) + 1];
    }

    private static zzlx zze(Object obj) {
        zzjb zzjbVar = (zzjb) obj;
        zzlx zzlxVar = zzjbVar.zzb;
        if (zzlxVar != zzlx.zza()) {
            return zzlxVar;
        }
        zzlx zzlxVarZzb = zzlx.zzb();
        zzjbVar.zzb = zzlxVarZzb;
        return zzlxVarZzb;
    }

    private static boolean zzf(int i) {
        return (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0;
    }

    private final int zzg(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, 0);
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zzb(T t5, T t10) {
        t10.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzd = zzd(i);
            long j = 1048575 & iZzd;
            int i4 = this.zzc[i];
            switch ((iZzd & 267386880) >>> 20) {
                case 0:
                    if (zza((Object) t10, i)) {
                        zzma.zza(t5, j, zzma.zze(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 1:
                    if (zza((Object) t10, i)) {
                        zzma.zza((Object) t5, j, zzma.zzd(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 2:
                    if (zza((Object) t10, i)) {
                        zzma.zza((Object) t5, j, zzma.zzb(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 3:
                    if (zza((Object) t10, i)) {
                        zzma.zza((Object) t5, j, zzma.zzb(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 4:
                    if (zza((Object) t10, i)) {
                        zzma.zza((Object) t5, j, zzma.zza(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 5:
                    if (zza((Object) t10, i)) {
                        zzma.zza((Object) t5, j, zzma.zzb(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 6:
                    if (zza((Object) t10, i)) {
                        zzma.zza((Object) t5, j, zzma.zza(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 7:
                    if (zza((Object) t10, i)) {
                        zzma.zza(t5, j, zzma.zzc(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 8:
                    if (zza((Object) t10, i)) {
                        zzma.zza(t5, j, zzma.zzf(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 9:
                    zza(t5, t10, i);
                    break;
                case 10:
                    if (zza((Object) t10, i)) {
                        zzma.zza(t5, j, zzma.zzf(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 11:
                    if (zza((Object) t10, i)) {
                        zzma.zza((Object) t5, j, zzma.zza(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 12:
                    if (zza((Object) t10, i)) {
                        zzma.zza((Object) t5, j, zzma.zza(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 13:
                    if (zza((Object) t10, i)) {
                        zzma.zza((Object) t5, j, zzma.zza(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 14:
                    if (zza((Object) t10, i)) {
                        zzma.zza((Object) t5, j, zzma.zzb(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 15:
                    if (zza((Object) t10, i)) {
                        zzma.zza((Object) t5, j, zzma.zza(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 16:
                    if (zza((Object) t10, i)) {
                        zzma.zza((Object) t5, j, zzma.zzb(t10, j));
                        zzb((Object) t5, i);
                    }
                    break;
                case 17:
                    zza(t5, t10, i);
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
                    this.zzp.zza(t5, t10, j);
                    break;
                case 50:
                    zzle.zza(this.zzs, t5, t10, j);
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
                    if (zza(t10, i4, i)) {
                        zzma.zza(t5, j, zzma.zzf(t10, j));
                        zzb(t5, i4, i);
                    }
                    break;
                case 60:
                    zzb(t5, t10, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza(t10, i4, i)) {
                        zzma.zza(t5, j, zzma.zzf(t10, j));
                        zzb(t5, i4, i);
                    }
                    break;
                case 68:
                    zzb(t5, t10, i);
                    break;
            }
        }
        zzle.zza(this.zzq, t5, t10);
        if (this.zzh) {
            zzle.zza(this.zzr, t5, t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.vision.zzlc] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.vision.zzlc] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(T r15) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zzd(java.lang.Object):boolean");
    }

    private static <T> boolean zzf(T t5, long j) {
        return ((Boolean) zzma.zzf(t5, j)).booleanValue();
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zzc(T t5) {
        int i;
        int i4 = this.zzm;
        while (true) {
            i = this.zzn;
            if (i4 >= i) {
                break;
            }
            long jZzd = zzd(this.zzl[i4]) & 1048575;
            Object objZzf = zzma.zzf(t5, jZzd);
            if (objZzf != null) {
                zzma.zza(t5, jZzd, this.zzs.zze(objZzf));
            }
            i4++;
        }
        int length = this.zzl.length;
        while (i < length) {
            this.zzp.zzb(t5, this.zzl[i]);
            i++;
        }
        this.zzq.zzd(t5);
        if (this.zzh) {
            this.zzr.zzc(t5);
        }
    }

    private final int zze(int i) {
        return this.zzc[i + 2];
    }

    private static <T> long zze(T t5, long j) {
        return ((Long) zzma.zzf(t5, j)).longValue();
    }

    private static <T> float zzc(T t5, long j) {
        return ((Float) zzma.zzf(t5, j)).floatValue();
    }

    private final boolean zzc(T t5, T t10, int i) {
        return zza((Object) t5, i) == zza((Object) t10, i);
    }

    private final int zzd(int i) {
        return this.zzc[i + 1];
    }

    private static <T> int zzd(T t5, long j) {
        return ((Integer) zzma.zzf(t5, j)).intValue();
    }

    private final void zzb(T t5, T t10, int i) {
        int iZzd = zzd(i);
        int i4 = this.zzc[i];
        long j = iZzd & 1048575;
        if (zza(t10, i4, i)) {
            Object objZzf = zza(t5, i4, i) ? zzma.zzf(t5, j) : null;
            Object objZzf2 = zzma.zzf(t10, j);
            if (objZzf != null && objZzf2 != null) {
                zzma.zza(t5, j, zzjf.zza(objZzf, objZzf2));
                zzb(t5, i4, i);
            } else if (objZzf2 != null) {
                zzma.zza(t5, j, objZzf2);
                zzb(t5, i4, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.vision.zzlc
    public final int zzb(T t5) {
        int i;
        int i4;
        boolean z4;
        int iZzd;
        int iZzb;
        int iZza;
        int iZzj;
        int iZzh;
        int iZzb2;
        int iZza2;
        int i6 = 267386880;
        int i10 = 1048575;
        int i11 = 0;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i12 = 0;
            int iZ = 0;
            while (i12 < this.zzc.length) {
                int iZzd2 = zzd(i12);
                int i13 = (iZzd2 & i6) >>> 20;
                int i14 = i6;
                int i15 = this.zzc[i12];
                long j = iZzd2 & 1048575;
                if (i13 >= zziv.zza.zza() && i13 <= zziv.zzb.zza()) {
                    int i16 = this.zzc[i12 + 2];
                }
                switch (i13) {
                    case 0:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzb(i15, AudioStats.AUDIO_AMPLITUDE_NONE);
                            iZ += iZzb2;
                        }
                        break;
                    case 1:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzb(i15, 0.0f);
                            iZ += iZzb2;
                        }
                        break;
                    case 2:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzd(i15, zzma.zzb(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 3:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zze(i15, zzma.zzb(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 4:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzf(i15, zzma.zza(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 5:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzg(i15, 0L);
                            iZ += iZzb2;
                        }
                        break;
                    case 6:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzi(i15, 0);
                            iZ += iZzb2;
                        }
                        break;
                    case 7:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzb(i15, true);
                            iZ += iZzb2;
                        }
                        break;
                    case 8:
                        if (zza((Object) t5, i12)) {
                            Object objZzf = zzma.zzf(t5, j);
                            if (objZzf instanceof zzht) {
                                iZzb2 = zzii.zzc(i15, (zzht) objZzf);
                            } else {
                                iZzb2 = zzii.zzb(i15, (String) objZzf);
                            }
                            iZ += iZzb2;
                        }
                        break;
                    case 9:
                        if (zza((Object) t5, i12)) {
                            iZza2 = zzle.zza(i15, zzma.zzf(t5, j), zza(i12));
                            iZ += iZza2;
                        }
                        break;
                    case 10:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzc(i15, (zzht) zzma.zzf(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 11:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzg(i15, zzma.zza(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 12:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzk(i15, zzma.zza(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 13:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzj(i15, 0);
                            iZ += iZzb2;
                        }
                        break;
                    case 14:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzh(i15, 0L);
                            iZ += iZzb2;
                        }
                        break;
                    case 15:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzh(i15, zzma.zza(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 16:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzf(i15, zzma.zzb(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 17:
                        if (zza((Object) t5, i12)) {
                            iZzb2 = zzii.zzc(i15, (zzkk) zzma.zzf(t5, j), zza(i12));
                            iZ += iZzb2;
                        }
                        break;
                    case 18:
                        iZza2 = zzle.zzi(i15, zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 19:
                        iZza2 = zzle.zzh(i15, zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 20:
                        iZza2 = zzle.zza(i15, (List<Long>) zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 21:
                        iZza2 = zzle.zzb(i15, (List<Long>) zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 22:
                        iZza2 = zzle.zze(i15, zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 23:
                        iZza2 = zzle.zzi(i15, zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 24:
                        iZza2 = zzle.zzh(i15, zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 25:
                        iZza2 = zzle.zzj(i15, zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 26:
                        iZza2 = zzle.zza(i15, zza(t5, j));
                        iZ += iZza2;
                        break;
                    case 27:
                        iZza2 = zzle.zza(i15, zza(t5, j), zza(i12));
                        iZ += iZza2;
                        break;
                    case 28:
                        iZza2 = zzle.zzb(i15, zza(t5, j));
                        iZ += iZza2;
                        break;
                    case 29:
                        iZza2 = zzle.zzf(i15, zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 30:
                        iZza2 = zzle.zzd(i15, zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 31:
                        iZza2 = zzle.zzh(i15, zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 32:
                        iZza2 = zzle.zzi(i15, zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 33:
                        iZza2 = zzle.zzg(i15, zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 34:
                        iZza2 = zzle.zzc(i15, zza(t5, j), false);
                        iZ += iZza2;
                        break;
                    case 35:
                        int iZzi = zzle.zzi((List) unsafe.getObject(t5, j));
                        if (iZzi > 0) {
                            iZ = AbstractC1173g.z(iZzi, zzii.zze(i15), iZzi, iZ);
                        }
                        break;
                    case 36:
                        int iZzh2 = zzle.zzh((List) unsafe.getObject(t5, j));
                        if (iZzh2 > 0) {
                            iZ = AbstractC1173g.z(iZzh2, zzii.zze(i15), iZzh2, iZ);
                        }
                        break;
                    case 37:
                        int iZza3 = zzle.zza((List<Long>) unsafe.getObject(t5, j));
                        if (iZza3 > 0) {
                            iZ = AbstractC1173g.z(iZza3, zzii.zze(i15), iZza3, iZ);
                        }
                        break;
                    case 38:
                        int iZzb3 = zzle.zzb((List) unsafe.getObject(t5, j));
                        if (iZzb3 > 0) {
                            iZ = AbstractC1173g.z(iZzb3, zzii.zze(i15), iZzb3, iZ);
                        }
                        break;
                    case 39:
                        int iZze = zzle.zze((List) unsafe.getObject(t5, j));
                        if (iZze > 0) {
                            iZ = AbstractC1173g.z(iZze, zzii.zze(i15), iZze, iZ);
                        }
                        break;
                    case 40:
                        int iZzi2 = zzle.zzi((List) unsafe.getObject(t5, j));
                        if (iZzi2 > 0) {
                            iZ = AbstractC1173g.z(iZzi2, zzii.zze(i15), iZzi2, iZ);
                        }
                        break;
                    case 41:
                        int iZzh3 = zzle.zzh((List) unsafe.getObject(t5, j));
                        if (iZzh3 > 0) {
                            iZ = AbstractC1173g.z(iZzh3, zzii.zze(i15), iZzh3, iZ);
                        }
                        break;
                    case 42:
                        int iZzj2 = zzle.zzj((List) unsafe.getObject(t5, j));
                        if (iZzj2 > 0) {
                            iZ = AbstractC1173g.z(iZzj2, zzii.zze(i15), iZzj2, iZ);
                        }
                        break;
                    case 43:
                        int iZzf = zzle.zzf((List) unsafe.getObject(t5, j));
                        if (iZzf > 0) {
                            iZ = AbstractC1173g.z(iZzf, zzii.zze(i15), iZzf, iZ);
                        }
                        break;
                    case 44:
                        int iZzd3 = zzle.zzd((List) unsafe.getObject(t5, j));
                        if (iZzd3 > 0) {
                            iZ = AbstractC1173g.z(iZzd3, zzii.zze(i15), iZzd3, iZ);
                        }
                        break;
                    case 45:
                        int iZzh4 = zzle.zzh((List) unsafe.getObject(t5, j));
                        if (iZzh4 > 0) {
                            iZ = AbstractC1173g.z(iZzh4, zzii.zze(i15), iZzh4, iZ);
                        }
                        break;
                    case 46:
                        int iZzi3 = zzle.zzi((List) unsafe.getObject(t5, j));
                        if (iZzi3 > 0) {
                            iZ = AbstractC1173g.z(iZzi3, zzii.zze(i15), iZzi3, iZ);
                        }
                        break;
                    case 47:
                        int iZzg = zzle.zzg((List) unsafe.getObject(t5, j));
                        if (iZzg > 0) {
                            iZ = AbstractC1173g.z(iZzg, zzii.zze(i15), iZzg, iZ);
                        }
                        break;
                    case 48:
                        int iZzc = zzle.zzc((List) unsafe.getObject(t5, j));
                        if (iZzc > 0) {
                            iZ = AbstractC1173g.z(iZzc, zzii.zze(i15), iZzc, iZ);
                        }
                        break;
                    case 49:
                        iZza2 = zzle.zzb(i15, (List<zzkk>) zza(t5, j), zza(i12));
                        iZ += iZza2;
                        break;
                    case 50:
                        iZza2 = this.zzs.zza(i15, zzma.zzf(t5, j), zzb(i12));
                        iZ += iZza2;
                        break;
                    case 51:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzb(i15, AudioStats.AUDIO_AMPLITUDE_NONE);
                            iZ += iZzb2;
                        }
                        break;
                    case 52:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzb(i15, 0.0f);
                            iZ += iZzb2;
                        }
                        break;
                    case 53:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzd(i15, zze(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 54:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zze(i15, zze(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 55:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzf(i15, zzd(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 56:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzg(i15, 0L);
                            iZ += iZzb2;
                        }
                        break;
                    case 57:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzi(i15, 0);
                            iZ += iZzb2;
                        }
                        break;
                    case 58:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzb(i15, true);
                            iZ += iZzb2;
                        }
                        break;
                    case 59:
                        if (zza(t5, i15, i12)) {
                            Object objZzf2 = zzma.zzf(t5, j);
                            if (objZzf2 instanceof zzht) {
                                iZzb2 = zzii.zzc(i15, (zzht) objZzf2);
                            } else {
                                iZzb2 = zzii.zzb(i15, (String) objZzf2);
                            }
                            iZ += iZzb2;
                        }
                        break;
                    case 60:
                        if (zza(t5, i15, i12)) {
                            iZza2 = zzle.zza(i15, zzma.zzf(t5, j), zza(i12));
                            iZ += iZza2;
                        }
                        break;
                    case 61:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzc(i15, (zzht) zzma.zzf(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 62:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzg(i15, zzd(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 63:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzk(i15, zzd(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 64:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzj(i15, 0);
                            iZ += iZzb2;
                        }
                        break;
                    case 65:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzh(i15, 0L);
                            iZ += iZzb2;
                        }
                        break;
                    case 66:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzh(i15, zzd(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 67:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzf(i15, zze(t5, j));
                            iZ += iZzb2;
                        }
                        break;
                    case 68:
                        if (zza(t5, i15, i12)) {
                            iZzb2 = zzii.zzc(i15, (zzkk) zzma.zzf(t5, j), zza(i12));
                            iZ += iZzb2;
                        }
                        break;
                }
                i12 += 3;
                i6 = i14;
            }
            return iZ + zza((zzlu) this.zzq, (Object) t5);
        }
        Unsafe unsafe2 = zzb;
        int i17 = 1048575;
        int i18 = 0;
        int iZzb4 = 0;
        int i19 = 0;
        while (i18 < this.zzc.length) {
            int iZzd4 = zzd(i18);
            int[] iArr = this.zzc;
            int i20 = iArr[i18];
            int i21 = i10;
            int i22 = (iZzd4 & 267386880) >>> 20;
            if (i22 <= 17) {
                int i23 = iArr[i18 + 2];
                int i24 = i23 & i21;
                i = 1 << (i23 >>> 20);
                if (i24 != i17) {
                    i19 = unsafe2.getInt(t5, i24);
                    i17 = i24;
                }
            } else {
                i = 0;
            }
            long j6 = iZzd4 & i21;
            switch (i22) {
                case 0:
                    i4 = 0;
                    z4 = false;
                    if ((i & i19) != 0) {
                        iZzb4 += zzii.zzb(i20, AudioStats.AUDIO_AMPLITUDE_NONE);
                    }
                    break;
                case 1:
                    i4 = 0;
                    if ((i & i19) != 0) {
                        z4 = false;
                        iZzb4 += zzii.zzb(i20, 0.0f);
                    } else {
                        z4 = false;
                    }
                    break;
                case 2:
                    i4 = 0;
                    if ((i & i19) != 0) {
                        iZzd = zzii.zzd(i20, unsafe2.getLong(t5, j6));
                        iZzb4 += iZzd;
                    }
                    z4 = false;
                    break;
                case 3:
                    i4 = 0;
                    if ((i & i19) != 0) {
                        iZzd = zzii.zze(i20, unsafe2.getLong(t5, j6));
                        iZzb4 += iZzd;
                    }
                    z4 = false;
                    break;
                case 4:
                    i4 = 0;
                    if ((i & i19) != 0) {
                        iZzd = zzii.zzf(i20, unsafe2.getInt(t5, j6));
                        iZzb4 += iZzd;
                    }
                    z4 = false;
                    break;
                case 5:
                    i4 = 0;
                    if ((i & i19) != 0) {
                        iZzd = zzii.zzg(i20, 0L);
                        iZzb4 += iZzd;
                    }
                    z4 = false;
                    break;
                case 6:
                    if ((i & i19) != 0) {
                        i4 = 0;
                        iZzd = zzii.zzi(i20, 0);
                        iZzb4 += iZzd;
                        z4 = false;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 7:
                    if ((i & i19) != 0) {
                        iZzb = zzii.zzb(i20, true);
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 8:
                    if ((i & i19) != 0) {
                        Object object = unsafe2.getObject(t5, j6);
                        if (object instanceof zzht) {
                            iZzb = zzii.zzc(i20, (zzht) object);
                        } else {
                            iZzb = zzii.zzb(i20, (String) object);
                        }
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 9:
                    if ((i & i19) != 0) {
                        iZza = zzle.zza(i20, unsafe2.getObject(t5, j6), zza(i18));
                        iZzb4 += iZza;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 10:
                    if ((i & i19) != 0) {
                        iZzb = zzii.zzc(i20, (zzht) unsafe2.getObject(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 11:
                    if ((i & i19) != 0) {
                        iZzb = zzii.zzg(i20, unsafe2.getInt(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 12:
                    if ((i & i19) != 0) {
                        iZzb = zzii.zzk(i20, unsafe2.getInt(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 13:
                    if ((i & i19) != 0) {
                        iZzj = zzii.zzj(i20, 0);
                        iZzb4 += iZzj;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 14:
                    if ((i & i19) != 0) {
                        iZzb = zzii.zzh(i20, 0L);
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 15:
                    if ((i & i19) != 0) {
                        iZzb = zzii.zzh(i20, unsafe2.getInt(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 16:
                    if ((i & i19) != 0) {
                        iZzb = zzii.zzf(i20, unsafe2.getLong(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 17:
                    if ((i & i19) != 0) {
                        iZzb = zzii.zzc(i20, (zzkk) unsafe2.getObject(t5, j6), zza(i18));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 18:
                    iZza = zzle.zzi(i20, (List) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZza;
                    i4 = 0;
                    z4 = false;
                    break;
                case 19:
                    i4 = 0;
                    iZzh = zzle.zzh(i20, (List) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZzh;
                    z4 = false;
                    break;
                case 20:
                    i4 = 0;
                    iZzh = zzle.zza(i20, (List<Long>) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZzh;
                    z4 = false;
                    break;
                case 21:
                    i4 = 0;
                    iZzh = zzle.zzb(i20, (List<Long>) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZzh;
                    z4 = false;
                    break;
                case 22:
                    i4 = 0;
                    iZzh = zzle.zze(i20, (List) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZzh;
                    z4 = false;
                    break;
                case 23:
                    i4 = 0;
                    iZzh = zzle.zzi(i20, (List) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZzh;
                    z4 = false;
                    break;
                case 24:
                    i4 = 0;
                    iZzh = zzle.zzh(i20, (List) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZzh;
                    z4 = false;
                    break;
                case 25:
                    i4 = 0;
                    iZzh = zzle.zzj(i20, (List) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZzh;
                    z4 = false;
                    break;
                case 26:
                    iZza = zzle.zza(i20, (List<?>) unsafe2.getObject(t5, j6));
                    iZzb4 += iZza;
                    i4 = 0;
                    z4 = false;
                    break;
                case 27:
                    iZza = zzle.zza(i20, (List<?>) unsafe2.getObject(t5, j6), zza(i18));
                    iZzb4 += iZza;
                    i4 = 0;
                    z4 = false;
                    break;
                case 28:
                    iZza = zzle.zzb(i20, (List) unsafe2.getObject(t5, j6));
                    iZzb4 += iZza;
                    i4 = 0;
                    z4 = false;
                    break;
                case 29:
                    iZza = zzle.zzf(i20, (List) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZza;
                    i4 = 0;
                    z4 = false;
                    break;
                case 30:
                    i4 = 0;
                    iZzh = zzle.zzd(i20, (List) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZzh;
                    z4 = false;
                    break;
                case 31:
                    i4 = 0;
                    iZzh = zzle.zzh(i20, (List) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZzh;
                    z4 = false;
                    break;
                case 32:
                    i4 = 0;
                    iZzh = zzle.zzi(i20, (List) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZzh;
                    z4 = false;
                    break;
                case 33:
                    i4 = 0;
                    iZzh = zzle.zzg(i20, (List) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZzh;
                    z4 = false;
                    break;
                case 34:
                    i4 = 0;
                    iZzh = zzle.zzc(i20, (List) unsafe2.getObject(t5, j6), false);
                    iZzb4 += iZzh;
                    z4 = false;
                    break;
                case 35:
                    int iZzi4 = zzle.zzi((List) unsafe2.getObject(t5, j6));
                    if (iZzi4 > 0) {
                        iZzb4 = AbstractC1173g.z(iZzi4, zzii.zze(i20), iZzi4, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 36:
                    int iZzh5 = zzle.zzh((List) unsafe2.getObject(t5, j6));
                    if (iZzh5 > 0) {
                        iZzb4 = AbstractC1173g.z(iZzh5, zzii.zze(i20), iZzh5, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 37:
                    int iZza4 = zzle.zza((List<Long>) unsafe2.getObject(t5, j6));
                    if (iZza4 > 0) {
                        iZzb4 = AbstractC1173g.z(iZza4, zzii.zze(i20), iZza4, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 38:
                    int iZzb5 = zzle.zzb((List) unsafe2.getObject(t5, j6));
                    if (iZzb5 > 0) {
                        iZzb4 = AbstractC1173g.z(iZzb5, zzii.zze(i20), iZzb5, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 39:
                    int iZze2 = zzle.zze((List) unsafe2.getObject(t5, j6));
                    if (iZze2 > 0) {
                        iZzb4 = AbstractC1173g.z(iZze2, zzii.zze(i20), iZze2, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 40:
                    int iZzi5 = zzle.zzi((List) unsafe2.getObject(t5, j6));
                    if (iZzi5 > 0) {
                        iZzb4 = AbstractC1173g.z(iZzi5, zzii.zze(i20), iZzi5, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 41:
                    int iZzh6 = zzle.zzh((List) unsafe2.getObject(t5, j6));
                    if (iZzh6 > 0) {
                        iZzb4 = AbstractC1173g.z(iZzh6, zzii.zze(i20), iZzh6, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 42:
                    int iZzj3 = zzle.zzj((List) unsafe2.getObject(t5, j6));
                    if (iZzj3 > 0) {
                        iZzb4 = AbstractC1173g.z(iZzj3, zzii.zze(i20), iZzj3, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 43:
                    int iZzf2 = zzle.zzf((List) unsafe2.getObject(t5, j6));
                    if (iZzf2 > 0) {
                        iZzb4 = AbstractC1173g.z(iZzf2, zzii.zze(i20), iZzf2, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 44:
                    int iZzd5 = zzle.zzd((List) unsafe2.getObject(t5, j6));
                    if (iZzd5 > 0) {
                        iZzb4 = AbstractC1173g.z(iZzd5, zzii.zze(i20), iZzd5, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 45:
                    int iZzh7 = zzle.zzh((List) unsafe2.getObject(t5, j6));
                    if (iZzh7 > 0) {
                        iZzb4 = AbstractC1173g.z(iZzh7, zzii.zze(i20), iZzh7, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 46:
                    int iZzi6 = zzle.zzi((List) unsafe2.getObject(t5, j6));
                    if (iZzi6 > 0) {
                        iZzb4 = AbstractC1173g.z(iZzi6, zzii.zze(i20), iZzi6, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 47:
                    int iZzg2 = zzle.zzg((List) unsafe2.getObject(t5, j6));
                    if (iZzg2 > 0) {
                        iZzb4 = AbstractC1173g.z(iZzg2, zzii.zze(i20), iZzg2, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 48:
                    int iZzc2 = zzle.zzc((List) unsafe2.getObject(t5, j6));
                    if (iZzc2 > 0) {
                        iZzb4 = AbstractC1173g.z(iZzc2, zzii.zze(i20), iZzc2, iZzb4);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 49:
                    iZza = zzle.zzb(i20, (List<zzkk>) unsafe2.getObject(t5, j6), zza(i18));
                    iZzb4 += iZza;
                    i4 = 0;
                    z4 = false;
                    break;
                case 50:
                    iZza = this.zzs.zza(i20, unsafe2.getObject(t5, j6), zzb(i18));
                    iZzb4 += iZza;
                    i4 = 0;
                    z4 = false;
                    break;
                case 51:
                    if (zza(t5, i20, i18)) {
                        iZzb4 += zzii.zzb(i20, AudioStats.AUDIO_AMPLITUDE_NONE);
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 52:
                    if (zza(t5, i20, i18)) {
                        iZzj = zzii.zzb(i20, 0.0f);
                        iZzb4 += iZzj;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 53:
                    if (zza(t5, i20, i18)) {
                        iZzb = zzii.zzd(i20, zze(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 54:
                    if (zza(t5, i20, i18)) {
                        iZzb = zzii.zze(i20, zze(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 55:
                    if (zza(t5, i20, i18)) {
                        iZzb = zzii.zzf(i20, zzd(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 56:
                    if (zza(t5, i20, i18)) {
                        iZzb = zzii.zzg(i20, 0L);
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 57:
                    if (zza(t5, i20, i18)) {
                        iZzj = zzii.zzi(i20, 0);
                        iZzb4 += iZzj;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 58:
                    if (zza(t5, i20, i18)) {
                        iZzb = zzii.zzb(i20, true);
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 59:
                    if (zza(t5, i20, i18)) {
                        Object object2 = unsafe2.getObject(t5, j6);
                        if (object2 instanceof zzht) {
                            iZzb = zzii.zzc(i20, (zzht) object2);
                        } else {
                            iZzb = zzii.zzb(i20, (String) object2);
                        }
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 60:
                    if (zza(t5, i20, i18)) {
                        iZza = zzle.zza(i20, unsafe2.getObject(t5, j6), zza(i18));
                        iZzb4 += iZza;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 61:
                    if (zza(t5, i20, i18)) {
                        iZzb = zzii.zzc(i20, (zzht) unsafe2.getObject(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 62:
                    if (zza(t5, i20, i18)) {
                        iZzb = zzii.zzg(i20, zzd(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 63:
                    if (zza(t5, i20, i18)) {
                        iZzb = zzii.zzk(i20, zzd(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 64:
                    if (zza(t5, i20, i18)) {
                        iZzj = zzii.zzj(i20, 0);
                        iZzb4 += iZzj;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 65:
                    if (zza(t5, i20, i18)) {
                        iZzb = zzii.zzh(i20, 0L);
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 66:
                    if (zza(t5, i20, i18)) {
                        iZzb = zzii.zzh(i20, zzd(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 67:
                    if (zza(t5, i20, i18)) {
                        iZzb = zzii.zzf(i20, zze(t5, j6));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                case 68:
                    if (zza(t5, i20, i18)) {
                        iZzb = zzii.zzc(i20, (zzkk) unsafe2.getObject(t5, j6), zza(i18));
                        iZzb4 += iZzb;
                    }
                    i4 = 0;
                    z4 = false;
                    break;
                default:
                    i4 = 0;
                    z4 = false;
                    break;
            }
            i18 += 3;
            i11 = i4;
            i10 = i21;
        }
        int iZzc3 = i11;
        int iZza5 = iZzb4 + zza((zzlu) this.zzq, (Object) t5);
        if (!this.zzh) {
            return iZza5;
        }
        zziu<T> zziuVarZza = this.zzr.zza(t5);
        for (int i25 = iZzc3; i25 < zziuVarZza.zza.zzc(); i25++) {
            Map.Entry entryZzb = zziuVarZza.zza.zzb(i25);
            iZzc3 += zziu.zzc((zziw) entryZzb.getKey(), entryZzb.getValue());
        }
        for (Map.Entry entry : zziuVarZza.zza.zzd()) {
            iZzc3 += zziu.zzc((zziw) entry.getKey(), entry.getValue());
        }
        return iZza5 + iZzc3;
    }

    private static Field zza(Class<?> cls, String str) {
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
            StringBuilder sb2 = new StringBuilder(c.c(name.length() + c.c(40, str), string));
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            throw new RuntimeException(s.p(sb2, " not found. Known fields are ", string));
        }
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(T r10, T r11) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final int zza(T t5) {
        int i;
        int iZza;
        int i4;
        int iZza2;
        int length = this.zzc.length;
        int i6 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzd = zzd(i10);
            int i11 = this.zzc[i10];
            long j = 1048575 & iZzd;
            int iHashCode = 37;
            switch ((iZzd & 267386880) >>> 20) {
                case 0:
                    i = i6 * 53;
                    iZza = zzjf.zza(Double.doubleToLongBits(zzma.zze(t5, j)));
                    i6 = iZza + i;
                    break;
                case 1:
                    i = i6 * 53;
                    iZza = Float.floatToIntBits(zzma.zzd(t5, j));
                    i6 = iZza + i;
                    break;
                case 2:
                    i = i6 * 53;
                    iZza = zzjf.zza(zzma.zzb(t5, j));
                    i6 = iZza + i;
                    break;
                case 3:
                    i = i6 * 53;
                    iZza = zzjf.zza(zzma.zzb(t5, j));
                    i6 = iZza + i;
                    break;
                case 4:
                    i4 = i6 * 53;
                    iZza2 = zzma.zza(t5, j);
                    i6 = i4 + iZza2;
                    break;
                case 5:
                    i = i6 * 53;
                    iZza = zzjf.zza(zzma.zzb(t5, j));
                    i6 = iZza + i;
                    break;
                case 6:
                    i4 = i6 * 53;
                    iZza2 = zzma.zza(t5, j);
                    i6 = i4 + iZza2;
                    break;
                case 7:
                    i = i6 * 53;
                    iZza = zzjf.zza(zzma.zzc(t5, j));
                    i6 = iZza + i;
                    break;
                case 8:
                    i = i6 * 53;
                    iZza = ((String) zzma.zzf(t5, j)).hashCode();
                    i6 = iZza + i;
                    break;
                case 9:
                    Object objZzf = zzma.zzf(t5, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i6 = (i6 * 53) + iHashCode;
                    break;
                case 10:
                    i = i6 * 53;
                    iZza = zzma.zzf(t5, j).hashCode();
                    i6 = iZza + i;
                    break;
                case 11:
                    i4 = i6 * 53;
                    iZza2 = zzma.zza(t5, j);
                    i6 = i4 + iZza2;
                    break;
                case 12:
                    i4 = i6 * 53;
                    iZza2 = zzma.zza(t5, j);
                    i6 = i4 + iZza2;
                    break;
                case 13:
                    i4 = i6 * 53;
                    iZza2 = zzma.zza(t5, j);
                    i6 = i4 + iZza2;
                    break;
                case 14:
                    i = i6 * 53;
                    iZza = zzjf.zza(zzma.zzb(t5, j));
                    i6 = iZza + i;
                    break;
                case 15:
                    i4 = i6 * 53;
                    iZza2 = zzma.zza(t5, j);
                    i6 = i4 + iZza2;
                    break;
                case 16:
                    i = i6 * 53;
                    iZza = zzjf.zza(zzma.zzb(t5, j));
                    i6 = iZza + i;
                    break;
                case 17:
                    Object objZzf2 = zzma.zzf(t5, j);
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
                    iZza = zzma.zzf(t5, j).hashCode();
                    i6 = iZza + i;
                    break;
                case 50:
                    i = i6 * 53;
                    iZza = zzma.zzf(t5, j).hashCode();
                    i6 = iZza + i;
                    break;
                case 51:
                    if (zza(t5, i11, i10)) {
                        i = i6 * 53;
                        iZza = zzjf.zza(Double.doubleToLongBits(zzb(t5, j)));
                        i6 = iZza + i;
                    }
                    break;
                case 52:
                    if (zza(t5, i11, i10)) {
                        i = i6 * 53;
                        iZza = Float.floatToIntBits(zzc(t5, j));
                        i6 = iZza + i;
                    }
                    break;
                case 53:
                    if (zza(t5, i11, i10)) {
                        i = i6 * 53;
                        iZza = zzjf.zza(zze(t5, j));
                        i6 = iZza + i;
                    }
                    break;
                case 54:
                    if (zza(t5, i11, i10)) {
                        i = i6 * 53;
                        iZza = zzjf.zza(zze(t5, j));
                        i6 = iZza + i;
                    }
                    break;
                case 55:
                    if (zza(t5, i11, i10)) {
                        i4 = i6 * 53;
                        iZza2 = zzd(t5, j);
                        i6 = i4 + iZza2;
                    }
                    break;
                case 56:
                    if (zza(t5, i11, i10)) {
                        i = i6 * 53;
                        iZza = zzjf.zza(zze(t5, j));
                        i6 = iZza + i;
                    }
                    break;
                case 57:
                    if (zza(t5, i11, i10)) {
                        i4 = i6 * 53;
                        iZza2 = zzd(t5, j);
                        i6 = i4 + iZza2;
                    }
                    break;
                case 58:
                    if (zza(t5, i11, i10)) {
                        i = i6 * 53;
                        iZza = zzjf.zza(zzf(t5, j));
                        i6 = iZza + i;
                    }
                    break;
                case 59:
                    if (zza(t5, i11, i10)) {
                        i = i6 * 53;
                        iZza = ((String) zzma.zzf(t5, j)).hashCode();
                        i6 = iZza + i;
                    }
                    break;
                case 60:
                    if (zza(t5, i11, i10)) {
                        i = i6 * 53;
                        iZza = zzma.zzf(t5, j).hashCode();
                        i6 = iZza + i;
                    }
                    break;
                case 61:
                    if (zza(t5, i11, i10)) {
                        i = i6 * 53;
                        iZza = zzma.zzf(t5, j).hashCode();
                        i6 = iZza + i;
                    }
                    break;
                case 62:
                    if (zza(t5, i11, i10)) {
                        i4 = i6 * 53;
                        iZza2 = zzd(t5, j);
                        i6 = i4 + iZza2;
                    }
                    break;
                case 63:
                    if (zza(t5, i11, i10)) {
                        i4 = i6 * 53;
                        iZza2 = zzd(t5, j);
                        i6 = i4 + iZza2;
                    }
                    break;
                case 64:
                    if (zza(t5, i11, i10)) {
                        i4 = i6 * 53;
                        iZza2 = zzd(t5, j);
                        i6 = i4 + iZza2;
                    }
                    break;
                case 65:
                    if (zza(t5, i11, i10)) {
                        i = i6 * 53;
                        iZza = zzjf.zza(zze(t5, j));
                        i6 = iZza + i;
                    }
                    break;
                case 66:
                    if (zza(t5, i11, i10)) {
                        i4 = i6 * 53;
                        iZza2 = zzd(t5, j);
                        i6 = i4 + iZza2;
                    }
                    break;
                case 67:
                    if (zza(t5, i11, i10)) {
                        i = i6 * 53;
                        iZza = zzjf.zza(zze(t5, j));
                        i6 = iZza + i;
                    }
                    break;
                case 68:
                    if (zza(t5, i11, i10)) {
                        i = i6 * 53;
                        iZza = zzma.zzf(t5, j).hashCode();
                        i6 = iZza + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzq.zzb(t5).hashCode() + (i6 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzr.zza(t5).hashCode() : iHashCode2;
    }

    private final void zza(T t5, T t10, int i) {
        long jZzd = zzd(i) & 1048575;
        if (zza((Object) t10, i)) {
            Object objZzf = zzma.zzf(t5, jZzd);
            Object objZzf2 = zzma.zzf(t10, jZzd);
            if (objZzf != null && objZzf2 != null) {
                zzma.zza(t5, jZzd, zzjf.zza(objZzf, objZzf2));
                zzb((Object) t5, i);
            } else if (objZzf2 != null) {
                zzma.zza(t5, jZzd, objZzf2);
                zzb((Object) t5, i);
            }
        }
    }

    private static <UT, UB> int zza(zzlu<UT, UB> zzluVar, T t5) {
        return zzluVar.zzf(zzluVar.zzb(t5));
    }

    private static List<?> zza(Object obj, long j) {
        return (List) zzma.zzf(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r14, com.google.android.gms.internal.vision.zzmr r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Object, com.google.android.gms.internal.vision.zzmr):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzb(T r18, com.google.android.gms.internal.vision.zzmr r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zzb(java.lang.Object, com.google.android.gms.internal.vision.zzmr):void");
    }

    private final Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private static <T> double zzb(T t5, long j) {
        return ((Double) zzma.zzf(t5, j)).doubleValue();
    }

    private final void zzb(T t5, int i) {
        int iZze = zze(i);
        long j = 1048575 & iZze;
        if (j == 1048575) {
            return;
        }
        zzma.zza((Object) t5, j, (1 << (iZze >>> 20)) | zzma.zza(t5, j));
    }

    private final void zzb(T t5, int i, int i4) {
        zzma.zza((Object) t5, zze(i4) & 1048575, i);
    }

    private final int zzb(int i, int i4) {
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

    private final <K, V> void zza(zzmr zzmrVar, int i, Object obj, int i4) throws IOException {
        if (obj != null) {
            zzmrVar.zza(i, this.zzs.zzb(zzb(i4)), this.zzs.zzc(obj));
        }
    }

    private static <UT, UB> void zza(zzlu<UT, UB> zzluVar, T t5, zzmr zzmrVar) throws IOException {
        zzluVar.zza(zzluVar.zzb(t5), zzmrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zza(T t5, zzld zzldVar, zzio zzioVar) throws IOException {
        int iZza;
        int iZzg;
        zzioVar.getClass();
        zzlu<?, ?> zzluVar = this.zzq;
        zziq<?> zziqVar = this.zzr;
        zziu zziuVarZzb = null;
        Object objZza = null;
        while (true) {
            try {
                iZza = zzldVar.zza();
                iZzg = zzg(iZza);
            } finally {
            }
            if (iZzg < 0) {
                if (iZza == Integer.MAX_VALUE) {
                    for (int i = this.zzm; i < this.zzn; i++) {
                        objZza = zza((Object) t5, this.zzl[i], objZza, (zzlu<UT, Object>) zzluVar);
                    }
                    if (objZza != null) {
                        zzluVar.zzb(t5, (Object) objZza);
                        return;
                    }
                    return;
                }
                Object objZza2 = !this.zzh ? null : zziqVar.zza(zzioVar, this.zzg, iZza);
                if (objZza2 != null) {
                    if (zziuVarZzb == null) {
                        zziuVarZzb = zziqVar.zzb(t5);
                    }
                    zzio zzioVar2 = zzioVar;
                    zziu zziuVar = zziuVarZzb;
                    zzld zzldVar2 = zzldVar;
                    objZza = zziqVar.zza(zzldVar2, objZza2, zzioVar2, zziuVar, objZza, zzluVar);
                    zzldVar = zzldVar2;
                    zzioVar = zzioVar2;
                    zziuVarZzb = zziuVar;
                } else {
                    zzluVar.zza(zzldVar);
                    if (objZza == null) {
                        objZza = zzluVar.zzc(t5);
                    }
                    if (!zzluVar.zza((Object) objZza, zzldVar)) {
                        for (int i4 = this.zzm; i4 < this.zzn; i4++) {
                            objZza = zza((Object) t5, this.zzl[i4], objZza, (zzlu<UT, Object>) zzluVar);
                        }
                        if (objZza != null) {
                            zzluVar.zzb(t5, (Object) objZza);
                            return;
                        }
                        return;
                    }
                }
            } else {
                int iZzd = zzd(iZzg);
                switch ((267386880 & iZzd) >>> 20) {
                    case 0:
                        zzma.zza(t5, iZzd & 1048575, zzldVar.zzd());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 1:
                        zzma.zza((Object) t5, iZzd & 1048575, zzldVar.zze());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 2:
                        zzma.zza((Object) t5, iZzd & 1048575, zzldVar.zzg());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 3:
                        zzma.zza((Object) t5, iZzd & 1048575, zzldVar.zzf());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 4:
                        zzma.zza((Object) t5, iZzd & 1048575, zzldVar.zzh());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 5:
                        zzma.zza((Object) t5, iZzd & 1048575, zzldVar.zzi());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 6:
                        zzma.zza((Object) t5, iZzd & 1048575, zzldVar.zzj());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 7:
                        zzma.zza(t5, iZzd & 1048575, zzldVar.zzk());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 8:
                        zza(t5, iZzd, zzldVar);
                        zzb((Object) t5, iZzg);
                        continue;
                    case 9:
                        if (zza((Object) t5, iZzg)) {
                            long j = iZzd & 1048575;
                            zzma.zza(t5, j, zzjf.zza(zzma.zzf(t5, j), zzldVar.zza(zza(iZzg), zzioVar)));
                        } else {
                            zzma.zza(t5, iZzd & 1048575, zzldVar.zza(zza(iZzg), zzioVar));
                            zzb((Object) t5, iZzg);
                            continue;
                        }
                        break;
                    case 10:
                        zzma.zza(t5, iZzd & 1048575, zzldVar.zzn());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 11:
                        zzma.zza((Object) t5, iZzd & 1048575, zzldVar.zzo());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 12:
                        int iZzp = zzldVar.zzp();
                        zzjg zzjgVarZzc = zzc(iZzg);
                        if (zzjgVarZzc != null && !zzjgVarZzc.zza(iZzp)) {
                            objZza = zzle.zza(iZza, iZzp, objZza, (zzlu<UT, Object>) zzluVar);
                        } else {
                            zzma.zza((Object) t5, iZzd & 1048575, iZzp);
                            zzb((Object) t5, iZzg);
                            continue;
                        }
                        break;
                    case 13:
                        zzma.zza((Object) t5, iZzd & 1048575, zzldVar.zzq());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 14:
                        zzma.zza((Object) t5, iZzd & 1048575, zzldVar.zzr());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 15:
                        zzma.zza((Object) t5, iZzd & 1048575, zzldVar.zzs());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 16:
                        zzma.zza((Object) t5, iZzd & 1048575, zzldVar.zzt());
                        zzb((Object) t5, iZzg);
                        continue;
                    case 17:
                        if (zza((Object) t5, iZzg)) {
                            long j6 = iZzd & 1048575;
                            zzma.zza(t5, j6, zzjf.zza(zzma.zzf(t5, j6), zzldVar.zzb(zza(iZzg), zzioVar)));
                        } else {
                            zzma.zza(t5, iZzd & 1048575, zzldVar.zzb(zza(iZzg), zzioVar));
                            zzb((Object) t5, iZzg);
                            continue;
                        }
                        break;
                    case 18:
                        zzldVar.zza(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 19:
                        zzldVar.zzb(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 20:
                        zzldVar.zzd(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 21:
                        zzldVar.zzc(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 22:
                        zzldVar.zze(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 23:
                        zzldVar.zzf(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 24:
                        zzldVar.zzg(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 25:
                        zzldVar.zzh(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 26:
                        if (zzf(iZzd)) {
                            zzldVar.zzj(this.zzp.zza(t5, iZzd & 1048575));
                        } else {
                            zzldVar.zzi(this.zzp.zza(t5, iZzd & 1048575));
                            continue;
                        }
                        break;
                    case 27:
                        zzldVar.zza(this.zzp.zza(t5, iZzd & 1048575), zza(iZzg), zzioVar);
                        continue;
                    case 28:
                        zzldVar.zzk(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 29:
                        zzldVar.zzl(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 30:
                        List<Integer> listZza = this.zzp.zza(t5, iZzd & 1048575);
                        zzldVar.zzm(listZza);
                        objZza = zzle.zza(iZza, listZza, zzc(iZzg), objZza, zzluVar);
                        continue;
                    case 31:
                        zzldVar.zzn(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 32:
                        zzldVar.zzo(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 33:
                        zzldVar.zzp(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 34:
                        zzldVar.zzq(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 35:
                        zzldVar.zza(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 36:
                        zzldVar.zzb(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 37:
                        zzldVar.zzd(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 38:
                        zzldVar.zzc(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 39:
                        zzldVar.zze(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 40:
                        zzldVar.zzf(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 41:
                        zzldVar.zzg(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 42:
                        zzldVar.zzh(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 43:
                        zzldVar.zzl(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 44:
                        List<Integer> listZza2 = this.zzp.zza(t5, iZzd & 1048575);
                        zzldVar.zzm(listZza2);
                        objZza = zzle.zza(iZza, listZza2, zzc(iZzg), objZza, zzluVar);
                        continue;
                    case 45:
                        zzldVar.zzn(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 46:
                        zzldVar.zzo(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 47:
                        zzldVar.zzp(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 48:
                        zzldVar.zzq(this.zzp.zza(t5, iZzd & 1048575));
                        continue;
                    case 49:
                        zzldVar.zzb(this.zzp.zza(t5, iZzd & 1048575), zza(iZzg), zzioVar);
                        continue;
                    case 50:
                        Object objZzb = zzb(iZzg);
                        long jZzd = zzd(iZzg) & 1048575;
                        Object objZzf = zzma.zzf(t5, jZzd);
                        if (objZzf == null) {
                            objZzf = this.zzs.zzf(objZzb);
                            zzma.zza(t5, jZzd, objZzf);
                        } else if (this.zzs.zzd(objZzf)) {
                            Object objZzf2 = this.zzs.zzf(objZzb);
                            this.zzs.zza(objZzf2, objZzf);
                            zzma.zza(t5, jZzd, objZzf2);
                            objZzf = objZzf2;
                        }
                        zzldVar.zza(this.zzs.zza(objZzf), this.zzs.zzb(objZzb), zzioVar);
                        continue;
                    case 51:
                        zzma.zza(t5, iZzd & 1048575, Double.valueOf(zzldVar.zzd()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 52:
                        zzma.zza(t5, iZzd & 1048575, Float.valueOf(zzldVar.zze()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 53:
                        zzma.zza(t5, iZzd & 1048575, Long.valueOf(zzldVar.zzg()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 54:
                        zzma.zza(t5, iZzd & 1048575, Long.valueOf(zzldVar.zzf()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 55:
                        zzma.zza(t5, iZzd & 1048575, Integer.valueOf(zzldVar.zzh()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 56:
                        zzma.zza(t5, iZzd & 1048575, Long.valueOf(zzldVar.zzi()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 57:
                        zzma.zza(t5, iZzd & 1048575, Integer.valueOf(zzldVar.zzj()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 58:
                        zzma.zza(t5, iZzd & 1048575, Boolean.valueOf(zzldVar.zzk()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 59:
                        zza(t5, iZzd, zzldVar);
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 60:
                        if (zza(t5, iZza, iZzg)) {
                            long j7 = iZzd & 1048575;
                            zzma.zza(t5, j7, zzjf.zza(zzma.zzf(t5, j7), zzldVar.zza(zza(iZzg), zzioVar)));
                        } else {
                            zzma.zza(t5, iZzd & 1048575, zzldVar.zza(zza(iZzg), zzioVar));
                            zzb((Object) t5, iZzg);
                        }
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 61:
                        zzma.zza(t5, iZzd & 1048575, zzldVar.zzn());
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 62:
                        zzma.zza(t5, iZzd & 1048575, Integer.valueOf(zzldVar.zzo()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 63:
                        int iZzp2 = zzldVar.zzp();
                        zzjg zzjgVarZzc2 = zzc(iZzg);
                        if (zzjgVarZzc2 != null && !zzjgVarZzc2.zza(iZzp2)) {
                            objZza = zzle.zza(iZza, iZzp2, objZza, (zzlu<UT, Object>) zzluVar);
                        } else {
                            zzma.zza(t5, iZzd & 1048575, Integer.valueOf(iZzp2));
                            zzb(t5, iZza, iZzg);
                            continue;
                        }
                        break;
                    case 64:
                        zzma.zza(t5, iZzd & 1048575, Integer.valueOf(zzldVar.zzq()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 65:
                        zzma.zza(t5, iZzd & 1048575, Long.valueOf(zzldVar.zzr()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 66:
                        zzma.zza(t5, iZzd & 1048575, Integer.valueOf(zzldVar.zzs()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 67:
                        zzma.zza(t5, iZzd & 1048575, Long.valueOf(zzldVar.zzt()));
                        zzb(t5, iZza, iZzg);
                        continue;
                    case 68:
                        zzma.zza(t5, iZzd & 1048575, zzldVar.zzb(zza(iZzg), zzioVar));
                        zzb(t5, iZza, iZzg);
                        continue;
                    default:
                        if (objZza == null) {
                            try {
                                objZza = zzluVar.zza();
                            } catch (zzjn unused) {
                                zzluVar.zza(zzldVar);
                                if (objZza == null) {
                                    objZza = zzluVar.zzc(t5);
                                }
                                if (!zzluVar.zza((Object) objZza, zzldVar)) {
                                    for (int i6 = this.zzm; i6 < this.zzn; i6++) {
                                        objZza = zza((Object) t5, this.zzl[i6], objZza, (zzlu<UT, Object>) zzluVar);
                                    }
                                    if (objZza != null) {
                                        zzluVar.zzb(t5, (Object) objZza);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        if (!zzluVar.zza((Object) objZza, zzldVar)) {
                            for (int i10 = this.zzm; i10 < this.zzn; i10++) {
                                objZza = zza((Object) t5, this.zzl[i10], objZza, (zzlu<UT, Object>) zzluVar);
                            }
                            if (objZza != null) {
                                zzluVar.zzb(t5, (Object) objZza);
                                return;
                            }
                            return;
                        }
                        break;
                        break;
                }
            }
        }
    }

    private static int zza(byte[] bArr, int i, int i4, zzml zzmlVar, Class<?> cls, zzhn zzhnVar) throws IOException {
        switch (zzkr.zza[zzmlVar.ordinal()]) {
            case 1:
                int iZzb = zzhl.zzb(bArr, i, zzhnVar);
                zzhnVar.zzc = Boolean.valueOf(zzhnVar.zzb != 0);
                return iZzb;
            case 2:
                return zzhl.zze(bArr, i, zzhnVar);
            case 3:
                zzhnVar.zzc = Double.valueOf(zzhl.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzhnVar.zzc = Integer.valueOf(zzhl.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzhnVar.zzc = Long.valueOf(zzhl.zzb(bArr, i));
                return i + 8;
            case 8:
                zzhnVar.zzc = Float.valueOf(zzhl.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iZza = zzhl.zza(bArr, i, zzhnVar);
                zzhnVar.zzc = Integer.valueOf(zzhnVar.zza);
                return iZza;
            case 12:
            case 13:
                int iZzb2 = zzhl.zzb(bArr, i, zzhnVar);
                zzhnVar.zzc = Long.valueOf(zzhnVar.zzb);
                return iZzb2;
            case 14:
                return zzhl.zza(zzky.zza().zza((Class) cls), bArr, i, i4, zzhnVar);
            case 15:
                int iZza2 = zzhl.zza(bArr, i, zzhnVar);
                zzhnVar.zzc = Integer.valueOf(zzif.zze(zzhnVar.zza));
                return iZza2;
            case 16:
                int iZzb3 = zzhl.zzb(bArr, i, zzhnVar);
                zzhnVar.zzc = Long.valueOf(zzif.zza(zzhnVar.zzb));
                return iZzb3;
            case 17:
                return zzhl.zzd(bArr, i, zzhnVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zza(T t5, byte[] bArr, int i, int i4, int i6, int i10, int i11, int i12, long j, int i13, long j6, zzhn zzhnVar) throws IOException {
        int i14;
        int i15;
        int iZza;
        Unsafe unsafe = zzb;
        zzjl zzjlVarZza = (zzjl) unsafe.getObject(t5, j6);
        if (!zzjlVarZza.zza()) {
            int size = zzjlVarZza.size();
            zzjlVarZza = zzjlVarZza.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(t5, j6, zzjlVarZza);
        }
        zzjl zzjlVar = zzjlVarZza;
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    zzin zzinVar = (zzin) zzjlVar;
                    int iZza2 = zzhl.zza(bArr, i, zzhnVar);
                    int i16 = zzhnVar.zza + iZza2;
                    while (iZza2 < i16) {
                        zzinVar.zza(zzhl.zzc(bArr, iZza2));
                        iZza2 += 8;
                    }
                    if (iZza2 == i16) {
                        return iZza2;
                    }
                    throw zzjk.zza();
                }
                if (i11 != 1) {
                    return i;
                }
                zzin zzinVar2 = (zzin) zzjlVar;
                zzinVar2.zza(zzhl.zzc(bArr, i));
                int i17 = i + 8;
                while (i17 < i4) {
                    int iZza3 = zzhl.zza(bArr, i17, zzhnVar);
                    if (i6 != zzhnVar.zza) {
                        return i17;
                    }
                    zzinVar2.zza(zzhl.zzc(bArr, iZza3));
                    i17 = iZza3 + 8;
                }
                return i17;
            case 19:
            case 36:
                if (i11 == 2) {
                    zzja zzjaVar = (zzja) zzjlVar;
                    int iZza4 = zzhl.zza(bArr, i, zzhnVar);
                    int i18 = zzhnVar.zza + iZza4;
                    while (iZza4 < i18) {
                        zzjaVar.zza(zzhl.zzd(bArr, iZza4));
                        iZza4 += 4;
                    }
                    if (iZza4 == i18) {
                        return iZza4;
                    }
                    throw zzjk.zza();
                }
                if (i11 != 5) {
                    return i;
                }
                zzja zzjaVar2 = (zzja) zzjlVar;
                zzjaVar2.zza(zzhl.zzd(bArr, i));
                int i19 = i + 4;
                while (i19 < i4) {
                    int iZza5 = zzhl.zza(bArr, i19, zzhnVar);
                    if (i6 != zzhnVar.zza) {
                        return i19;
                    }
                    zzjaVar2.zza(zzhl.zzd(bArr, iZza5));
                    i19 = iZza5 + 4;
                }
                return i19;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    zzjy zzjyVar = (zzjy) zzjlVar;
                    int iZza6 = zzhl.zza(bArr, i, zzhnVar);
                    int i20 = zzhnVar.zza + iZza6;
                    while (iZza6 < i20) {
                        iZza6 = zzhl.zzb(bArr, iZza6, zzhnVar);
                        zzjyVar.zza(zzhnVar.zzb);
                    }
                    if (iZza6 == i20) {
                        return iZza6;
                    }
                    throw zzjk.zza();
                }
                if (i11 != 0) {
                    return i;
                }
                zzjy zzjyVar2 = (zzjy) zzjlVar;
                int iZzb = zzhl.zzb(bArr, i, zzhnVar);
                zzjyVar2.zza(zzhnVar.zzb);
                while (iZzb < i4) {
                    int iZza7 = zzhl.zza(bArr, iZzb, zzhnVar);
                    if (i6 != zzhnVar.zza) {
                        return iZzb;
                    }
                    iZzb = zzhl.zzb(bArr, iZza7, zzhnVar);
                    zzjyVar2.zza(zzhnVar.zzb);
                }
                return iZzb;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return zzhl.zza(bArr, i, (zzjl<?>) zzjlVar, zzhnVar);
                }
                return i11 == 0 ? zzhl.zza(i6, bArr, i, i4, (zzjl<?>) zzjlVar, zzhnVar) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    zzjy zzjyVar3 = (zzjy) zzjlVar;
                    int iZza8 = zzhl.zza(bArr, i, zzhnVar);
                    int i21 = zzhnVar.zza + iZza8;
                    while (iZza8 < i21) {
                        zzjyVar3.zza(zzhl.zzb(bArr, iZza8));
                        iZza8 += 8;
                    }
                    if (iZza8 == i21) {
                        return iZza8;
                    }
                    throw zzjk.zza();
                }
                if (i11 != 1) {
                    return i;
                }
                zzjy zzjyVar4 = (zzjy) zzjlVar;
                zzjyVar4.zza(zzhl.zzb(bArr, i));
                int i22 = i + 8;
                while (i22 < i4) {
                    int iZza9 = zzhl.zza(bArr, i22, zzhnVar);
                    if (i6 != zzhnVar.zza) {
                        return i22;
                    }
                    zzjyVar4.zza(zzhl.zzb(bArr, iZza9));
                    i22 = iZza9 + 8;
                }
                return i22;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    zzjd zzjdVar = (zzjd) zzjlVar;
                    int iZza10 = zzhl.zza(bArr, i, zzhnVar);
                    int i23 = zzhnVar.zza + iZza10;
                    while (iZza10 < i23) {
                        zzjdVar.zzc(zzhl.zza(bArr, iZza10));
                        iZza10 += 4;
                    }
                    if (iZza10 == i23) {
                        return iZza10;
                    }
                    throw zzjk.zza();
                }
                if (i11 != 5) {
                    return i;
                }
                zzjd zzjdVar2 = (zzjd) zzjlVar;
                zzjdVar2.zzc(zzhl.zza(bArr, i));
                int i24 = i + 4;
                while (i24 < i4) {
                    int iZza11 = zzhl.zza(bArr, i24, zzhnVar);
                    if (i6 != zzhnVar.zza) {
                        return i24;
                    }
                    zzjdVar2.zzc(zzhl.zza(bArr, iZza11));
                    i24 = iZza11 + 4;
                }
                return i24;
            case 25:
            case 42:
                if (i11 == 2) {
                    zzhr zzhrVar = (zzhr) zzjlVar;
                    int iZza12 = zzhl.zza(bArr, i, zzhnVar);
                    int i25 = zzhnVar.zza + iZza12;
                    while (iZza12 < i25) {
                        iZza12 = zzhl.zzb(bArr, iZza12, zzhnVar);
                        zzhrVar.zza(zzhnVar.zzb != 0);
                    }
                    if (iZza12 == i25) {
                        return iZza12;
                    }
                    throw zzjk.zza();
                }
                if (i11 != 0) {
                    return i;
                }
                zzhr zzhrVar2 = (zzhr) zzjlVar;
                int iZzb2 = zzhl.zzb(bArr, i, zzhnVar);
                zzhrVar2.zza(zzhnVar.zzb != 0);
                while (iZzb2 < i4) {
                    int iZza13 = zzhl.zza(bArr, iZzb2, zzhnVar);
                    if (i6 != zzhnVar.zza) {
                        return iZzb2;
                    }
                    iZzb2 = zzhl.zzb(bArr, iZza13, zzhnVar);
                    zzhrVar2.zza(zzhnVar.zzb != 0);
                }
                return iZzb2;
            case 26:
                if (i11 != 2) {
                    return i;
                }
                if ((j & 536870912) == 0) {
                    int iZza14 = zzhl.zza(bArr, i, zzhnVar);
                    int i26 = zzhnVar.zza;
                    if (i26 < 0) {
                        throw zzjk.zzb();
                    }
                    if (i26 == 0) {
                        zzjlVar.add("");
                    } else {
                        zzjlVar.add(new String(bArr, iZza14, i26, zzjf.zza));
                        iZza14 += i26;
                    }
                    while (iZza14 < i4) {
                        int iZza15 = zzhl.zza(bArr, iZza14, zzhnVar);
                        if (i6 != zzhnVar.zza) {
                            return iZza14;
                        }
                        iZza14 = zzhl.zza(bArr, iZza15, zzhnVar);
                        int i27 = zzhnVar.zza;
                        if (i27 < 0) {
                            throw zzjk.zzb();
                        }
                        if (i27 == 0) {
                            zzjlVar.add("");
                        } else {
                            zzjlVar.add(new String(bArr, iZza14, i27, zzjf.zza));
                            iZza14 += i27;
                        }
                    }
                    return iZza14;
                }
                int iZza16 = zzhl.zza(bArr, i, zzhnVar);
                int i28 = zzhnVar.zza;
                if (i28 < 0) {
                    throw zzjk.zzb();
                }
                if (i28 == 0) {
                    zzjlVar.add("");
                } else {
                    int i29 = iZza16 + i28;
                    if (zzmd.zza(bArr, iZza16, i29)) {
                        zzjlVar.add(new String(bArr, iZza16, i28, zzjf.zza));
                        iZza16 = i29;
                    } else {
                        throw zzjk.zzh();
                    }
                }
                while (iZza16 < i4) {
                    int iZza17 = zzhl.zza(bArr, iZza16, zzhnVar);
                    if (i6 != zzhnVar.zza) {
                        return iZza16;
                    }
                    iZza16 = zzhl.zza(bArr, iZza17, zzhnVar);
                    int i30 = zzhnVar.zza;
                    if (i30 < 0) {
                        throw zzjk.zzb();
                    }
                    if (i30 == 0) {
                        zzjlVar.add("");
                    } else {
                        int i31 = iZza16 + i30;
                        if (zzmd.zza(bArr, iZza16, i31)) {
                            zzjlVar.add(new String(bArr, iZza16, i30, zzjf.zza));
                            iZza16 = i31;
                        } else {
                            throw zzjk.zzh();
                        }
                    }
                }
                return iZza16;
            case 27:
                i14 = i;
                if (i11 == 2) {
                    return zzhl.zza(zza(i12), i6, bArr, i14, i4, zzjlVar, zzhnVar);
                }
                return i14;
            case 28:
                i14 = i;
                if (i11 == 2) {
                    int iZza18 = zzhl.zza(bArr, i14, zzhnVar);
                    int i32 = zzhnVar.zza;
                    if (i32 >= 0) {
                        if (i32 > bArr.length - iZza18) {
                            throw zzjk.zza();
                        }
                        if (i32 == 0) {
                            zzjlVar.add(zzht.zza);
                        } else {
                            zzjlVar.add(zzht.zza(bArr, iZza18, i32));
                            iZza18 += i32;
                        }
                        while (iZza18 < i4) {
                            int iZza19 = zzhl.zza(bArr, iZza18, zzhnVar);
                            if (i6 != zzhnVar.zza) {
                                return iZza18;
                            }
                            iZza18 = zzhl.zza(bArr, iZza19, zzhnVar);
                            int i33 = zzhnVar.zza;
                            if (i33 >= 0) {
                                if (i33 > bArr.length - iZza18) {
                                    throw zzjk.zza();
                                }
                                if (i33 == 0) {
                                    zzjlVar.add(zzht.zza);
                                } else {
                                    zzjlVar.add(zzht.zza(bArr, iZza18, i33));
                                    iZza18 += i33;
                                }
                            } else {
                                throw zzjk.zzb();
                            }
                        }
                        return iZza18;
                    }
                    throw zzjk.zzb();
                }
                return i14;
            case 30:
            case 44:
                i15 = i;
                if (i11 != 2) {
                    if (i11 == 0) {
                        iZza = zzhl.zza(i6, bArr, i15, i4, (zzjl<?>) zzjlVar, zzhnVar);
                    }
                    return i15;
                }
                iZza = zzhl.zza(bArr, i15, (zzjl<?>) zzjlVar, zzhnVar);
                zzjb zzjbVar = (zzjb) t5;
                zzlx zzlxVar = zzjbVar.zzb;
                if (zzlxVar == zzlx.zza()) {
                    zzlxVar = null;
                }
                zzlx zzlxVar2 = (zzlx) zzle.zza(i10, zzjlVar, zzc(i12), zzlxVar, this.zzq);
                if (zzlxVar2 != null) {
                    zzjbVar.zzb = zzlxVar2;
                }
                return iZza;
            case 33:
            case 47:
                i15 = i;
                if (i11 == 2) {
                    zzjd zzjdVar3 = (zzjd) zzjlVar;
                    int iZza20 = zzhl.zza(bArr, i15, zzhnVar);
                    int i34 = zzhnVar.zza + iZza20;
                    while (iZza20 < i34) {
                        iZza20 = zzhl.zza(bArr, iZza20, zzhnVar);
                        zzjdVar3.zzc(zzif.zze(zzhnVar.zza));
                    }
                    if (iZza20 == i34) {
                        return iZza20;
                    }
                    throw zzjk.zza();
                }
                if (i11 == 0) {
                    zzjd zzjdVar4 = (zzjd) zzjlVar;
                    int iZza21 = zzhl.zza(bArr, i15, zzhnVar);
                    zzjdVar4.zzc(zzif.zze(zzhnVar.zza));
                    while (iZza21 < i4) {
                        int iZza22 = zzhl.zza(bArr, iZza21, zzhnVar);
                        if (i6 != zzhnVar.zza) {
                            return iZza21;
                        }
                        iZza21 = zzhl.zza(bArr, iZza22, zzhnVar);
                        zzjdVar4.zzc(zzif.zze(zzhnVar.zza));
                    }
                    return iZza21;
                }
                return i15;
            case 34:
            case 48:
                i15 = i;
                if (i11 == 2) {
                    zzjy zzjyVar5 = (zzjy) zzjlVar;
                    int iZza23 = zzhl.zza(bArr, i15, zzhnVar);
                    int i35 = zzhnVar.zza + iZza23;
                    while (iZza23 < i35) {
                        iZza23 = zzhl.zzb(bArr, iZza23, zzhnVar);
                        zzjyVar5.zza(zzif.zza(zzhnVar.zzb));
                    }
                    if (iZza23 == i35) {
                        return iZza23;
                    }
                    throw zzjk.zza();
                }
                if (i11 == 0) {
                    zzjy zzjyVar6 = (zzjy) zzjlVar;
                    int iZzb3 = zzhl.zzb(bArr, i15, zzhnVar);
                    zzjyVar6.zza(zzif.zza(zzhnVar.zzb));
                    while (iZzb3 < i4) {
                        int iZza24 = zzhl.zza(bArr, iZzb3, zzhnVar);
                        if (i6 != zzhnVar.zza) {
                            return iZzb3;
                        }
                        iZzb3 = zzhl.zzb(bArr, iZza24, zzhnVar);
                        zzjyVar6.zza(zzif.zza(zzhnVar.zzb));
                    }
                    return iZzb3;
                }
                return i15;
            case 49:
                if (i11 == 3) {
                    zzlc zzlcVarZza = zza(i12);
                    int i36 = (i6 & (-8)) | 4;
                    int iZza25 = zzhl.zza(zzlcVarZza, bArr, i, i4, i36, zzhnVar);
                    zzlc zzlcVar = zzlcVarZza;
                    int i37 = i4;
                    zzhn zzhnVar2 = zzhnVar;
                    zzjlVar.add(zzhnVar2.zzc);
                    while (iZza25 < i37) {
                        int iZza26 = zzhl.zza(bArr, iZza25, zzhnVar2);
                        if (i6 != zzhnVar2.zza) {
                            return iZza25;
                        }
                        zzlc zzlcVar2 = zzlcVar;
                        int i38 = i37;
                        zzhn zzhnVar3 = zzhnVar2;
                        iZza25 = zzhl.zza(zzlcVar2, bArr, iZza26, i38, i36, zzhnVar3);
                        zzjlVar.add(zzhnVar3.zzc);
                        zzlcVar = zzlcVar2;
                        i37 = i38;
                        zzhnVar2 = zzhnVar3;
                    }
                    return iZza25;
                }
            default:
                return i;
        }
    }

    private final <K, V> int zza(T t5, byte[] bArr, int i, int i4, int i6, long j, zzhn zzhnVar) throws IOException {
        byte[] bArr2;
        zzhn zzhnVar2;
        int i10;
        Unsafe unsafe = zzb;
        Object objZzb = zzb(i6);
        Object object = unsafe.getObject(t5, j);
        if (this.zzs.zzd(object)) {
            Object objZzf = this.zzs.zzf(objZzb);
            this.zzs.zza(objZzf, object);
            unsafe.putObject(t5, j, objZzf);
            object = objZzf;
        }
        zzkf<?, ?> zzkfVarZzb = this.zzs.zzb(objZzb);
        Map<?, ?> mapZza = this.zzs.zza(object);
        int iZza = zzhl.zza(bArr, i, zzhnVar);
        int i11 = zzhnVar.zza;
        if (i11 >= 0 && i11 <= i4 - iZza) {
            int i12 = i11 + iZza;
            K k8 = zzkfVarZzb.zzb;
            V v7 = zzkfVarZzb.zzd;
            while (iZza < i12) {
                int iZza2 = iZza + 1;
                int i13 = bArr[iZza];
                if (i13 < 0) {
                    iZza2 = zzhl.zza(i13, bArr, iZza2, zzhnVar);
                    i13 = zzhnVar.zza;
                }
                int i14 = iZza2;
                int i15 = i13 >>> 3;
                int i16 = i13 & 7;
                if (i15 != 1) {
                    if (i15 == 2 && i16 == zzkfVarZzb.zzc.zzb()) {
                        byte[] bArr3 = bArr;
                        int i17 = i4;
                        zzhn zzhnVar3 = zzhnVar;
                        iZza = zza(bArr3, i14, i17, zzkfVarZzb.zzc, zzkfVarZzb.zzd.getClass(), zzhnVar3);
                        v7 = (V) zzhnVar3.zzc;
                        i4 = i17;
                        bArr = bArr3;
                    } else {
                        bArr2 = bArr;
                        i10 = i4;
                        zzhnVar2 = zzhnVar;
                    }
                } else {
                    bArr2 = bArr;
                    int i18 = i4;
                    zzhnVar2 = zzhnVar;
                    if (i16 == zzkfVarZzb.zza.zzb()) {
                        i10 = i18;
                        iZza = zza(bArr2, i14, i10, zzkfVarZzb.zza, (Class<?>) null, zzhnVar2);
                        k8 = zzhnVar2.zzc;
                        bArr = bArr2;
                        i4 = i10;
                        zzhnVar = zzhnVar2;
                    } else {
                        i10 = i18;
                    }
                }
                iZza = zzhl.zza(i13, bArr2, i14, i10, zzhnVar2);
                k8 = k8;
                bArr = bArr2;
                i4 = i10;
                zzhnVar = zzhnVar2;
            }
            if (iZza == i12) {
                mapZza.put(k8, v7);
                return i12;
            }
            throw zzjk.zzg();
        }
        throw zzjk.zza();
    }

    private final int zza(T t5, byte[] bArr, int i, int i4, int i6, int i10, int i11, int i12, int i13, long j, int i14, zzhn zzhnVar) throws IOException {
        int i15;
        int i16;
        int iZzb;
        Object object;
        Unsafe unsafe = zzb;
        long j6 = this.zzc[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                i15 = i;
                if (i11 != 1) {
                    return i15;
                }
                unsafe.putObject(t5, j, Double.valueOf(zzhl.zzc(bArr, i)));
                iZzb = i15 + 8;
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 52:
                i16 = i;
                if (i11 != 5) {
                    return i16;
                }
                unsafe.putObject(t5, j, Float.valueOf(zzhl.zzd(bArr, i)));
                iZzb = i16 + 4;
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 53:
            case 54:
                if (i11 != 0) {
                    return i;
                }
                iZzb = zzhl.zzb(bArr, i, zzhnVar);
                unsafe.putObject(t5, j, Long.valueOf(zzhnVar.zzb));
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 55:
            case 62:
                if (i11 != 0) {
                    return i;
                }
                iZzb = zzhl.zza(bArr, i, zzhnVar);
                unsafe.putObject(t5, j, Integer.valueOf(zzhnVar.zza));
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 56:
            case 65:
                i15 = i;
                if (i11 != 1) {
                    return i15;
                }
                unsafe.putObject(t5, j, Long.valueOf(zzhl.zzb(bArr, i)));
                iZzb = i15 + 8;
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 57:
            case 64:
                i16 = i;
                if (i11 != 5) {
                    return i16;
                }
                unsafe.putObject(t5, j, Integer.valueOf(zzhl.zza(bArr, i)));
                iZzb = i16 + 4;
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 58:
                if (i11 != 0) {
                    return i;
                }
                iZzb = zzhl.zzb(bArr, i, zzhnVar);
                unsafe.putObject(t5, j, Boolean.valueOf(zzhnVar.zzb != 0));
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 59:
                if (i11 != 2) {
                    return i;
                }
                int iZza = zzhl.zza(bArr, i, zzhnVar);
                int i17 = zzhnVar.zza;
                if (i17 == 0) {
                    unsafe.putObject(t5, j, "");
                } else {
                    if ((i12 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 && !zzmd.zza(bArr, iZza, iZza + i17)) {
                        throw zzjk.zzh();
                    }
                    unsafe.putObject(t5, j, new String(bArr, iZza, i17, zzjf.zza));
                    iZza += i17;
                }
                unsafe.putInt(t5, j6, i10);
                return iZza;
            case 60:
                if (i11 != 2) {
                    return i;
                }
                int iZza2 = zzhl.zza(zza(i14), bArr, i, i4, zzhnVar);
                object = unsafe.getInt(t5, j6) == i10 ? unsafe.getObject(t5, j) : null;
                if (object == null) {
                    unsafe.putObject(t5, j, zzhnVar.zzc);
                } else {
                    unsafe.putObject(t5, j, zzjf.zza(object, zzhnVar.zzc));
                }
                unsafe.putInt(t5, j6, i10);
                return iZza2;
            case 61:
                if (i11 != 2) {
                    return i;
                }
                iZzb = zzhl.zze(bArr, i, zzhnVar);
                unsafe.putObject(t5, j, zzhnVar.zzc);
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 63:
                if (i11 != 0) {
                    return i;
                }
                int iZza3 = zzhl.zza(bArr, i, zzhnVar);
                int i18 = zzhnVar.zza;
                zzjg zzjgVarZzc = zzc(i14);
                if (zzjgVarZzc != null && !zzjgVarZzc.zza(i18)) {
                    zze(t5).zza(i6, Long.valueOf(i18));
                    return iZza3;
                }
                unsafe.putObject(t5, j, Integer.valueOf(i18));
                iZzb = iZza3;
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 66:
                if (i11 != 0) {
                    return i;
                }
                iZzb = zzhl.zza(bArr, i, zzhnVar);
                unsafe.putObject(t5, j, Integer.valueOf(zzif.zze(zzhnVar.zza)));
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 67:
                if (i11 != 0) {
                    return i;
                }
                iZzb = zzhl.zzb(bArr, i, zzhnVar);
                unsafe.putObject(t5, j, Long.valueOf(zzif.zza(zzhnVar.zzb)));
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 68:
                if (i11 == 3) {
                    iZzb = zzhl.zza(zza(i14), bArr, i, i4, (i6 & (-8)) | 4, zzhnVar);
                    object = unsafe.getInt(t5, j6) == i10 ? unsafe.getObject(t5, j) : null;
                    if (object == null) {
                        unsafe.putObject(t5, j, zzhnVar.zzc);
                    } else {
                        unsafe.putObject(t5, j, zzjf.zza(object, zzhnVar.zzc));
                    }
                    unsafe.putInt(t5, j6, i10);
                    return iZzb;
                }
            default:
                return i;
        }
    }

    private final zzlc zza(int i) {
        int i4 = (i / 3) << 1;
        zzlc zzlcVar = (zzlc) this.zzd[i4];
        if (zzlcVar != null) {
            return zzlcVar;
        }
        zzlc<T> zzlcVarZza = zzky.zza().zza((Class) this.zzd[i4 + 1]);
        this.zzd[i4] = zzlcVarZza;
        return zzlcVarZza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x05f3, code lost:
    
        if (r11 == 1048575) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x05f5, code lost:
    
        r22.putInt(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05fb, code lost:
    
        r0 = r9.zzm;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0601, code lost:
    
        if (r0 >= r9.zzn) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0603, code lost:
    
        r1 = (com.google.android.gms.internal.vision.zzlx) r9.zza(r10, r9.zzl[r0], r1, (com.google.android.gms.internal.vision.zzlu<UT, com.google.android.gms.internal.vision.zzlx>) r9.zzq);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0612, code lost:
    
        if (r1 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0614, code lost:
    
        r9.zzq.zzb(r10, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0619, code lost:
    
        if (r14 != 0) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x061b, code lost:
    
        if (r4 != r3) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0622, code lost:
    
        throw com.google.android.gms.internal.vision.zzjk.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0623, code lost:
    
        if (r4 > r3) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0625, code lost:
    
        if (r13 != r14) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0627, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x062c, code lost:
    
        throw com.google.android.gms.internal.vision.zzjk.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0590  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.vision.zzhn r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.vision.zzhn):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0087. Please report as an issue. */
    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zza(T t5, byte[] bArr, int i, int i4, zzhn zzhnVar) throws IOException {
        int iZzg;
        T t10;
        Unsafe unsafe;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zzko<T> zzkoVar = this;
        T t11 = t5;
        byte[] bArr2 = bArr;
        int i19 = i4;
        zzhn zzhnVar2 = zzhnVar;
        if (zzkoVar.zzj) {
            Unsafe unsafe2 = zzb;
            int i20 = -1;
            int iZzb = i;
            int i21 = -1;
            int i22 = 0;
            int i23 = 0;
            int i24 = 1048575;
            while (iZzb < i19) {
                int iZza = iZzb + 1;
                int i25 = bArr2[iZzb];
                if (i25 < 0) {
                    iZza = zzhl.zza(i25, bArr2, iZza, zzhnVar2);
                    i25 = zzhnVar2.zza;
                }
                int i26 = iZza;
                int i27 = i25 >>> 3;
                int i28 = i25 & 7;
                if (i27 > i21) {
                    iZzg = zzkoVar.zza(i27, i22 / 3);
                } else {
                    iZzg = zzkoVar.zzg(i27);
                }
                if (iZzg == i20) {
                    t10 = t11;
                    unsafe = unsafe2;
                    i6 = i25;
                    i10 = i27;
                    i11 = 0;
                } else {
                    int[] iArr = zzkoVar.zzc;
                    int i29 = iArr[iZzg + 1];
                    int i30 = (i29 & 267386880) >>> 20;
                    int i31 = i25;
                    int i32 = iZzg;
                    long j = i29 & 1048575;
                    if (i30 <= 17) {
                        int i33 = iArr[i32 + 2];
                        int i34 = 1 << (i33 >>> 20);
                        int i35 = i33 & 1048575;
                        int i36 = 1048575;
                        if (i35 != i24) {
                            if (i24 != 1048575) {
                                unsafe2.putInt(t11, i24, i23);
                                i36 = 1048575;
                            }
                            if (i35 != i36) {
                                i23 = unsafe2.getInt(t11, i35);
                            }
                            i24 = i35;
                        }
                        switch (i30) {
                            case 0:
                                i17 = i36;
                                if (i28 != 1) {
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    zzma.zza(t11, j, zzhl.zzc(bArr2, i26));
                                    iZzb = i26 + 8;
                                    i23 |= i34;
                                    i19 = i4;
                                    i21 = i27;
                                    i22 = i32;
                                    i20 = -1;
                                }
                                break;
                            case 1:
                                i17 = i36;
                                if (i28 != 5) {
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    zzma.zza((Object) t11, j, zzhl.zzd(bArr2, i26));
                                    iZzb = i26 + 4;
                                    i23 |= i34;
                                    i19 = i4;
                                    i21 = i27;
                                    i22 = i32;
                                    i20 = -1;
                                }
                                break;
                            case 2:
                            case 3:
                                i17 = i36;
                                if (i28 != 0) {
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    int iZzb2 = zzhl.zzb(bArr2, i26, zzhnVar2);
                                    Unsafe unsafe3 = unsafe2;
                                    T t12 = t11;
                                    unsafe3.putLong(t12, j, zzhnVar2.zzb);
                                    unsafe2 = unsafe3;
                                    t11 = t12;
                                    i23 |= i34;
                                    iZzb = iZzb2;
                                    i21 = i27;
                                    i22 = i32;
                                    i20 = -1;
                                    i19 = i4;
                                }
                                break;
                            case 4:
                            case 11:
                                i17 = i36;
                                if (i28 != 0) {
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    int iZza2 = zzhl.zza(bArr2, i26, zzhnVar2);
                                    unsafe2.putInt(t11, j, zzhnVar2.zza);
                                    i23 |= i34;
                                    i19 = i4;
                                    iZzb = iZza2;
                                    i21 = i27;
                                    i22 = i32;
                                    i20 = -1;
                                }
                                break;
                            case 5:
                            case 14:
                                i17 = i36;
                                if (i28 != 1) {
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    Unsafe unsafe4 = unsafe2;
                                    T t13 = t11;
                                    unsafe4.putLong(t13, j, zzhl.zzb(bArr2, i26));
                                    unsafe2 = unsafe4;
                                    t11 = t13;
                                    iZzb = i26 + 8;
                                    i23 |= i34;
                                    i19 = i4;
                                    i21 = i27;
                                    i22 = i32;
                                    i20 = -1;
                                }
                                break;
                            case 6:
                            case 13:
                                i17 = i36;
                                if (i28 != 5) {
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    unsafe2.putInt(t11, j, zzhl.zza(bArr2, i26));
                                    iZzb = i26 + 4;
                                    i23 |= i34;
                                    i19 = i4;
                                    i21 = i27;
                                    i22 = i32;
                                    i20 = -1;
                                }
                                break;
                            case 7:
                                i17 = i36;
                                if (i28 != 0) {
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    iZzb = zzhl.zzb(bArr2, i26, zzhnVar2);
                                    zzma.zza(t11, j, zzhnVar2.zzb != 0);
                                    i23 |= i34;
                                    i19 = i4;
                                    i21 = i27;
                                    i22 = i32;
                                    i20 = -1;
                                }
                                break;
                            case 8:
                                i17 = i36;
                                if (i28 != 2) {
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    if ((536870912 & i29) == 0) {
                                        iZzb = zzhl.zzc(bArr2, i26, zzhnVar2);
                                    } else {
                                        iZzb = zzhl.zzd(bArr2, i26, zzhnVar2);
                                    }
                                    unsafe2.putObject(t11, j, zzhnVar2.zzc);
                                    i23 |= i34;
                                    i21 = i27;
                                    i22 = i32;
                                    i20 = -1;
                                }
                                break;
                            case 9:
                                i17 = i36;
                                i18 = i32;
                                if (i28 != 2) {
                                    i32 = i18;
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    iZzb = zzhl.zza(zzkoVar.zza(i18), bArr2, i26, i19, zzhnVar2);
                                    Object object = unsafe2.getObject(t11, j);
                                    if (object == null) {
                                        unsafe2.putObject(t11, j, zzhnVar2.zzc);
                                    } else {
                                        unsafe2.putObject(t11, j, zzjf.zza(object, zzhnVar2.zzc));
                                    }
                                    i23 |= i34;
                                    i21 = i27;
                                    i22 = i18;
                                    i20 = -1;
                                }
                                break;
                            case 10:
                                i17 = i36;
                                i18 = i32;
                                if (i28 != 2) {
                                    i32 = i18;
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    iZzb = zzhl.zze(bArr2, i26, zzhnVar2);
                                    unsafe2.putObject(t11, j, zzhnVar2.zzc);
                                    i23 |= i34;
                                    i21 = i27;
                                    i22 = i18;
                                    i20 = -1;
                                }
                                break;
                            case 12:
                                i17 = i36;
                                i18 = i32;
                                if (i28 != 0) {
                                    i32 = i18;
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    iZzb = zzhl.zza(bArr2, i26, zzhnVar2);
                                    unsafe2.putInt(t11, j, zzhnVar2.zza);
                                    i23 |= i34;
                                    i21 = i27;
                                    i22 = i18;
                                    i20 = -1;
                                }
                                break;
                            case 15:
                                i17 = i36;
                                i18 = i32;
                                if (i28 != 0) {
                                    i32 = i18;
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    iZzb = zzhl.zza(bArr2, i26, zzhnVar2);
                                    unsafe2.putInt(t11, j, zzif.zze(zzhnVar2.zza));
                                    i23 |= i34;
                                    i21 = i27;
                                    i22 = i18;
                                    i20 = -1;
                                }
                                break;
                            case 16:
                                if (i28 != 0) {
                                    i17 = i36;
                                    t10 = t11;
                                    unsafe = unsafe2;
                                    i10 = i27;
                                    i11 = i32;
                                    i6 = i31 == true ? 1 : 0;
                                } else {
                                    int iZzb3 = zzhl.zzb(bArr2, i26, zzhnVar2);
                                    Unsafe unsafe5 = unsafe2;
                                    T t14 = t11;
                                    i18 = i32;
                                    unsafe5.putLong(t14, j, zzif.zza(zzhnVar2.zzb));
                                    unsafe2 = unsafe5;
                                    t11 = t14;
                                    i23 |= i34;
                                    iZzb = iZzb3;
                                    i21 = i27;
                                    i22 = i18;
                                    i20 = -1;
                                }
                                break;
                            default:
                                i17 = i36;
                                t10 = t11;
                                unsafe = unsafe2;
                                i10 = i27;
                                i11 = i32;
                                i6 = i31 == true ? 1 : 0;
                                break;
                        }
                    } else {
                        i11 = i32;
                        if (i30 != 27) {
                            i12 = i26;
                            Unsafe unsafe6 = unsafe2;
                            if (i30 <= 49) {
                                int i37 = i24;
                                i13 = i23;
                                unsafe = unsafe6;
                                int iZza3 = zzkoVar.zza(t5, bArr, i12, i4, i31 == true ? 1 : 0, i27, i28, i11, i29, i30, j, zzhnVar);
                                if (iZza3 == i12) {
                                    i26 = iZza3;
                                    i10 = i27;
                                    i6 = i31 == true ? 1 : 0;
                                    i23 = i13;
                                    t10 = t5;
                                    i24 = i37;
                                } else {
                                    zzkoVar = this;
                                    t11 = t5;
                                    i24 = i37;
                                    zzhnVar2 = zzhnVar;
                                    iZzb = iZza3;
                                    i22 = i11;
                                    i21 = i27;
                                    i23 = i13;
                                    unsafe2 = unsafe;
                                    i20 = -1;
                                    bArr2 = bArr;
                                    i19 = i4;
                                }
                            } else {
                                i13 = i23;
                                unsafe = unsafe6;
                                i14 = i27;
                                i15 = i24;
                                i16 = i31 == true ? 1 : 0;
                                if (i30 != 50) {
                                    i10 = i14;
                                    int iZza4 = zza(t5, bArr, i12, i4, i16 == true ? 1 : 0, i10, i28, i29, i30, j, i11, zzhnVar);
                                    t10 = t5;
                                    i6 = i16 == true ? 1 : 0;
                                    i11 = i11;
                                    if (iZza4 == i12) {
                                        i26 = iZza4;
                                        i24 = i15;
                                        i23 = i13;
                                    } else {
                                        zzkoVar = this;
                                        zzhnVar2 = zzhnVar;
                                        i21 = i10;
                                        iZzb = iZza4;
                                        i22 = i11;
                                        t11 = t10;
                                        i24 = i15;
                                        i23 = i13;
                                        unsafe2 = unsafe;
                                        i20 = -1;
                                        bArr2 = bArr;
                                        i19 = i4;
                                    }
                                } else if (i28 == 2) {
                                    int iZza5 = zza(t5, bArr, i12, i4, i11, j, zzhnVar);
                                    i11 = i11;
                                    if (iZza5 == i12) {
                                        i26 = iZza5;
                                        i10 = i14;
                                        i6 = i16;
                                        i24 = i15;
                                        i23 = i13;
                                        t10 = t5;
                                    } else {
                                        zzkoVar = this;
                                        t11 = t5;
                                        bArr2 = bArr;
                                        zzhnVar2 = zzhnVar;
                                        iZzb = iZza5;
                                        i22 = i11;
                                        i21 = i14;
                                        i24 = i15;
                                        i23 = i13;
                                        unsafe2 = unsafe;
                                        i20 = -1;
                                        i19 = i4;
                                    }
                                } else {
                                    i11 = i11;
                                    i26 = i12;
                                    i10 = i14;
                                    i6 = i16;
                                    i24 = i15;
                                    i23 = i13;
                                    t10 = t5;
                                }
                            }
                        } else if (i28 == 2) {
                            zzjl zzjlVarZza = (zzjl) unsafe2.getObject(t11, j);
                            if (!zzjlVarZza.zza()) {
                                int size = zzjlVarZza.size();
                                zzjlVarZza = zzjlVarZza.zza(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t11, j, zzjlVarZza);
                            }
                            int iZza6 = zzhl.zza(zzkoVar.zza(i11), i31 == true ? 1 : 0, bArr2, i26, i4, zzjlVarZza, zzhnVar2);
                            bArr2 = bArr;
                            zzhnVar2 = zzhnVar;
                            iZzb = iZza6;
                            i22 = i11;
                            unsafe2 = unsafe2;
                            i21 = i27;
                            i20 = -1;
                            t11 = t5;
                            i19 = i4;
                        } else {
                            i12 = i26;
                            i13 = i23;
                            unsafe = unsafe2;
                            i14 = i27;
                            i15 = i24;
                            i16 = i31 == true ? 1 : 0;
                            i26 = i12;
                            i10 = i14;
                            i6 = i16;
                            i24 = i15;
                            i23 = i13;
                            t10 = t5;
                        }
                    }
                }
                int iZza7 = zzhl.zza(i6 == true ? 1 : 0, bArr, i26, i4, zze(t10), zzhnVar);
                bArr2 = bArr;
                zzhnVar2 = zzhnVar;
                i21 = i10;
                i22 = i11;
                t11 = t10;
                unsafe2 = unsafe;
                i20 = -1;
                i19 = i4;
                iZzb = iZza7;
                zzkoVar = this;
            }
            T t15 = t11;
            Unsafe unsafe7 = unsafe2;
            int i38 = i19;
            int i39 = i24;
            int i40 = i23;
            if (i39 != 1048575) {
                unsafe7.putInt(t15, i39, i40);
            }
            if (iZzb != i38) {
                throw zzjk.zzg();
            }
            return;
        }
        zza(t11, bArr, i, i19, 0, zzhnVar);
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzlu<UT, UB> zzluVar) {
        zzjg zzjgVarZzc;
        int i4 = this.zzc[i];
        Object objZzf = zzma.zzf(obj, zzd(i) & 1048575);
        return (objZzf == null || (zzjgVarZzc = zzc(i)) == null) ? ub : (UB) zza(i, i4, this.zzs.zza(objZzf), zzjgVarZzc, ub, zzluVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i4, Map<K, V> map, zzjg zzjgVar, UB ub, zzlu<UT, UB> zzluVar) {
        zzkf<?, ?> zzkfVarZzb = this.zzs.zzb(zzb(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjgVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzluVar.zza();
                }
                zzib zzibVarZzc = zzht.zzc(zzkc.zza(zzkfVarZzb, next.getKey(), next.getValue()));
                try {
                    zzkc.zza(zzibVarZzc.zzb(), zzkfVarZzb, next.getKey(), next.getValue());
                    zzluVar.zza(ub, i4, zzibVarZzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzlc zzlcVar) {
        return zzlcVar.zzd(zzma.zzf(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzmr zzmrVar) throws IOException {
        if (obj instanceof String) {
            zzmrVar.zza(i, (String) obj);
        } else {
            zzmrVar.zza(i, (zzht) obj);
        }
    }

    private final void zza(Object obj, int i, zzld zzldVar) throws IOException {
        if (zzf(i)) {
            zzma.zza(obj, i & 1048575, zzldVar.zzm());
        } else if (this.zzi) {
            zzma.zza(obj, i & 1048575, zzldVar.zzl());
        } else {
            zzma.zza(obj, i & 1048575, zzldVar.zzn());
        }
    }

    private final boolean zza(T t5, int i, int i4, int i6, int i10) {
        if (i4 == 1048575) {
            return zza((Object) t5, i);
        }
        return (i6 & i10) != 0;
    }

    private final boolean zza(T t5, int i) {
        int iZze = zze(i);
        long j = iZze & 1048575;
        if (j != 1048575) {
            return (zzma.zza(t5, j) & (1 << (iZze >>> 20))) != 0;
        }
        int iZzd = zzd(i);
        long j6 = iZzd & 1048575;
        switch ((iZzd & 267386880) >>> 20) {
            case 0:
                return zzma.zze(t5, j6) != AudioStats.AUDIO_AMPLITUDE_NONE;
            case 1:
                return zzma.zzd(t5, j6) != 0.0f;
            case 2:
                return zzma.zzb(t5, j6) != 0;
            case 3:
                return zzma.zzb(t5, j6) != 0;
            case 4:
                return zzma.zza(t5, j6) != 0;
            case 5:
                return zzma.zzb(t5, j6) != 0;
            case 6:
                return zzma.zza(t5, j6) != 0;
            case 7:
                return zzma.zzc(t5, j6);
            case 8:
                Object objZzf = zzma.zzf(t5, j6);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzht) {
                    return !zzht.zza.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzma.zzf(t5, j6) != null;
            case 10:
                return !zzht.zza.equals(zzma.zzf(t5, j6));
            case 11:
                return zzma.zza(t5, j6) != 0;
            case 12:
                return zzma.zza(t5, j6) != 0;
            case 13:
                return zzma.zza(t5, j6) != 0;
            case 14:
                return zzma.zzb(t5, j6) != 0;
            case 15:
                return zzma.zza(t5, j6) != 0;
            case 16:
                return zzma.zzb(t5, j6) != 0;
            case 17:
                return zzma.zzf(t5, j6) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t5, int i, int i4) {
        return zzma.zza(t5, (long) (zze(i4) & 1048575)) == i;
    }

    private final int zza(int i, int i4) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, i4);
    }
}
