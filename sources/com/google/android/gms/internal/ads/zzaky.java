package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzaky {

    @Nullable
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;

    @Nullable
    private String zzl;

    @Nullable
    private Layout.Alignment zzo;

    @Nullable
    private Layout.Alignment zzp;

    @Nullable
    private zzakr zzr;

    @Nullable
    private String zzt;

    @Nullable
    private String zzu;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    @Nullable
    public final Layout.Alignment zzA() {
        return this.zzp;
    }

    public final zzaky zzB(@Nullable Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final boolean zzC() {
        return this.zzq == 1;
    }

    public final zzaky zzD(boolean z4) {
        this.zzq = z4 ? 1 : 0;
        return this;
    }

    @Nullable
    public final zzakr zzE() {
        return this.zzr;
    }

    public final zzaky zzF(@Nullable zzakr zzakrVar) {
        this.zzr = zzakrVar;
        return this;
    }

    public final zzaky zzG(float f) {
        this.zzk = f;
        return this;
    }

    public final zzaky zzH(int i) {
        this.zzj = i;
        return this;
    }

    public final int zzI() {
        return this.zzj;
    }

    public final float zzJ() {
        return this.zzk;
    }

    public final zzaky zzK(@Nullable String str) {
        this.zzt = str;
        return this;
    }

    @Nullable
    public final String zzL() {
        return this.zzt;
    }

    public final zzaky zzM(@Nullable String str) {
        this.zzu = str;
        return this;
    }

    @Nullable
    public final String zzN() {
        return this.zzu;
    }

    public final int zza() {
        int i = this.zzh;
        if (i == -1 && this.zzi == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
    }

    public final boolean zzb() {
        return this.zzf == 1;
    }

    public final zzaky zzc(boolean z4) {
        this.zzf = z4 ? 1 : 0;
        return this;
    }

    public final boolean zzd() {
        return this.zzg == 1;
    }

    public final zzaky zze(boolean z4) {
        this.zzg = z4 ? 1 : 0;
        return this;
    }

    public final zzaky zzf(boolean z4) {
        this.zzh = z4 ? 1 : 0;
        return this;
    }

    public final zzaky zzg(boolean z4) {
        this.zzi = z4 ? 1 : 0;
        return this;
    }

    @Nullable
    public final String zzh() {
        return this.zza;
    }

    public final zzaky zzi(@Nullable String str) {
        this.zza = str;
        return this;
    }

    public final int zzj() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final zzaky zzk(int i) {
        this.zzb = i;
        this.zzc = true;
        return this;
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final int zzm() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final zzaky zzn(int i) {
        this.zzd = i;
        this.zze = true;
        return this;
    }

    public final boolean zzo() {
        return this.zze;
    }

    public final zzaky zzp(float f) {
        this.zzs = f;
        return this;
    }

    public final float zzq() {
        return this.zzs;
    }

    public final zzaky zzr(@Nullable zzaky zzakyVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzakyVar != null) {
            if (!this.zzc && zzakyVar.zzc) {
                zzk(zzakyVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzakyVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzakyVar.zzi;
            }
            if (this.zza == null && (str = zzakyVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzakyVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzakyVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzakyVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzakyVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzakyVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzakyVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzakyVar.zzj;
                this.zzk = zzakyVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzakyVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzakyVar.zzs;
            }
            if (this.zzt == null) {
                this.zzt = zzakyVar.zzt;
            }
            if (this.zzu == null) {
                this.zzu = zzakyVar.zzu;
            }
            if (!this.zze && zzakyVar.zze) {
                zzn(zzakyVar.zzd);
            }
            if (this.zzm == -1 && (i = zzakyVar.zzm) != -1) {
                this.zzm = i;
            }
        }
        return this;
    }

    public final zzaky zzs(@Nullable String str) {
        this.zzl = str;
        return this;
    }

    @Nullable
    public final String zzt() {
        return this.zzl;
    }

    public final zzaky zzu(int i) {
        this.zzm = i;
        return this;
    }

    public final int zzv() {
        return this.zzm;
    }

    public final zzaky zzw(int i) {
        this.zzn = i;
        return this;
    }

    public final int zzx() {
        return this.zzn;
    }

    @Nullable
    public final Layout.Alignment zzy() {
        return this.zzo;
    }

    public final zzaky zzz(@Nullable Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
