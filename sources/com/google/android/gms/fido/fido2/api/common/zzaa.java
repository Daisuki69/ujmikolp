package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "GoogleSilentVerificationExtensionCreator")
public final class zzaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();

    @NonNull
    @SafeParcelable.Field(getter = "getSilentVerification", id = 1)
    private final boolean zza;

    @SafeParcelable.Constructor
    public zzaa(@NonNull @SafeParcelable.Param(id = 1) boolean z4) {
        this.zza = ((Boolean) Preconditions.checkNotNull(Boolean.valueOf(z4))).booleanValue();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof zzaa) && this.zza == ((zzaa) obj).zza;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
