package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;

/* JADX INFO: loaded from: classes3.dex */
public final class zzftd implements zzfrw {
    private final Bj.E zza;
    private final Kj.a zzb;
    private final Kj.a zzc;
    private final Kj.a zzd;
    private boolean zze;
    private zzfru zzf;
    private boolean zzg;
    private final DataStore zzh;
    private final zzdpw zzi;

    public zzftd(DataStore adQualityDataStore, zzftf coroutineScopeProvider, zzdpw dataPinger, zzfsf clock) {
        kotlin.jvm.internal.j.g(adQualityDataStore, "adQualityDataStore");
        kotlin.jvm.internal.j.g(coroutineScopeProvider, "coroutineScopeProvider");
        kotlin.jvm.internal.j.g(dataPinger, "dataPinger");
        kotlin.jvm.internal.j.g(clock, "clock");
        this.zzi = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = Kj.e.a(1, false);
        this.zzc = Kj.e.a(1, false);
        this.zzd = Kj.e.a(1, false);
        this.zzh = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzs(java.lang.String r8, gj.InterfaceC1526a r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zzfsi
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zzfsi r0 = (com.google.android.gms.internal.ads.zzfsi) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsi r0 = new com.google.android.gms.internal.ads.zzfsi
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zzc
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.zze
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.zza
            Kj.a r8 = (Kj.a) r8
            bj.AbstractC1039j.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L70
        L2f:
            r9 = move-exception
            goto L7e
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.zzb
            Kj.a r8 = (Kj.a) r8
            java.lang.Object r2 = r0.zza
            java.lang.String r2 = (java.lang.String) r2
            bj.AbstractC1039j.b(r9)
            r9 = r8
            r8 = r2
            goto L5a
        L47:
            bj.AbstractC1039j.b(r9)
            Kj.a r9 = r7.zzd
            r0.zza = r8
            r0.zzb = r9
            r0.zze = r4
            Kj.d r9 = (Kj.d) r9
            java.lang.Object r2 = r9.d(r0)
            if (r2 == r1) goto L84
        L5a:
            androidx.datastore.core.DataStore r2 = r7.zzh     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.internal.ads.zzfsj r4 = new com.google.android.gms.internal.ads.zzfsj     // Catch: java.lang.Throwable -> L7a
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L7a
            r0.zza = r9     // Catch: java.lang.Throwable -> L7a
            r0.zzb = r5     // Catch: java.lang.Throwable -> L7a
            r0.zze = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r8 = r2.updateData(r4, r0)     // Catch: java.lang.Throwable -> L7a
            if (r8 == r1) goto L84
            r6 = r9
            r9 = r8
            r8 = r6
        L70:
            com.google.android.gms.internal.ads.zzfrz r9 = (com.google.android.gms.internal.ads.zzfrz) r9     // Catch: java.lang.Throwable -> L2f
            Kj.d r8 = (Kj.d) r8
            r8.f(r5)
            kotlin.Unit r8 = kotlin.Unit.f18162a
            return r8
        L7a:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7e:
            Kj.d r8 = (Kj.d) r8
            r8.f(r5)
            throw r9
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzs(java.lang.String, gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzt(gj.InterfaceC1526a r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfsl
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfsl r0 = (com.google.android.gms.internal.ads.zzfsl) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsl r0 = new com.google.android.gms.internal.ads.zzfsl
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzb
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.zza
            Kj.a r0 = (Kj.a) r0
            bj.AbstractC1039j.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r8 = move-exception
            goto L75
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.zza
            Kj.a r2 = (Kj.a) r2
            bj.AbstractC1039j.b(r8)
            r8 = r2
            goto L53
        L42:
            bj.AbstractC1039j.b(r8)
            Kj.a r8 = r7.zzd
            r0.zza = r8
            r0.zzd = r4
            Kj.d r8 = (Kj.d) r8
            java.lang.Object r2 = r8.d(r0)
            if (r2 == r1) goto L7b
        L53:
            androidx.datastore.core.DataStore r2 = r7.zzh     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.internal.ads.zzfsm r4 = new com.google.android.gms.internal.ads.zzfsm     // Catch: java.lang.Throwable -> L71
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L71
            r0.zza = r8     // Catch: java.lang.Throwable -> L71
            r0.zzd = r3     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r2.updateData(r4, r0)     // Catch: java.lang.Throwable -> L71
            if (r0 == r1) goto L7b
            r6 = r0
            r0 = r8
            r8 = r6
        L67:
            com.google.android.gms.internal.ads.zzfrz r8 = (com.google.android.gms.internal.ads.zzfrz) r8     // Catch: java.lang.Throwable -> L2f
            Kj.d r0 = (Kj.d) r0
            r0.f(r5)
            kotlin.Unit r8 = kotlin.Unit.f18162a
            return r8
        L71:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L75:
            Kj.d r0 = (Kj.d) r0
            r0.f(r5)
            throw r8
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzt(gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzu(long r6, gj.InterfaceC1526a r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfsk
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfsk r0 = (com.google.android.gms.internal.ads.zzfsk) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsk r0 = new com.google.android.gms.internal.ads.zzfsk
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.zze
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r6 = r0.zza
            java.lang.Object r0 = r0.zzb
            Kj.a r0 = (Kj.a) r0
            bj.AbstractC1039j.b(r8)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            bj.AbstractC1039j.b(r8)
            Kj.a r8 = r5.zzb
            r0.zzb = r8
            r0.zza = r6
            r0.zze = r3
            Kj.d r8 = (Kj.d) r8
            java.lang.Object r0 = r8.d(r0)
            if (r0 == r1) goto L79
            r0 = r8
        L49:
            r8 = 0
            com.google.android.gms.internal.ads.zzfru r1 = r5.zzf     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "adQualityDataBuilder"
            if (r1 == 0) goto L6f
            long r3 = r1.zzi()     // Catch: java.lang.Throwable -> L69
            long r6 = r6 - r3
            com.google.android.gms.internal.ads.zzfru r3 = r5.zzf     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L6b
            long r2 = r3.zzg()     // Catch: java.lang.Throwable -> L69
            long r6 = r6 - r2
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L69
            Kj.d r0 = (Kj.d) r0
            r0.f(r8)
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        L69:
            r6 = move-exception
            goto L73
        L6b:
            kotlin.jvm.internal.j.n(r2)     // Catch: java.lang.Throwable -> L69
            throw r8     // Catch: java.lang.Throwable -> L69
        L6f:
            kotlin.jvm.internal.j.n(r2)     // Catch: java.lang.Throwable -> L69
            throw r8     // Catch: java.lang.Throwable -> L69
        L73:
            Kj.d r0 = (Kj.d) r0
            r0.f(r8)
            throw r6
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzu(long, gj.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzv(gj.InterfaceC1526a r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfsp
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfsp r0 = (com.google.android.gms.internal.ads.zzfsp) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsp r0 = new com.google.android.gms.internal.ads.zzfsp
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.zze
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L51
            if (r2 == r6) goto L49
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r0 = r0.zza
            Kj.a r0 = (Kj.a) r0
            bj.AbstractC1039j.b(r8)     // Catch: java.lang.Throwable -> L32
            goto L9a
        L32:
            r8 = move-exception
            goto La6
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.zzb
            Kj.a r2 = (Kj.a) r2
            java.lang.Object r5 = r0.zza
            com.google.android.gms.internal.ads.zzfrv r5 = (com.google.android.gms.internal.ads.zzfrv) r5
            bj.AbstractC1039j.b(r8)
            goto L86
        L49:
            java.lang.Object r2 = r0.zza
            Kj.a r2 = (Kj.a) r2
            bj.AbstractC1039j.b(r8)
            goto L63
        L51:
            bj.AbstractC1039j.b(r8)
            Kj.a r8 = r7.zzb
            r0.zza = r8
            r0.zze = r6
            r2 = r8
            Kj.d r2 = (Kj.d) r2
            java.lang.Object r8 = r2.d(r0)
            if (r8 == r1) goto Lba
        L63:
            com.google.android.gms.internal.ads.zzfru r8 = r7.zzf     // Catch: java.lang.Throwable -> Lac
            if (r8 == 0) goto Lae
            com.google.android.gms.internal.ads.zzhih r8 = r8.zzbu()     // Catch: java.lang.Throwable -> Lac
            com.google.android.gms.internal.ads.zzfrv r8 = (com.google.android.gms.internal.ads.zzfrv) r8     // Catch: java.lang.Throwable -> Lac
            Kj.d r2 = (Kj.d) r2
            r2.f(r3)
            kotlin.jvm.internal.j.d(r8)
            Kj.a r2 = r7.zzd
            r0.zza = r8
            r0.zzb = r2
            r0.zze = r5
            Kj.d r2 = (Kj.d) r2
            java.lang.Object r5 = r2.d(r0)
            if (r5 == r1) goto Lba
            r5 = r8
        L86:
            androidx.datastore.core.DataStore r8 = r7.zzh     // Catch: java.lang.Throwable -> La4
            com.google.android.gms.internal.ads.zzfsq r6 = new com.google.android.gms.internal.ads.zzfsq     // Catch: java.lang.Throwable -> La4
            r6.<init>(r5, r3)     // Catch: java.lang.Throwable -> La4
            r0.zza = r2     // Catch: java.lang.Throwable -> La4
            r0.zzb = r3     // Catch: java.lang.Throwable -> La4
            r0.zze = r4     // Catch: java.lang.Throwable -> La4
            java.lang.Object r8 = r8.updateData(r6, r0)     // Catch: java.lang.Throwable -> La4
            if (r8 == r1) goto Lba
            r0 = r2
        L9a:
            com.google.android.gms.internal.ads.zzfrz r8 = (com.google.android.gms.internal.ads.zzfrz) r8     // Catch: java.lang.Throwable -> L32
            Kj.d r0 = (Kj.d) r0
            r0.f(r3)
            kotlin.Unit r8 = kotlin.Unit.f18162a
            return r8
        La4:
            r8 = move-exception
            r0 = r2
        La6:
            Kj.d r0 = (Kj.d) r0
            r0.f(r3)
            throw r8
        Lac:
            r8 = move-exception
            goto Lb4
        Lae:
            java.lang.String r8 = "adQualityDataBuilder"
            kotlin.jvm.internal.j.n(r8)     // Catch: java.lang.Throwable -> Lac
            throw r3     // Catch: java.lang.Throwable -> Lac
        Lb4:
            Kj.d r2 = (Kj.d) r2
            r2.f(r3)
            throw r8
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzv(gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean zzw(com.google.android.gms.internal.ads.zzfrv r9) {
        /*
            java.util.List r0 = r9.zzk()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = cj.C1110A.H(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            int r1 = r9.zzl()
            int r2 = r9.zzm()
            r3 = 1
            r4 = 0
            if (r1 <= r2) goto L22
            boolean r1 = r9.zzd()
            if (r1 != 0) goto L22
            r1 = r3
            goto L23
        L22:
            r1 = r4
        L23:
            if (r0 == 0) goto L36
            long r5 = r0.longValue()
            long r7 = r9.zzi()
            long r7 = r7 - r5
            r5 = 5000(0x1388, double:2.4703E-320)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L36
            r9 = r3
            goto L37
        L36:
            r9 = r4
        L37:
            if (r1 != 0) goto L3d
            if (r9 == 0) goto L3c
            goto L3d
        L3c:
            return r4
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzw(com.google.android.gms.internal.ads.zzfrv):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zza() {
        Bj.H.w(this.zza, null, null, new zzfsy(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzb(String gwsQueryId) {
        kotlin.jvm.internal.j.g(gwsQueryId, "gwsQueryId");
        Bj.H.w(this.zza, null, null, new zzfss(this, gwsQueryId, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzc() {
        Bj.H.w(this.zza, null, null, new zzfso(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzd() {
        Bj.H.w(this.zza, null, null, new zzftc(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zze() {
        Bj.H.w(this.zza, null, null, new zzfsw(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzf() {
        Bj.H.w(this.zza, null, null, new zzfta(this, null), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzg() {
        Bj.H.w(this.zza, null, null, new zzfsu(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if (zzt(r0) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzftd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzh(gj.InterfaceC1526a r9) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzh(gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzi(java.lang.String r7, gj.InterfaceC1526a r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfsr
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfsr r0 = (com.google.android.gms.internal.ads.zzfsr) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsr r0 = new com.google.android.gms.internal.ads.zzfsr
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.zze
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r1 = r0.zzb
            java.lang.Object r7 = r0.zza
            Kj.a r7 = (Kj.a) r7
            java.lang.String r0 = r0.zzf
            bj.AbstractC1039j.b(r8)
            goto L53
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            bj.AbstractC1039j.b(r8)
            Kj.a r8 = r6.zzb
            long r4 = java.lang.System.currentTimeMillis()
            r0.zzf = r7
            r0.zza = r8
            r0.zzb = r4
            r0.zze = r3
            Kj.d r8 = (Kj.d) r8
            java.lang.Object r0 = r8.d(r0)
            if (r0 == r1) goto L8c
            r0 = r7
            r7 = r8
            r1 = r4
        L53:
            r8 = 0
            boolean r4 = r6.zze     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L62
            kotlin.Unit r0 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L60
            Kj.d r7 = (Kj.d) r7
            r7.f(r8)
            return r0
        L60:
            r0 = move-exception
            goto L86
        L62:
            r6.zze = r3     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzfrv r3 = com.google.android.gms.internal.ads.zzfrv.zzp()     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzhib r3 = r3.zzcc()     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzfru r3 = (com.google.android.gms.internal.ads.zzfru) r3     // Catch: java.lang.Throwable -> L60
            r6.zzf = r3     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L80
            r3.zza(r0)     // Catch: java.lang.Throwable -> L60
            r3.zzj(r1)     // Catch: java.lang.Throwable -> L60
            Kj.d r7 = (Kj.d) r7
            r7.f(r8)
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        L80:
            java.lang.String r0 = "adQualityDataBuilder"
            kotlin.jvm.internal.j.n(r0)     // Catch: java.lang.Throwable -> L60
            throw r8     // Catch: java.lang.Throwable -> L60
        L86:
            Kj.d r7 = (Kj.d) r7
            r7.f(r8)
            throw r0
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzi(java.lang.String, gj.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        if (zzv(r0) != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:33:0x008f, B:35:0x0093, B:45:0x00b3, B:46:0x00b8), top: B:52:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3 A[Catch: all -> 0x00b1, TRY_ENTER, TryCatch #0 {all -> 0x00b1, blocks: (B:33:0x008f, B:35:0x0093, B:45:0x00b3, B:46:0x00b8), top: B:52:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(gj.InterfaceC1526a r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.gms.internal.ads.zzfsn
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.gms.internal.ads.zzfsn r0 = (com.google.android.gms.internal.ads.zzfsn) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfsn r0 = new com.google.android.gms.internal.ads.zzfsn
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.zzc
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.zze
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L50
            if (r2 == r7) goto L48
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            bj.AbstractC1039j.b(r10)
            goto Lae
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3a:
            bj.AbstractC1039j.b(r10)
            goto La5
        L3e:
            long r6 = r0.zzb
            java.lang.Object r2 = r0.zza
            Kj.a r2 = (Kj.a) r2
            bj.AbstractC1039j.b(r10)
            goto L8f
        L48:
            java.lang.Object r2 = r0.zza
            Kj.a r2 = (Kj.a) r2
            bj.AbstractC1039j.b(r10)
            goto L62
        L50:
            bj.AbstractC1039j.b(r10)
            Kj.a r10 = r9.zzc
            r0.zza = r10
            r0.zze = r7
            r2 = r10
            Kj.d r2 = (Kj.d) r2
            java.lang.Object r10 = r2.d(r0)
            if (r10 == r1) goto Lc5
        L62:
            boolean r10 = r9.zzg     // Catch: java.lang.Throwable -> L6e
            if (r10 == 0) goto L70
            kotlin.Unit r10 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L6e
            Kj.d r2 = (Kj.d) r2
            r2.f(r3)
            return r10
        L6e:
            r10 = move-exception
            goto Lbf
        L70:
            r9.zzg = r7     // Catch: java.lang.Throwable -> L6e
            kotlin.Unit r10 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L6e
            Kj.d r2 = (Kj.d) r2
            r2.f(r3)
            Kj.a r10 = r9.zzb
            long r7 = java.lang.System.currentTimeMillis()
            r0.zza = r10
            r0.zzb = r7
            r0.zze = r6
            r2 = r10
            Kj.d r2 = (Kj.d) r2
            java.lang.Object r10 = r2.d(r0)
            if (r10 == r1) goto Lc5
            r6 = r7
        L8f:
            com.google.android.gms.internal.ads.zzfru r10 = r9.zzf     // Catch: java.lang.Throwable -> Lb1
            if (r10 == 0) goto Lb3
            r10.zzo(r6)     // Catch: java.lang.Throwable -> Lb1
            Kj.d r2 = (Kj.d) r2
            r2.f(r3)
            r0.zza = r3
            r0.zze = r5
            java.lang.Object r10 = r9.zzu(r6, r0)
            if (r10 == r1) goto Lc5
        La5:
            r0.zze = r4
            java.lang.Object r10 = r9.zzv(r0)
            if (r10 != r1) goto Lae
            goto Lc5
        Lae:
            kotlin.Unit r10 = kotlin.Unit.f18162a
            return r10
        Lb1:
            r10 = move-exception
            goto Lb9
        Lb3:
            java.lang.String r10 = "adQualityDataBuilder"
            kotlin.jvm.internal.j.n(r10)     // Catch: java.lang.Throwable -> Lb1
            throw r3     // Catch: java.lang.Throwable -> Lb1
        Lb9:
            Kj.d r2 = (Kj.d) r2
            r2.f(r3)
            throw r10
        Lbf:
            Kj.d r2 = (Kj.d) r2
            r2.f(r3)
            throw r10
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzj(gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[Catch: all -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c6, blocks: (B:30:0x0082, B:33:0x0088, B:36:0x0090, B:38:0x0094, B:40:0x00b0, B:42:0x00b9, B:44:0x00bd, B:47:0x00c8, B:48:0x00cb, B:49:0x00cc, B:50:0x00cf, B:51:0x00d0, B:52:0x00d3, B:53:0x00d4, B:55:0x00d8, B:57:0x00de, B:59:0x00e2, B:61:0x00fe, B:62:0x0107, B:63:0x010a, B:64:0x010b, B:65:0x010e, B:66:0x010f, B:68:0x0113, B:71:0x011e, B:72:0x0121, B:73:0x0122, B:74:0x0125, B:75:0x0126, B:76:0x0129), top: B:82:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0126 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:30:0x0082, B:33:0x0088, B:36:0x0090, B:38:0x0094, B:40:0x00b0, B:42:0x00b9, B:44:0x00bd, B:47:0x00c8, B:48:0x00cb, B:49:0x00cc, B:50:0x00cf, B:51:0x00d0, B:52:0x00d3, B:53:0x00d4, B:55:0x00d8, B:57:0x00de, B:59:0x00e2, B:61:0x00fe, B:62:0x0107, B:63:0x010a, B:64:0x010b, B:65:0x010e, B:66:0x010f, B:68:0x0113, B:71:0x011e, B:72:0x0121, B:73:0x0122, B:74:0x0125, B:75:0x0126, B:76:0x0129), top: B:82:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzk(gj.InterfaceC1526a r12) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzk(gj.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
    
        if (zzs(r14, r0) == r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c A[Catch: all -> 0x00f1, TRY_ENTER, TryCatch #0 {all -> 0x00f1, blocks: (B:34:0x0096, B:37:0x009c, B:39:0x00a6, B:41:0x00b2, B:43:0x00b9, B:56:0x00f3, B:57:0x00f6, B:58:0x00f7, B:59:0x00fa, B:60:0x00fb, B:61:0x00fe, B:62:0x00ff, B:63:0x0102), top: B:69:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:34:0x0096, B:37:0x009c, B:39:0x00a6, B:41:0x00b2, B:43:0x00b9, B:56:0x00f3, B:57:0x00f6, B:58:0x00f7, B:59:0x00fa, B:60:0x00fb, B:61:0x00fe, B:62:0x00ff, B:63:0x0102), top: B:69:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzl(gj.InterfaceC1526a r14) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzl(gj.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        if (zzs(r15, r0) == r1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #1 {all -> 0x00f7, blocks: (B:33:0x0095, B:36:0x009b, B:38:0x00a5, B:40:0x00b1, B:42:0x00b8, B:44:0x00bf, B:57:0x00f9, B:58:0x00fc, B:59:0x00fd, B:60:0x0100, B:61:0x0101, B:62:0x0104, B:63:0x0105, B:64:0x0108, B:65:0x0109, B:66:0x010c), top: B:73:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109 A[Catch: all -> 0x00f7, TryCatch #1 {all -> 0x00f7, blocks: (B:33:0x0095, B:36:0x009b, B:38:0x00a5, B:40:0x00b1, B:42:0x00b8, B:44:0x00bf, B:57:0x00f9, B:58:0x00fc, B:59:0x00fd, B:60:0x0100, B:61:0x0101, B:62:0x0104, B:63:0x0105, B:64:0x0108, B:65:0x0109, B:66:0x010c), top: B:73:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzm(gj.InterfaceC1526a r15) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzm(gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzn(gj.InterfaceC1526a r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.internal.ads.zzfst
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.gms.internal.ads.zzfst r0 = (com.google.android.gms.internal.ads.zzfst) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfst r0 = new com.google.android.gms.internal.ads.zzfst
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zzc
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.zze
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.zza
            java.lang.Object r0 = r0.zzb
            Kj.a r0 = (Kj.a) r0
            bj.AbstractC1039j.b(r7)
            goto L4e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            bj.AbstractC1039j.b(r7)
            Kj.a r7 = r6.zzb
            long r4 = java.lang.System.currentTimeMillis()
            r0.zzb = r7
            r0.zza = r4
            r0.zze = r3
            Kj.d r7 = (Kj.d) r7
            java.lang.Object r0 = r7.d(r0)
            if (r0 == r1) goto L6c
            r0 = r7
            r1 = r4
        L4e:
            r7 = 0
            com.google.android.gms.internal.ads.zzfru r3 = r6.zzf     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L60
            r3.zzs(r1)     // Catch: java.lang.Throwable -> L5e
            Kj.d r0 = (Kj.d) r0
            r0.f(r7)
            kotlin.Unit r7 = kotlin.Unit.f18162a
            return r7
        L5e:
            r1 = move-exception
            goto L66
        L60:
            java.lang.String r1 = "adQualityDataBuilder"
            kotlin.jvm.internal.j.n(r1)     // Catch: java.lang.Throwable -> L5e
            throw r7     // Catch: java.lang.Throwable -> L5e
        L66:
            Kj.d r0 = (Kj.d) r0
            r0.f(r7)
            throw r1
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftd.zzn(gj.a):java.lang.Object");
    }
}
