package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzal {

    @Nullable
    private CharSequence zza;

    @Nullable
    private CharSequence zzb;

    @Nullable
    private CharSequence zzc;

    @Nullable
    private CharSequence zzd;

    @Nullable
    private CharSequence zze;

    @Nullable
    private byte[] zzf;

    @Nullable
    private Integer zzg;

    @Nullable
    private Integer zzh;

    @Nullable
    private Integer zzi;

    @Nullable
    private Integer zzj;

    @Nullable
    private Boolean zzk;

    @Nullable
    private Integer zzl;

    @Nullable
    private Integer zzm;

    @Nullable
    private Integer zzn;

    @Nullable
    private Integer zzo;

    @Nullable
    private Integer zzp;

    @Nullable
    private Integer zzq;

    @Nullable
    private CharSequence zzr;

    @Nullable
    private CharSequence zzs;

    @Nullable
    private CharSequence zzt;

    @Nullable
    private Integer zzu;

    @Nullable
    private Integer zzv;

    @Nullable
    private CharSequence zzw;

    @Nullable
    private CharSequence zzx;

    @Nullable
    private Integer zzy;
    private zzgjz zzz;

    public /* synthetic */ zzal(zzam zzamVar, byte[] bArr) {
        this.zza = zzamVar.zzb;
        this.zzb = zzamVar.zzc;
        this.zzc = zzamVar.zzd;
        this.zzd = zzamVar.zze;
        this.zze = zzamVar.zzf;
        this.zzf = zzamVar.zzg;
        this.zzg = zzamVar.zzh;
        this.zzh = zzamVar.zzi;
        this.zzi = zzamVar.zzj;
        this.zzj = zzamVar.zzk;
        this.zzk = zzamVar.zzl;
        this.zzl = zzamVar.zzn;
        this.zzm = zzamVar.zzo;
        this.zzn = zzamVar.zzp;
        this.zzo = zzamVar.zzq;
        this.zzp = zzamVar.zzr;
        this.zzq = zzamVar.zzs;
        this.zzr = zzamVar.zzt;
        this.zzs = zzamVar.zzu;
        this.zzt = zzamVar.zzv;
        this.zzu = zzamVar.zzw;
        this.zzv = zzamVar.zzx;
        this.zzw = zzamVar.zzy;
        this.zzx = zzamVar.zzz;
        this.zzy = zzamVar.zzA;
        this.zzz = zzamVar.zzB;
    }

    public final /* synthetic */ CharSequence zzA() {
        return this.zzd;
    }

    public final /* synthetic */ CharSequence zzB() {
        return this.zze;
    }

    public final /* synthetic */ byte[] zzC() {
        return this.zzf;
    }

    public final /* synthetic */ Integer zzD() {
        return this.zzg;
    }

    public final /* synthetic */ Integer zzE() {
        return this.zzh;
    }

    public final /* synthetic */ Integer zzF() {
        return this.zzi;
    }

    public final /* synthetic */ Integer zzG() {
        return this.zzj;
    }

    public final /* synthetic */ Boolean zzH() {
        return this.zzk;
    }

    public final /* synthetic */ Integer zzI() {
        return this.zzl;
    }

    public final /* synthetic */ Integer zzJ() {
        return this.zzm;
    }

    public final /* synthetic */ Integer zzK() {
        return this.zzn;
    }

    public final /* synthetic */ Integer zzL() {
        return this.zzo;
    }

    public final /* synthetic */ Integer zzM() {
        return this.zzp;
    }

    public final /* synthetic */ Integer zzN() {
        return this.zzq;
    }

    public final /* synthetic */ CharSequence zzO() {
        return this.zzr;
    }

    public final /* synthetic */ CharSequence zzP() {
        return this.zzs;
    }

    public final /* synthetic */ CharSequence zzQ() {
        return this.zzt;
    }

    public final /* synthetic */ Integer zzR() {
        return this.zzu;
    }

    public final /* synthetic */ Integer zzS() {
        return this.zzv;
    }

    public final /* synthetic */ CharSequence zzT() {
        return this.zzw;
    }

    public final /* synthetic */ CharSequence zzU() {
        return this.zzx;
    }

    public final /* synthetic */ Integer zzV() {
        return this.zzy;
    }

    public final /* synthetic */ zzgjz zzW() {
        return this.zzz;
    }

    public final zzal zza(@Nullable CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzal zzb(@Nullable CharSequence charSequence) {
        this.zzb = charSequence;
        return this;
    }

    public final zzal zzc(@Nullable CharSequence charSequence) {
        this.zzc = charSequence;
        return this;
    }

    public final zzal zzd(@Nullable CharSequence charSequence) {
        this.zzd = charSequence;
        return this;
    }

    public final zzal zze(@Nullable CharSequence charSequence) {
        this.zze = charSequence;
        return this;
    }

    public final zzal zzf(byte[] bArr, int i) {
        if (this.zzf != null && i != 3 && Objects.equals(this.zzg, 3)) {
            return this;
        }
        this.zzf = (byte[]) bArr.clone();
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public final zzal zzg(@Nullable Integer num) {
        this.zzh = num;
        return this;
    }

    public final zzal zzh(@Nullable Integer num) {
        this.zzi = num;
        return this;
    }

    public final zzal zzi(@Nullable Integer num) {
        this.zzl = num;
        return this;
    }

    public final zzal zzj(@IntRange(from = 1, to = 12) @Nullable Integer num) {
        this.zzm = num;
        return this;
    }

    public final zzal zzk(@IntRange(from = 1, to = 31) @Nullable Integer num) {
        this.zzn = num;
        return this;
    }

    public final zzal zzl(@Nullable Integer num) {
        this.zzo = num;
        return this;
    }

    public final zzal zzm(@IntRange(from = 1, to = 12) @Nullable Integer num) {
        this.zzp = num;
        return this;
    }

    public final zzal zzn(@IntRange(from = 1, to = 31) @Nullable Integer num) {
        this.zzq = num;
        return this;
    }

    public final zzal zzo(@Nullable CharSequence charSequence) {
        this.zzr = charSequence;
        return this;
    }

    public final zzal zzp(@Nullable CharSequence charSequence) {
        this.zzs = charSequence;
        return this;
    }

    public final zzal zzq(@Nullable CharSequence charSequence) {
        this.zzt = charSequence;
        return this;
    }

    public final zzal zzr(@Nullable Integer num) {
        this.zzu = num;
        return this;
    }

    public final zzal zzs(@Nullable Integer num) {
        this.zzv = num;
        return this;
    }

    public final zzal zzt(@Nullable CharSequence charSequence) {
        this.zzw = charSequence;
        return this;
    }

    public final zzal zzu(@Nullable CharSequence charSequence) {
        this.zzx = charSequence;
        return this;
    }

    public final zzal zzv(@Nullable zzam zzamVar) {
        if (zzamVar != null) {
            CharSequence charSequence = zzamVar.zzb;
            if (charSequence != null) {
                this.zza = charSequence;
            }
            CharSequence charSequence2 = zzamVar.zzc;
            if (charSequence2 != null) {
                this.zzb = charSequence2;
            }
            CharSequence charSequence3 = zzamVar.zzd;
            if (charSequence3 != null) {
                this.zzc = charSequence3;
            }
            CharSequence charSequence4 = zzamVar.zze;
            if (charSequence4 != null) {
                this.zzd = charSequence4;
            }
            CharSequence charSequence5 = zzamVar.zzf;
            if (charSequence5 != null) {
                this.zze = charSequence5;
            }
            byte[] bArr = zzamVar.zzg;
            if (bArr != null) {
                Integer num = zzamVar.zzh;
                this.zzf = (byte[]) bArr.clone();
                this.zzg = num;
            }
            Integer num2 = zzamVar.zzi;
            if (num2 != null) {
                this.zzh = num2;
            }
            Integer num3 = zzamVar.zzj;
            if (num3 != null) {
                this.zzi = num3;
            }
            Integer num4 = zzamVar.zzk;
            if (num4 != null) {
                this.zzj = num4;
            }
            Boolean bool = zzamVar.zzl;
            if (bool != null) {
                this.zzk = bool;
            }
            Integer num5 = zzamVar.zzm;
            if (num5 != null) {
                this.zzl = num5;
            }
            Integer num6 = zzamVar.zzn;
            if (num6 != null) {
                this.zzl = num6;
            }
            Integer num7 = zzamVar.zzo;
            if (num7 != null) {
                this.zzm = num7;
            }
            Integer num8 = zzamVar.zzp;
            if (num8 != null) {
                this.zzn = num8;
            }
            Integer num9 = zzamVar.zzq;
            if (num9 != null) {
                this.zzo = num9;
            }
            Integer num10 = zzamVar.zzr;
            if (num10 != null) {
                this.zzp = num10;
            }
            Integer num11 = zzamVar.zzs;
            if (num11 != null) {
                this.zzq = num11;
            }
            CharSequence charSequence6 = zzamVar.zzt;
            if (charSequence6 != null) {
                this.zzr = charSequence6;
            }
            CharSequence charSequence7 = zzamVar.zzu;
            if (charSequence7 != null) {
                this.zzs = charSequence7;
            }
            CharSequence charSequence8 = zzamVar.zzv;
            if (charSequence8 != null) {
                this.zzt = charSequence8;
            }
            Integer num12 = zzamVar.zzw;
            if (num12 != null) {
                this.zzu = num12;
            }
            Integer num13 = zzamVar.zzx;
            if (num13 != null) {
                this.zzv = num13;
            }
            CharSequence charSequence9 = zzamVar.zzy;
            if (charSequence9 != null) {
                this.zzw = charSequence9;
            }
            CharSequence charSequence10 = zzamVar.zzz;
            if (charSequence10 != null) {
                this.zzx = charSequence10;
            }
            Integer num14 = zzamVar.zzA;
            if (num14 != null) {
                this.zzy = num14;
            }
            zzgjz zzgjzVar = zzamVar.zzB;
            if (!zzgjzVar.isEmpty()) {
                this.zzz = zzgjz.zzq(zzgjzVar);
            }
        }
        return this;
    }

    public final zzam zzw() {
        return new zzam(this, null);
    }

    public final /* synthetic */ CharSequence zzx() {
        return this.zza;
    }

    public final /* synthetic */ CharSequence zzy() {
        return this.zzb;
    }

    public final /* synthetic */ CharSequence zzz() {
        return this.zzc;
    }

    public zzal() {
        this.zzz = zzgjz.zzi();
    }
}
