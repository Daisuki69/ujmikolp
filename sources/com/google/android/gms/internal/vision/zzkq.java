package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzkq<T> implements zzlc<T> {
    private final zzkk zza;
    private final zzlu<?, ?> zzb;
    private final boolean zzc;
    private final zziq<?> zzd;

    private zzkq(zzlu<?, ?> zzluVar, zziq<?> zziqVar, zzkk zzkkVar) {
        this.zzb = zzluVar;
        this.zzc = zziqVar.zza(zzkkVar);
        this.zzd = zziqVar;
        this.zza = zzkkVar;
    }

    public static <T> zzkq<T> zza(zzlu<?, ?> zzluVar, zziq<?> zziqVar, zzkk zzkkVar) {
        return new zzkq<>(zzluVar, zziqVar, zzkkVar);
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zzb(T t5, T t10) {
        zzle.zza(this.zzb, t5, t10);
        if (this.zzc) {
            zzle.zza(this.zzd, t5, t10);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zzc(T t5) {
        this.zzb.zzd(t5);
        this.zzd.zzc(t5);
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final boolean zzd(T t5) {
        return this.zzd.zza(t5).zzf();
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final T zza() {
        return (T) this.zza.zzq().zze();
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final boolean zza(T t5, T t10) {
        if (!this.zzb.zzb(t5).equals(this.zzb.zzb(t10))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t5).equals(this.zzd.zza(t10));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final int zzb(T t5) {
        zzlu<?, ?> zzluVar = this.zzb;
        int iZze = zzluVar.zze(zzluVar.zzb(t5));
        return this.zzc ? iZze + this.zzd.zza(t5).zzg() : iZze;
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final int zza(T t5) {
        int iHashCode = this.zzb.zzb(t5).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t5).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zza(T t5, zzmr zzmrVar) throws IOException {
        Iterator itZzd = this.zzd.zza(t5).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zziw zziwVar = (zziw) entry.getKey();
            if (zziwVar.zzc() == zzmo.MESSAGE && !zziwVar.zzd() && !zziwVar.zze()) {
                if (entry instanceof zzjr) {
                    zzmrVar.zza(zziwVar.zza(), (Object) ((zzjr) entry).zza().zzc());
                } else {
                    zzmrVar.zza(zziwVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzlu<?, ?> zzluVar = this.zzb;
        zzluVar.zzb(zzluVar.zzb(t5), zzmrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2 A[EDGE_INSN: B:61:0x00c2->B:33:0x00c2 BREAK  A[LOOP:1: B:17:0x0069->B:64:0x0069], SYNTHETIC] */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.vision.zzhn r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzkq.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.zzhn):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:46:0x000c->B:54:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r11, com.google.android.gms.internal.vision.zzld r12, com.google.android.gms.internal.vision.zzio r13) throws java.io.IOException {
        /*
            r10 = this;
            com.google.android.gms.internal.vision.zzlu<?, ?> r0 = r10.zzb
            com.google.android.gms.internal.vision.zziq<?> r1 = r10.zzd
            java.lang.Object r2 = r0.zzc(r11)
            com.google.android.gms.internal.vision.zziu r3 = r1.zzb(r11)
        Lc:
            int r4 = r12.zza()     // Catch: java.lang.Throwable -> L34
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L19
            r0.zzb(r11, r2)
            return
        L19:
            int r4 = r12.zzb()     // Catch: java.lang.Throwable -> L34
            r6 = 11
            if (r4 == r6) goto L40
            r5 = r4 & 7
            r6 = 2
            if (r5 != r6) goto L3b
            com.google.android.gms.internal.vision.zzkk r5 = r10.zza     // Catch: java.lang.Throwable -> L34
            int r4 = r4 >>> 3
            java.lang.Object r4 = r1.zza(r13, r5, r4)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L36
            r1.zza(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L34
            goto L85
        L34:
            r12 = move-exception
            goto L91
        L36:
            boolean r4 = r0.zza(r2, r12)     // Catch: java.lang.Throwable -> L34
            goto L86
        L3b:
            boolean r4 = r12.zzc()     // Catch: java.lang.Throwable -> L34
            goto L86
        L40:
            r4 = 0
            r6 = 0
            r7 = r6
            r6 = r4
        L44:
            int r8 = r12.zza()     // Catch: java.lang.Throwable -> L34
            if (r8 == r5) goto L72
            int r8 = r12.zzb()     // Catch: java.lang.Throwable -> L34
            r9 = 16
            if (r8 != r9) goto L5d
            int r7 = r12.zzo()     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.vision.zzkk r4 = r10.zza     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r1.zza(r13, r4, r7)     // Catch: java.lang.Throwable -> L34
            goto L44
        L5d:
            r9 = 26
            if (r8 != r9) goto L6c
            if (r4 == 0) goto L67
            r1.zza(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L34
            goto L44
        L67:
            com.google.android.gms.internal.vision.zzht r6 = r12.zzn()     // Catch: java.lang.Throwable -> L34
            goto L44
        L6c:
            boolean r8 = r12.zzc()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L44
        L72:
            int r5 = r12.zzb()     // Catch: java.lang.Throwable -> L34
            r8 = 12
            if (r5 != r8) goto L8c
            if (r6 == 0) goto L85
            if (r4 == 0) goto L82
            r1.zza(r6, r4, r13, r3)     // Catch: java.lang.Throwable -> L34
            goto L85
        L82:
            r0.zza(r2, r7, r6)     // Catch: java.lang.Throwable -> L34
        L85:
            r4 = 1
        L86:
            if (r4 != 0) goto Lc
            r0.zzb(r11, r2)
            return
        L8c:
            com.google.android.gms.internal.vision.zzjk r12 = com.google.android.gms.internal.vision.zzjk.zze()     // Catch: java.lang.Throwable -> L34
            throw r12     // Catch: java.lang.Throwable -> L34
        L91:
            r0.zzb(r11, r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzkq.zza(java.lang.Object, com.google.android.gms.internal.vision.zzld, com.google.android.gms.internal.vision.zzio):void");
    }
}
