package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmp {
    private final zzmm zza;
    private final zzmk zzb;
    private final zzmn zzc;
    private final zzml zzd;
    private final Boolean zze;
    private final Float zzf;

    public /* synthetic */ zzmp(zzmj zzmjVar, zzmo zzmoVar) {
        this.zza = zzmjVar.zza;
        this.zzb = zzmjVar.zzb;
        this.zzc = zzmjVar.zzc;
        this.zzd = zzmjVar.zzd;
        this.zze = zzmjVar.zze;
        this.zzf = zzmjVar.zzf;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzmp)) {
            return false;
        }
        zzmp zzmpVar = (zzmp) obj;
        return Objects.equal(this.zza, zzmpVar.zza) && Objects.equal(this.zzb, zzmpVar.zzb) && Objects.equal(this.zzc, zzmpVar.zzc) && Objects.equal(this.zzd, zzmpVar.zzd) && Objects.equal(this.zze, zzmpVar.zze) && Objects.equal(this.zzf, zzmpVar.zzf);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    @Nullable
    @zzbm(zza = 2)
    public final zzmk zza() {
        return this.zzb;
    }

    @Nullable
    @zzbm(zza = 4)
    public final zzml zzb() {
        return this.zzd;
    }

    @Nullable
    @zzbm(zza = 1)
    public final zzmm zzc() {
        return this.zza;
    }

    @Nullable
    @zzbm(zza = 3)
    public final zzmn zzd() {
        return this.zzc;
    }

    @Nullable
    @zzbm(zza = 5)
    public final Boolean zze() {
        return this.zze;
    }

    @Nullable
    @zzbm(zza = 6)
    public final Float zzf() {
        return this.zzf;
    }
}
