package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zznz {
    public static final /* synthetic */ int zza = 0;
    private static final zzoi zzb;

    static {
        int i = zznu.zza;
        zzb = new zzok();
    }

    public static zzoi zzA() {
        return zzb;
    }

    public static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzC(zzls zzlsVar, Object obj, Object obj2) {
        if (((zzmc) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzD(zzoi zzoiVar, Object obj, Object obj2) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVarZzc = zzmfVar.zzc;
        zzoj zzojVar = ((zzmf) obj2).zzc;
        if (!zzoj.zza().equals(zzojVar)) {
            if (zzoj.zza().equals(zzojVarZzc)) {
                zzojVarZzc = zzoj.zzc(zzojVarZzc, zzojVar);
            } else {
                zzojVarZzc.zzl(zzojVar);
            }
        }
        zzmfVar.zzc = zzojVarZzc;
    }

    public static Object zzE(Object obj, int i, int i4, Object obj2, zzoi zzoiVar) {
        if (obj2 == null) {
            obj2 = zzoiVar.zza(obj);
        }
        ((zzoj) obj2).zzk(i << 3, Long.valueOf(i4));
        return obj2;
    }

    public static void zza(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzC(i, list, z4);
    }

    public static void zzb(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzB(i, list, z4);
    }

    public static void zzc(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzy(i, list, z4);
    }

    public static void zzd(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzz(i, list, z4);
    }

    public static void zze(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzL(i, list, z4);
    }

    public static void zzf(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzA(i, list, z4);
    }

    public static void zzg(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzJ(i, list, z4);
    }

    public static void zzh(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzw(i, list, z4);
    }

    public static void zzi(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzH(i, list, z4);
    }

    public static void zzj(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzK(i, list, z4);
    }

    public static void zzk(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzx(i, list, z4);
    }

    public static void zzl(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzI(i, list, z4);
    }

    public static void zzm(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzD(i, list, z4);
    }

    public static void zzn(int i, List list, zzov zzovVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzE(i, list, z4);
    }

    public static int zzo(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzlm.zzA(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzp(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzlm.zzA(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzq(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzna)) {
            int iZzA = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzA += zzlm.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzA;
        }
        zzna zznaVar = (zzna) list;
        int iZzA2 = 0;
        while (i < size) {
            long jZzc = zznaVar.zzc(i);
            iZzA2 += zzlm.zzA((jZzc >> 63) ^ (jZzc + jZzc));
            i++;
        }
        return iZzA2;
    }

    public static int zzr(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzz = 0;
            while (i < size) {
                iZzz += zzlm.zzz(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzz;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzz2 = 0;
        while (i < size) {
            iZzz2 += zzlm.zzz(zzmgVar.zzf(i));
            i++;
        }
        return iZzz2;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmg)) {
            int iZzz = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzz += zzlm.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzz;
        }
        zzmg zzmgVar = (zzmg) list;
        int iZzz2 = 0;
        while (i < size) {
            int iZzf = zzmgVar.zzf(i);
            iZzz2 += zzlm.zzz((iZzf >> 31) ^ (iZzf + iZzf));
            i++;
        }
        return iZzz2;
    }

    public static int zzv(List list) {
        return list.size() * 4;
    }

    public static int zzw(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlm.zzz(i << 3) + 4) * size;
    }

    public static int zzx(List list) {
        return list.size() * 8;
    }

    public static int zzy(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlm.zzz(i << 3) + 8) * size;
    }

    public static int zzz(int i, Object obj, zznx zznxVar) {
        int i4 = i << 3;
        if (!(obj instanceof zzmw)) {
            return zzlm.zzD((zznm) obj, zznxVar) + zzlm.zzz(i4);
        }
        int iZzz = zzlm.zzz(i4);
        int iZzb = ((zzmw) obj).zzb();
        return AbstractC1173g.C(iZzb, iZzb, iZzz);
    }
}
