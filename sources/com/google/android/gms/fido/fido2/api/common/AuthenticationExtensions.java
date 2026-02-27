package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "AuthenticationExtensionsCreator")
@SafeParcelable.Reserved({1})
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new zzd();

    @Nullable
    @SafeParcelable.Field(getter = "getFidoAppIdExtension", id = 2)
    private final FidoAppIdExtension zza;

    @Nullable
    @SafeParcelable.Field(getter = "getCableAuthenticationExtension", id = 3)
    private final zzp zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getUserVerificationMethodExtension", id = 4)
    private final UserVerificationMethodExtension zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getGoogleMultiAssertionExtension", id = 5)
    private final zzw zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getGoogleSessionIdExtension", id = 6)
    private final zzy zze;

    @Nullable
    @SafeParcelable.Field(getter = "getGoogleSilentVerificationExtension", id = 7)
    private final zzaa zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getDevicePublicKeyExtension", id = 8)
    private final zzr zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getGoogleTunnelServerIdExtension", id = 9)
    private final zzad zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getGoogleThirdPartyPaymentExtension", id = 10)
    private final GoogleThirdPartyPaymentExtension zzi;

    public static final class Builder {
        private FidoAppIdExtension zza;
        private UserVerificationMethodExtension zzb;
        private zzp zzc;
        private zzw zzd;
        private zzy zze;
        private zzaa zzf;
        private zzr zzg;
        private zzad zzh;
        private GoogleThirdPartyPaymentExtension zzi;

        public Builder() {
        }

        @NonNull
        public AuthenticationExtensions build() {
            return new AuthenticationExtensions(this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
        }

        @NonNull
        public Builder setFido2Extension(@Nullable FidoAppIdExtension fidoAppIdExtension) {
            this.zza = fidoAppIdExtension;
            return this;
        }

        @NonNull
        public Builder setGoogleThirdPartyPaymentExtension(@Nullable GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.zzi = googleThirdPartyPaymentExtension;
            return this;
        }

        @NonNull
        public Builder setUserVerificationMethodExtension(@Nullable UserVerificationMethodExtension userVerificationMethodExtension) {
            this.zzb = userVerificationMethodExtension;
            return this;
        }

        public Builder(@Nullable AuthenticationExtensions authenticationExtensions) {
            if (authenticationExtensions != null) {
                this.zza = authenticationExtensions.getFidoAppIdExtension();
                this.zzb = authenticationExtensions.getUserVerificationMethodExtension();
                this.zzc = authenticationExtensions.zza();
                this.zzd = authenticationExtensions.zzc();
                this.zze = authenticationExtensions.zzd();
                this.zzf = authenticationExtensions.zze();
                this.zzg = authenticationExtensions.zzb();
                this.zzh = authenticationExtensions.zzg();
                this.zzi = authenticationExtensions.zzf();
            }
        }
    }

    @SafeParcelable.Constructor
    public AuthenticationExtensions(@Nullable @SafeParcelable.Param(id = 2) FidoAppIdExtension fidoAppIdExtension, @Nullable @SafeParcelable.Param(id = 3) zzp zzpVar, @Nullable @SafeParcelable.Param(id = 4) UserVerificationMethodExtension userVerificationMethodExtension, @Nullable @SafeParcelable.Param(id = 5) zzw zzwVar, @Nullable @SafeParcelable.Param(id = 6) zzy zzyVar, @Nullable @SafeParcelable.Param(id = 7) zzaa zzaaVar, @Nullable @SafeParcelable.Param(id = 8) zzr zzrVar, @Nullable @SafeParcelable.Param(id = 9) zzad zzadVar, @Nullable @SafeParcelable.Param(id = 10) GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzpVar;
        this.zzd = zzwVar;
        this.zze = zzyVar;
        this.zzf = zzaaVar;
        this.zzg = zzrVar;
        this.zzh = zzadVar;
        this.zzi = googleThirdPartyPaymentExtension;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return Objects.equal(this.zza, authenticationExtensions.zza) && Objects.equal(this.zzb, authenticationExtensions.zzb) && Objects.equal(this.zzc, authenticationExtensions.zzc) && Objects.equal(this.zzd, authenticationExtensions.zzd) && Objects.equal(this.zze, authenticationExtensions.zze) && Objects.equal(this.zzf, authenticationExtensions.zzf) && Objects.equal(this.zzg, authenticationExtensions.zzg) && Objects.equal(this.zzh, authenticationExtensions.zzh) && Objects.equal(this.zzi, authenticationExtensions.zzi);
    }

    @Nullable
    public FidoAppIdExtension getFidoAppIdExtension() {
        return this.zza;
    }

    @Nullable
    public UserVerificationMethodExtension getUserVerificationMethodExtension() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getFidoAppIdExtension(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getUserVerificationMethodExtension(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    public final zzp zza() {
        return this.zzb;
    }

    @Nullable
    public final zzr zzb() {
        return this.zzg;
    }

    @Nullable
    public final zzw zzc() {
        return this.zzd;
    }

    @Nullable
    public final zzy zzd() {
        return this.zze;
    }

    @Nullable
    public final zzaa zze() {
        return this.zzf;
    }

    @Nullable
    public final GoogleThirdPartyPaymentExtension zzf() {
        return this.zzi;
    }

    @Nullable
    public final zzad zzg() {
        return this.zzh;
    }
}
