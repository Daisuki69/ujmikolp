package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazr {
    public static void zza(String[] strArr, int i, int i4, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzb(i, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzb(i, jZze, zzc(strArr, 0, 6), 6, priorityQueue);
        int i6 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i6 >= length2 - 5) {
                return;
            }
            long jZza = zzazo.zza(strArr[i6 - 1]);
            long jZza2 = zzazo.zza(strArr[i6 + 5]);
            String strZzc = zzc(strArr, i6, 6);
            jZze = (((jZza2 + 2147483647L) % 1073807359) + (((((jZze + 1073807359) - ((((jZza + 2147483647L) % 1073807359) * zzd(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzb(i, jZze, strZzc, length2, priorityQueue);
            i6++;
        }
    }

    @VisibleForTesting
    public static void zzb(int i, long j, String str, int i4, PriorityQueue priorityQueue) {
        zzazq zzazqVar = new zzazq(j, str, i4);
        if ((priorityQueue.size() != i || (((zzazq) priorityQueue.peek()).zzc <= zzazqVar.zzc && ((zzazq) priorityQueue.peek()).zza <= zzazqVar.zza)) && !priorityQueue.contains(zzazqVar)) {
            priorityQueue.add(zzazqVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    @VisibleForTesting
    public static String zzc(String[] strArr, int i, int i4) {
        int i6 = i4 + i;
        if (strArr.length < i6) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i11 = i6 - 1;
            if (i >= i11) {
                sb2.append(strArr[i11]);
                return sb2.toString();
            }
            sb2.append(strArr[i]);
            sb2.append(' ');
            i++;
        }
    }

    @VisibleForTesting
    public static long zzd(long j, int i) {
        if (i == 1) {
            return j;
        }
        int i4 = i >> 1;
        long j6 = (j * j) % 1073807359;
        return (i & 1) == 0 ? zzd(j6, i4) % 1073807359 : ((zzd(j6, i4) % 1073807359) * j) % 1073807359;
    }

    private static long zze(String[] strArr, int i, int i4) {
        long jZza = (((long) zzazo.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i6 = 1; i6 < i4; i6++) {
            jZza = (((((long) zzazo.zza(strArr[i6])) + 2147483647L) % 1073807359) + ((jZza * 16785407) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
