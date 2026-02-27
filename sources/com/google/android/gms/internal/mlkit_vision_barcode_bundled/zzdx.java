package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.ads.AbstractC1173g;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzdx {
    private static final zzdx zzb = new zzdx(true);
    final zzgo zza = new zzgh();
    private boolean zzc;
    private boolean zzd;

    private zzdx() {
    }

    public static int zza(zzdw zzdwVar, Object obj) {
        int iZzd;
        int iZzA;
        zzhf zzhfVarZzd = zzdwVar.zzd();
        int iZza = zzdwVar.zza();
        zzdwVar.zzg();
        int iZzA2 = zzdn.zzA(iZza << 3);
        if (zzhfVarZzd == zzhf.zzj) {
            byte[] bArr = zzep.zzb;
            if (((zzfm) obj) instanceof zzcr) {
                throw null;
            }
            iZzA2 += iZzA2;
        }
        zzhg zzhgVar = zzhg.INT;
        int iZzB = 4;
        switch (zzhfVarZzd.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iZzB = 8;
                return iZzA2 + iZzB;
            case 1:
                ((Float) obj).getClass();
                return iZzA2 + iZzB;
            case 2:
                iZzB = zzdn.zzB(((Long) obj).longValue());
                return iZzA2 + iZzB;
            case 3:
                iZzB = zzdn.zzB(((Long) obj).longValue());
                return iZzA2 + iZzB;
            case 4:
                iZzB = zzdn.zzB(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case 5:
                ((Long) obj).getClass();
                iZzB = 8;
                return iZzA2 + iZzB;
            case 6:
                ((Integer) obj).getClass();
                return iZzA2 + iZzB;
            case 7:
                ((Boolean) obj).getClass();
                iZzB = 1;
                return iZzA2 + iZzB;
            case 8:
                if (!(obj instanceof zzdf)) {
                    iZzB = zzdn.zzz((String) obj);
                    return iZzA2 + iZzB;
                }
                iZzd = ((zzdf) obj).zzd();
                iZzA = zzdn.zzA(iZzd);
                iZzB = iZzA + iZzd;
                return iZzA2 + iZzB;
            case 9:
                iZzB = ((zzfm) obj).zzF();
                return iZzA2 + iZzB;
            case 10:
                if (!(obj instanceof zzew)) {
                    iZzB = zzdn.zzx((zzfm) obj);
                    return iZzA2 + iZzB;
                }
                iZzd = ((zzew) obj).zza();
                iZzA = zzdn.zzA(iZzd);
                iZzB = iZzA + iZzd;
                return iZzA2 + iZzB;
            case 11:
                if (obj instanceof zzdf) {
                    iZzd = ((zzdf) obj).zzd();
                    iZzA = zzdn.zzA(iZzd);
                } else {
                    iZzd = ((byte[]) obj).length;
                    iZzA = zzdn.zzA(iZzd);
                }
                iZzB = iZzA + iZzd;
                return iZzA2 + iZzB;
            case 12:
                iZzB = zzdn.zzA(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case 13:
                iZzB = obj instanceof zzej ? zzdn.zzB(((zzej) obj).zza()) : zzdn.zzB(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case 14:
                ((Integer) obj).getClass();
                return iZzA2 + iZzB;
            case 15:
                ((Long) obj).getClass();
                iZzB = 8;
                return iZzA2 + iZzB;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZzB = zzdn.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzA2 + iZzB;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZzB = zzdn.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzA2 + iZzB;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzdx zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzfr) {
            return ((zzfr) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzdw zzdwVar = (zzdw) entry.getKey();
        Object value = entry.getValue();
        boolean z4 = value instanceof zzew;
        zzdwVar.zzg();
        if (zzdwVar.zze() != zzhg.MESSAGE) {
            if (z4) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzdwVar, zzl(value));
            return;
        }
        Object objZze = zze(zzdwVar);
        if (objZze != null) {
            if (z4) {
                throw null;
            }
            this.zza.put(zzdwVar, objZze instanceof zzfr ? zzdwVar.zzc((zzfr) objZze, (zzfr) value) : zzdwVar.zzb(((zzfm) objZze).zzaa(), (zzfm) value).zzj());
        } else {
            this.zza.put(zzdwVar, zzl(value));
            if (z4) {
                this.zzd = true;
            }
        }
    }

    private static boolean zzn(Map.Entry entry) {
        zzdw zzdwVar = (zzdw) entry.getKey();
        if (zzdwVar.zze() != zzhg.MESSAGE) {
            return true;
        }
        zzdwVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzfn) {
            return ((zzfn) value).zzad();
        }
        if (value instanceof zzew) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i;
        int iZzA;
        int iZzx;
        zzdw zzdwVar = (zzdw) entry.getKey();
        Object value = entry.getValue();
        if (zzdwVar.zze() != zzhg.MESSAGE) {
            return zza(zzdwVar, value);
        }
        zzdwVar.zzg();
        zzdwVar.zzf();
        if (value instanceof zzew) {
            int iZza = ((zzdw) entry.getKey()).zza();
            int iZzA2 = zzdn.zzA(8);
            i = iZzA2 + iZzA2;
            iZzA = zzdn.zzA(iZza) + zzdn.zzA(16);
            int iZzA3 = zzdn.zzA(24);
            int iZza2 = ((zzew) value).zza();
            iZzx = AbstractC1173g.E(iZza2, iZza2, iZzA3);
        } else {
            int iZza3 = ((zzdw) entry.getKey()).zza();
            int iZzA4 = zzdn.zzA(8);
            i = iZzA4 + iZzA4;
            iZzA = zzdn.zzA(iZza3) + zzdn.zzA(16);
            iZzx = zzdn.zzx((zzfm) value) + zzdn.zzA(24);
        }
        return i + iZzA + iZzx;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdx) {
            return this.zza.equals(((zzdx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzc = this.zza.zzc();
        int iZzo = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzo += zzo(this.zza.zzg(i));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzdx clone() {
        zzdx zzdxVar = new zzdx();
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zzdxVar.zzi((zzdw) ((zzgi) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzdxVar.zzi((zzdw) entry.getKey(), entry.getValue());
        }
        zzdxVar.zzd = this.zzd;
        return zzdxVar;
    }

    public final Object zze(zzdw zzdwVar) {
        Object obj = this.zza.get(zzdwVar);
        if (obj instanceof zzew) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzev(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            if (entryZzg.getValue() instanceof zzeh) {
                ((zzeh) entryZzg.getValue()).zzT();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzdx zzdxVar) {
        int iZzc = zzdxVar.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            zzm(zzdxVar.zza.zzg(i));
        }
        Iterator it = zzdxVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if ((r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzej) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r1 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 1
            r6.zzg()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r1 = r6.zzd()
            byte[] r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzep.zzb
            r7.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg.INT
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r1 = r1.zza()
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L47;
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L2f;
                case 7: goto L26;
                case 8: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L57
        L1d:
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew
            if (r1 == 0) goto L57
            goto L4b
        L26:
            boolean r1 = r7 instanceof java.lang.Integer
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzej
            if (r1 == 0) goto L57
            goto L4b
        L2f:
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof byte[]
            if (r1 == 0) goto L57
            goto L4b
        L38:
            boolean r1 = r7 instanceof java.lang.String
            goto L49
        L3b:
            boolean r1 = r7 instanceof java.lang.Boolean
            goto L49
        L3e:
            boolean r1 = r7 instanceof java.lang.Double
            goto L49
        L41:
            boolean r1 = r7 instanceof java.lang.Float
            goto L49
        L44:
            boolean r1 = r7 instanceof java.lang.Long
            goto L49
        L47:
            boolean r1 = r7 instanceof java.lang.Integer
        L49:
            if (r1 == 0) goto L57
        L4b:
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew
            if (r1 == 0) goto L51
            r5.zzd = r0
        L51:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgo r0 = r5.zza
            r0.put(r6, r7)
            return
        L57:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r2 = r6.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r6 = r6.zzd()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r6 = r6.zza()
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r3[r0] = r6
            r6 = 2
            r3[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r1.<init>(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdx.zzi(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzn(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzdx(boolean z4) {
        zzg();
        zzg();
    }
}
