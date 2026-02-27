package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdn {
    private final zzks zza;
    private final Boolean zzb;
    private final zzkh zzc = null;
    private final zzkd zzd;
    private final Integer zze;
    private final Integer zzf;

    public /* synthetic */ zzdn(zzdl zzdlVar, zzdm zzdmVar) {
        this.zza = zzdlVar.zza;
        this.zzb = zzdlVar.zzb;
        this.zzd = zzdlVar.zzc;
        this.zze = zzdlVar.zzd;
        this.zzf = zzdlVar.zze;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdn)) {
            return false;
        }
        zzdn zzdnVar = (zzdn) obj;
        return Objects.equal(this.zza, zzdnVar.zza) && Objects.equal(this.zzb, zzdnVar.zzb) && Objects.equal(null, null) && Objects.equal(this.zzd, zzdnVar.zzd) && Objects.equal(this.zze, zzdnVar.zze) && Objects.equal(this.zzf, zzdnVar.zzf);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, null, this.zzd, this.zze, this.zzf);
    }

    @Nullable
    @zzcu(zza = 4)
    public final zzkd zza() {
        return this.zzd;
    }

    @Nullable
    @zzcu(zza = 1)
    public final zzks zzb() {
        return this.zza;
    }

    @Nullable
    @zzcu(zza = 2)
    public final Boolean zzc() {
        return this.zzb;
    }

    @Nullable
    @zzcu(zza = 5)
    public final Integer zzd() {
        return this.zze;
    }

    @Nullable
    @zzcu(zza = 6)
    public final Integer zze() {
        return this.zzf;
    }
}
