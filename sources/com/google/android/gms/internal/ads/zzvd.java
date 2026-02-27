package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzvd implements zzun, zzum {
    private final zzun[] zza;
    private final boolean[] zzb;

    @Nullable
    private zzum zzf;

    @Nullable
    private zzwq zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzwh zzi = new zztz(zzgjz.zzi(), zzgjz.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzun[] zzh = new zzun[0];

    public zzvd(zzua zzuaVar, long[] jArr, zzun... zzunVarArr) {
        this.zza = zzunVarArr;
        this.zzb = new boolean[zzunVarArr.length];
        for (int i = 0; i < zzunVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zzb[i] = true;
                this.zza[i] = new zzwn(zzunVarArr[i], j);
            }
        }
    }

    public final zzun zza(int i) {
        return this.zzb[i] ? ((zzwn) this.zza[i]).zza() : this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j) {
        this.zzf = zzumVar;
        ArrayList arrayList = this.zzd;
        zzun[] zzunVarArr = this.zza;
        Collections.addAll(arrayList, zzunVarArr);
        for (zzun zzunVar : zzunVarArr) {
            zzunVar.zzb(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzc() throws IOException {
        int i = 0;
        while (true) {
            zzun[] zzunVarArr = this.zza;
            if (i >= zzunVarArr.length) {
                return;
            }
            zzunVarArr[i].zzc();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzwq zzd() {
        zzwq zzwqVar = this.zzg;
        zzwqVar.getClass();
        return zzwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zze(zzyf[] zzyfVarArr, boolean[] zArr, zzwf[] zzwfVarArr, boolean[] zArr2, long j) {
        int length;
        int[] iArr;
        int length2 = zzyfVarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i = 0;
        int i4 = 0;
        while (true) {
            length = zzyfVarArr.length;
            if (i4 >= length) {
                break;
            }
            zzwf zzwfVar = zzwfVarArr[i4];
            Integer num = zzwfVar == null ? null : (Integer) this.zzc.get(zzwfVar);
            iArr2[i4] = num == null ? -1 : num.intValue();
            zzyf zzyfVar = zzyfVarArr[i4];
            if (zzyfVar != null) {
                String str = zzyfVar.zza().zzb;
                iArr3[i4] = Integer.parseInt(str.substring(0, str.indexOf(Global.COLON)));
            } else {
                iArr3[i4] = -1;
            }
            i4++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzun[] zzunVarArr = this.zza;
        zzwf[] zzwfVarArr2 = new zzwf[length];
        zzwf[] zzwfVarArr3 = new zzwf[length];
        zzyf[] zzyfVarArr2 = new zzyf[length];
        ArrayList arrayList = new ArrayList(zzunVarArr.length);
        long j6 = j;
        int i6 = 0;
        while (i6 < zzunVarArr.length) {
            int i10 = i;
            while (i10 < zzyfVarArr.length) {
                zzwfVarArr3[i10] = iArr2[i10] == i6 ? zzwfVarArr[i10] : null;
                if (iArr3[i10] == i6) {
                    zzyf zzyfVar2 = zzyfVarArr[i10];
                    zzyfVar2.getClass();
                    iArr = iArr3;
                    zzbf zzbfVar = (zzbf) this.zze.get(zzyfVar2.zza());
                    zzbfVar.getClass();
                    zzyfVarArr2[i10] = new zzvc(zzyfVar2, zzbfVar);
                } else {
                    iArr = iArr3;
                    zzyfVarArr2[i10] = null;
                }
                i10++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i11 = i6;
            long jZze = zzunVarArr[i6].zze(zzyfVarArr2, zArr, zzwfVarArr3, zArr2, j6);
            if (i11 == 0) {
                j6 = jZze;
            } else if (jZze != j6) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z4 = false;
            for (int i12 = 0; i12 < zzyfVarArr.length; i12++) {
                if (iArr4[i12] == i11) {
                    zzwf zzwfVar2 = zzwfVarArr3[i12];
                    zzwfVar2.getClass();
                    zzwfVarArr2[i12] = zzwfVar2;
                    identityHashMap.put(zzwfVar2, Integer.valueOf(i11));
                    z4 = true;
                } else if (iArr2[i12] == i11) {
                    zzghc.zzh(zzwfVarArr3[i12] == null);
                }
            }
            if (z4) {
                arrayList2.add(zzunVarArr[i11]);
            }
            i6 = i11 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i = 0;
        }
        int i13 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwfVarArr2, i13, zzwfVarArr, i13, length);
        this.zzh = (zzun[]) arrayList3.toArray(new zzun[i13]);
        this.zzi = new zztz(arrayList3, zzgkp.zzc(arrayList3, zzvb.zza));
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j, boolean z4) {
        for (zzun zzunVar : this.zzh) {
            zzunVar.zzf(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j) {
        this.zzi.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        long j = -9223372036854775807L;
        for (zzun zzunVar : this.zzh) {
            long jZzh = zzunVar.zzh();
            if (jZzh == androidx.media3.common.C.TIME_UNSET) {
                if (j != androidx.media3.common.C.TIME_UNSET && zzunVar.zzj(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == androidx.media3.common.C.TIME_UNSET) {
                for (zzun zzunVar2 : this.zzh) {
                    if (zzunVar2 == zzunVar) {
                        break;
                    }
                    if (zzunVar2.zzj(jZzh) != jZzh) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzh;
            } else if (jZzh != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        return this.zzi.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j) {
        long jZzj = this.zzh[0].zzj(j);
        int i = 1;
        while (true) {
            zzun[] zzunVarArr = this.zzh;
            if (i >= zzunVarArr.length) {
                return jZzj;
            }
            if (zzunVarArr[i].zzj(jZzj) != jZzj) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzk(long j, zzlt zzltVar) {
        zzun[] zzunVarArr = this.zzh;
        return (zzunVarArr.length > 0 ? zzunVarArr[0] : this.zza[0]).zzk(j, zzltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        return this.zzi.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzm(zzklVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzun) arrayList.get(i)).zzm(zzklVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zzi.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzun zzunVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzunVar);
        if (arrayList.isEmpty()) {
            zzun[] zzunVarArr = this.zza;
            int i = 0;
            for (zzun zzunVar2 : zzunVarArr) {
                i += zzunVar2.zzd().zzb;
            }
            zzbf[] zzbfVarArr = new zzbf[i];
            int i4 = 0;
            for (int i6 = 0; i6 < zzunVarArr.length; i6++) {
                zzwq zzwqVarZzd = zzunVarArr[i6].zzd();
                int i10 = zzwqVarZzd.zzb;
                int i11 = 0;
                while (i11 < i10) {
                    zzbf zzbfVarZza = zzwqVarZzd.zza(i11);
                    int i12 = zzbfVarZza.zza;
                    zzu[] zzuVarArr = new zzu[i12];
                    int i13 = 0;
                    while (i13 < i12) {
                        zzu zzuVarZza = zzbfVarZza.zza(i13);
                        zzs zzsVarZza = zzuVarZza.zza();
                        String str = zzuVarZza.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzun[] zzunVarArr2 = zzunVarArr;
                        StringBuilder sb2 = new StringBuilder(str.length() + androidx.media3.datasource.cache.c.a(i6, 1));
                        sb2.append(i6);
                        sb2.append(Global.COLON);
                        sb2.append(str);
                        zzsVarZza.zza(sb2.toString());
                        zzuVarArr[i13] = zzsVarZza.zzM();
                        i13++;
                        zzunVarArr = zzunVarArr2;
                    }
                    zzun[] zzunVarArr3 = zzunVarArr;
                    String str2 = zzbfVarZza.zzb;
                    StringBuilder sb3 = new StringBuilder(androidx.media3.datasource.cache.c.a(i6, 1) + String.valueOf(str2).length());
                    sb3.append(i6);
                    sb3.append(Global.COLON);
                    sb3.append(str2);
                    zzbf zzbfVar = new zzbf(sb3.toString(), zzuVarArr);
                    this.zze.put(zzbfVar, zzbfVarZza);
                    zzbfVarArr[i4] = zzbfVar;
                    i11++;
                    i4++;
                    zzunVarArr = zzunVarArr3;
                }
            }
            this.zzg = new zzwq(zzbfVarArr);
            zzum zzumVar = this.zzf;
            zzumVar.getClass();
            zzumVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final /* bridge */ /* synthetic */ void zzs(zzwh zzwhVar) {
        zzum zzumVar = this.zzf;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }
}
