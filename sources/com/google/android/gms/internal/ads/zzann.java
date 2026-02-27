package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.extractor.ts.TsExtractor;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzann implements zzacu {
    private final int zza;
    private final List zzb;
    private final zzef zzc;
    private final SparseIntArray zzd;
    private final zzanq zze;
    private final zzajt zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzanj zzj;
    private zzani zzk;
    private zzacx zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzann() {
        this(1, 1, zzajt.zza, new zzel(0L), new zzama(0), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    public final /* synthetic */ List zza() {
        return this.zzb;
    }

    public final /* synthetic */ zzanq zzb() {
        return this.zze;
    }

    public final /* synthetic */ SparseArray zzc() {
        return this.zzg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzacv r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzef r0 = r6.zzc
            byte[] r0 = r0.zzi()
            com.google.android.gms.internal.ads.zzacl r7 = (com.google.android.gms.internal.ads.zzacl) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzh(r0, r2, r1, r2)
            r1 = r2
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = r2
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zze(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzann.zzd(com.google.android.gms.internal.ads.zzacv):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return AbstractC1170d.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        if (this.zza == 0) {
            zzacxVar = new zzajw(zzacxVar, this.zzf);
        }
        this.zzl = zzacxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x019c  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzg(com.google.android.gms.internal.ads.zzacv r20, com.google.android.gms.internal.ads.zzads r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzann.zzg(com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzads):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(long r10, long r12) {
        /*
            r9 = this;
            java.util.List r10 = r9.zzb
            int r11 = r10.size()
            r0 = 0
            r1 = r0
        L8:
            r2 = 0
            if (r1 >= r11) goto L35
            java.lang.Object r4 = r10.get(r1)
            com.google.android.gms.internal.ads.zzel r4 = (com.google.android.gms.internal.ads.zzel) r4
            long r5 = r4.zzc()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2f
            long r5 = r4.zza()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L32
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L32
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L32
        L2f:
            r4.zzd(r12)
        L32:
            int r1 = r1 + 1
            goto L8
        L35:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 == 0) goto L40
            com.google.android.gms.internal.ads.zzani r10 = r9.zzk
            if (r10 == 0) goto L40
            r10.zzb(r12)
        L40:
            com.google.android.gms.internal.ads.zzef r10 = r9.zzc
            r10.zza(r0)
            android.util.SparseIntArray r10 = r9.zzd
            r10.clear()
            r10 = r0
        L4b:
            android.util.SparseArray r11 = r9.zzg
            int r12 = r11.size()
            if (r10 >= r12) goto L5f
            java.lang.Object r11 = r11.valueAt(r10)
            com.google.android.gms.internal.ads.zzans r11 = (com.google.android.gms.internal.ads.zzans) r11
            r11.zzb()
            int r10 = r10 + 1
            goto L4b
        L5f:
            r9.zzq = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzann.zzh(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }

    public final /* synthetic */ SparseBooleanArray zzj() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzi;
    }

    public final /* synthetic */ zzacx zzl() {
        return this.zzl;
    }

    public final /* synthetic */ int zzm() {
        return this.zzm;
    }

    public final /* synthetic */ void zzn(int i) {
        this.zzm = i;
    }

    public final /* synthetic */ void zzo(boolean z4) {
        this.zzn = true;
    }

    public final /* synthetic */ void zzp(int i) {
        this.zzr = i;
    }

    public zzann(int i, int i4, zzajt zzajtVar, zzel zzelVar, zzanq zzanqVar, int i6) {
        this.zze = zzanqVar;
        this.zza = i4;
        this.zzf = zzajtVar;
        this.zzb = Collections.singletonList(zzelVar);
        this.zzc = new zzef(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzanj(TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
        this.zzl = zzacx.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzanqVar.zza();
        int size = sparseArrayZza.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.zzg.put(sparseArrayZza.keyAt(i10), (zzans) sparseArrayZza.valueAt(i10));
        }
        this.zzg.put(0, new zzane(new zzank(this)));
    }
}
