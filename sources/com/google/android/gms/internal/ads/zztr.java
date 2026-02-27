package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zztr implements zzvi {
    private final zzada zza;

    @Nullable
    private zzacu zzb;

    @Nullable
    private zzacv zzc;

    public zztr(zzada zzadaVar) {
        this.zza = zzadaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // com.google.android.gms.internal.ads.zzvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzi r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzacx r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzacl r1 = new com.google.android.gms.internal.ads.zzacl
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.zzc = r1
            com.google.android.gms.internal.ads.zzacu r8 = r7.zzb
            if (r8 == 0) goto Lf
            return
        Lf:
            com.google.android.gms.internal.ads.zzada r8 = r7.zza
            com.google.android.gms.internal.ads.zzacu[] r8 = r8.zzb(r9, r10)
            int r10 = r8.length
            com.google.android.gms.internal.ads.zzgjw r11 = com.google.android.gms.internal.ads.zzgjz.zzv(r10)
            r12 = 1
            r13 = 0
            if (r10 != r12) goto L24
            r8 = r8[r13]
            r7.zzb = r8
            goto L81
        L24:
            r14 = r13
        L25:
            if (r14 >= r10) goto L7d
            r0 = r8[r14]
            boolean r2 = r0.zzd(r1)     // Catch: java.lang.Throwable -> L38 java.io.EOFException -> L6d
            if (r2 == 0) goto L3b
            r7.zzb = r0     // Catch: java.lang.Throwable -> L38 java.io.EOFException -> L6d
            com.google.android.gms.internal.ads.zzghc.zzh(r12)
            r1.zzl()
            goto L7d
        L38:
            r0 = move-exception
            r8 = r0
            goto L58
        L3b:
            java.util.List r0 = r0.zze()     // Catch: java.lang.Throwable -> L38 java.io.EOFException -> L6d
            r11.zzh(r0)     // Catch: java.lang.Throwable -> L38 java.io.EOFException -> L6d
            com.google.android.gms.internal.ads.zzacu r0 = r7.zzb
            if (r0 != 0) goto L4e
            long r5 = r1.zzn()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L50
        L4e:
            r0 = r12
            goto L51
        L50:
            r0 = r13
        L51:
            com.google.android.gms.internal.ads.zzghc.zzh(r0)
            r1.zzl()
            goto L7a
        L58:
            com.google.android.gms.internal.ads.zzacu r9 = r7.zzb
            if (r9 != 0) goto L66
            long r9 = r1.zzn()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L65
            goto L66
        L65:
            r12 = r13
        L66:
            com.google.android.gms.internal.ads.zzghc.zzh(r12)
            r1.zzl()
            throw r8
        L6d:
            com.google.android.gms.internal.ads.zzacu r0 = r7.zzb
            if (r0 != 0) goto L4e
            long r5 = r1.zzn()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L50
            goto L4e
        L7a:
            int r14 = r14 + 1
            goto L25
        L7d:
            com.google.android.gms.internal.ads.zzacu r10 = r7.zzb
            if (r10 == 0) goto L87
        L81:
            com.google.android.gms.internal.ads.zzacu r8 = r7.zzb
            r8.zzf(r15)
            return
        L87:
            com.google.android.gms.internal.ads.zzwr r10 = new com.google.android.gms.internal.ads.zzwr
            com.google.android.gms.internal.ads.zzgjz r8 = com.google.android.gms.internal.ads.zzgjz.zzr(r8)
            com.google.android.gms.internal.ads.zztq r12 = com.google.android.gms.internal.ads.zztq.zza
            java.util.List r8 = com.google.android.gms.internal.ads.zzgkp.zzc(r8, r12)
            java.lang.String r12 = ", "
            java.lang.String r8 = com.google.android.gms.internal.ads.zzggw.zzd(r8, r12)
            int r12 = r8.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r12 = r12 + 58
            r13.<init>(r12)
            java.lang.String r12 = "None of the available extractors ("
            java.lang.String r14 = ") could read the stream."
            java.lang.String r8 = We.s.q(r13, r12, r8, r14)
            com.google.android.gms.internal.ads.zzgjz r11 = r11.zzi()
            r10.<init>(r8, r9, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztr.zza(com.google.android.gms.internal.ads.zzi, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzacx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzb() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zzc() {
        zzacu zzacuVar = this.zzb;
        if (zzacuVar != null && (zzacuVar instanceof zzahg)) {
            ((zzahg) zzacuVar).zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final long zzd() {
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            return zzacvVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final void zze(long j, long j6) {
        zzacu zzacuVar = this.zzb;
        zzacuVar.getClass();
        zzacuVar.zzh(j, j6);
    }

    @Override // com.google.android.gms.internal.ads.zzvi
    public final int zzf(zzads zzadsVar) throws IOException {
        zzacv zzacvVar;
        zzacu zzacuVar = this.zzb;
        if (zzacuVar == null || (zzacvVar = this.zzc) == null) {
            throw null;
        }
        return zzacuVar.zzg(zzacvVar, zzadsVar);
    }
}
