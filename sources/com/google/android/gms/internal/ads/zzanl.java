package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.extractor.ts.TsExtractor;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzanl implements zzand {
    final /* synthetic */ zzann zza;
    private final zzee zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzanl(zzann zzannVar, int i) {
        Objects.requireNonNull(zzannVar);
        this.zza = zzannVar;
        this.zzb = new zzee(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zza(zzel zzelVar, zzacx zzacxVar, zzanr zzanrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zzb(zzef zzefVar) {
        zzann zzannVar;
        int i;
        zzee zzeeVar;
        int i4;
        int i6;
        if (zzefVar.zzs() != 2) {
            return;
        }
        zzann zzannVar2 = this.zza;
        zzel zzelVar = (zzel) zzannVar2.zza().get(0);
        if ((zzefVar.zzs() & 128) != 0) {
            zzefVar.zzk(1);
            int iZzt = zzefVar.zzt();
            int i10 = 3;
            zzefVar.zzk(3);
            zzee zzeeVar2 = this.zzb;
            zzefVar.zzl(zzeeVar2, 2);
            zzeeVar2.zzh(3);
            int i11 = 13;
            zzannVar2.zzp(zzeeVar2.zzj(13));
            zzefVar.zzl(zzeeVar2, 2);
            int i12 = 4;
            zzeeVar2.zzh(4);
            int i13 = 12;
            zzefVar.zzk(zzeeVar2.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZzd = zzefVar.zzd();
            while (iZzd > 0) {
                int i14 = 5;
                zzefVar.zzl(zzeeVar2, 5);
                int iZzj = zzeeVar2.zzj(8);
                zzeeVar2.zzh(i10);
                int iZzj2 = zzeeVar2.zzj(i11);
                zzeeVar2.zzh(i12);
                int iZzj3 = zzeeVar2.zzj(i13);
                int iZzg = zzefVar.zzg();
                int i15 = iZzg + iZzj3;
                String str = null;
                ArrayList arrayList = null;
                int i16 = -1;
                int iZzs = 0;
                while (zzefVar.zzg() < i15) {
                    int iZzs2 = zzefVar.zzs();
                    int iZzg2 = zzefVar.zzg() + zzefVar.zzs();
                    if (iZzg2 > i15) {
                        break;
                    }
                    if (iZzs2 == i14) {
                        long jZzz = zzefVar.zzz();
                        if (jZzz != 1094921523) {
                            if (jZzz != 1161904947) {
                                if (jZzz != 1094921524) {
                                    if (jZzz == 1212503619) {
                                        i6 = 36;
                                        zzannVar = zzannVar2;
                                        i16 = i6;
                                        i = iZzg2;
                                        zzeeVar = zzeeVar2;
                                        i4 = iZzd;
                                    }
                                    zzannVar = zzannVar2;
                                    i = iZzg2;
                                    zzeeVar = zzeeVar2;
                                    i4 = iZzd;
                                }
                                zzannVar = zzannVar2;
                                i = iZzg2;
                                zzeeVar = zzeeVar2;
                                i4 = iZzd;
                                i16 = 172;
                            }
                            zzannVar = zzannVar2;
                            zzeeVar = zzeeVar2;
                            i4 = iZzd;
                            i16 = 135;
                            i = iZzg2;
                        }
                        zzannVar = zzannVar2;
                        i = iZzg2;
                        zzeeVar = zzeeVar2;
                        i4 = iZzd;
                        i16 = 129;
                    } else {
                        if (iZzs2 != 106) {
                            if (iZzs2 == 122) {
                                zzannVar = zzannVar2;
                                zzeeVar = zzeeVar2;
                                i4 = iZzd;
                                i16 = 135;
                                i = iZzg2;
                            } else {
                                if (iZzs2 == 127) {
                                    int iZzs3 = zzefVar.zzs();
                                    if (iZzs3 != 21) {
                                        if (iZzs3 == 14) {
                                            i6 = TsExtractor.TS_STREAM_TYPE_DTS_HD;
                                        } else {
                                            if (iZzs3 == 33) {
                                                i6 = TsExtractor.TS_STREAM_TYPE_DTS_UHD;
                                            }
                                            zzannVar = zzannVar2;
                                            i = iZzg2;
                                            zzeeVar = zzeeVar2;
                                            i4 = iZzd;
                                        }
                                    }
                                    zzannVar = zzannVar2;
                                    i = iZzg2;
                                    zzeeVar = zzeeVar2;
                                    i4 = iZzd;
                                    i16 = 172;
                                } else if (iZzs2 == 123) {
                                    i6 = TsExtractor.TS_STREAM_TYPE_DTS;
                                } else if (iZzs2 == 10) {
                                    String strTrim = zzefVar.zzK(3, StandardCharsets.UTF_8).trim();
                                    iZzs = zzefVar.zzs();
                                    zzannVar = zzannVar2;
                                    str = strTrim;
                                    i = iZzg2;
                                    zzeeVar = zzeeVar2;
                                    i4 = iZzd;
                                } else if (iZzs2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzefVar.zzg() < iZzg2) {
                                        int i17 = iZzg2;
                                        String strTrim2 = zzefVar.zzK(3, StandardCharsets.UTF_8).trim();
                                        int iZzs4 = zzefVar.zzs();
                                        int i18 = iZzd;
                                        byte[] bArr = new byte[4];
                                        zzefVar.zzm(bArr, 0, 4);
                                        arrayList2.add(new zzano(strTrim2, iZzs4, bArr));
                                        iZzd = i18;
                                        iZzg2 = i17;
                                        zzeeVar2 = zzeeVar2;
                                        zzannVar2 = zzannVar2;
                                    }
                                    zzannVar = zzannVar2;
                                    i = iZzg2;
                                    zzeeVar = zzeeVar2;
                                    i4 = iZzd;
                                    arrayList = arrayList2;
                                    i16 = 89;
                                } else {
                                    zzannVar = zzannVar2;
                                    i = iZzg2;
                                    zzeeVar = zzeeVar2;
                                    i4 = iZzd;
                                    if (iZzs2 == 111) {
                                        i16 = 257;
                                    }
                                }
                                zzannVar = zzannVar2;
                                i16 = i6;
                                i = iZzg2;
                                zzeeVar = zzeeVar2;
                                i4 = iZzd;
                            }
                        }
                        zzannVar = zzannVar2;
                        i = iZzg2;
                        zzeeVar = zzeeVar2;
                        i4 = iZzd;
                        i16 = 129;
                    }
                    zzefVar.zzk(i - zzefVar.zzg());
                    iZzd = i4;
                    zzeeVar2 = zzeeVar;
                    zzannVar2 = zzannVar;
                    i14 = 5;
                }
                zzann zzannVar3 = zzannVar2;
                zzee zzeeVar3 = zzeeVar2;
                int i19 = iZzd;
                zzefVar.zzh(i15);
                zzanp zzanpVar = new zzanp(i16, str, iZzs, arrayList, Arrays.copyOfRange(zzefVar.zzi(), iZzg, i15));
                if (iZzj == 6 || iZzj == 5) {
                    iZzj = zzanpVar.zza;
                }
                iZzd = i19 - (iZzj3 + 5);
                if (!zzannVar3.zzj().get(iZzj2)) {
                    zzans zzansVarZzb = zzannVar3.zzb().zzb(iZzj, zzanpVar);
                    sparseIntArray.put(iZzj2, iZzj2);
                    sparseArray.put(iZzj2, zzansVarZzb);
                }
                i12 = 4;
                zzeeVar2 = zzeeVar3;
                zzannVar2 = zzannVar3;
                i10 = 3;
                i11 = 13;
                i13 = 12;
            }
            zzann zzannVar4 = zzannVar2;
            int size = sparseIntArray.size();
            for (int i20 = 0; i20 < size; i20++) {
                int iKeyAt = sparseIntArray.keyAt(i20);
                int iValueAt = sparseIntArray.valueAt(i20);
                zzannVar4.zzj().put(iKeyAt, true);
                zzannVar4.zzk().put(iValueAt, true);
                zzans zzansVar = (zzans) sparseArray.valueAt(i20);
                if (zzansVar != null) {
                    zzansVar.zza(zzelVar, zzannVar4.zzl(), new zzanr(iZzt, iKeyAt, 8192));
                    zzannVar4.zzc().put(iValueAt, zzansVar);
                }
            }
            zzannVar4.zzc().remove(this.zze);
            zzannVar4.zzn(0);
            if (zzannVar4.zzm() == 0) {
                zzannVar4.zzl().zzv();
                zzannVar4.zzo(true);
            }
        }
    }
}
