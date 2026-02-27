package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzhhw {
    private static final zzhhw zzd = new zzhhw(true);
    final zzhkr zza = new zzhkn();
    boolean zzb;
    boolean zzc;

    private zzhhw() {
    }

    public static zzhhw zza() {
        return zzd;
    }

    public static void zzf(zzhhm zzhhmVar, zzhli zzhliVar, int i, Object obj) throws IOException {
        if (zzhliVar == zzhli.zzj) {
            zzhhmVar.zzJ(i, 3);
            ((zzhjs) obj).zzdc(zzhhmVar);
            zzhhmVar.zzJ(i, 4);
            return;
        }
        zzhhmVar.zzJ(i, zzhliVar.zzb());
        zzhlj zzhljVar = zzhlj.INT;
        switch (zzhliVar.ordinal()) {
            case 0:
                zzhhmVar.zzv(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzhhmVar.zzt(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzhhmVar.zzu(((Long) obj).longValue());
                break;
            case 3:
                zzhhmVar.zzu(((Long) obj).longValue());
                break;
            case 4:
                zzhhmVar.zzr(((Integer) obj).intValue());
                break;
            case 5:
                zzhhmVar.zzv(((Long) obj).longValue());
                break;
            case 6:
                zzhhmVar.zzt(((Integer) obj).intValue());
                break;
            case 7:
                zzhhmVar.zzq(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzhhb)) {
                    zzhhmVar.zzx((String) obj);
                } else {
                    zzhhmVar.zzl((zzhhb) obj);
                }
                break;
            case 9:
                ((zzhjs) obj).zzdc(zzhhmVar);
                break;
            case 10:
                zzhhmVar.zzp((zzhjs) obj);
                break;
            case 11:
                if (!(obj instanceof zzhhb)) {
                    byte[] bArr = (byte[]) obj;
                    zzhhmVar.zzm(bArr, 0, bArr.length);
                } else {
                    zzhhmVar.zzl((zzhhb) obj);
                }
                break;
            case 12:
                zzhhmVar.zzs(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzhil)) {
                    zzhhmVar.zzr(((Integer) obj).intValue());
                } else {
                    zzhhmVar.zzr(((zzhil) obj).zza());
                }
                break;
            case 14:
                zzhhmVar.zzt(((Integer) obj).intValue());
                break;
            case 15:
                zzhhmVar.zzv(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzhhmVar.zzs((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzhhmVar.zzu((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int zzh(zzhli zzhliVar, int i, Object obj) {
        int iZzA = zzhhm.zzA(i << 3);
        if (zzhliVar == zzhli.zzj) {
            iZzA += iZzA;
        }
        return iZzA + zzi(zzhliVar, obj);
    }

    public static int zzi(zzhli zzhliVar, Object obj) {
        int iZzc;
        int iZzA;
        zzhli zzhliVar2 = zzhli.zza;
        zzhlj zzhljVar = zzhlj.INT;
        switch (zzhliVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i = zzhhm.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i4 = zzhhm.zzf;
                return 4;
            case 2:
                return zzhhm.zzB(((Long) obj).longValue());
            case 3:
                return zzhhm.zzB(((Long) obj).longValue());
            case 4:
                return zzhhm.zzB(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i6 = zzhhm.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i10 = zzhhm.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i11 = zzhhm.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzhhb)) {
                    return zzhhm.zzC((String) obj);
                }
                int i12 = zzhhm.zzf;
                iZzc = ((zzhhb) obj).zzc();
                iZzA = zzhhm.zzA(iZzc);
                break;
                break;
            case 9:
                return ((zzhjs) obj).zzbr();
            case 10:
                if (!(obj instanceof zzhjb)) {
                    return zzhhm.zzD((zzhjs) obj);
                }
                iZzc = ((zzhjb) obj).zzb();
                iZzA = zzhhm.zzA(iZzc);
                break;
                break;
            case 11:
                if (!(obj instanceof zzhhb)) {
                    int i13 = zzhhm.zzf;
                    iZzc = ((byte[]) obj).length;
                    iZzA = zzhhm.zzA(iZzc);
                } else {
                    int i14 = zzhhm.zzf;
                    iZzc = ((zzhhb) obj).zzc();
                    iZzA = zzhhm.zzA(iZzc);
                }
                break;
            case 12:
                return zzhhm.zzA(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzhil ? zzhhm.zzB(((zzhil) obj).zza()) : zzhhm.zzB(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i15 = zzhhm.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i16 = zzhhm.zzf;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzhhm.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzhhm.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzA + iZzc;
    }

    public static int zzj(zzhhv zzhhvVar, Object obj) {
        zzhli zzhliVarZzb = zzhhvVar.zzb();
        int iZza = zzhhvVar.zza();
        if (!zzhhvVar.zzd()) {
            return zzh(zzhliVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzhhvVar.zze()) {
            int iZzh = 0;
            while (i < size) {
                iZzh += zzh(zzhliVarZzb, iZza, list.get(i));
                i++;
            }
            return iZzh;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzi = 0;
        while (i < size) {
            iZzi += zzi(zzhliVarZzb, list.get(i));
            i++;
        }
        return zzhhm.zzA(iZzi) + zzhhm.zzA(iZza << 3) + iZzi;
    }

    private static boolean zzk(Map.Entry entry) {
        zzhhv zzhhvVar = (zzhhv) entry.getKey();
        if (zzhhvVar.zzc() != zzhlj.MESSAGE) {
            return true;
        }
        if (!zzhhvVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzl(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzhjt) {
            return ((zzhjt) obj).zzbi();
        }
        if (obj instanceof zzhjb) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i;
        int iZzA;
        int iZzD;
        zzhhv zzhhvVar = (zzhhv) entry.getKey();
        Object value = entry.getValue();
        if (zzhhvVar.zzc() != zzhlj.MESSAGE || zzhhvVar.zzd() || zzhhvVar.zze()) {
            return zzj(zzhhvVar, value);
        }
        if (value instanceof zzhjb) {
            int iZza = ((zzhhv) entry.getKey()).zza();
            int iZzA2 = zzhhm.zzA(8);
            i = iZzA2 + iZzA2;
            iZzA = zzhhm.zzA(iZza) + zzhhm.zzA(16);
            int iZzA3 = zzhhm.zzA(24);
            int iZzb = ((zzhjb) value).zzb();
            iZzD = AbstractC1173g.e(iZzb, iZzb, iZzA3);
        } else {
            int iZza2 = ((zzhhv) entry.getKey()).zza();
            int iZzA4 = zzhhm.zzA(8);
            i = iZzA4 + iZzA4;
            iZzA = zzhhm.zzA(iZza2) + zzhhm.zzA(16);
            iZzD = zzhhm.zzD((zzhjs) value) + zzhhm.zzA(24);
        }
        return i + iZzA + iZzD;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzn(com.google.android.gms.internal.ads.zzhhv r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zzhli r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.zzhiu.zzb
            r5.getClass()
            com.google.android.gms.internal.ads.zzhli r1 = com.google.android.gms.internal.ads.zzhli.zza
            com.google.android.gms.internal.ads.zzhlj r1 = com.google.android.gms.internal.ads.zzhlj.INT
            com.google.android.gms.internal.ads.zzhlj r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhjs
            if (r0 != 0) goto L21
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhjb
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhil
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhhb
            if (r0 != 0) goto L33
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
        L33:
            return
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.ads.zzhli r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzhlj r4 = r4.zza()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhhw.zzn(com.google.android.gms.internal.ads.zzhhv, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzhhw zzhhwVar = new zzhhw();
        zzhkr zzhkrVar = this.zza;
        int iZzc = zzhkrVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzd = zzhkrVar.zzd(i);
            zzhhwVar.zzd((zzhhv) ((zzhko) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzhkrVar.zze()) {
            zzhhwVar.zzd((zzhhv) entry.getKey(), entry.getValue());
        }
        zzhhwVar.zzc = this.zzc;
        return zzhhwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhhw) {
            return this.zza.equals(((zzhhw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzhkr zzhkrVar = this.zza;
        int iZzc = zzhkrVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Object value = zzhkrVar.zzd(i).getValue();
            if (value instanceof zzhih) {
                ((zzhih) value).zzbm();
            }
        }
        Iterator it = zzhkrVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzhih) {
                ((zzhih) value2).zzbm();
            }
        }
        zzhkrVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzhkr zzhkrVar = this.zza;
        return zzhkrVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzhja(zzhkrVar.entrySet().iterator()) : zzhkrVar.entrySet().iterator();
    }

    public final void zzd(zzhhv zzhhvVar, Object obj) {
        if (!zzhhvVar.zzd()) {
            zzn(zzhhvVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzn(zzhhvVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzhjb) {
            this.zzc = true;
        }
        this.zza.put(zzhhvVar, obj);
    }

    public final boolean zze() {
        zzhkr zzhkrVar = this.zza;
        int iZzc = zzhkrVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzk(zzhkrVar.zzd(i))) {
                return false;
            }
        }
        Iterator it = zzhkrVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzhkr zzhkrVar = this.zza;
        int iZzc = zzhkrVar.zzc();
        int iZzm = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzm += zzm(zzhkrVar.zzd(i));
        }
        Iterator it = zzhkrVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    private zzhhw(boolean z4) {
        zzb();
        zzb();
    }
}
