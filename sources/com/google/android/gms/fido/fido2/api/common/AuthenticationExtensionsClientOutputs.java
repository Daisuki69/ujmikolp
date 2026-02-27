package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "AuthenticationExtensionsClientOutputsCreator")
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new zzc();

    @Nullable
    @SafeParcelable.Field(getter = "getUvmEntries", id = 1)
    private final UvmEntries zza;

    @Nullable
    @SafeParcelable.Field(getter = "getDevicePubKey", id = 2)
    private final zze zzb;

    public static final class Builder {
        private UvmEntries zza;

        @NonNull
        public AuthenticationExtensionsClientOutputs build() {
            return new AuthenticationExtensionsClientOutputs(this.zza, null);
        }

        @NonNull
        public Builder setUserVerificationMethodEntries(@Nullable UvmEntries uvmEntries) {
            this.zza = uvmEntries;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public AuthenticationExtensionsClientOutputs(@Nullable @SafeParcelable.Param(id = 1) UvmEntries uvmEntries, @Nullable @SafeParcelable.Param(id = 2) zze zzeVar) {
        this.zza = uvmEntries;
        this.zzb = zzeVar;
    }

    @NonNull
    public static AuthenticationExtensionsClientOutputs deserializeFromBytes(@Nullable byte[] bArr) {
        return (AuthenticationExtensionsClientOutputs) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return Objects.equal(this.zza, authenticationExtensionsClientOutputs.zza) && Objects.equal(this.zzb, authenticationExtensionsClientOutputs.zzb);
    }

    @NonNull
    public UvmEntries getUvmEntries() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUvmEntries(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
