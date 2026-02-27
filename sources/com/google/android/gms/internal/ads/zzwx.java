package com.google.android.gms.internal.ads;

import androidx.camera.video.AudioStats;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwx extends zzwz {
    public zzwx(zzbf zzbfVar, int[] iArr, int i, zzyu zzyuVar, long j, long j6, long j7, int i4, int i6, float f, float f3, List list, zzdb zzdbVar) {
        super(zzbfVar, iArr, 0);
        zzgjz.zzq(list);
    }

    public static /* synthetic */ zzgjz zzd(zzye[] zzyeVarArr) {
        int i;
        long[][] jArr;
        int i4 = 1;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            zzye zzyeVar = zzyeVarArr[i10];
            if (zzyeVar == null || zzyeVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i11 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                zzgjwVar.zzf(new zzwv(0L, 0L));
                arrayList.add(zzgjwVar);
            }
        }
        long[][] jArr2 = new long[2][];
        for (int i12 = 0; i12 < 2; i12++) {
            zzye zzyeVar2 = zzyeVarArr[i12];
            if (zzyeVar2 == null) {
                jArr2[i12] = new long[0];
            } else {
                int[] iArr = zzyeVar2.zzb;
                jArr2[i12] = new long[iArr.length];
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    long j = zzyeVar2.zza.zza(iArr[i13]).zzj;
                    long[] jArr3 = jArr2[i12];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i13] = j;
                }
                Arrays.sort(jArr2[i12]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i14 = 0; i14 < 2; i14++) {
            long[] jArr5 = jArr2[i14];
            jArr4[i14] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzgkk zzgkkVarZza = zzgle.zzc(zzglj.zzb()).zzb(2).zza();
        int i15 = 0;
        while (i15 < 2) {
            int length = jArr2[i15].length;
            if (length <= i4) {
                i = i6;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i16 = i6;
                while (true) {
                    long[] jArr6 = jArr2[i15];
                    int length2 = jArr6.length;
                    double dLog = AudioStats.AUDIO_AMPLITUDE_NONE;
                    if (i16 >= length2) {
                        break;
                    }
                    int i17 = i6;
                    long[][] jArr7 = jArr2;
                    long j6 = jArr6[i16];
                    if (j6 != -1) {
                        dLog = Math.log(j6);
                    }
                    dArr[i16] = dLog;
                    i16 += i4;
                    i6 = i17;
                    jArr2 = jArr7;
                }
                i = i6;
                jArr = jArr2;
                int i18 = length - 1;
                double d10 = dArr[i18] - dArr[i];
                int i19 = i;
                while (i19 < i18) {
                    double d11 = dArr[i19];
                    i19 += i4;
                    zzgkkVarZza.zze(Double.valueOf(d10 == AudioStats.AUDIO_AMPLITUDE_NONE ? 1.0d : (((d11 + dArr[i19]) * 0.5d) - dArr[i]) / d10), Integer.valueOf(i15));
                    i4 = i4;
                }
            }
            i15++;
            i6 = i;
            jArr2 = jArr;
            i4 = i4;
        }
        int i20 = i6;
        long[][] jArr8 = jArr2;
        zzgjz zzgjzVarZzq = zzgjz.zzq(zzgkkVarZza.zzs());
        while (i6 < zzgjzVarZzq.size()) {
            int iIntValue = ((Integer) zzgjzVarZzq.get(i6)).intValue();
            int i21 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i21;
            jArr4[iIntValue] = jArr8[iIntValue][i21];
            zzi(arrayList, jArr4);
            i6++;
        }
        for (int i22 = i20; i22 < 2; i22++) {
            if (arrayList.get(i22) != null) {
                long j7 = jArr4[i22];
                jArr4[i22] = j7 + j7;
            }
        }
        zzi(arrayList, jArr4);
        zzgjw zzgjwVar2 = new zzgjw();
        for (int i23 = i20; i23 < arrayList.size(); i23++) {
            zzgjw zzgjwVar3 = (zzgjw) arrayList.get(i23);
            zzgjwVar2.zzf(zzgjwVar3 == null ? zzgjz.zzi() : zzgjwVar3.zzi());
        }
        return zzgjwVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            zzgjw zzgjwVar = (zzgjw) list.get(i4);
            if (zzgjwVar != null) {
                zzgjwVar.zzf(new zzwv(j, jArr[i4]));
            }
        }
    }
}
