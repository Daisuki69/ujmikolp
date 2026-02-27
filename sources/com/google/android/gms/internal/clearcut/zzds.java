package com.google.android.gms.internal.clearcut;

import androidx.camera.video.AudioStats;
import androidx.media3.common.C;
import com.google.android.gms.internal.clearcut.zzcg;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzds<T> implements zzef<T> {
    private static final Unsafe zzmh = zzfd.zzef();
    private final int[] zzmi;
    private final Object[] zzmj;
    private final int zzmk;
    private final int zzml;
    private final int zzmm;
    private final zzdo zzmn;
    private final boolean zzmo;
    private final boolean zzmp;
    private final boolean zzmq;
    private final boolean zzmr;
    private final int[] zzms;
    private final int[] zzmt;
    private final int[] zzmu;
    private final zzdw zzmv;
    private final zzcy zzmw;
    private final zzex<?, ?> zzmx;
    private final zzbu<?> zzmy;
    private final zzdj zzmz;

    private zzds(int[] iArr, Object[] objArr, int i, int i4, int i6, zzdo zzdoVar, boolean z4, boolean z5, int[] iArr2, int[] iArr3, int[] iArr4, zzdw zzdwVar, zzcy zzcyVar, zzex<?, ?> zzexVar, zzbu<?> zzbuVar, zzdj zzdjVar) {
        this.zzmi = iArr;
        this.zzmj = objArr;
        this.zzmk = i;
        this.zzml = i4;
        this.zzmm = i6;
        this.zzmp = zzdoVar instanceof zzcg;
        this.zzmq = z4;
        this.zzmo = zzbuVar != null && zzbuVar.zze(zzdoVar);
        this.zzmr = false;
        this.zzms = iArr2;
        this.zzmt = iArr3;
        this.zzmu = iArr4;
        this.zzmv = zzdwVar;
        this.zzmw = zzcyVar;
        this.zzmx = zzexVar;
        this.zzmy = zzbuVar;
        this.zzmn = zzdoVar;
        this.zzmz = zzdjVar;
    }

    private static int zza(int i, byte[] bArr, int i4, int i6, Object obj, zzay zzayVar) throws IOException {
        return zzax.zza(i, bArr, i4, i6, zzn(obj), zzayVar);
    }

    private final zzef zzad(int i) {
        int i4 = (i / 4) << 1;
        zzef zzefVar = (zzef) this.zzmj[i4];
        if (zzefVar != null) {
            return zzefVar;
        }
        zzef<T> zzefVarZze = zzea.zzcm().zze((Class) this.zzmj[i4 + 1]);
        this.zzmj[i4] = zzefVarZze;
        return zzefVarZze;
    }

    private final Object zzae(int i) {
        return this.zzmj[(i / 4) << 1];
    }

    private final zzck<?> zzaf(int i) {
        return (zzck) this.zzmj[((i / 4) << 1) + 1];
    }

    private final int zzag(int i) {
        return this.zzmi[i + 1];
    }

    private final int zzah(int i) {
        return this.zzmi[i + 2];
    }

    private final int zzai(int i) {
        int i4 = this.zzmk;
        if (i >= i4) {
            int i6 = this.zzmm;
            if (i < i6) {
                int i10 = (i - i4) << 2;
                if (this.zzmi[i10] == i) {
                    return i10;
                }
                return -1;
            }
            if (i <= this.zzml) {
                int i11 = i6 - i4;
                int length = (this.zzmi.length / 4) - 1;
                while (i11 <= length) {
                    int i12 = (length + i11) >>> 1;
                    int i13 = i12 << 2;
                    int i14 = this.zzmi[i13];
                    if (i == i14) {
                        return i13;
                    }
                    if (i < i14) {
                        length = i12 - 1;
                    } else {
                        i11 = i12 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void zzb(T t5, int i) {
        if (this.zzmq) {
            return;
        }
        int iZzah = zzah(i);
        long j = iZzah & 1048575;
        zzfd.zza((Object) t5, j, zzfd.zzj(t5, j) | (1 << (iZzah >>> 20)));
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zzfd.zzo(obj, j);
    }

    private static <T> double zze(T t5, long j) {
        return ((Double) zzfd.zzo(t5, j)).doubleValue();
    }

    private static <T> float zzf(T t5, long j) {
        return ((Float) zzfd.zzo(t5, j)).floatValue();
    }

    private static <T> int zzg(T t5, long j) {
        return ((Integer) zzfd.zzo(t5, j)).intValue();
    }

    private static <T> long zzh(T t5, long j) {
        return ((Long) zzfd.zzo(t5, j)).longValue();
    }

    private static <T> boolean zzi(T t5, long j) {
        return ((Boolean) zzfd.zzo(t5, j)).booleanValue();
    }

    private static zzey zzn(Object obj) {
        zzcg zzcgVar = (zzcg) obj;
        zzey zzeyVar = zzcgVar.zzjp;
        if (zzeyVar != zzey.zzea()) {
            return zzeyVar;
        }
        zzey zzeyVarZzeb = zzey.zzeb();
        zzcgVar.zzjp = zzeyVarZzeb;
        return zzeyVarZzeb;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(T r10, T r11) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7 A[PHI: r3
  0x00f7: PHI (r3v9 java.lang.Object) = (r3v6 java.lang.Object), (r3v10 java.lang.Object) binds: [B:75:0x0113, B:69:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode(T r9) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.hashCode(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final T newInstance() {
        return (T) this.zzmv.newInstance(this.zzmn);
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(T t5) {
        int[] iArr = this.zzmt;
        if (iArr != null) {
            for (int i : iArr) {
                long jZzag = zzag(i) & 1048575;
                Object objZzo = zzfd.zzo(t5, jZzag);
                if (objZzo != null) {
                    zzfd.zza(t5, jZzag, this.zzmz.zzj(objZzo));
                }
            }
        }
        int[] iArr2 = this.zzmu;
        if (iArr2 != null) {
            for (int i4 : iArr2) {
                this.zzmw.zza(t5, i4);
            }
        }
        this.zzmx.zzc(t5);
        if (this.zzmo) {
            this.zzmy.zzc(t5);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x048e, code lost:
    
        if (zza(r21, r15, r4) != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0490, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, (com.google.android.gms.internal.clearcut.zzdo) r2.getObject(r21, r13), zzad(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04c7, code lost:
    
        if (zza(r21, r15, r4) != false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04c9, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzh(r15, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04d2, code lost:
    
        if (zza(r21, r15, r4) != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04d4, code lost:
    
        r8 = com.google.android.gms.internal.clearcut.zzbn.zzk(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x04fd, code lost:
    
        if (zza(r21, r15, r4) != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04ff, code lost:
    
        r6 = r2.getObject(r21, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x050e, code lost:
    
        if (zza(r21, r15, r4) != false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0510, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzeh.zzc(r15, r2.getObject(r21, r13), zzad(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0539, code lost:
    
        if (zza(r21, r15, r4) != false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x053b, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x077c, code lost:
    
        if ((r12 & r19) != 0) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0796, code lost:
    
        if ((r12 & r19) != 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x079c, code lost:
    
        if ((r12 & r19) != 0) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x07b6, code lost:
    
        if ((r12 & r19) != 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x07bc, code lost:
    
        if ((r12 & r19) != 0) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x07d0, code lost:
    
        if ((r12 & r19) != 0) goto L290;
     */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0503 A[PHI: r6
  0x0503: PHI (r6v118 java.lang.Object) = (r6v25 java.lang.Object), (r6v113 java.lang.Object), (r6v121 java.lang.Object) binds: [B:430:0x07ca, B:285:0x052a, B:276:0x04ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x052d A[PHI: r6
  0x052d: PHI (r6v109 java.lang.Object) = (r6v25 java.lang.Object), (r6v113 java.lang.Object) binds: [B:430:0x07ca, B:285:0x052a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05d4 A[PHI: r8
  0x05d4: PHI (r8v75 int) = 
  (r8v37 int)
  (r8v40 int)
  (r8v43 int)
  (r8v46 int)
  (r8v49 int)
  (r8v52 int)
  (r8v55 int)
  (r8v58 int)
  (r8v61 int)
  (r8v64 int)
  (r8v67 int)
  (r8v70 int)
  (r8v73 int)
  (r8v78 int)
 binds: [B:383:0x06c2, B:378:0x06b0, B:373:0x069e, B:368:0x068c, B:363:0x067a, B:358:0x0668, B:353:0x0656, B:348:0x0645, B:343:0x0634, B:338:0x0623, B:333:0x0612, B:328:0x0601, B:323:0x05f0, B:317:0x05d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a9 A[PHI: r4
  0x01a9: PHI (r4v77 int) = 
  (r4v42 int)
  (r4v45 int)
  (r4v48 int)
  (r4v51 int)
  (r4v54 int)
  (r4v57 int)
  (r4v60 int)
  (r4v63 int)
  (r4v66 int)
  (r4v69 int)
  (r4v72 int)
  (r4v75 int)
  (r4v80 int)
 binds: [B:148:0x027f, B:143:0x026d, B:138:0x025b, B:133:0x0249, B:128:0x0237, B:123:0x0226, B:118:0x0215, B:113:0x0204, B:108:0x01f3, B:103:0x01e2, B:98:0x01d1, B:93:0x01c0, B:87:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzm(T r21) {
        /*
            Method dump skipped, instruction units count: 2410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzm(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.google.android.gms.internal.clearcut.zzef] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.google.android.gms.internal.clearcut.zzef] */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzo(T r18) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzo(java.lang.Object):boolean");
    }

    private static int zza(zzef<?> zzefVar, int i, byte[] bArr, int i4, int i6, zzcn<?> zzcnVar, zzay zzayVar) throws IOException {
        int iZza = zza((zzef) zzefVar, bArr, i4, i6, zzayVar);
        while (true) {
            zzcnVar.add(zzayVar.zzff);
            if (iZza >= i6) {
                break;
            }
            int iZza2 = zzax.zza(bArr, iZza, zzayVar);
            if (i != zzayVar.zzfd) {
                break;
            }
            iZza = zza((zzef) zzefVar, bArr, iZza2, i6, zzayVar);
        }
        return iZza;
    }

    private final void zzb(T t5, int i, int i4) {
        zzfd.zza((Object) t5, zzah(i4) & 1048575, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(T r7, T r8) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzc(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(zzef zzefVar, byte[] bArr, int i, int i4, int i6, zzay zzayVar) throws IOException {
        zzds zzdsVar = (zzds) zzefVar;
        Object objNewInstance = zzdsVar.newInstance();
        int iZza = zzdsVar.zza(objNewInstance, bArr, i, i4, i6, zzayVar);
        zzdsVar.zzc(objNewInstance);
        zzayVar.zzff = objNewInstance;
        return iZza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzb(T r19, com.google.android.gms.internal.clearcut.zzfr r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzb(java.lang.Object, com.google.android.gms.internal.clearcut.zzfr):void");
    }

    private final boolean zzc(T t5, T t10, int i) {
        return zza(t5, i) == zza(t10, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(zzef zzefVar, byte[] bArr, int i, int i4, zzay zzayVar) throws IOException {
        int iZza = i + 1;
        int i6 = bArr[i];
        if (i6 < 0) {
            iZza = zzax.zza(i6, bArr, iZza, zzayVar);
            i6 = zzayVar.zzfd;
        }
        int i10 = iZza;
        if (i6 < 0 || i6 > i4 - i10) {
            throw zzco.zzbl();
        }
        Object objNewInstance = zzefVar.newInstance();
        int i11 = i10 + i6;
        zzefVar.zza(objNewInstance, bArr, i10, i11, zzayVar);
        zzefVar.zzc(objNewInstance);
        zzayVar.zzff = objNewInstance;
        return i11;
    }

    private final void zzb(T t5, T t10, int i) {
        int iZzag = zzag(i);
        int i4 = this.zzmi[i];
        long j = iZzag & 1048575;
        if (zza(t10, i4, i)) {
            Object objZzo = zzfd.zzo(t5, j);
            Object objZzo2 = zzfd.zzo(t10, j);
            if (objZzo != null && objZzo2 != null) {
                objZzo2 = zzci.zza(objZzo, objZzo2);
            } else if (objZzo2 == null) {
                return;
            }
            zzfd.zza(t5, j, objZzo2);
            zzb(t5, i4, i);
        }
    }

    private static <UT, UB> int zza(zzex<UT, UB> zzexVar, T t5) {
        return zzexVar.zzm(zzexVar.zzq(t5));
    }

    private final int zza(T t5, byte[] bArr, int i, int i4, int i6, int i10, int i11, int i12, int i13, long j, int i14, zzay zzayVar) throws IOException {
        int i15;
        Object objValueOf;
        int i16;
        Object objValueOf2;
        int iZzb;
        long jZza;
        int iZzm;
        Object objValueOf3;
        Object object;
        Unsafe unsafe = zzmh;
        long j6 = this.zzmi[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                i15 = i;
                if (i11 != 1) {
                    return i15;
                }
                objValueOf = Double.valueOf(zzax.zze(bArr, i));
                unsafe.putObject(t5, j, objValueOf);
                iZzb = i15 + 8;
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 52:
                i16 = i;
                if (i11 != 5) {
                    return i16;
                }
                objValueOf2 = Float.valueOf(zzax.zzf(bArr, i));
                unsafe.putObject(t5, j, objValueOf2);
                iZzb = i16 + 4;
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 53:
            case 54:
                if (i11 != 0) {
                    return i;
                }
                iZzb = zzax.zzb(bArr, i, zzayVar);
                jZza = zzayVar.zzfe;
                objValueOf3 = Long.valueOf(jZza);
                unsafe.putObject(t5, j, objValueOf3);
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 55:
            case 62:
                if (i11 != 0) {
                    return i;
                }
                iZzb = zzax.zza(bArr, i, zzayVar);
                iZzm = zzayVar.zzfd;
                objValueOf3 = Integer.valueOf(iZzm);
                unsafe.putObject(t5, j, objValueOf3);
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 56:
            case 65:
                i15 = i;
                if (i11 != 1) {
                    return i15;
                }
                objValueOf = Long.valueOf(zzax.zzd(bArr, i));
                unsafe.putObject(t5, j, objValueOf);
                iZzb = i15 + 8;
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 57:
            case 64:
                i16 = i;
                if (i11 != 5) {
                    return i16;
                }
                objValueOf2 = Integer.valueOf(zzax.zzc(bArr, i));
                unsafe.putObject(t5, j, objValueOf2);
                iZzb = i16 + 4;
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 58:
                if (i11 != 0) {
                    return i;
                }
                iZzb = zzax.zzb(bArr, i, zzayVar);
                objValueOf3 = Boolean.valueOf(zzayVar.zzfe != 0);
                unsafe.putObject(t5, j, objValueOf3);
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 59:
                if (i11 != 2) {
                    return i;
                }
                int iZza = zzax.zza(bArr, i, zzayVar);
                int i17 = zzayVar.zzfd;
                if (i17 == 0) {
                    unsafe.putObject(t5, j, "");
                } else {
                    if ((i12 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 && !zzff.zze(bArr, iZza, iZza + i17)) {
                        throw zzco.zzbp();
                    }
                    unsafe.putObject(t5, j, new String(bArr, iZza, i17, zzci.UTF_8));
                    iZza += i17;
                }
                unsafe.putInt(t5, j6, i10);
                return iZza;
            case 60:
                if (i11 != 2) {
                    return i;
                }
                int iZza2 = zza(zzad(i14), bArr, i, i4, zzayVar);
                object = unsafe.getInt(t5, j6) == i10 ? unsafe.getObject(t5, j) : null;
                Object objZza = zzayVar.zzff;
                if (object != null) {
                    objZza = zzci.zza(object, objZza);
                }
                unsafe.putObject(t5, j, objZza);
                unsafe.putInt(t5, j6, i10);
                return iZza2;
            case 61:
                if (i11 != 2) {
                    return i;
                }
                int iZza3 = zzax.zza(bArr, i, zzayVar);
                int i18 = zzayVar.zzfd;
                if (i18 == 0) {
                    unsafe.putObject(t5, j, zzbb.zzfi);
                } else {
                    unsafe.putObject(t5, j, zzbb.zzb(bArr, iZza3, i18));
                    iZza3 += i18;
                }
                unsafe.putInt(t5, j6, i10);
                return iZza3;
            case 63:
                if (i11 != 0) {
                    return i;
                }
                int iZza4 = zzax.zza(bArr, i, zzayVar);
                int i19 = zzayVar.zzfd;
                zzck<?> zzckVarZzaf = zzaf(i14);
                if (zzckVarZzaf != null && zzckVarZzaf.zzb(i19) == null) {
                    zzn(t5).zzb(i6, Long.valueOf(i19));
                    return iZza4;
                }
                unsafe.putObject(t5, j, Integer.valueOf(i19));
                iZzb = iZza4;
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 66:
                if (i11 != 0) {
                    return i;
                }
                iZzb = zzax.zza(bArr, i, zzayVar);
                iZzm = zzbk.zzm(zzayVar.zzfd);
                objValueOf3 = Integer.valueOf(iZzm);
                unsafe.putObject(t5, j, objValueOf3);
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 67:
                if (i11 != 0) {
                    return i;
                }
                iZzb = zzax.zzb(bArr, i, zzayVar);
                jZza = zzbk.zza(zzayVar.zzfe);
                objValueOf3 = Long.valueOf(jZza);
                unsafe.putObject(t5, j, objValueOf3);
                unsafe.putInt(t5, j6, i10);
                return iZzb;
            case 68:
                if (i11 == 3) {
                    iZzb = zza(zzad(i14), bArr, i, i4, (i6 & (-8)) | 4, zzayVar);
                    object = unsafe.getInt(t5, j6) == i10 ? unsafe.getObject(t5, j) : null;
                    objValueOf3 = zzayVar.zzff;
                    if (object != null) {
                        objValueOf3 = zzci.zza(object, objValueOf3);
                    }
                    unsafe.putObject(t5, j, objValueOf3);
                    unsafe.putInt(t5, j6, i10);
                    return iZzb;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0274, code lost:
    
        if (r27.zzfe != 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0276, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0278, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0279, code lost:
    
        r1.addBoolean(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027c, code lost:
    
        if (r14 >= r17) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x027e, code lost:
    
        r3 = com.google.android.gms.internal.clearcut.zzax.zza(r15, r14, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0284, code lost:
    
        if (r18 != r27.zzfd) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0286, code lost:
    
        r14 = com.google.android.gms.internal.clearcut.zzax.zzb(r15, r3, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x028e, code lost:
    
        if (r27.zzfe == 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0291, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0170, code lost:
    
        r4.add(com.google.android.gms.internal.clearcut.zzbb.zzb(r15, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0279, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0160, code lost:
    
        if (r2 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0162, code lost:
    
        r4.add(com.google.android.gms.internal.clearcut.zzbb.zzfi);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0168, code lost:
    
        r4.add(com.google.android.gms.internal.clearcut.zzbb.zzb(r15, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0170, code lost:
    
        if (r1 >= r17) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0172, code lost:
    
        r2 = com.google.android.gms.internal.clearcut.zzax.zza(r15, r1, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0178, code lost:
    
        if (r18 != r27.zzfd) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017a, code lost:
    
        r1 = com.google.android.gms.internal.clearcut.zzax.zza(r15, r2, r27);
        r2 = r27.zzfd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0180, code lost:
    
        if (r2 != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0183, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0219 -> B:104:0x01f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x028e -> B:139:0x0276). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0180 -> B:71:0x0162). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01e2 -> B:91:0x01c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zza(T r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, int r21, long r22, int r24, long r25, com.google.android.gms.internal.clearcut.zzay r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.zzay):int");
    }

    private final <K, V> int zza(T t5, byte[] bArr, int i, int i4, int i6, int i10, long j, zzay zzayVar) throws IOException {
        byte[] bArr2;
        zzay zzayVar2;
        int i11;
        Unsafe unsafe = zzmh;
        Object objZzae = zzae(i6);
        Object object = unsafe.getObject(t5, j);
        if (this.zzmz.zzi(object)) {
            Object objZzk = this.zzmz.zzk(objZzae);
            this.zzmz.zzb(objZzk, object);
            unsafe.putObject(t5, j, objZzk);
            object = objZzk;
        }
        zzdh<?, ?> zzdhVarZzl = this.zzmz.zzl(objZzae);
        Map<?, ?> mapZzg = this.zzmz.zzg(object);
        int iZza = zzax.zza(bArr, i, zzayVar);
        int i12 = zzayVar.zzfd;
        if (i12 < 0 || i12 > i4 - iZza) {
            throw zzco.zzbl();
        }
        int i13 = i12 + iZza;
        K k8 = zzdhVarZzl.zzmc;
        V v7 = zzdhVarZzl.zzdu;
        while (iZza < i13) {
            int iZza2 = iZza + 1;
            int i14 = bArr[iZza];
            if (i14 < 0) {
                iZza2 = zzax.zza(i14, bArr, iZza2, zzayVar);
                i14 = zzayVar.zzfd;
            }
            int i15 = iZza2;
            int i16 = i14 >>> 3;
            int i17 = i14 & 7;
            if (i16 == 1) {
                bArr2 = bArr;
                int i18 = i4;
                zzayVar2 = zzayVar;
                if (i17 == zzdhVarZzl.zzmb.zzel()) {
                    i11 = i18;
                    iZza = zza(bArr2, i15, i11, zzdhVarZzl.zzmb, (Class<?>) null, zzayVar2);
                    k8 = zzayVar2.zzff;
                    bArr = bArr2;
                    i4 = i11;
                    zzayVar = zzayVar2;
                } else {
                    i11 = i18;
                }
            } else if (i16 == 2 && i17 == zzdhVarZzl.zzmd.zzel()) {
                byte[] bArr3 = bArr;
                int i19 = i4;
                zzay zzayVar3 = zzayVar;
                iZza = zza(bArr3, i15, i19, zzdhVarZzl.zzmd, zzdhVarZzl.zzdu.getClass(), zzayVar3);
                v7 = (V) zzayVar3.zzff;
                i4 = i19;
                bArr = bArr3;
            } else {
                bArr2 = bArr;
                i11 = i4;
                zzayVar2 = zzayVar;
            }
            iZza = zzax.zza(i14, bArr2, i15, i11, zzayVar2);
            k8 = k8;
            bArr = bArr2;
            i4 = i11;
            zzayVar = zzayVar2;
        }
        if (iZza != i13) {
            throw zzco.zzbo();
        }
        mapZzg.put(k8, v7);
        return i13;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0067. Please report as an issue. */
    private final int zza(T t5, byte[] bArr, int i, int i4, int i6, zzay zzayVar) throws IOException {
        zzds<T> zzdsVar;
        int i10;
        Unsafe unsafe;
        int i11;
        int i12;
        T t10;
        int i13;
        int i14;
        int i15;
        zzds<T> zzdsVar2;
        zzck<?> zzckVarZzaf;
        int i16;
        int i17;
        int i18;
        byte[] bArr2;
        Unsafe unsafe2;
        int i19;
        int i20;
        int i21;
        int i22;
        int iZza;
        int i23;
        zzay zzayVar2;
        int i24;
        long j;
        Object objZza;
        zzay zzayVar3;
        int iZzb;
        Unsafe unsafe3;
        int i25;
        zzds<T> zzdsVar3 = this;
        T t11 = t5;
        byte[] bArr3 = bArr;
        int i26 = i4;
        zzay zzayVar4 = zzayVar;
        Unsafe unsafe4 = zzmh;
        int i27 = -1;
        int iZza2 = i;
        int i28 = -1;
        int i29 = 0;
        int i30 = 0;
        while (true) {
            if (iZza2 < i26) {
                int iZza3 = iZza2 + 1;
                int i31 = bArr3[iZza2];
                if (i31 < 0) {
                    iZza3 = zzax.zza(i31, bArr3, iZza3, zzayVar4);
                    i31 = zzayVar4.zzfd;
                }
                int i32 = i31;
                iZza2 = iZza3;
                int i33 = (i32 == true ? 1 : 0) >>> 3;
                int i34 = (i32 == true ? 1 : 0) & 7;
                int iZzai = zzdsVar3.zzai(i33);
                if (iZzai != i27) {
                    int[] iArr = zzdsVar3.zzmi;
                    int i35 = iArr[iZzai + 1];
                    int i36 = (i35 & 267386880) >>> 20;
                    long j6 = i35 & 1048575;
                    if (i36 <= 17) {
                        int i37 = iArr[iZzai + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        i11 = -1;
                        if (i39 != i28) {
                            if (i28 != -1) {
                                unsafe4.putInt(t11, i28, i30);
                            }
                            i28 = i39;
                            i30 = unsafe4.getInt(t11, i39);
                        }
                        switch (i36) {
                            case 0:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i19 = i32 == true ? 1 : 0;
                                i20 = i4;
                                i21 = i28;
                                i22 = iZza2;
                                i17 = i30;
                                if (i34 != 1) {
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    zzfd.zza(t11, j6, zzax.zze(bArr2, i22));
                                    iZza = i22 + 8;
                                    i30 = i17 | i38;
                                    zzayVar4 = zzayVar;
                                    i29 = i19;
                                    i26 = i20;
                                    i28 = i21;
                                    unsafe4 = unsafe2;
                                    iZza2 = iZza;
                                    bArr3 = bArr2;
                                    i27 = -1;
                                }
                                break;
                            case 1:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i19 = i32 == true ? 1 : 0;
                                i20 = i4;
                                i21 = i28;
                                i22 = iZza2;
                                i17 = i30;
                                if (i34 != 5) {
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    zzfd.zza((Object) t11, j6, zzax.zzf(bArr2, i22));
                                    iZza = i22 + 4;
                                    i30 = i17 | i38;
                                    zzayVar4 = zzayVar;
                                    i29 = i19;
                                    i26 = i20;
                                    i28 = i21;
                                    unsafe4 = unsafe2;
                                    iZza2 = iZza;
                                    bArr3 = bArr2;
                                    i27 = -1;
                                }
                                break;
                            case 2:
                            case 3:
                                unsafe2 = unsafe4;
                                zzayVar3 = zzayVar;
                                i21 = i28;
                                i22 = iZza2;
                                i17 = i30;
                                if (i34 != 0) {
                                    i19 = i32 == true ? 1 : 0;
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    iZzb = zzax.zzb(bArr, i22, zzayVar3);
                                    T t12 = t11;
                                    unsafe2.putLong(t12, j6, zzayVar3.zzfe);
                                    unsafe3 = unsafe2;
                                    t11 = t12;
                                    i30 = i17 | i38;
                                    i26 = i4;
                                    bArr3 = bArr;
                                    i29 = i32 == true ? 1 : 0;
                                    i28 = i21;
                                    i27 = -1;
                                    unsafe4 = unsafe3;
                                    iZza2 = iZzb;
                                    zzayVar4 = zzayVar3;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i23 = i4;
                                zzayVar2 = zzayVar;
                                i21 = i28;
                                i22 = iZza2;
                                i17 = i30;
                                if (i34 != 0) {
                                    i19 = i32 == true ? 1 : 0;
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    iZza = zzax.zza(bArr2, i22, zzayVar2);
                                    unsafe2.putInt(t11, j6, zzayVar2.zzfd);
                                    i30 = i17 | i38;
                                    i26 = i23;
                                    i29 = i32 == true ? 1 : 0;
                                    zzayVar4 = zzayVar2;
                                    i28 = i21;
                                    unsafe4 = unsafe2;
                                    iZza2 = iZza;
                                    bArr3 = bArr2;
                                    i27 = -1;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i24 = iZza2;
                                i23 = i4;
                                i17 = i30;
                                zzayVar2 = zzayVar;
                                i21 = i28;
                                if (i34 != 1) {
                                    i22 = i24;
                                    i19 = i32 == true ? 1 : 0;
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    T t13 = t11;
                                    unsafe2.putLong(t13, j6, zzax.zzd(bArr2, i24));
                                    unsafe2 = unsafe2;
                                    t11 = t13;
                                    iZza = i24 + 8;
                                    i30 = i17 | i38;
                                    i26 = i23;
                                    i29 = i32 == true ? 1 : 0;
                                    zzayVar4 = zzayVar2;
                                    i28 = i21;
                                    unsafe4 = unsafe2;
                                    iZza2 = iZza;
                                    bArr3 = bArr2;
                                    i27 = -1;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i24 = iZza2;
                                i23 = i4;
                                i17 = i30;
                                zzayVar2 = zzayVar;
                                i21 = i28;
                                if (i34 != 5) {
                                    i22 = i24;
                                    i19 = i32 == true ? 1 : 0;
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    unsafe2.putInt(t11, j6, zzax.zzc(bArr2, i24));
                                    iZza = i24 + 4;
                                    i30 = i17 | i38;
                                    i26 = i23;
                                    i29 = i32 == true ? 1 : 0;
                                    zzayVar4 = zzayVar2;
                                    i28 = i21;
                                    unsafe4 = unsafe2;
                                    iZza2 = iZza;
                                    bArr3 = bArr2;
                                    i27 = -1;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i24 = iZza2;
                                i23 = i4;
                                i17 = i30;
                                zzayVar2 = zzayVar;
                                i21 = i28;
                                if (i34 != 0) {
                                    i22 = i24;
                                    i19 = i32 == true ? 1 : 0;
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    iZza = zzax.zzb(bArr2, i24, zzayVar2);
                                    zzfd.zza(t11, j6, zzayVar2.zzfe != 0);
                                    i30 = i17 | i38;
                                    i26 = i23;
                                    i29 = i32 == true ? 1 : 0;
                                    zzayVar4 = zzayVar2;
                                    i28 = i21;
                                    unsafe4 = unsafe2;
                                    iZza2 = iZza;
                                    bArr3 = bArr2;
                                    i27 = -1;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i24 = iZza2;
                                i23 = i4;
                                i17 = i30;
                                zzayVar2 = zzayVar;
                                i21 = i28;
                                j = j6;
                                if (i34 != 2) {
                                    i22 = i24;
                                    i19 = i32 == true ? 1 : 0;
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    iZza = (i35 & C.BUFFER_FLAG_LAST_SAMPLE) == 0 ? zzax.zzc(bArr2, i24, zzayVar2) : zzax.zzd(bArr2, i24, zzayVar2);
                                    objZza = zzayVar2.zzff;
                                    unsafe2.putObject(t11, j, objZza);
                                    i30 = i17 | i38;
                                    i26 = i23;
                                    i29 = i32 == true ? 1 : 0;
                                    zzayVar4 = zzayVar2;
                                    i28 = i21;
                                    unsafe4 = unsafe2;
                                    iZza2 = iZza;
                                    bArr3 = bArr2;
                                    i27 = -1;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i24 = iZza2;
                                i23 = i4;
                                i17 = i30;
                                zzayVar2 = zzayVar;
                                i21 = i28;
                                j = j6;
                                if (i34 != 2) {
                                    i22 = i24;
                                    i19 = i32 == true ? 1 : 0;
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    iZza = zza(zzdsVar3.zzad(iZzai), bArr2, i24, i23, zzayVar2);
                                    objZza = (i17 & i38) == 0 ? zzayVar2.zzff : zzci.zza(unsafe2.getObject(t11, j), zzayVar2.zzff);
                                    unsafe2.putObject(t11, j, objZza);
                                    i30 = i17 | i38;
                                    i26 = i23;
                                    i29 = i32 == true ? 1 : 0;
                                    zzayVar4 = zzayVar2;
                                    i28 = i21;
                                    unsafe4 = unsafe2;
                                    iZza2 = iZza;
                                    bArr3 = bArr2;
                                    i27 = -1;
                                }
                                break;
                            case 10:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i24 = iZza2;
                                i23 = i4;
                                i17 = i30;
                                zzayVar2 = zzayVar;
                                i21 = i28;
                                j = j6;
                                if (i34 != 2) {
                                    i22 = i24;
                                    i19 = i32 == true ? 1 : 0;
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    iZza = zzax.zze(bArr2, i24, zzayVar2);
                                    objZza = zzayVar2.zzff;
                                    unsafe2.putObject(t11, j, objZza);
                                    i30 = i17 | i38;
                                    i26 = i23;
                                    i29 = i32 == true ? 1 : 0;
                                    zzayVar4 = zzayVar2;
                                    i28 = i21;
                                    unsafe4 = unsafe2;
                                    iZza2 = iZza;
                                    bArr3 = bArr2;
                                    i27 = -1;
                                }
                                break;
                            case 12:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i24 = iZza2;
                                i23 = i4;
                                i17 = i30;
                                zzayVar2 = zzayVar;
                                i21 = i28;
                                if (i34 != 0) {
                                    i22 = i24;
                                    i19 = i32 == true ? 1 : 0;
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    iZza = zzax.zza(bArr2, i24, zzayVar2);
                                    int i40 = zzayVar2.zzfd;
                                    zzck<?> zzckVarZzaf2 = zzdsVar3.zzaf(iZzai);
                                    if (zzckVarZzaf2 != null && zzckVarZzaf2.zzb(i40) == null) {
                                        zzn(t11).zzb(i32 == true ? 1 : 0, Long.valueOf(i40));
                                        i26 = i23;
                                        i29 = i32 == true ? 1 : 0;
                                        zzayVar4 = zzayVar2;
                                        i28 = i21;
                                        i30 = i17;
                                        unsafe4 = unsafe2;
                                        iZza2 = iZza;
                                        bArr3 = bArr2;
                                        i27 = -1;
                                    } else {
                                        unsafe2.putInt(t11, j6, i40);
                                        i30 = i17 | i38;
                                        i26 = i23;
                                        i29 = i32 == true ? 1 : 0;
                                        zzayVar4 = zzayVar2;
                                        i28 = i21;
                                        unsafe4 = unsafe2;
                                        iZza2 = iZza;
                                        bArr3 = bArr2;
                                        i27 = -1;
                                    }
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i24 = iZza2;
                                if (i34 != 0) {
                                    i21 = i28;
                                    i17 = i30;
                                    i22 = i24;
                                    i19 = i32 == true ? 1 : 0;
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    iZza = zzax.zza(bArr2, i24, zzayVar);
                                    unsafe2.putInt(t11, j6, zzbk.zzm(zzayVar.zzfd));
                                    i30 |= i38;
                                    i26 = i4;
                                    i29 = i32 == true ? 1 : 0;
                                    zzayVar4 = zzayVar;
                                    unsafe4 = unsafe2;
                                    iZza2 = iZza;
                                    bArr3 = bArr2;
                                    i27 = -1;
                                }
                                break;
                            case 16:
                                i24 = iZza2;
                                if (i34 != 0) {
                                    unsafe2 = unsafe4;
                                    i21 = i28;
                                    i17 = i30;
                                    i22 = i24;
                                    i19 = i32 == true ? 1 : 0;
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    iZzb = zzax.zzb(bArr, i24, zzayVar);
                                    zzayVar3 = zzayVar;
                                    T t14 = t11;
                                    Unsafe unsafe5 = unsafe4;
                                    unsafe5.putLong(t14, j6, zzbk.zza(zzayVar.zzfe));
                                    unsafe3 = unsafe5;
                                    t11 = t14;
                                    i30 |= i38;
                                    i26 = i4;
                                    bArr3 = bArr;
                                    i29 = i32 == true ? 1 : 0;
                                    i27 = -1;
                                    unsafe4 = unsafe3;
                                    iZza2 = iZzb;
                                    zzayVar4 = zzayVar3;
                                }
                                break;
                            case 17:
                                if (i34 != 3) {
                                    unsafe2 = unsafe4;
                                    i21 = i28;
                                    i19 = i32 == true ? 1 : 0;
                                    i22 = iZza2;
                                    i17 = i30;
                                    i12 = i6;
                                    zzdsVar = zzdsVar3;
                                    unsafe = unsafe2;
                                    i18 = i19;
                                    iZza2 = i22;
                                    i28 = i21;
                                    i30 = i17;
                                } else {
                                    iZza = zza(zzdsVar3.zzad(iZzai), bArr, iZza2, i4, (i33 << 3) | 4, zzayVar);
                                    bArr2 = bArr;
                                    unsafe4.putObject(t11, j6, (i30 & i38) == 0 ? zzayVar.zzff : zzci.zza(unsafe4.getObject(t11, j6), zzayVar.zzff));
                                    i30 |= i38;
                                    i26 = i4;
                                    zzayVar4 = zzayVar;
                                    i29 = i32 == true ? 1 : 0;
                                    iZza2 = iZza;
                                    bArr3 = bArr2;
                                    i27 = -1;
                                }
                                break;
                            default:
                                unsafe2 = unsafe4;
                                i21 = i28;
                                i19 = i32 == true ? 1 : 0;
                                i22 = iZza2;
                                i17 = i30;
                                i12 = i6;
                                zzdsVar = zzdsVar3;
                                unsafe = unsafe2;
                                i18 = i19;
                                iZza2 = i22;
                                i28 = i21;
                                i30 = i17;
                                break;
                        }
                    } else {
                        Unsafe unsafe6 = unsafe4;
                        i11 = -1;
                        int i41 = i26;
                        if (i36 != 27) {
                            iZza2 = iZza2;
                            if (i36 <= 49) {
                                i17 = i30;
                                unsafe = unsafe6;
                                i16 = i28;
                                int iZza4 = zzdsVar3.zza(t5, bArr, iZza2, i4, i32 == true ? 1 : 0, i33, i34, iZzai, i35, i36, j6, zzayVar);
                                i25 = i32 == true ? 1 : 0;
                                if (iZza4 == iZza2) {
                                    zzdsVar = this;
                                    i12 = i6;
                                    iZza2 = iZza4;
                                    i18 = i25;
                                    i30 = i17;
                                    i28 = i16;
                                } else {
                                    zzdsVar3 = this;
                                    t11 = t5;
                                    bArr3 = bArr;
                                    i26 = i4;
                                    zzayVar4 = zzayVar;
                                    iZza2 = iZza4;
                                    i29 = i25;
                                    i27 = -1;
                                    unsafe4 = unsafe;
                                    i30 = i17;
                                    i28 = i16;
                                }
                            } else {
                                unsafe = unsafe6;
                                i16 = i28;
                                i17 = i30;
                                i25 = i32 == true ? 1 : 0;
                                if (i36 != 50) {
                                    int iZza5 = zza(t5, bArr, iZza2, i4, i25 == true ? 1 : 0, i33, i34, i35, i36, j6, iZzai, zzayVar);
                                    zzdsVar = this;
                                    i18 = i25 == true ? 1 : 0;
                                    if (iZza5 == iZza2) {
                                        i28 = i16;
                                        i12 = i6;
                                        iZza2 = iZza5;
                                        i30 = i17;
                                    } else {
                                        t11 = t5;
                                        i28 = i16;
                                        i26 = i4;
                                        i29 = i18 == true ? 1 : 0;
                                        iZza2 = iZza5;
                                        zzdsVar3 = zzdsVar;
                                        i27 = -1;
                                        unsafe4 = unsafe;
                                        i30 = i17;
                                        bArr3 = bArr;
                                        zzayVar4 = zzayVar;
                                    }
                                } else if (i34 == 2) {
                                    int iZza6 = zza(t5, bArr, iZza2, i4, iZzai, i33, j6, zzayVar);
                                    if (iZza6 == iZza2) {
                                        zzdsVar = this;
                                        i12 = i6;
                                        iZza2 = iZza6;
                                        i18 = i25;
                                        i30 = i17;
                                        i28 = i16;
                                    } else {
                                        zzdsVar3 = this;
                                        t11 = t5;
                                        bArr3 = bArr;
                                        i26 = i4;
                                        zzayVar4 = zzayVar;
                                        iZza2 = iZza6;
                                        i29 = i25;
                                        i27 = -1;
                                        unsafe4 = unsafe;
                                        i30 = i17;
                                        i28 = i16;
                                    }
                                } else {
                                    zzdsVar = this;
                                    i18 = i25 == true ? 1 : 0;
                                }
                            }
                        } else if (i34 == 2) {
                            zzcn zzcnVarZzi = (zzcn) unsafe6.getObject(t11, j6);
                            if (!zzcnVarZzi.zzu()) {
                                int size = zzcnVarZzi.size();
                                zzcnVarZzi = zzcnVarZzi.zzi(size == 0 ? 10 : size << 1);
                                unsafe6.putObject(t11, j6, zzcnVarZzi);
                            }
                            zzayVar4 = zzayVar;
                            unsafe4 = unsafe6;
                            i26 = i4;
                            iZza2 = zza((zzef<?>) zzdsVar3.zzad(iZzai), i32 == true ? 1 : 0, bArr, iZza2, i41, (zzcn<?>) zzcnVarZzi, zzayVar4);
                            i29 = i32 == true ? 1 : 0;
                            i27 = -1;
                            t11 = t5;
                            bArr3 = bArr;
                        } else {
                            zzdsVar = zzdsVar3;
                            i18 = i32 == true ? 1 : 0;
                            unsafe = unsafe6;
                            i16 = i28;
                            iZza2 = iZza2;
                            i17 = i30;
                        }
                    }
                    if (i18 == i12 || i12 == 0) {
                        int i42 = i18;
                        int iZza7 = zza(i42 == true ? 1 : 0, bArr, iZza2, i4, t5, zzayVar);
                        i29 = i42 == true ? 1 : 0;
                        t11 = t5;
                        zzdsVar3 = zzdsVar;
                        i27 = i11;
                        unsafe4 = unsafe;
                        zzayVar4 = zzayVar;
                        i26 = i4;
                        iZza2 = iZza7;
                        bArr3 = bArr;
                    } else {
                        t10 = t5;
                        i10 = i4;
                        i13 = i28;
                        i15 = i30;
                        i14 = i18;
                    }
                } else {
                    zzdsVar = zzdsVar3;
                    unsafe = unsafe4;
                    i11 = i27;
                    i16 = i28;
                    i17 = i30;
                    i18 = i32 == true ? 1 : 0;
                }
                i28 = i16;
                i12 = i6;
                i30 = i17;
                if (i18 == i12) {
                }
                int i422 = i18;
                int iZza72 = zza(i422 == true ? 1 : 0, bArr, iZza2, i4, t5, zzayVar);
                i29 = i422 == true ? 1 : 0;
                t11 = t5;
                zzdsVar3 = zzdsVar;
                i27 = i11;
                unsafe4 = unsafe;
                zzayVar4 = zzayVar;
                i26 = i4;
                iZza2 = iZza72;
                bArr3 = bArr;
            } else {
                zzdsVar = zzdsVar3;
                i10 = i26;
                unsafe = unsafe4;
                i11 = i27;
                int i43 = i30;
                i12 = i6;
                t10 = t11;
                i13 = i28;
                i14 = i29;
                i15 = i43;
            }
        }
        int i44 = iZza2;
        if (i13 != i11) {
            unsafe.putInt(t10, i13, i15);
        }
        int[] iArr2 = zzdsVar.zzmt;
        if (iArr2 != null) {
            int length = iArr2.length;
            Object objZza2 = null;
            int i45 = 0;
            while (i45 < length) {
                int i46 = iArr2[i45];
                zzex zzexVar = zzdsVar.zzmx;
                int i47 = zzdsVar.zzmi[i46];
                Object objZzo = zzfd.zzo(t10, zzdsVar.zzag(i46) & 1048575);
                if (objZzo == null || (zzckVarZzaf = zzdsVar.zzaf(i46)) == null) {
                    zzdsVar2 = zzdsVar;
                } else {
                    Map mapZzg = zzdsVar.zzmz.zzg(objZzo);
                    zzdsVar2 = zzdsVar;
                    objZza2 = zzdsVar2.zza(i46, i47, mapZzg, zzckVarZzaf, objZza2, (zzex<UT, Object>) zzexVar);
                }
                objZza2 = (zzey) objZza2;
                i45++;
                zzdsVar = zzdsVar2;
            }
            zzds<T> zzdsVar4 = zzdsVar;
            if (objZza2 != null) {
                zzdsVar4.zzmx.zzf(t10, objZza2);
            }
        }
        if (i12 == 0) {
            if (i44 != i10) {
                throw zzco.zzbo();
            }
        } else if (i44 > i10 || i14 != i12) {
            throw zzco.zzbo();
        }
        return i44;
    }

    private static int zza(byte[] bArr, int i, int i4, zzfl zzflVar, Class<?> cls, zzay zzayVar) throws IOException {
        switch (zzdt.zzgq[zzflVar.ordinal()]) {
            case 1:
                int iZzb = zzax.zzb(bArr, i, zzayVar);
                zzayVar.zzff = Boolean.valueOf(zzayVar.zzfe != 0);
                return iZzb;
            case 2:
                return zzax.zze(bArr, i, zzayVar);
            case 3:
                zzayVar.zzff = Double.valueOf(zzax.zze(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzayVar.zzff = Integer.valueOf(zzax.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzayVar.zzff = Long.valueOf(zzax.zzd(bArr, i));
                return i + 8;
            case 8:
                zzayVar.zzff = Float.valueOf(zzax.zzf(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iZza = zzax.zza(bArr, i, zzayVar);
                zzayVar.zzff = Integer.valueOf(zzayVar.zzfd);
                return iZza;
            case 12:
            case 13:
                int iZzb2 = zzax.zzb(bArr, i, zzayVar);
                zzayVar.zzff = Long.valueOf(zzayVar.zzfe);
                return iZzb2;
            case 14:
                return zza((zzef) zzea.zzcm().zze(cls), bArr, i, i4, zzayVar);
            case 15:
                int iZza2 = zzax.zza(bArr, i, zzayVar);
                zzayVar.zzff = Integer.valueOf(zzbk.zzm(zzayVar.zzfd));
                return iZza2;
            case 16:
                int iZzb3 = zzax.zzb(bArr, i, zzayVar);
                zzayVar.zzff = Long.valueOf(zzbk.zza(zzayVar.zzfe));
                return iZzb3;
            case 17:
                return zzax.zzd(bArr, i, zzayVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static <T> zzds<T> zza(Class<T> cls, zzdm zzdmVar, zzdw zzdwVar, zzcy zzcyVar, zzex<?, ?> zzexVar, zzbu<?> zzbuVar, zzdj zzdjVar) {
        int iZzcu;
        int i;
        int i4;
        int iZza;
        int iZza2;
        int iZzdg;
        if (zzdmVar instanceof zzec) {
            zzec zzecVar = (zzec) zzdmVar;
            boolean z4 = zzecVar.zzcf() == zzcg.zzg.zzkm;
            if (zzecVar.getFieldCount() == 0) {
                iZzcu = 0;
                i = 0;
                i4 = 0;
            } else {
                int iZzcp = zzecVar.zzcp();
                int iZzcq = zzecVar.zzcq();
                iZzcu = zzecVar.zzcu();
                i = iZzcp;
                i4 = iZzcq;
            }
            int[] iArr = new int[iZzcu << 2];
            Object[] objArr = new Object[iZzcu << 1];
            int[] iArr2 = zzecVar.zzcr() > 0 ? new int[zzecVar.zzcr()] : null;
            int[] iArr3 = zzecVar.zzcs() > 0 ? new int[zzecVar.zzcs()] : null;
            zzed zzedVarZzco = zzecVar.zzco();
            if (zzedVarZzco.next()) {
                int iZzcx = zzedVarZzco.zzcx();
                int i6 = 0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (iZzcx >= zzecVar.zzcv() || i6 >= ((iZzcx - i) << 2)) {
                        if (zzedVarZzco.zzda()) {
                            iZza = (int) zzfd.zza(zzedVarZzco.zzdb());
                            iZza2 = (int) zzfd.zza(zzedVarZzco.zzdc());
                            iZzdg = 0;
                        } else {
                            iZza = (int) zzfd.zza(zzedVarZzco.zzdd());
                            if (zzedVarZzco.zzde()) {
                                iZza2 = (int) zzfd.zza(zzedVarZzco.zzdf());
                                iZzdg = zzedVarZzco.zzdg();
                            } else {
                                iZza2 = 0;
                                iZzdg = 0;
                            }
                        }
                        iArr[i6] = zzedVarZzco.zzcx();
                        int i12 = i6 + 1;
                        iArr[i12] = (zzedVarZzco.zzdi() ? C.BUFFER_FLAG_LAST_SAMPLE : 0) | (zzedVarZzco.zzdh() ? 268435456 : 0) | (zzedVarZzco.zzcy() << 20) | iZza;
                        iArr[i6 + 2] = iZza2 | (iZzdg << 20);
                        if (zzedVarZzco.zzdl() != null) {
                            int i13 = (i6 / 4) << 1;
                            objArr[i13] = zzedVarZzco.zzdl();
                            if (zzedVarZzco.zzdj() != null) {
                                objArr[i13 + 1] = zzedVarZzco.zzdj();
                            } else if (zzedVarZzco.zzdk() != null) {
                                objArr[i13 + 1] = zzedVarZzco.zzdk();
                            }
                        } else if (zzedVarZzco.zzdj() != null) {
                            objArr[((i6 / 4) << 1) + 1] = zzedVarZzco.zzdj();
                        } else if (zzedVarZzco.zzdk() != null) {
                            objArr[((i6 / 4) << 1) + 1] = zzedVarZzco.zzdk();
                        }
                        int iZzcy = zzedVarZzco.zzcy();
                        if (iZzcy == zzcb.zziw.ordinal()) {
                            iArr2[i10] = i6;
                            i10++;
                        } else if (iZzcy >= 18 && iZzcy <= 49) {
                            iArr3[i11] = iArr[i12] & 1048575;
                            i11++;
                        }
                        if (!zzedVarZzco.next()) {
                            break;
                        }
                        iZzcx = zzedVarZzco.zzcx();
                    } else {
                        for (int i14 = 0; i14 < 4; i14++) {
                            iArr[i6 + i14] = -1;
                        }
                    }
                    i6 += 4;
                }
            }
            return new zzds<>(iArr, objArr, i, i4, zzecVar.zzcv(), zzecVar.zzch(), z4, false, zzecVar.zzct(), iArr2, iArr3, zzdwVar, zzcyVar, zzexVar, zzbuVar, zzdjVar);
        }
        ((zzes) zzdmVar).zzcf();
        throw new NoSuchMethodError();
    }

    private final <K, V, UT, UB> UB zza(int i, int i4, Map<K, V> map, zzck<?> zzckVar, UB ub, zzex<UT, UB> zzexVar) {
        zzdh<?, ?> zzdhVarZzl = this.zzmz.zzl(zzae(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (zzckVar.zzb(((Integer) next.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = zzexVar.zzdz();
                }
                zzbg zzbgVarZzk = zzbb.zzk(zzdg.zza(zzdhVarZzl, next.getKey(), next.getValue()));
                try {
                    zzdg.zza(zzbgVarZzk.zzae(), zzdhVarZzl, next.getKey(), next.getValue());
                    zzexVar.zza(ub, i4, zzbgVarZzk.zzad());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static void zza(int i, Object obj, zzfr zzfrVar) throws IOException {
        if (obj instanceof String) {
            zzfrVar.zza(i, (String) obj);
        } else {
            zzfrVar.zza(i, (zzbb) obj);
        }
    }

    private static <UT, UB> void zza(zzex<UT, UB> zzexVar, T t5, zzfr zzfrVar) throws IOException {
        zzexVar.zza(zzexVar.zzq(t5), zzfrVar);
    }

    private final <K, V> void zza(zzfr zzfrVar, int i, Object obj, int i4) throws IOException {
        if (obj != null) {
            zzfrVar.zza(i, this.zzmz.zzl(zzae(i4)), this.zzmz.zzh(obj));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r14, com.google.android.gms.internal.clearcut.zzfr r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, com.google.android.gms.internal.clearcut.zzfr):void");
    }

    private final void zza(T t5, T t10, int i) {
        long jZzag = zzag(i) & 1048575;
        if (zza(t10, i)) {
            Object objZzo = zzfd.zzo(t5, jZzag);
            Object objZzo2 = zzfd.zzo(t10, jZzag);
            if (objZzo != null && objZzo2 != null) {
                objZzo2 = zzci.zza(objZzo, objZzo2);
            } else if (objZzo2 == null) {
                return;
            }
            zzfd.zza(t5, jZzag, objZzo2);
            zzb(t5, i);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zza(T t5, byte[] bArr, int i, int i4, zzay zzayVar) throws IOException {
        Unsafe unsafe;
        zzay zzayVar2;
        T t10;
        int i6;
        int i10;
        byte[] bArr2;
        int i11;
        int i12;
        int iZza;
        Unsafe unsafe2;
        T t11;
        Object objZza;
        T t12;
        int iZzm;
        zzds<T> zzdsVar = this;
        byte[] bArr3 = bArr;
        int i13 = i4;
        zzay zzayVar3 = zzayVar;
        if (!zzdsVar.zzmq) {
            zza(t5, bArr, i, i13, 0, zzayVar);
            return;
        }
        Unsafe unsafe3 = zzmh;
        int iZza2 = i;
        while (iZza2 < i13) {
            int iZza3 = iZza2 + 1;
            int i14 = bArr3[iZza2];
            if (i14 < 0) {
                iZza3 = zzax.zza(i14, bArr3, iZza3, zzayVar3);
                i14 = zzayVar3.zzfd;
            }
            int i15 = i14;
            int i16 = iZza3;
            int i17 = (i15 == true ? 1 : 0) >>> 3;
            int i18 = (i15 == true ? 1 : 0) & 7;
            int iZzai = zzdsVar.zzai(i17);
            if (iZzai >= 0) {
                int i19 = zzdsVar.zzmi[iZzai + 1];
                int i20 = (267386880 & i19) >>> 20;
                long j = 1048575 & i19;
                if (i20 <= 17) {
                    switch (i20) {
                        case 0:
                            unsafe = unsafe3;
                            if (i18 == 1) {
                                zzfd.zza(t5, j, zzax.zze(bArr3, i16));
                                iZza2 = i16 + 8;
                                unsafe3 = unsafe;
                            }
                            i12 = i16;
                            t10 = t5;
                            bArr2 = bArr;
                            i10 = i12;
                            i11 = i15;
                            i6 = i4;
                            zzayVar2 = zzayVar;
                            iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                            zzdsVar = this;
                            bArr3 = bArr;
                            zzayVar3 = zzayVar;
                            i13 = i6;
                            unsafe3 = unsafe;
                            break;
                        case 1:
                            unsafe = unsafe3;
                            if (i18 == 5) {
                                zzfd.zza((Object) t5, j, zzax.zzf(bArr3, i16));
                                iZza2 = i16 + 4;
                                unsafe3 = unsafe;
                            }
                            i12 = i16;
                            t10 = t5;
                            bArr2 = bArr;
                            i10 = i12;
                            i11 = i15;
                            i6 = i4;
                            zzayVar2 = zzayVar;
                            iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                            zzdsVar = this;
                            bArr3 = bArr;
                            zzayVar3 = zzayVar;
                            i13 = i6;
                            unsafe3 = unsafe;
                            break;
                        case 2:
                        case 3:
                            Unsafe unsafe4 = unsafe3;
                            if (i18 != 0) {
                                unsafe = unsafe4;
                                i12 = i16;
                                t10 = t5;
                                bArr2 = bArr;
                                i10 = i12;
                                i11 = i15;
                                i6 = i4;
                                zzayVar2 = zzayVar;
                                iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                                zzdsVar = this;
                                bArr3 = bArr;
                                zzayVar3 = zzayVar;
                                i13 = i6;
                                unsafe3 = unsafe;
                            } else {
                                int iZzb = zzax.zzb(bArr3, i16, zzayVar3);
                                unsafe3 = unsafe4;
                                unsafe3.putLong(t5, j, zzayVar3.zzfe);
                                iZza2 = iZzb;
                            }
                            break;
                        case 4:
                        case 11:
                            unsafe2 = unsafe3;
                            if (i18 != 0) {
                                i12 = i16;
                                unsafe = unsafe2;
                                t10 = t5;
                                bArr2 = bArr;
                                i10 = i12;
                                i11 = i15;
                                i6 = i4;
                                zzayVar2 = zzayVar;
                                iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                                zzdsVar = this;
                                bArr3 = bArr;
                                zzayVar3 = zzayVar;
                                i13 = i6;
                                unsafe3 = unsafe;
                            } else {
                                iZza2 = zzax.zza(bArr3, i16, zzayVar3);
                                unsafe2.putInt(t5, j, zzayVar3.zzfd);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 5:
                        case 14:
                            unsafe2 = unsafe3;
                            if (i18 != 1) {
                                i12 = i16;
                                unsafe = unsafe2;
                                t10 = t5;
                                bArr2 = bArr;
                                i10 = i12;
                                i11 = i15;
                                i6 = i4;
                                zzayVar2 = zzayVar;
                                iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                                zzdsVar = this;
                                bArr3 = bArr;
                                zzayVar3 = zzayVar;
                                i13 = i6;
                                unsafe3 = unsafe;
                            } else {
                                unsafe2.putLong(t5, j, zzax.zzd(bArr3, i16));
                                iZza2 = i16 + 8;
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 6:
                        case 13:
                            unsafe2 = unsafe3;
                            if (i18 != 5) {
                                i12 = i16;
                                unsafe = unsafe2;
                                t10 = t5;
                                bArr2 = bArr;
                                i10 = i12;
                                i11 = i15;
                                i6 = i4;
                                zzayVar2 = zzayVar;
                                iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                                zzdsVar = this;
                                bArr3 = bArr;
                                zzayVar3 = zzayVar;
                                i13 = i6;
                                unsafe3 = unsafe;
                            } else {
                                unsafe2.putInt(t5, j, zzax.zzc(bArr3, i16));
                                iZza2 = i16 + 4;
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 7:
                            unsafe2 = unsafe3;
                            if (i18 != 0) {
                                i12 = i16;
                                unsafe = unsafe2;
                                t10 = t5;
                                bArr2 = bArr;
                                i10 = i12;
                                i11 = i15;
                                i6 = i4;
                                zzayVar2 = zzayVar;
                                iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                                zzdsVar = this;
                                bArr3 = bArr;
                                zzayVar3 = zzayVar;
                                i13 = i6;
                                unsafe3 = unsafe;
                            } else {
                                iZza2 = zzax.zzb(bArr3, i16, zzayVar3);
                                zzfd.zza(t5, j, zzayVar3.zzfe != 0);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 8:
                            unsafe2 = unsafe3;
                            t11 = t5;
                            if (i18 != 2) {
                                i12 = i16;
                                unsafe = unsafe2;
                                t10 = t5;
                                bArr2 = bArr;
                                i10 = i12;
                                i11 = i15;
                                i6 = i4;
                                zzayVar2 = zzayVar;
                                iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                                zzdsVar = this;
                                bArr3 = bArr;
                                zzayVar3 = zzayVar;
                                i13 = i6;
                                unsafe3 = unsafe;
                            } else {
                                iZza2 = (536870912 & i19) == 0 ? zzax.zzc(bArr3, i16, zzayVar3) : zzax.zzd(bArr3, i16, zzayVar3);
                                objZza = zzayVar3.zzff;
                                unsafe2.putObject(t11, j, objZza);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 9:
                            unsafe2 = unsafe3;
                            t11 = t5;
                            if (i18 != 2) {
                                i12 = i16;
                                unsafe = unsafe2;
                                t10 = t5;
                                bArr2 = bArr;
                                i10 = i12;
                                i11 = i15;
                                i6 = i4;
                                zzayVar2 = zzayVar;
                                iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                                zzdsVar = this;
                                bArr3 = bArr;
                                zzayVar3 = zzayVar;
                                i13 = i6;
                                unsafe3 = unsafe;
                            } else {
                                iZza2 = zza(zzdsVar.zzad(iZzai), bArr3, i16, i13, zzayVar3);
                                Object object = unsafe2.getObject(t11, j);
                                objZza = object == null ? zzayVar3.zzff : zzci.zza(object, zzayVar3.zzff);
                                unsafe2.putObject(t11, j, objZza);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 10:
                            unsafe2 = unsafe3;
                            t11 = t5;
                            if (i18 != 2) {
                                i12 = i16;
                                unsafe = unsafe2;
                                t10 = t5;
                                bArr2 = bArr;
                                i10 = i12;
                                i11 = i15;
                                i6 = i4;
                                zzayVar2 = zzayVar;
                                iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                                zzdsVar = this;
                                bArr3 = bArr;
                                zzayVar3 = zzayVar;
                                i13 = i6;
                                unsafe3 = unsafe;
                            } else {
                                iZza2 = zzax.zze(bArr3, i16, zzayVar3);
                                objZza = zzayVar3.zzff;
                                unsafe2.putObject(t11, j, objZza);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 12:
                            unsafe2 = unsafe3;
                            t12 = t5;
                            if (i18 != 0) {
                                i12 = i16;
                                unsafe = unsafe2;
                                t10 = t5;
                                bArr2 = bArr;
                                i10 = i12;
                                i11 = i15;
                                i6 = i4;
                                zzayVar2 = zzayVar;
                                iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                                zzdsVar = this;
                                bArr3 = bArr;
                                zzayVar3 = zzayVar;
                                i13 = i6;
                                unsafe3 = unsafe;
                            } else {
                                iZza2 = zzax.zza(bArr3, i16, zzayVar3);
                                iZzm = zzayVar3.zzfd;
                                unsafe2.putInt(t12, j, iZzm);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 15:
                            unsafe2 = unsafe3;
                            t12 = t5;
                            if (i18 != 0) {
                                i12 = i16;
                                unsafe = unsafe2;
                                t10 = t5;
                                bArr2 = bArr;
                                i10 = i12;
                                i11 = i15;
                                i6 = i4;
                                zzayVar2 = zzayVar;
                                iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                                zzdsVar = this;
                                bArr3 = bArr;
                                zzayVar3 = zzayVar;
                                i13 = i6;
                                unsafe3 = unsafe;
                            } else {
                                iZza2 = zzax.zza(bArr3, i16, zzayVar3);
                                iZzm = zzbk.zzm(zzayVar3.zzfd);
                                unsafe2.putInt(t12, j, iZzm);
                                unsafe3 = unsafe2;
                            }
                            break;
                        case 16:
                            if (i18 != 0) {
                                unsafe2 = unsafe3;
                                i12 = i16;
                                unsafe = unsafe2;
                                t10 = t5;
                                bArr2 = bArr;
                                i10 = i12;
                                i11 = i15;
                                i6 = i4;
                                zzayVar2 = zzayVar;
                                iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                                zzdsVar = this;
                                bArr3 = bArr;
                                zzayVar3 = zzayVar;
                                i13 = i6;
                                unsafe3 = unsafe;
                            } else {
                                int iZzb2 = zzax.zzb(bArr3, i16, zzayVar3);
                                unsafe3.putLong(t5, j, zzbk.zza(zzayVar3.zzfe));
                                unsafe2 = unsafe3;
                                iZza2 = iZzb2;
                                unsafe3 = unsafe2;
                            }
                            break;
                    }
                } else {
                    unsafe = unsafe3;
                    if (i20 != 27) {
                        if (i20 <= 49) {
                            iZza = zzdsVar.zza(t5, bArr, i16, i4, i15 == true ? 1 : 0, i17, i18, iZzai, i19, i20, j, zzayVar);
                            if (iZza == i16) {
                                t10 = t5;
                                bArr2 = bArr;
                                i6 = i4;
                                zzayVar2 = zzayVar;
                                i10 = iZza;
                                i11 = i15 == true ? 1 : 0;
                                iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                                zzdsVar = this;
                                bArr3 = bArr;
                                zzayVar3 = zzayVar;
                                i13 = i6;
                            }
                        } else {
                            if (i20 != 50) {
                                iZza = zza(t5, bArr, i16, i4, i15 == true ? 1 : 0, i17, i18, i19, i20, j, iZzai, zzayVar);
                                if (iZza == i16) {
                                    t10 = t5;
                                    bArr2 = bArr;
                                    i6 = i4;
                                    i11 = i15 == true ? 1 : 0;
                                    i10 = iZza;
                                }
                            } else if (i18 == 2) {
                                int iZza4 = zza(t5, bArr, i16, i4, iZzai, i17, j, zzayVar);
                                if (iZza4 == i16) {
                                    t10 = t5;
                                    bArr2 = bArr;
                                    i6 = i4;
                                    i10 = iZza4;
                                    i11 = i15 == true ? 1 : 0;
                                } else {
                                    zzdsVar = this;
                                    bArr3 = bArr;
                                    i13 = i4;
                                    zzayVar3 = zzayVar;
                                    iZza2 = iZza4;
                                }
                            } else {
                                i12 = i16;
                                i15 = i15 == true ? 1 : 0;
                                t10 = t5;
                                bArr2 = bArr;
                                i10 = i12;
                                i11 = i15;
                                i6 = i4;
                            }
                            zzayVar2 = zzayVar;
                            iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                            zzdsVar = this;
                            bArr3 = bArr;
                            zzayVar3 = zzayVar;
                            i13 = i6;
                        }
                        zzdsVar = this;
                        bArr3 = bArr;
                        i13 = i4;
                        zzayVar3 = zzayVar;
                        iZza2 = iZza;
                    } else if (i18 == 2) {
                        zzcn zzcnVarZzi = (zzcn) unsafe.getObject(t5, j);
                        if (!zzcnVarZzi.zzu()) {
                            int size = zzcnVarZzi.size();
                            zzcnVarZzi = zzcnVarZzi.zzi(size == 0 ? 10 : size << 1);
                            unsafe.putObject(t5, j, zzcnVarZzi);
                        }
                        iZza2 = zza((zzef<?>) zzdsVar.zzad(iZzai), i15 == true ? 1 : 0, bArr3, i16, i13, (zzcn<?>) zzcnVarZzi, zzayVar3);
                        bArr3 = bArr;
                        i13 = i4;
                        zzayVar3 = zzayVar;
                    } else {
                        i15 = i15 == true ? 1 : 0;
                        i12 = i16;
                        t10 = t5;
                        bArr2 = bArr;
                        i10 = i12;
                        i11 = i15;
                        i6 = i4;
                        zzayVar2 = zzayVar;
                        iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
                        zzdsVar = this;
                        bArr3 = bArr;
                        zzayVar3 = zzayVar;
                        i13 = i6;
                    }
                    unsafe3 = unsafe;
                }
            }
            unsafe = unsafe3;
            i12 = i16;
            t10 = t5;
            bArr2 = bArr;
            i10 = i12;
            i11 = i15;
            i6 = i4;
            zzayVar2 = zzayVar;
            iZza2 = zza(i11, bArr2, i10, i6, t10, zzayVar2);
            zzdsVar = this;
            bArr3 = bArr;
            zzayVar3 = zzayVar;
            i13 = i6;
            unsafe3 = unsafe;
        }
        if (iZza2 != i13) {
            throw zzco.zzbo();
        }
    }

    private final boolean zza(T t5, int i) {
        if (!this.zzmq) {
            int iZzah = zzah(i);
            return (zzfd.zzj(t5, (long) (iZzah & 1048575)) & (1 << (iZzah >>> 20))) != 0;
        }
        int iZzag = zzag(i);
        long j = iZzag & 1048575;
        switch ((iZzag & 267386880) >>> 20) {
            case 0:
                return zzfd.zzn(t5, j) != AudioStats.AUDIO_AMPLITUDE_NONE;
            case 1:
                return zzfd.zzm(t5, j) != 0.0f;
            case 2:
                return zzfd.zzk(t5, j) != 0;
            case 3:
                return zzfd.zzk(t5, j) != 0;
            case 4:
                return zzfd.zzj(t5, j) != 0;
            case 5:
                return zzfd.zzk(t5, j) != 0;
            case 6:
                return zzfd.zzj(t5, j) != 0;
            case 7:
                return zzfd.zzl(t5, j);
            case 8:
                Object objZzo = zzfd.zzo(t5, j);
                if (objZzo instanceof String) {
                    return !((String) objZzo).isEmpty();
                }
                if (objZzo instanceof zzbb) {
                    return !zzbb.zzfi.equals(objZzo);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfd.zzo(t5, j) != null;
            case 10:
                return !zzbb.zzfi.equals(zzfd.zzo(t5, j));
            case 11:
                return zzfd.zzj(t5, j) != 0;
            case 12:
                return zzfd.zzj(t5, j) != 0;
            case 13:
                return zzfd.zzj(t5, j) != 0;
            case 14:
                return zzfd.zzk(t5, j) != 0;
            case 15:
                return zzfd.zzj(t5, j) != 0;
            case 16:
                return zzfd.zzk(t5, j) != 0;
            case 17:
                return zzfd.zzo(t5, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t5, int i, int i4) {
        return zzfd.zzj(t5, (long) (zzah(i4) & 1048575)) == i;
    }

    private final boolean zza(T t5, int i, int i4, int i6) {
        return this.zzmq ? zza(t5, i) : (i4 & i6) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzef zzefVar) {
        return zzefVar.zzo(zzfd.zzo(obj, i & 1048575));
    }
}
