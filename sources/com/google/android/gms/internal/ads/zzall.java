package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzall {
    public CharSequence zzc;
    public long zza = 0;
    public long zzb = 0;
    public int zzd = 2;
    public float zze = -3.4028235E38f;
    public int zzf = 1;
    public int zzg = 0;
    public float zzh = -3.4028235E38f;
    public int zzi = Integer.MIN_VALUE;
    public float zzj = 1.0f;
    public int zzk = Integer.MIN_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzck zza() {
        /*
            r13 = this;
            float r0 = r13.zzh
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 5
            r6 = 4
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L11
            goto L1c
        L11:
            int r0 = r13.zzd
            if (r0 == r6) goto L1b
            if (r0 == r5) goto L19
            r0 = r4
            goto L1c
        L19:
            r0 = r7
            goto L1c
        L1b:
            r0 = r3
        L1c:
            int r2 = r13.zzi
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r2 == r8) goto L26
            goto L35
        L26:
            int r2 = r13.zzd
            if (r2 == r11) goto L34
            if (r2 == r9) goto L32
            if (r2 == r6) goto L34
            if (r2 == r5) goto L32
            r2 = r11
            goto L35
        L32:
            r2 = r10
            goto L35
        L34:
            r2 = 0
        L35:
            com.google.android.gms.internal.ads.zzck r8 = new com.google.android.gms.internal.ads.zzck
            r8.<init>()
            int r12 = r13.zzd
            if (r12 == r11) goto L64
            if (r12 == r10) goto L61
            if (r12 == r9) goto L5e
            if (r12 == r6) goto L64
            if (r12 == r5) goto L5e
            java.lang.String r5 = java.lang.String.valueOf(r12)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 23
            r6.<init>(r5)
            java.lang.String r5 = "Unknown textAlignment: "
            java.lang.String r9 = "WebvttCueParser"
            androidx.media3.datasource.cache.c.x(r6, r5, r12, r9)
            r5 = 0
            goto L66
        L5e:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L66
        L61:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L66
        L64:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
        L66:
            r8.zzd(r5)
            float r5 = r13.zze
            int r6 = r13.zzf
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 == 0) goto L7d
            if (r6 != 0) goto L7d
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L7b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L7d
        L7b:
            r1 = r7
            goto L83
        L7d:
            if (r9 != 0) goto L82
            if (r6 != 0) goto L83
            goto L7b
        L82:
            r1 = r5
        L83:
            r8.zzf(r1, r6)
            int r1 = r13.zzg
            r8.zzg(r1)
            r8.zzi(r0)
            r8.zzj(r2)
            float r1 = r13.zzj
            if (r2 == 0) goto Lae
            if (r2 == r11) goto La4
            if (r2 != r10) goto L9a
            goto Lb0
        L9a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1)
            throw r0
        La4:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto Laa
            float r0 = r0 + r0
            goto Lb0
        Laa:
            float r7 = r7 - r0
            float r0 = r7 + r7
            goto Lb0
        Lae:
            float r0 = r7 - r0
        Lb0:
            float r0 = java.lang.Math.min(r1, r0)
            r8.zzm(r0)
            int r0 = r13.zzk
            r8.zzo(r0)
            java.lang.CharSequence r0 = r13.zzc
            if (r0 == 0) goto Lc3
            r8.zza(r0)
        Lc3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzall.zza():com.google.android.gms.internal.ads.zzck");
    }
}
