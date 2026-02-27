package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzhkm {
    public static final /* synthetic */ int zza = 0;
    private static final zzhkv zzb;

    static {
        int i = zzhgo.zza;
        zzb = new zzhkx();
    }

    public static int zzA(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhhm.zzA(i << 3) + 4) * size;
    }

    public static int zzB(List list) {
        return list.size() * 8;
    }

    public static int zzC(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhhm.zzA(i << 3) + 8) * size;
    }

    public static int zzD(int i, Object obj, zzhkk zzhkkVar) {
        int i4 = i << 3;
        if (obj instanceof zzhjc) {
            int iZzA = zzhhm.zzA(i4);
            int iZzb = ((zzhjc) obj).zzb();
            return AbstractC1173g.e(iZzb, iZzb, iZzA);
        }
        int iZzA2 = zzhhm.zzA(i4);
        int iZzaT = ((zzhgk) obj).zzaT(zzhkkVar);
        return AbstractC1173g.e(iZzaT, iZzaT, iZzA2);
    }

    @Deprecated
    public static int zzE(int i, zzhjs zzhjsVar, zzhkk zzhkkVar) {
        int iZzA = zzhhm.zzA(i << 3);
        return ((zzhgk) zzhjsVar).zzaT(zzhkkVar) + iZzA + iZzA;
    }

    public static zzhkv zzF() {
        return zzb;
    }

    public static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzH(zzhhs zzhhsVar, Object obj, Object obj2) {
        if (((zzhid) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzI(zzhkv zzhkvVar, Object obj, Object obj2) {
        zzhih zzhihVar = (zzhih) obj;
        zzhkw zzhkwVarZzc = zzhihVar.zzt;
        zzhkw zzhkwVar = ((zzhih) obj2).zzt;
        if (!zzhkw.zza().equals(zzhkwVar)) {
            if (zzhkw.zza().equals(zzhkwVarZzc)) {
                zzhkwVarZzc = zzhkw.zzc(zzhkwVarZzc, zzhkwVar);
            } else {
                zzhkwVarZzc.zzm(zzhkwVar);
            }
        }
        zzhihVar.zzt = zzhkwVarZzc;
    }

    public static Object zzJ(Object obj, int i, List list, zzhin zzhinVar, Object obj2, zzhkv zzhkvVar) {
        if (zzhinVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzhinVar.zza(iIntValue)) {
                    obj2 = zzK(obj, i, iIntValue, obj2, zzhkvVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i4 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Integer num = (Integer) list.get(i6);
            int iIntValue2 = num.intValue();
            if (zzhinVar.zza(iIntValue2)) {
                if (i6 != i4) {
                    list.set(i4, num);
                }
                i4++;
            } else {
                obj2 = zzK(obj, i, iIntValue2, obj2, zzhkvVar);
            }
        }
        if (i4 != size) {
            list.subList(i4, size).clear();
        }
        return obj2;
    }

    public static Object zzK(Object obj, int i, int i4, Object obj2, zzhkv zzhkvVar) {
        if (obj2 == null) {
            obj2 = zzhkvVar.zzh(obj);
        }
        zzhkvVar.zza(obj2, i, i4);
        return obj2;
    }

    public static void zza(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzC(i, list, z4);
    }

    public static void zzb(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzB(i, list, z4);
    }

    public static void zzc(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzy(i, list, z4);
    }

    public static void zzd(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzz(i, list, z4);
    }

    public static void zze(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzL(i, list, z4);
    }

    public static void zzf(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzA(i, list, z4);
    }

    public static void zzg(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzJ(i, list, z4);
    }

    public static void zzh(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzw(i, list, z4);
    }

    public static void zzi(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzH(i, list, z4);
    }

    public static void zzj(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzK(i, list, z4);
    }

    public static void zzk(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzx(i, list, z4);
    }

    public static void zzl(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzI(i, list, z4);
    }

    public static void zzm(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzD(i, list, z4);
    }

    public static void zzn(int i, List list, zzhlk zzhlkVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzE(i, list, z4);
    }

    public static void zzo(int i, List list, zzhlk zzhlkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzF(i, list);
    }

    public static void zzp(int i, List list, zzhlk zzhlkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzG(i, list);
    }

    public static void zzq(int i, List list, zzhlk zzhlkVar, zzhkk zzhkkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((zzhhn) zzhlkVar).zzr(i, list.get(i4), zzhkkVar);
        }
    }

    public static void zzr(int i, List list, zzhlk zzhlkVar, zzhkk zzhkkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((zzhhn) zzhlkVar).zzs(i, list.get(i4), zzhkkVar);
        }
    }

    public static int zzs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhjg)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzhhm.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzB;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzhhm.zzB(zzhjgVar.zzc(i));
            i++;
        }
        return iZzB2;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhjg)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzhhm.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzB;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzhhm.zzB(zzhjgVar.zzc(i));
            i++;
        }
        return iZzB2;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhjg)) {
            int iZzB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzB += zzhhm.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzB;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        int iZzB2 = 0;
        while (i < size) {
            long jZzc = zzhjgVar.zzc(i);
            iZzB2 += zzhhm.zzB((jZzc >> 63) ^ (jZzc + jZzc));
            i++;
        }
        return iZzB2;
    }

    public static int zzv(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhii)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzhhm.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzB;
        }
        zzhii zzhiiVar = (zzhii) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzhhm.zzB(zzhiiVar.zzf(i));
            i++;
        }
        return iZzB2;
    }

    public static int zzw(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhii)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzhhm.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzB;
        }
        zzhii zzhiiVar = (zzhii) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzhhm.zzB(zzhiiVar.zzf(i));
            i++;
        }
        return iZzB2;
    }

    public static int zzx(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhii)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzhhm.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzhii zzhiiVar = (zzhii) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzhhm.zzA(zzhiiVar.zzf(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzy(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhii)) {
            int iZzA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzA += zzhhm.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzA;
        }
        zzhii zzhiiVar = (zzhii) list;
        int iZzA2 = 0;
        while (i < size) {
            int iZzf = zzhiiVar.zzf(i);
            iZzA2 += zzhhm.zzA((iZzf >> 31) ^ (iZzf + iZzf));
            i++;
        }
        return iZzA2;
    }

    public static int zzz(List list) {
        return list.size() * 4;
    }
}
