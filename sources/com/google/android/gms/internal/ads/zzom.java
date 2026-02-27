package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class zzom implements zzov {
    public static final zzght zza = zzok.zza;
    private static final Random zzb = new Random();
    private final zzbd zzc;
    private final zzbc zzd;
    private final HashMap zze;
    private zzou zzf;
    private zzbe zzg;

    @Nullable
    private String zzh;
    private long zzi;

    public zzom() {
        throw null;
    }

    private final void zzl(zzme zzmeVar) {
        if (zzmeVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzol zzolVar = (zzol) this.zze.get(str);
                zzolVar.getClass();
                zzm(zzolVar);
                return;
            }
            return;
        }
        zzol zzolVar2 = (zzol) this.zze.get(this.zzh);
        int i = zzmeVar.zzc;
        zzup zzupVar = zzmeVar.zzd;
        this.zzh = zzo(i, zzupVar).zze();
        zzc(zzmeVar);
        if (zzupVar == null || !zzupVar.zzb()) {
            return;
        }
        if (zzolVar2 != null) {
            if (zzolVar2.zzg() == zzupVar.zzd && zzolVar2.zzh() != null) {
                zzup zzupVarZzh = zzolVar2.zzh();
                if (zzupVarZzh.zzb == zzupVar.zzb) {
                    zzup zzupVarZzh2 = zzolVar2.zzh();
                    if (zzupVarZzh2.zzc == zzupVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i, new zzup(zzupVar.zza, zzupVar.zzd));
    }

    private final void zzm(zzol zzolVar) {
        if (zzolVar.zzg() != -1) {
            this.zzi = zzolVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzol zzolVar = (zzol) this.zze.get(this.zzh);
        return (zzolVar == null || zzolVar.zzg() == -1) ? this.zzi + 1 : zzolVar.zzg();
    }

    private final zzol zzo(int i, @Nullable zzup zzupVar) {
        HashMap map = this.zze;
        long j = Long.MAX_VALUE;
        zzol zzolVar = null;
        for (zzol zzolVar2 : map.values()) {
            zzolVar2.zzc(i, zzupVar);
            if (zzolVar2.zzb(i, zzupVar)) {
                long jZzg = zzolVar2.zzg();
                if (jZzg == -1 || jZzg < j) {
                    zzolVar = zzolVar2;
                    j = jZzg;
                } else if (jZzg == j) {
                    String str = zzeo.zza;
                    if (zzolVar.zzh() != null && zzolVar2.zzh() != null) {
                        zzolVar = zzolVar2;
                    }
                }
            }
        }
        if (zzolVar != null) {
            return zzolVar;
        }
        String strZzp = zzp();
        zzol zzolVar3 = new zzol(this, strZzp, i, zzupVar);
        map.put(strZzp, zzolVar3);
        return zzolVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final void zza(zzou zzouVar) {
        this.zzf = zzouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized String zzb(zzbe zzbeVar, zzup zzupVar) {
        return zzo(zzbeVar.zzo(zzupVar.zza, this.zzd).zzc, zzupVar).zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003e, B:23:0x0048, B:26:0x0051, B:28:0x0057, B:30:0x006c, B:31:0x0085, B:33:0x008b, B:34:0x008e, B:36:0x009a, B:38:0x00a0, B:44:0x00b1), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzc(com.google.android.gms.internal.ads.zzme r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzou r0 = r9.zzf     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lb0
            com.google.android.gms.internal.ads.zzbe r0 = r10.zzb     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r0.zzg()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto Lf
            goto Lae
        Lf:
            com.google.android.gms.internal.ads.zzup r1 = r10.zzd     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3e
            long r2 = r9.zzi()     // Catch: java.lang.Throwable -> L3c
            long r4 = r1.zzd     // Catch: java.lang.Throwable -> L3c
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto Lae
            java.util.HashMap r2 = r9.zze     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r9.zzh     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzol r2 = (com.google.android.gms.internal.ads.zzol) r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3e
            long r3 = r2.zzg()     // Catch: java.lang.Throwable -> L3c
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L3e
            int r2 = r2.zzf()     // Catch: java.lang.Throwable -> L3c
            int r3 = r10.zzc     // Catch: java.lang.Throwable -> L3c
            if (r2 != r3) goto Lae
            goto L3e
        L3c:
            r10 = move-exception
            goto Lb2
        L3e:
            int r2 = r10.zzc     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzol r3 = r9.zzo(r2, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r9.zzh     // Catch: java.lang.Throwable -> L3c
            if (r4 != 0) goto L4e
            java.lang.String r4 = r3.zze()     // Catch: java.lang.Throwable -> L3c
            r9.zzh = r4     // Catch: java.lang.Throwable -> L3c
        L4e:
            r4 = 1
            if (r1 == 0) goto L85
            boolean r5 = r1.zzb()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L85
            java.lang.Object r5 = r1.zza     // Catch: java.lang.Throwable -> L3c
            long r6 = r1.zzd     // Catch: java.lang.Throwable -> L3c
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzup r8 = new com.google.android.gms.internal.ads.zzup     // Catch: java.lang.Throwable -> L3c
            r8.<init>(r5, r6, r1)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzol r2 = r9.zzo(r2, r8)     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r2.zzi()     // Catch: java.lang.Throwable -> L3c
            if (r6 != 0) goto L85
            r2.zzj(r4)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbc r2 = r9.zzd     // Catch: java.lang.Throwable -> L3c
            r0.zzo(r5, r2)     // Catch: java.lang.Throwable -> L3c
            r2.zzc(r1)     // Catch: java.lang.Throwable -> L3c
            r0 = 0
            long r5 = com.google.android.gms.internal.ads.zzeo.zzp(r0)     // Catch: java.lang.Throwable -> L3c
            long r7 = com.google.android.gms.internal.ads.zzeo.zzp(r0)     // Catch: java.lang.Throwable -> L3c
            long r5 = r5 + r7
            java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L3c
        L85:
            boolean r0 = r3.zzi()     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L8e
            r3.zzj(r4)     // Catch: java.lang.Throwable -> L3c
        L8e:
            java.lang.String r0 = r3.zze()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto Lae
            boolean r0 = r3.zzk()     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto Lae
            r3.zzl(r4)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzou r0 = r9.zzf     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r3.zze()     // Catch: java.lang.Throwable -> L3c
            r0.zzc(r10, r1)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r9)
            return
        Lae:
            monitor-exit(r9)
            return
        Lb0:
            r10 = 0
            throw r10     // Catch: java.lang.Throwable -> L3c
        Lb2:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3c
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzom.zzc(com.google.android.gms.internal.ads.zzme):void");
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized void zzd(zzme zzmeVar) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            zzbe zzbeVar = this.zzg;
            this.zzg = zzmeVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzol zzolVar = (zzol) it.next();
                if (!zzolVar.zza(zzbeVar, this.zzg) || zzolVar.zzd(zzmeVar)) {
                    it.remove();
                    if (zzolVar.zzi()) {
                        if (zzolVar.zze().equals(this.zzh)) {
                            zzm(zzolVar);
                        }
                        this.zzf.zzd(zzmeVar, zzolVar.zze(), false);
                    }
                }
            }
            zzl(zzmeVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized void zze(zzme zzmeVar, int i) {
        try {
            if (this.zzf == null) {
                throw null;
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzol zzolVar = (zzol) it.next();
                if (zzolVar.zzd(zzmeVar)) {
                    it.remove();
                    if (zzolVar.zzi()) {
                        boolean zEquals = zzolVar.zze().equals(this.zzh);
                        boolean z4 = false;
                        if (i == 0 && zEquals && zzolVar.zzk()) {
                            z4 = true;
                        }
                        if (zEquals) {
                            zzm(zzolVar);
                        }
                        this.zzf.zzd(zzmeVar, zzolVar.zze(), z4);
                    }
                }
            }
            zzl(zzmeVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzov
    @Nullable
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzov
    public final synchronized void zzg(zzme zzmeVar) {
        zzou zzouVar;
        try {
            String str = this.zzh;
            if (str != null) {
                zzol zzolVar = (zzol) this.zze.get(str);
                if (zzolVar == null) {
                    throw null;
                }
                zzm(zzolVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzol zzolVar2 = (zzol) it.next();
                it.remove();
                if (zzolVar2.zzi() && (zzouVar = this.zzf) != null) {
                    zzouVar.zzd(zzmeVar, zzolVar2.zze(), false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final /* synthetic */ zzbd zzj() {
        return this.zzc;
    }

    public final /* synthetic */ zzbc zzk() {
        return this.zzd;
    }

    public zzom(zzght zzghtVar) {
        this.zzc = new zzbd();
        this.zzd = new zzbc();
        this.zze = new HashMap();
        this.zzg = zzbe.zza;
        this.zzi = -1L;
    }
}
