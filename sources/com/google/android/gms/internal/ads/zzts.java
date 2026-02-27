package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzts implements zzwf {
    public final zzwf zza;
    final /* synthetic */ zztt zzb;
    private boolean zzc;

    public zzts(zztt zzttVar, zzwf zzwfVar) {
        Objects.requireNonNull(zzttVar);
        this.zzb = zzttVar;
        this.zza = zzwfVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    @Override // com.google.android.gms.internal.ads.zzwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzkh r12, com.google.android.gms.internal.ads.zzhg r13, int r14) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zztt r0 = r11.zzb
            boolean r1 = r0.zzo()
            r2 = -3
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r11.zzc
            r3 = 4
            r4 = -4
            if (r1 == 0) goto L14
            r13.zzg(r3)
            return r4
        L14:
            long r5 = r0.zzi()
            com.google.android.gms.internal.ads.zzwf r1 = r11.zza
            int r14 = r1.zzd(r12, r13, r14)
            r1 = -5
            r7 = -9223372036854775808
            if (r14 != r1) goto L4c
            com.google.android.gms.internal.ads.zzu r13 = r12.zzb
            r13.getClass()
            int r14 = r13.zzJ
            r2 = 0
            if (r14 != 0) goto L32
            int r14 = r13.zzK
            if (r14 == 0) goto L4b
            r14 = r2
        L32:
            long r3 = r0.zzb
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L39
            goto L3b
        L39:
            int r2 = r13.zzK
        L3b:
            com.google.android.gms.internal.ads.zzs r13 = r13.zza()
            r13.zzH(r14)
            r13.zzI(r2)
            com.google.android.gms.internal.ads.zzu r13 = r13.zzM()
            r12.zzb = r13
        L4b:
            return r1
        L4c:
            long r0 = r0.zzb
            int r12 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r12 == 0) goto L6e
            if (r14 != r4) goto L5a
            long r9 = r13.zze
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 >= 0) goto L64
        L5a:
            if (r14 != r2) goto L6e
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 != 0) goto L6e
            boolean r12 = r13.zzd
            if (r12 != 0) goto L6e
        L64:
            r13.zza()
            r13.zzg(r3)
            r12 = 1
            r11.zzc = r12
            return r4
        L6e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzts.zzd(com.google.android.gms.internal.ads.zzkh, com.google.android.gms.internal.ads.zzhg, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final int zze(long j) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j);
    }
}
