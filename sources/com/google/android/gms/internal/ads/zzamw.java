package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamw implements zzans {
    private final zzamd zza;
    private final zzee zzb = new zzee(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzel zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzamw(zzamd zzamdVar) {
        this.zza = zzamdVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzef zzefVar, @Nullable byte[] bArr, int i) {
        int iMin = Math.min(zzefVar.zzd(), i - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzefVar.zzk(iMin);
        } else {
            zzefVar.zzm(bArr, this.zzd, iMin);
        }
        int i4 = this.zzd + iMin;
        this.zzd = i4;
        return i4 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zza(zzel zzelVar, zzacx zzacxVar, zzanr zzanrVar) {
        this.zze = zzelVar;
        this.zza.zzb(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zzc(zzef zzefVar, int i) throws zzas {
        int i4;
        int i6;
        long jZze;
        long j;
        this.zze.getClass();
        int i10 = -1;
        int i11 = 2;
        if ((i & 1) != 0) {
            int i12 = this.zzc;
            if (i12 != 0 && i12 != 1) {
                if (i12 != 2) {
                    int i13 = this.zzj;
                    if (i13 != -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 48);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i13);
                        sb2.append(" more bytes");
                        zzds.zzc("PesReader", sb2.toString());
                    }
                    this.zza.zze(zzefVar.zze() == 0);
                } else {
                    zzds.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i14 = i;
        while (zzefVar.zzd() > 0) {
            int i15 = this.zzc;
            if (i15 == 0) {
                i4 = i11;
                zzefVar.zzk(zzefVar.zzd());
            } else if (i15 != 1) {
                if (i15 != i11) {
                    int iZzd = zzefVar.zzd();
                    int i16 = this.zzj;
                    int i17 = i16 == i10 ? 0 : iZzd - i16;
                    if (i17 > 0) {
                        iZzd -= i17;
                        zzefVar.zzf(zzefVar.zzg() + iZzd);
                    }
                    zzamd zzamdVar = this.zza;
                    zzamdVar.zzd(zzefVar);
                    int i18 = this.zzj;
                    if (i18 != i10) {
                        int i19 = i18 - iZzd;
                        this.zzj = i19;
                        if (i19 == 0) {
                            zzamdVar.zze(false);
                            zze(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.zzi);
                    zzee zzeeVar = this.zzb;
                    if (zzf(zzefVar, zzeeVar.zza, iMin) && zzf(zzefVar, null, this.zzi)) {
                        zzeeVar.zzf(0);
                        if (this.zzf) {
                            zzeeVar.zzh(4);
                            long jZzj = zzeeVar.zzj(3);
                            zzeeVar.zzh(1);
                            int iZzj = zzeeVar.zzj(15) << 15;
                            zzeeVar.zzh(1);
                            long jZzj2 = zzeeVar.zzj(15);
                            zzeeVar.zzh(1);
                            if (this.zzh || !this.zzg) {
                                j = jZzj;
                            } else {
                                zzeeVar.zzh(4);
                                j = jZzj;
                                long jZzj3 = ((long) zzeeVar.zzj(3)) << 30;
                                zzeeVar.zzh(1);
                                int iZzj2 = zzeeVar.zzj(15) << 15;
                                zzeeVar.zzh(1);
                                long jZzj4 = zzeeVar.zzj(15);
                                zzeeVar.zzh(1);
                                this.zze.zze(jZzj3 | ((long) iZzj2) | jZzj4);
                                this.zzh = true;
                            }
                            jZze = this.zze.zze(jZzj2 | (j << 30) | ((long) iZzj));
                        } else {
                            jZze = androidx.media3.common.C.TIME_UNSET;
                        }
                        i14 |= true != this.zzk ? 0 : 4;
                        this.zza.zzc(jZze, i14);
                        zze(3);
                        i10 = -1;
                        i11 = 2;
                    }
                }
                i4 = i11;
            } else {
                zzee zzeeVar2 = this.zzb;
                if (zzf(zzefVar, zzeeVar2.zza, 9)) {
                    zzeeVar2.zzf(0);
                    int iZzj3 = zzeeVar2.zzj(24);
                    if (iZzj3 != 1) {
                        androidx.media3.datasource.cache.c.x(new StringBuilder(String.valueOf(iZzj3).length() + 30), "Unexpected start code prefix: ", iZzj3, "PesReader");
                        i10 = -1;
                        this.zzj = -1;
                        i6 = 0;
                        i4 = 2;
                    } else {
                        zzeeVar2.zzh(8);
                        int iZzj4 = zzeeVar2.zzj(16);
                        zzeeVar2.zzh(5);
                        this.zzk = zzeeVar2.zzi();
                        i4 = 2;
                        zzeeVar2.zzh(2);
                        this.zzf = zzeeVar2.zzi();
                        this.zzg = zzeeVar2.zzi();
                        zzeeVar2.zzh(6);
                        int iZzj5 = zzeeVar2.zzj(8);
                        this.zzi = iZzj5;
                        if (iZzj4 == 0) {
                            this.zzj = -1;
                            i10 = -1;
                        } else {
                            int i20 = (iZzj4 - 3) - iZzj5;
                            this.zzj = i20;
                            if (i20 < 0) {
                                androidx.media3.datasource.cache.c.x(new StringBuilder(String.valueOf(i20).length() + 36), "Found negative packet payload size: ", i20, "PesReader");
                                i10 = -1;
                                this.zzj = -1;
                            } else {
                                i10 = -1;
                            }
                        }
                        i6 = 2;
                    }
                    zze(i6);
                } else {
                    i10 = -1;
                    i4 = 2;
                }
            }
            i11 = i4;
        }
    }

    public final boolean zzd(boolean z4) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
