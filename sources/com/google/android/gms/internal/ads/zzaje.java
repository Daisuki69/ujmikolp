package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzaje {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzef zzg = new zzef(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r11 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r10.zzn() >= r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r10.zzd(1) != (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(com.google.android.gms.internal.ads.zzacv r10, long r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r10.zzn()
            long r2 = r10.zzm()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            com.google.android.gms.internal.ads.zzghc.zza(r0)
            com.google.android.gms.internal.ads.zzef r0 = r9.zzg
            r3 = 4
            r0.zza(r3)
        L1a:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L2c
            long r5 = r10.zzn()
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 < 0) goto L2c
            goto L4c
        L2c:
            byte[] r5 = r0.zzi()
            boolean r5 = com.google.android.gms.internal.ads.zzacy.zze(r10, r5, r1, r3, r2)
            if (r5 == 0) goto L4c
            r0.zzh(r1)
            long r4 = r0.zzz()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L48
            r10.zzl()
            return r2
        L48:
            r10.zzf(r2)
            goto L1a
        L4c:
            if (r4 == 0) goto L56
            long r5 = r10.zzn()
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5d
        L56:
            int r0 = r10.zzd(r2)
            r3 = -1
            if (r0 != r3) goto L4c
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaje.zzb(com.google.android.gms.internal.ads.zzacv, long):boolean");
    }

    public final boolean zzc(zzacv zzacvVar, boolean z4) throws IOException {
        zza();
        zzef zzefVar = this.zzg;
        zzefVar.zza(27);
        if (zzacy.zze(zzacvVar, zzefVar.zzi(), 0, 27, z4) && zzefVar.zzz() == 1332176723) {
            if (zzefVar.zzs() != 0) {
                if (z4) {
                    return false;
                }
                throw zzas.zzc("unsupported bit stream revision");
            }
            this.zza = zzefVar.zzs();
            this.zzb = zzefVar.zzE();
            zzefVar.zzA();
            zzefVar.zzA();
            zzefVar.zzA();
            int iZzs = zzefVar.zzs();
            this.zzc = iZzs;
            this.zzd = iZzs + 27;
            zzefVar.zza(iZzs);
            if (zzacy.zze(zzacvVar, zzefVar.zzi(), 0, this.zzc, z4)) {
                for (int i = 0; i < this.zzc; i++) {
                    int[] iArr = this.zzf;
                    int iZzs2 = zzefVar.zzs();
                    iArr[i] = iZzs2;
                    this.zze += iZzs2;
                }
                return true;
            }
        }
        return false;
    }
}
