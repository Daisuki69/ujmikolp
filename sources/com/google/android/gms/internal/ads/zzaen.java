package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.extractor.avi.AviExtractor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaen implements zzacu {
    private final zzef zza;
    private final zzaem zzb;
    private final boolean zzc;
    private final zzajt zzd;
    private int zze;
    private zzacx zzf;
    private zzaeo zzg;
    private long zzh;
    private zzaeq[] zzi;
    private long zzj;

    @Nullable
    private zzaeq zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaen() {
        this(1, zzajt.zza);
    }

    @Nullable
    private final zzaeq zzb(int i) {
        for (zzaeq zzaeqVar : this.zzi) {
            if (zzaeqVar.zzc(i)) {
                return zzaeqVar;
            }
        }
        return null;
    }

    public final /* synthetic */ zzaeq[] zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzef zzefVar = this.zza;
        zzacvVar.zzi(zzefVar.zzi(), 0, 12);
        zzefVar.zzh(0);
        if (zzefVar.zzC() != 1179011410) {
            return false;
        }
        zzefVar.zzk(4);
        return zzefVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return AbstractC1170d.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zze = 0;
        if (this.zzc) {
            zzacxVar = new zzajw(zzacxVar, this.zzd);
        }
        this.zzf = zzacxVar;
        this.zzj = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        boolean z4;
        int i;
        long j;
        long j6 = this.zzj;
        if (j6 != -1) {
            long jZzn = zzacvVar.zzn();
            if (j6 < jZzn || j6 > 262144 + jZzn) {
                zzadsVar.zza = j6;
                z4 = true;
            } else {
                zzacvVar.zzf((int) (j6 - jZzn));
                z4 = false;
            }
        } else {
            z4 = false;
        }
        this.zzj = -1L;
        if (z4) {
            return 1;
        }
        int i4 = this.zze;
        zzaeq zzaeqVar = null;
        if (i4 == 0) {
            if (!zzd(zzacvVar)) {
                throw zzas.zzb("AVI Header List not found", null);
            }
            zzacvVar.zzf(12);
            this.zze = 1;
            return 0;
        }
        if (i4 == 1) {
            zzef zzefVar = this.zza;
            zzacvVar.zzc(zzefVar.zzi(), 0, 12);
            zzefVar.zzh(0);
            zzaem zzaemVar = this.zzb;
            zzaemVar.zza(zzefVar);
            int i6 = zzaemVar.zza;
            if (i6 != 1414744396) {
                StringBuilder sb2 = new StringBuilder(androidx.media3.datasource.cache.c.a(i6, 22));
                sb2.append("LIST expected, found: ");
                sb2.append(i6);
                throw zzas.zzb(sb2.toString(), null);
            }
            int iZzC = zzefVar.zzC();
            if (iZzC == 1819436136) {
                this.zzl = zzaemVar.zzb;
                this.zze = 2;
                return 0;
            }
            StringBuilder sb3 = new StringBuilder(androidx.media3.datasource.cache.c.a(iZzC, 22));
            sb3.append("hdrl expected, found: ");
            sb3.append(iZzC);
            throw zzas.zzb(sb3.toString(), null);
        }
        if (i4 == 2) {
            int i10 = this.zzl - 4;
            zzef zzefVar2 = new zzef(i10);
            zzacvVar.zzc(zzefVar2.zzi(), 0, i10);
            zzaer zzaerVarZzb = zzaer.zzb(AviExtractor.FOURCC_hdrl, zzefVar2);
            if (zzaerVarZzb.zza() != 1819436136) {
                int iZza = zzaerVarZzb.zza();
                StringBuilder sb4 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb4.append("Unexpected header list type ");
                sb4.append(iZza);
                throw zzas.zzb(sb4.toString(), null);
            }
            zzaeo zzaeoVar = (zzaeo) zzaerVarZzb.zzc(zzaeo.class);
            if (zzaeoVar == null) {
                throw zzas.zzb("AviHeader not found", null);
            }
            this.zzg = zzaeoVar;
            this.zzh = ((long) zzaeoVar.zzc) * ((long) zzaeoVar.zza);
            ArrayList arrayList = new ArrayList();
            zzgjz zzgjzVar = zzaerVarZzb.zza;
            int size = zzgjzVar.size();
            int i11 = 0;
            int i12 = 0;
            while (i11 < size) {
                zzaek zzaekVar = (zzaek) zzgjzVar.get(i11);
                if (zzaekVar.zza() == 1819440243) {
                    zzaer zzaerVar = (zzaer) zzaekVar;
                    int i13 = i12 + 1;
                    zzaep zzaepVar = (zzaep) zzaerVar.zzc(zzaep.class);
                    zzaes zzaesVar = (zzaes) zzaerVar.zzc(zzaes.class);
                    if (zzaepVar == null) {
                        zzds.zzc("AviExtractor", "Missing Stream Header");
                    } else if (zzaesVar == null) {
                        zzds.zzc("AviExtractor", "Missing Stream Format");
                    } else {
                        long jZzd = zzaepVar.zzd();
                        zzu zzuVar = zzaesVar.zza;
                        zzs zzsVarZza = zzuVar.zza();
                        zzsVarZza.zzb(i12);
                        int i14 = zzaepVar.zze;
                        if (i14 != 0) {
                            zzsVarZza.zzn(i14);
                        }
                        zzaet zzaetVar = (zzaet) zzaerVar.zzc(zzaet.class);
                        if (zzaetVar != null) {
                            zzsVarZza.zzc(zzaetVar.zza);
                        }
                        int iZzg = zzar.zzg(zzuVar.zzo);
                        if (iZzg == 1) {
                            zzaeb zzaebVarZzu = this.zzf.zzu(i12, iZzg);
                            zzaebVarZzu.zzu(zzsVarZza.zzM());
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzaeqVar = new zzaeq(i12, zzaepVar, zzaebVarZzu);
                        } else if (iZzg == 2) {
                            iZzg = 2;
                            zzaeb zzaebVarZzu2 = this.zzf.zzu(i12, iZzg);
                            zzaebVarZzu2.zzu(zzsVarZza.zzM());
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzaeqVar = new zzaeq(i12, zzaepVar, zzaebVarZzu2);
                        } else {
                            zzaeqVar = null;
                        }
                    }
                    if (zzaeqVar != null) {
                        arrayList.add(zzaeqVar);
                    }
                    i12 = i13;
                }
                i11++;
                zzaeqVar = null;
            }
            this.zzi = (zzaeq[]) arrayList.toArray(new zzaeq[0]);
            this.zzf.zzv();
            this.zze = 3;
            return 0;
        }
        if (i4 == 3) {
            long j7 = this.zzm;
            if (j7 != -1 && zzacvVar.zzn() != j7) {
                this.zzj = j7;
                return 0;
            }
            zzef zzefVar3 = this.zza;
            zzacvVar.zzi(zzefVar3.zzi(), 0, 12);
            zzacvVar.zzl();
            zzefVar3.zzh(0);
            zzaem zzaemVar2 = this.zzb;
            zzaemVar2.zza(zzefVar3);
            int iZzC2 = zzefVar3.zzC();
            int i15 = zzaemVar2.zza;
            if (i15 == 1179011410) {
                zzacvVar.zzf(12);
                return 0;
            }
            if (i15 != 1414744396 || iZzC2 != 1769369453) {
                this.zzj = zzacvVar.zzn() + ((long) zzaemVar2.zzb) + 8;
                return 0;
            }
            long jZzn2 = zzacvVar.zzn();
            this.zzm = jZzn2;
            long j9 = jZzn2 + ((long) zzaemVar2.zzb) + 8;
            this.zzn = j9;
            if (!this.zzp) {
                zzaeo zzaeoVar2 = this.zzg;
                zzaeoVar2.getClass();
                if ((zzaeoVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j9;
                    return 0;
                }
                this.zzf.zzw(new zzadu(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzacvVar.zzn() + 12;
            this.zze = 6;
            return 0;
        }
        if (i4 == 4) {
            zzef zzefVar4 = this.zza;
            zzacvVar.zzc(zzefVar4.zzi(), 0, 8);
            zzefVar4.zzh(0);
            int iZzC3 = zzefVar4.zzC();
            int iZzC4 = zzefVar4.zzC();
            if (iZzC3 != 829973609) {
                this.zzj = zzacvVar.zzn() + ((long) iZzC4);
                return 0;
            }
            this.zze = 5;
            this.zzo = iZzC4;
            return 0;
        }
        if (i4 != 5) {
            if (zzacvVar.zzn() >= this.zzn) {
                return -1;
            }
            zzaeq zzaeqVar2 = this.zzk;
            if (zzaeqVar2 != null) {
                if (!zzaeqVar2.zze(zzacvVar)) {
                    return 0;
                }
                this.zzk = null;
                return 0;
            }
            if ((zzacvVar.zzn() & 1) == 1) {
                zzacvVar.zzf(1);
            }
            zzef zzefVar5 = this.zza;
            zzacvVar.zzi(zzefVar5.zzi(), 0, 12);
            zzefVar5.zzh(0);
            int iZzC5 = zzefVar5.zzC();
            if (iZzC5 == 1414744396) {
                zzefVar5.zzh(8);
                zzacvVar.zzf(zzefVar5.zzC() != 1769369453 ? 8 : 12);
                zzacvVar.zzl();
                return 0;
            }
            int iZzC6 = zzefVar5.zzC();
            if (iZzC5 == 1263424842) {
                this.zzj = zzacvVar.zzn() + ((long) iZzC6) + 8;
                return 0;
            }
            zzacvVar.zzf(8);
            zzacvVar.zzl();
            zzaeq zzaeqVarZzb = zzb(iZzC5);
            if (zzaeqVarZzb == null) {
                this.zzj = zzacvVar.zzn() + ((long) iZzC6);
                return 0;
            }
            zzaeqVarZzb.zzd(iZzC6);
            this.zzk = zzaeqVarZzb;
            return 0;
        }
        zzef zzefVar6 = new zzef(this.zzo);
        zzacvVar.zzc(zzefVar6.zzi(), 0, this.zzo);
        if (zzefVar6.zzd() < 16) {
            i = 0;
            j = 0;
        } else {
            int iZzg2 = zzefVar6.zzg();
            zzefVar6.zzk(8);
            long jZzC = zzefVar6.zzC();
            i = 0;
            long j10 = this.zzm;
            j = jZzC > j10 ? 0L : j10 + 8;
            zzefVar6.zzh(iZzg2);
        }
        while (zzefVar6.zzd() >= 16) {
            int iZzC7 = zzefVar6.zzC();
            int iZzC8 = zzefVar6.zzC();
            long jZzC2 = ((long) zzefVar6.zzC()) + j;
            zzefVar6.zzk(4);
            zzaeq zzaeqVarZzb2 = zzb(iZzC7);
            if (zzaeqVarZzb2 != null) {
                zzaeqVarZzb2.zza(jZzC2, (iZzC8 & 16) == 16 ? 1 : i);
            }
        }
        zzaeq[] zzaeqVarArr = this.zzi;
        int length = zzaeqVarArr.length;
        for (int i16 = i; i16 < length; i16++) {
            zzaeqVarArr[i16].zzb();
        }
        this.zzp = true;
        if (this.zzi.length == 0) {
            this.zzf.zzw(new zzadu(this.zzh, 0L));
        } else {
            this.zzf.zzw(new zzael(this, this.zzh));
        }
        this.zze = 6;
        this.zzj = this.zzm;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j6) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzaeq zzaeqVar : this.zzi) {
            zzaeqVar.zzf(j);
        }
        if (j == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ zzacu zzi() {
        return AbstractC1170d.b(this);
    }

    public zzaen(int i, zzajt zzajtVar) {
        this.zzd = zzajtVar;
        this.zzc = 1 == (i ^ 1);
        this.zza = new zzef(12);
        this.zzb = new zzaem(null);
        this.zzf = new zzadq();
        this.zzi = new zzaeq[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = androidx.media3.common.C.TIME_UNSET;
    }
}
