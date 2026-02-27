package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzaaq implements zzbs {
    private final Context zza;
    private final zzbr zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzabr zze;
    private final zzdb zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzaav zzi;
    private zzek zzj = new zzek(10);
    private zzu zzk;
    private zzdl zzl;

    @Nullable
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    public /* synthetic */ zzaaq(zzaai zzaaiVar, byte[] bArr) {
        this.zza = zzaaiVar.zze();
        zzbr zzbrVarZzg = zzaaiVar.zzg();
        zzbrVarZzg.getClass();
        this.zzb = zzbrVarZzg;
        this.zzc = new SparseArray();
        zzgjz.zzi();
        this.zzd = zzaaiVar.zzh();
        zzdb zzdbVarZzi = zzaaiVar.zzi();
        this.zzf = zzdbVarZzi;
        this.zzh = zzaaiVar.zzj() != androidx.media3.common.C.TIME_UNSET ? -zzaaiVar.zzj() : -9223372036854775807L;
        zzaav zzaavVarZzk = zzaaiVar.zzk();
        this.zzi = zzaavVarZzk;
        this.zze = new zzzv(zzaaiVar.zzf(), zzaavVarZzk, zzdbVarZzi);
        new zzaah(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzs().zzM();
        this.zzp = androidx.media3.common.C.TIME_UNSET;
        this.zzq = androidx.media3.common.C.TIME_UNSET;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzh zzC(@Nullable zzh zzhVar) {
        return (zzhVar == null || !zzhVar.zzf()) ? zzh.zza : zzhVar;
    }

    public final /* synthetic */ void zzA(long j) {
        this.zzq = j;
    }

    public final void zza(int i) {
        this.zzr = 1;
    }

    public final zzabr zzb(int i) {
        SparseArray sparseArray = this.zzc;
        if (zzeo.zza(sparseArray, 0)) {
            return (zzabr) sparseArray.get(0);
        }
        zzaak zzaakVar = new zzaak(this, this.zza, 0);
        this.zzg.add(zzaakVar);
        sparseArray.put(0, zzaakVar);
        return zzaakVar;
    }

    public final void zzc(Surface surface, zzeg zzegVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzeg) this.zzm.second).equals(zzegVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzegVar);
        zzegVar.zza();
        zzegVar.zzb();
    }

    public final void zzd() {
        zzeg zzegVar = zzeg.zza;
        zzegVar.zza();
        zzegVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdl zzdlVar = this.zzl;
        if (zzdlVar != null) {
            zzdlVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: zzdi -> 0x0033, TRY_LEAVE, TryCatch #0 {zzdi -> 0x0033, blocks: (B:7:0x0012, B:9:0x0017, B:11:0x001d, B:14:0x0025, B:18:0x0036, B:20:0x003c, B:23:0x0043, B:28:0x0067), top: B:38:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ boolean zzi(com.google.android.gms.internal.ads.zzu r12, int r13) throws com.google.android.gms.internal.ads.zzabq {
        /*
            r11 = this;
            java.lang.String r13 = "Color transfer "
            int r0 = r11.zzo
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.gms.internal.ads.zzghc.zzh(r0)
            com.google.android.gms.internal.ads.zzh r0 = r12.zzE
            com.google.android.gms.internal.ads.zzh r0 = zzC(r0)
            int r1 = r0.zzd     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            r2 = 7
            if (r1 != r2) goto L36
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            r3 = 34
            if (r1 >= r3) goto L23
            boolean r1 = com.google.android.gms.internal.ads.zzdj.zzd()     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            if (r1 != 0) goto L25
        L23:
            r1 = r2
            goto L36
        L25:
            com.google.android.gms.internal.ads.zzg r13 = r0.zzd()     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            r0 = 6
            r13.zzc(r0)     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            com.google.android.gms.internal.ads.zzh r0 = r13.zzg()     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
        L31:
            r3 = r0
            goto L6a
        L33:
            r0 = move-exception
            r13 = r0
            goto L98
        L36:
            boolean r2 = com.google.android.gms.internal.ads.zzdj.zzc(r1)     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            if (r2 != 0) goto L60
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            r3 = 29
            if (r2 >= r3) goto L43
            goto L60
        L43:
            java.lang.String r0 = "PlaybackVidGraphWrapper"
            java.lang.String r2 = com.google.android.gms.internal.ads.zzeo.zza     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            java.util.Locale r2 = java.util.Locale.US     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            r2.<init>(r13)     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            r2.append(r1)     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            java.lang.String r13 = " is not supported. Falling back to OpenGl tone mapping."
            r2.append(r13)     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            java.lang.String r13 = r2.toString()     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            com.google.android.gms.internal.ads.zzds.zzc(r0, r13)     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            com.google.android.gms.internal.ads.zzh r0 = com.google.android.gms.internal.ads.zzh.zza     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            goto L31
        L60:
            r13 = 2
            if (r1 == r13) goto L67
            r13 = 10
            if (r1 != r13) goto L31
        L67:
            com.google.android.gms.internal.ads.zzh r0 = com.google.android.gms.internal.ads.zzh.zza     // Catch: com.google.android.gms.internal.ads.zzdi -> L33
            goto L31
        L6a:
            com.google.android.gms.internal.ads.zzdb r13 = r11.zzf
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r10 = 0
            com.google.android.gms.internal.ads.zzdl r13 = r13.zzd(r0, r10)
            r11.zzl = r13
            com.google.android.gms.internal.ads.zzbr r1 = r11.zzb     // Catch: com.google.android.gms.internal.ads.zzbn -> L90
            android.content.Context r2 = r11.zza     // Catch: com.google.android.gms.internal.ads.zzbn -> L90
            com.google.android.gms.internal.ads.zzk r4 = com.google.android.gms.internal.ads.zzk.zzb     // Catch: com.google.android.gms.internal.ads.zzbn -> L90
            java.util.Objects.requireNonNull(r13)     // Catch: com.google.android.gms.internal.ads.zzbn -> L90
            com.google.android.gms.internal.ads.zzaaj r6 = new com.google.android.gms.internal.ads.zzaaj     // Catch: com.google.android.gms.internal.ads.zzbn -> L90
            r6.<init>()     // Catch: com.google.android.gms.internal.ads.zzbn -> L90
            r7 = 0
            r9 = 0
            r5 = r11
            r1.zza(r2, r3, r4, r5, r6, r7, r9)     // Catch: com.google.android.gms.internal.ads.zzbn -> L90
            throw r10     // Catch: com.google.android.gms.internal.ads.zzbn -> L90
        L90:
            r0 = move-exception
            r13 = r0
            com.google.android.gms.internal.ads.zzabq r0 = new com.google.android.gms.internal.ads.zzabq
            r0.<init>(r13, r12)
            throw r0
        L98:
            com.google.android.gms.internal.ads.zzabq r0 = new com.google.android.gms.internal.ads.zzabq
            r0.<init>(r13, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaq.zzi(com.google.android.gms.internal.ads.zzu, int):boolean");
    }

    public final /* synthetic */ boolean zzj(boolean z4) {
        return this.zze.zzh(false);
    }

    public final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    public final /* synthetic */ void zzl(long j, long j6) throws zzabq {
        this.zze.zzv(j, j6);
    }

    public final /* synthetic */ void zzm(boolean z4) {
        if (this.zzo == 1) {
            this.zzn++;
            zzabr zzabrVar = this.zze;
            zzabrVar.zzg(z4);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzaap zzaapVar = (zzaap) this.zzj.zzd();
                zzaapVar.getClass();
                zzabrVar.zzs(1, this.zzk, zzaapVar.zza, zzaapVar.zzb, zzgjz.zzi());
            }
            this.zzp = androidx.media3.common.C.TIME_UNSET;
            this.zzq = androidx.media3.common.C.TIME_UNSET;
            zzdl zzdlVar = this.zzl;
            zzdlVar.getClass();
            zzdlVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaal
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    public final /* synthetic */ void zzn(boolean z4) {
        this.zze.zzw(z4);
    }

    public final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    public final /* synthetic */ void zzp(zzaar zzaarVar) {
        this.zze.zzl(zzaarVar);
    }

    public final /* synthetic */ void zzq(float f) {
        this.zzi.zzc(f);
        this.zze.zzm(f);
    }

    public final /* synthetic */ void zzr(int i) {
        this.zze.zzr(i);
    }

    public final /* synthetic */ boolean zzs() {
        int i = this.zzr;
        return i != -1 && i == 0;
    }

    public final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    public final /* synthetic */ long zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzaav zzv() {
        return this.zzi;
    }

    public final /* synthetic */ zzek zzw() {
        return this.zzj;
    }

    public final /* synthetic */ void zzx(zzek zzekVar) {
        this.zzj = zzekVar;
    }

    public final /* synthetic */ long zzy() {
        return this.zzp;
    }

    public final /* synthetic */ long zzz() {
        return this.zzq;
    }
}
