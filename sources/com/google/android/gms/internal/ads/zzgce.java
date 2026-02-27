package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
final class zzgce implements zzgbx {
    private final Context zza;
    private final zzhpr zzb;
    private final zzgcg zzc;
    private final zzgea zzd;
    private final ExecutorService zze;
    private final zzgbm zzf;
    private final zzfoh zzg;

    public zzgce(Context context, zzhpr zzhprVar, zzgcg zzgcgVar, zzgea zzgeaVar, ExecutorService executorService, zzgbm zzgbmVar, zzfoh zzfohVar) {
        this.zza = context;
        this.zzb = zzhprVar;
        this.zzc = zzgcgVar;
        this.zzd = zzgeaVar;
        this.zze = executorService;
        this.zzf = zzgbmVar;
        this.zzg = zzfohVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfwk zzf(int i) {
        zzfwj zzfwjVarZzd = zzfwk.zzd();
        zzfwjVarZzd.zzd(i);
        return (zzfwk) zzfwjVarZzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final S1.y zza() {
        final zzhpr zzhprVar = this.zzb;
        Objects.requireNonNull(zzhprVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgbz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzhprVar.zzb();
            }
        };
        ExecutorService executorService = this.zze;
        zzgol zzgolVar = (zzgol) zzgot.zzg((zzgol) zzgot.zzk((zzgol) zzgot.zzj((zzgol) zzgot.zzk(zzgol.zzw(zzgot.zzd(callable, executorService)), new zzggr() { // from class: com.google.android.gms.internal.ads.zzgcd
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzb((zzaxq) obj);
                return new Integer(0);
            }
        }, zzgpk.zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzgca
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ S1.y zza(Object obj) {
                return this.zza.zzc((Integer) obj);
            }
        }, zzgpk.zza()), new zzggr() { // from class: com.google.android.gms.internal.ads.zzgcb
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((zzfwm) obj);
            }
        }, executorService), zzgby.class, zzgcc.zza, zzgpk.zza());
        this.zzd.zze(15202, zzgolVar);
        return zzgolVar;
    }

    public final /* synthetic */ int zzb(zzaxq zzaxqVar) {
        if (zzfpe.zza(zzaxqVar)) {
            return 0;
        }
        this.zzd.zzc(15204, zzaxqVar.name());
        throw new zzgby(null);
    }

    public final /* synthetic */ S1.y zzc(Integer num) {
        return this.zzc.zza();
    }

    public final /* synthetic */ zzfwk zzd(zzfwm zzfwmVar) {
        String strZza = zzfwmVar.zza().zza();
        String strZzb = zzfwmVar.zza().zzb();
        zzgdy zzgdyVarZza = this.zzd.zza(15203);
        try {
            zzgdyVarZza.zza();
            zzfpv zzfpvVarZza = zzfoq.zza(this.zza, 1, (zzaxq) this.zzb.zzb(), strZza, strZzb, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, this.zzg);
            zzgdyVarZza.zzc();
            int i = 2;
            if (zzfpvVarZza.zzc == 2) {
                this.zzd.zzb(15208);
                return zzf(4);
            }
            byte[] bArr = zzfpvVarZza.zzb;
            if (bArr == null || bArr.length == 0) {
                this.zzd.zzb(5010);
                return zzf(8);
            }
            try {
                zzaxs zzaxsVarZze = zzaxs.zze(bArr, zzhhr.zzb());
                if (zzaxsVarZze.zza().zza().isEmpty() || zzaxsVarZze.zza().zzb().isEmpty() || zzaxsVarZze.zzc().zzv().length == 0) {
                    this.zzd.zzb(15207);
                } else {
                    if (zzfwmVar.equals(zzfwm.zzd()) || !TextUtils.equals(zzfwmVar.zza().zza(), zzaxsVarZze.zza().zza()) || !TextUtils.equals(zzfwmVar.zza().zzb(), zzaxsVarZze.zza().zzb())) {
                        int i4 = zzfpvVarZza.zzc;
                        if (i4 == 4) {
                            if (!this.zzf.zza(zzaxsVarZze.zzb().zzv())) {
                                this.zzd.zzb(15206);
                                return zzf(12);
                            }
                            i4 = 4;
                        }
                        zzfwj zzfwjVarZzd = zzfwk.zzd();
                        if (i4 == 2) {
                            i = 4;
                        } else if (i4 != 3) {
                            i = i4 != 4 ? i4 != 6 ? 1 : 5 : 3;
                        }
                        zzfwjVarZzd.zzd(i);
                        zzfwl zzfwlVarZzc = zzfwm.zzc();
                        zzfwlVarZzc.zza(zzaxsVarZze.zza());
                        zzfwlVarZzc.zzb((zzaxq) this.zzb.zzb());
                        zzfwjVarZzd.zza((zzfwm) zzfwlVarZzc.zzbu());
                        zzfwjVarZzd.zzc(zzaxsVarZze.zzb());
                        zzfwjVarZzd.zzb(zzaxsVarZze.zzc());
                        return (zzfwk) zzfwjVarZzd.zzbu();
                    }
                    this.zzd.zzb(15209);
                }
                return zzf(11);
            } catch (zzhiw e) {
                this.zzd.zzd(15205, e);
                return zzf(9);
            } catch (NullPointerException unused) {
                this.zzd.zzb(15210);
                return zzf(10);
            }
        } catch (Throwable th2) {
            try {
                zzgdyVarZza.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                zzgdyVarZza.zzc();
                throw th3;
            }
        }
    }
}
