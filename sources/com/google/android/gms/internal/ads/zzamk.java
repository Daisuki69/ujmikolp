package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamk implements zzamd {
    private final zzang zza;
    private long zzf;
    private String zzh;
    private zzaeb zzi;
    private zzamj zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = MimeTypes.VIDEO_MP2T;
    private final boolean[] zzg = new boolean[3];
    private final zzamu zzc = new zzamu(7, 128);
    private final zzamu zzd = new zzamu(8, 128);
    private final zzamu zze = new zzamu(6, 128);
    private long zzl = androidx.media3.common.C.TIME_UNSET;
    private final zzef zzn = new zzef();

    public zzamk(zzang zzangVar, boolean z4, boolean z5, String str) {
        this.zza = zzangVar;
    }

    private final void zzf(long j, int i, long j6) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j, i, j6, this.zzm);
    }

    private final void zzg(byte[] bArr, int i, int i4) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i, i4);
            this.zzd.zzd(bArr, i, i4);
        }
        this.zze.zzd(bArr, i, i4);
    }

    private final void zzh(long j, int i, int i4, long j6) {
        if (!this.zzk) {
            zzamu zzamuVar = this.zzc;
            zzamuVar.zze(i4);
            zzamu zzamuVar2 = this.zzd;
            zzamuVar2.zze(i4);
            if (this.zzk) {
                if (zzamuVar.zzb()) {
                    zzfk zzfkVarZzd = zzfl.zzd(zzamuVar.zza, 4, zzamuVar.zzb);
                    this.zza.zzb(zzfkVarZzd.zzm);
                    this.zzj.zza(zzfkVarZzd);
                    zzamuVar.zza();
                } else if (zzamuVar2.zzb()) {
                    this.zzj.zzb(zzfl.zzg(zzamuVar2.zza, 4, zzamuVar2.zzb));
                    zzamuVar2.zza();
                }
            } else if (zzamuVar.zzb() && zzamuVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzamuVar.zza, zzamuVar.zzb));
                arrayList.add(Arrays.copyOf(zzamuVar2.zza, zzamuVar2.zzb));
                zzfk zzfkVarZzd2 = zzfl.zzd(zzamuVar.zza, 4, zzamuVar.zzb);
                zzfj zzfjVarZzg = zzfl.zzg(zzamuVar2.zza, 4, zzamuVar2.zzb);
                String strZzb = zzdc.zzb(zzfkVarZzd2.zza, zzfkVarZzd2.zzb, zzfkVarZzd2.zzc);
                zzaeb zzaebVar = this.zzi;
                zzs zzsVar = new zzs();
                zzsVar.zza(this.zzh);
                zzsVar.zzl(this.zzb);
                zzsVar.zzm("video/avc");
                zzsVar.zzj(strZzb);
                zzsVar.zzt(zzfkVarZzd2.zze);
                zzsVar.zzu(zzfkVarZzd2.zzf);
                zzg zzgVar = new zzg();
                zzgVar.zza(zzfkVarZzd2.zzj);
                zzgVar.zzb(zzfkVarZzd2.zzk);
                zzgVar.zzc(zzfkVarZzd2.zzl);
                zzgVar.zze(zzfkVarZzd2.zzh + 8);
                zzgVar.zzf(zzfkVarZzd2.zzi + 8);
                zzsVar.zzC(zzgVar.zzg());
                zzsVar.zzz(zzfkVarZzd2.zzg);
                zzsVar.zzp(arrayList);
                int i6 = zzfkVarZzd2.zzm;
                zzsVar.zzo(i6);
                zzaebVar.zzu(zzsVar.zzM());
                this.zzk = true;
                this.zza.zzb(i6);
                this.zzj.zza(zzfkVarZzd2);
                this.zzj.zzb(zzfjVarZzg);
                zzamuVar.zza();
                zzamuVar2.zza();
            }
        }
        zzamu zzamuVar3 = this.zze;
        if (zzamuVar3.zze(i4)) {
            int iZza = zzfl.zza(zzamuVar3.zza, zzamuVar3.zzb);
            zzef zzefVar = this.zzn;
            zzefVar.zzb(zzamuVar3.zza, iZza);
            zzefVar.zzh(4);
            this.zza.zzc(j6, zzefVar);
        }
        if (this.zzj.zze(j, i, this.zzk)) {
            this.zzm = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = androidx.media3.common.C.TIME_UNSET;
        zzfl.zzi(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzamj zzamjVar = this.zzj;
        if (zzamjVar != null) {
            zzamjVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzh = zzanrVar.zzc();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 2);
        this.zzi = zzaebVarZzu;
        this.zzj = new zzamj(zzaebVarZzu, false, false);
        this.zza.zza(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzl = j;
        int i4 = i & 2;
        this.zzm = (i4 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzef r16) {
        /*
            r15 = this;
            r7 = 3
            com.google.android.gms.internal.ads.zzaeb r1 = r15.zzi
            r1.getClass()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeo.zza
            int r1 = r16.zzg()
            int r8 = r16.zze()
            byte[] r9 = r16.zzi()
            long r2 = r15.zzf
            int r4 = r16.zzd()
            long r4 = (long) r4
            long r2 = r2 + r4
            r15.zzf = r2
            com.google.android.gms.internal.ads.zzaeb r2 = r15.zzi
            int r3 = r16.zzd()
            r4 = r16
            r2.zzz(r4, r3)
        L29:
            boolean[] r2 = r15.zzg
            int r2 = com.google.android.gms.internal.ads.zzfl.zzh(r9, r1, r8, r2)
            if (r2 == r8) goto L6a
            int r3 = r2 + 3
            r3 = r9[r3]
            r10 = r3 & 31
            if (r2 <= 0) goto L43
            int r3 = r2 + (-1)
            r4 = r9[r3]
            if (r4 != 0) goto L43
            r2 = 4
            r12 = r2
            r11 = r3
            goto L45
        L43:
            r11 = r2
            r12 = r7
        L45:
            int r2 = r11 - r1
            if (r2 <= 0) goto L4c
            r15.zzg(r9, r1, r11)
        L4c:
            int r3 = r8 - r11
            long r4 = r15.zzf
            long r13 = (long) r3
            long r4 = r4 - r13
            if (r2 >= 0) goto L57
            int r1 = -r2
        L55:
            r13 = r4
            goto L59
        L57:
            r1 = 0
            goto L55
        L59:
            long r5 = r15.zzl
            r0 = r15
            r4 = r1
            r1 = r13
            r0.zzh(r1, r3, r4, r5)
            long r4 = r15.zzl
            r3 = r10
            r0.zzf(r1, r3, r4)
            int r1 = r11 + r12
            goto L29
        L6a:
            r15.zzg(r9, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamk.zzd(com.google.android.gms.internal.ads.zzef):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z4) {
        this.zzi.getClass();
        String str = zzeo.zza;
        if (z4) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }
}
