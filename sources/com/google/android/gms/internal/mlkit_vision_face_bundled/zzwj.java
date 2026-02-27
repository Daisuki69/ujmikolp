package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.android.gms.internal.ads.AbstractC1173g;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzwj {
    public static final /* synthetic */ int zza = 0;
    private static final zzwv zzb;

    static {
        int i = zzwe.zza;
        zzb = new zzwx();
    }

    public static void zzA(int i, List list, zzxi zzxiVar, zzwh zzwhVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((zzud) zzxiVar).zzv(i, list.get(i4), zzwhVar);
        }
    }

    public static void zzB(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzy(i, list, z4);
    }

    public static void zzC(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzA(i, list, z4);
    }

    public static void zzD(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzC(i, list, z4);
    }

    public static void zzE(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzE(i, list, z4);
    }

    public static void zzF(int i, List list, zzxi zzxiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzH(i, list);
    }

    public static void zzG(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzJ(i, list, z4);
    }

    public static void zzH(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzL(i, list, z4);
    }

    public static boolean zzI(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzux)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzuc.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzux zzuxVar = (zzux) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzuc.zzA(zzuxVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzb(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzuc.zzz(i << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzuc.zzz(i << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzux)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzuc.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zzux zzuxVar = (zzux) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzuc.zzA(zzuxVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzvl)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzuc.zzA(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzA;
        }
        zzvl zzvlVar = (zzvl) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzuc.zzA(zzvlVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    public static int zzh(int i, Object obj, zzwh zzwhVar) {
        int i4 = i << 3;
        if (!(obj instanceof zzvh)) {
            return zzuc.zzx((zzvw) obj, zzwhVar) + zzuc.zzz(i4);
        }
        int iZzz = zzuc.zzz(i4);
        int iZza = ((zzvh) obj).zza();
        return AbstractC1173g.F(iZza, iZza, iZzz);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzux)) {
            int iZzz = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzz += zzuc.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzz;
        }
        zzux zzuxVar = (zzux) list;
        int iZzz2 = 0;
        while (i < size) {
            int iZze = zzuxVar.zze(i);
            iZzz2 += zzuc.zzz((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzz2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzvl)) {
            int iZzA = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzA += zzuc.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzA;
        }
        zzvl zzvlVar = (zzvl) list;
        int iZzA2 = 0;
        while (i < size) {
            long jZze = zzvlVar.zze(i);
            iZzA2 += zzuc.zzA((jZze >> 63) ^ (jZze + jZze));
            i++;
        }
        return iZzA2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzux)) {
            int iZzz = 0;
            while (i < size) {
                iZzz += zzuc.zzz(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzz;
        }
        zzux zzuxVar = (zzux) list;
        int iZzz2 = 0;
        while (i < size) {
            iZzz2 += zzuc.zzz(zzuxVar.zze(i));
            i++;
        }
        return iZzz2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzvl)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzuc.zzA(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzA;
        }
        zzvl zzvlVar = (zzvl) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzuc.zzA(zzvlVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    public static zzwv zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i, int i4, Object obj2, zzwv zzwvVar) {
        Object obj3 = obj2;
        if (obj2 == null) {
            zzuw zzuwVar = (zzuw) obj;
            zzww zzwwVar = zzuwVar.zzc;
            obj3 = zzwwVar;
            if (zzwwVar == zzww.zzc()) {
                zzww zzwwVarZzf = zzww.zzf();
                zzuwVar.zzc = zzwwVarZzf;
                obj3 = zzwwVarZzf;
            }
        }
        ((zzww) obj3).zzj(i << 3, Long.valueOf(i4));
        return obj3;
    }

    public static void zzo(zzui zzuiVar, Object obj, Object obj2) {
        zzum zzumVar = ((zzus) obj2).zzb;
        if (zzumVar.zza.isEmpty()) {
            return;
        }
        ((zzus) obj).zzb().zzi(zzumVar);
    }

    public static void zzp(zzwv zzwvVar, Object obj, Object obj2) {
        zzuw zzuwVar = (zzuw) obj;
        zzww zzwwVarZze = zzuwVar.zzc;
        zzww zzwwVar = ((zzuw) obj2).zzc;
        if (!zzww.zzc().equals(zzwwVar)) {
            if (zzww.zzc().equals(zzwwVarZze)) {
                zzwwVarZze = zzww.zze(zzwwVarZze, zzwwVar);
            } else {
                zzwwVarZze.zzd(zzwwVar);
            }
        }
        zzuwVar.zzc = zzwwVarZze;
    }

    public static void zzq(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzc(i, list, z4);
    }

    public static void zzr(int i, List list, zzxi zzxiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zze(i, list);
    }

    public static void zzs(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzg(i, list, z4);
    }

    public static void zzt(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzj(i, list, z4);
    }

    public static void zzu(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzl(i, list, z4);
    }

    public static void zzv(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzn(i, list, z4);
    }

    public static void zzw(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzp(i, list, z4);
    }

    public static void zzx(int i, List list, zzxi zzxiVar, zzwh zzwhVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((zzud) zzxiVar).zzq(i, list.get(i4), zzwhVar);
        }
    }

    public static void zzy(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzs(i, list, z4);
    }

    public static void zzz(int i, List list, zzxi zzxiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxiVar.zzu(i, list, z4);
    }
}
