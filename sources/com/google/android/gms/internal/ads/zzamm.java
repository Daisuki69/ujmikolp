package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamm implements zzamd {
    private final zzang zza;
    private String zzb;
    private zzaeb zzc;
    private zzaml zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzamu zzg = new zzamu(32, 128);
    private final zzamu zzh = new zzamu(33, 128);
    private final zzamu zzi = new zzamu(34, 128);
    private final zzamu zzj = new zzamu(39, 128);
    private final zzamu zzk = new zzamu(40, 128);
    private long zzm = androidx.media3.common.C.TIME_UNSET;
    private final zzef zzn = new zzef();

    public zzamm(zzang zzangVar, String str) {
        this.zza = zzangVar;
    }

    private final void zzf(long j, int i, int i4, long j6) {
        this.zzd.zzb(j, i, i4, j6, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i4);
            this.zzh.zzc(i4);
            this.zzi.zzc(i4);
        }
        this.zzj.zzc(i4);
        this.zzk.zzc(i4);
    }

    private final void zzg(byte[] bArr, int i, int i4) {
        this.zzd.zzc(bArr, i, i4);
        if (!this.zze) {
            this.zzg.zzd(bArr, i, i4);
            this.zzh.zzd(bArr, i, i4);
            this.zzi.zzd(bArr, i, i4);
        }
        this.zzj.zzd(bArr, i, i4);
        this.zzk.zzd(bArr, i, i4);
    }

    private final void zzh(long j, int i, int i4, long j6) {
        this.zzd.zzd(j, i, this.zze);
        if (!this.zze) {
            zzamu zzamuVar = this.zzg;
            zzamuVar.zze(i4);
            zzamu zzamuVar2 = this.zzh;
            zzamuVar2.zze(i4);
            zzamu zzamuVar3 = this.zzi;
            zzamuVar3.zze(i4);
            if (zzamuVar.zzb() && zzamuVar2.zzb() && zzamuVar3.zzb()) {
                String str = this.zzb;
                int i6 = zzamuVar.zzb;
                byte[] bArr = new byte[zzamuVar2.zzb + i6 + zzamuVar3.zzb];
                System.arraycopy(zzamuVar.zza, 0, bArr, 0, i6);
                System.arraycopy(zzamuVar2.zza, 0, bArr, zzamuVar.zzb, zzamuVar2.zzb);
                System.arraycopy(zzamuVar3.zza, 0, bArr, zzamuVar.zzb + zzamuVar2.zzb, zzamuVar3.zzb);
                String strZzc = null;
                zzff zzffVarZzf = zzfl.zzf(zzamuVar2.zza, 3, zzamuVar2.zzb, null);
                zzfa zzfaVar = zzffVarZzf.zzb;
                if (zzfaVar != null) {
                    int i10 = zzfaVar.zzf;
                    int[] iArr = zzfaVar.zze;
                    int i11 = zzfaVar.zzd;
                    strZzc = zzdc.zzc(zzfaVar.zza, zzfaVar.zzb, zzfaVar.zzc, i11, iArr, i10);
                }
                zzs zzsVar = new zzs();
                zzsVar.zza(str);
                zzsVar.zzl(MimeTypes.VIDEO_MP2T);
                zzsVar.zzm(MimeTypes.VIDEO_H265);
                zzsVar.zzj(strZzc);
                zzsVar.zzt(zzffVarZzf.zze);
                zzsVar.zzu(zzffVarZzf.zzf);
                zzsVar.zzv(zzffVarZzf.zzg);
                zzsVar.zzw(zzffVarZzf.zzh);
                zzg zzgVar = new zzg();
                zzgVar.zza(zzffVarZzf.zzk);
                zzgVar.zzb(zzffVarZzf.zzl);
                zzgVar.zzc(zzffVarZzf.zzm);
                zzgVar.zze(zzffVarZzf.zzc + 8);
                zzgVar.zzf(zzffVarZzf.zzd + 8);
                zzsVar.zzC(zzgVar.zzg());
                zzsVar.zzz(zzffVarZzf.zzi);
                zzsVar.zzo(zzffVarZzf.zzj);
                zzsVar.zzD(zzffVarZzf.zza + 1);
                zzsVar.zzp(Collections.singletonList(bArr));
                zzu zzuVarZzM = zzsVar.zzM();
                this.zzc.zzu(zzuVarZzM);
                int i12 = zzuVarZzM.zzq;
                zzghc.zzh(i12 != -1);
                this.zza.zzb(i12);
                this.zze = true;
            }
        }
        zzamu zzamuVar4 = this.zzj;
        if (zzamuVar4.zze(i4)) {
            int iZza = zzfl.zza(zzamuVar4.zza, zzamuVar4.zzb);
            zzef zzefVar = this.zzn;
            zzefVar.zzb(zzamuVar4.zza, iZza);
            zzefVar.zzk(5);
            this.zza.zzc(j6, zzefVar);
        }
        zzamu zzamuVar5 = this.zzk;
        if (zzamuVar5.zze(i4)) {
            int iZza2 = zzfl.zza(zzamuVar5.zza, zzamuVar5.zzb);
            zzef zzefVar2 = this.zzn;
            zzefVar2.zzb(zzamuVar5.zza, iZza2);
            zzefVar2.zzk(5);
            this.zza.zzc(j6, zzefVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzl = 0L;
        this.zzm = androidx.media3.common.C.TIME_UNSET;
        zzfl.zzi(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaml zzamlVar = this.zzd;
        if (zzamlVar != null) {
            zzamlVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzb = zzanrVar.zzc();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 2);
        this.zzc = zzaebVarZzu;
        this.zzd = new zzaml(zzaebVarZzu);
        this.zza.zza(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzef r18) {
        /*
            r17 = this;
            r0 = r17
            r7 = 3
            com.google.android.gms.internal.ads.zzaeb r1 = r0.zzc
            r1.getClass()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeo.zza
        La:
            int r1 = r18.zzd()
            if (r1 <= 0) goto L78
            int r1 = r18.zzg()
            int r8 = r18.zze()
            byte[] r9 = r18.zzi()
            long r2 = r0.zzl
            int r4 = r18.zzd()
            long r4 = (long) r4
            long r2 = r2 + r4
            r0.zzl = r2
            com.google.android.gms.internal.ads.zzaeb r2 = r0.zzc
            int r3 = r18.zzd()
            r10 = r18
            r2.zzz(r10, r3)
        L31:
            if (r1 >= r8) goto La
            boolean[] r2 = r0.zzf
            int r2 = com.google.android.gms.internal.ads.zzfl.zzh(r9, r1, r8, r2)
            if (r2 == r8) goto L75
            int r3 = r2 + 3
            r3 = r9[r3]
            r3 = r3 & 126(0x7e, float:1.77E-43)
            if (r2 <= 0) goto L4d
            int r4 = r2 + (-1)
            r5 = r9[r4]
            if (r5 != 0) goto L4d
            r2 = 4
            r12 = r2
            r11 = r4
            goto L4f
        L4d:
            r11 = r2
            r12 = r7
        L4f:
            int r2 = r11 - r1
            if (r2 <= 0) goto L56
            r0.zzg(r9, r1, r11)
        L56:
            r1 = r3
            int r3 = r8 - r11
            long r4 = r0.zzl
            long r13 = (long) r3
            long r4 = r4 - r13
            if (r2 >= 0) goto L61
            int r2 = -r2
            goto L62
        L61:
            r2 = 0
        L62:
            int r13 = r1 >> 1
            r15 = r4
            r4 = r2
            r1 = r15
            long r5 = r0.zzm
            r0.zzh(r1, r3, r4, r5)
            long r5 = r0.zzm
            r4 = r13
            r0.zzf(r1, r3, r4, r5)
            int r1 = r11 + r12
            goto L31
        L75:
            r0.zzg(r9, r1, r8)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamm.zzd(com.google.android.gms.internal.ads.zzef):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z4) {
        this.zzc.getClass();
        String str = zzeo.zza;
        if (z4) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}
