package com.google.android.gms.common.api;

import We.s;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ComplianceOptionsCreator")
public final class ComplianceOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;

    @NonNull
    public static final ComplianceOptions zza;

    @SafeParcelable.Field(getter = "getCallerProductId", id = 1)
    private final int zzb;

    @SafeParcelable.Field(getter = "getDataOwnerProductId", id = 2)
    private final int zzc;

    @SafeParcelable.Field(getter = "getProcessingReason", id = 3)
    private final int zzd;

    @SafeParcelable.Field(defaultValue = "true", getter = "isUserData", id = 4)
    private final boolean zze;

    @KeepForSdk
    public static final class Builder {
        private int zza = -1;
        private int zzb = -1;
        private int zzc = 0;
        private boolean zzd = true;

        @NonNull
        @KeepForSdk
        public ComplianceOptions build() {
            return new ComplianceOptions(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @NonNull
        @KeepForSdk
        public Builder setCallerProductId(int i) {
            this.zza = i;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setDataOwnerProductId(int i) {
            this.zzb = i;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setIsUserData(boolean z4) {
            this.zzd = z4;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setProcessingReason(int i) {
            this.zzc = i;
            return this;
        }
    }

    static {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setCallerProductId(-1);
        builderNewBuilder.setDataOwnerProductId(-1);
        builderNewBuilder.setProcessingReason(0);
        builderNewBuilder.setIsUserData(true);
        zza = builderNewBuilder.build();
        CREATOR = new zzc();
    }

    @SafeParcelable.Constructor
    public ComplianceOptions(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i4, @SafeParcelable.Param(id = 3) int i6, @SafeParcelable.Param(id = 4) boolean z4) {
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i6;
        this.zze = z4;
    }

    @NonNull
    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.zzb == complianceOptions.zzb && this.zzc == complianceOptions.zzc && this.zzd == complianceOptions.zzd && this.zze == complianceOptions.zze;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze));
    }

    @NonNull
    @KeepForSdk
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setCallerProductId(this.zzb);
        builder.setDataOwnerProductId(this.zzc);
        builder.setProcessingReason(this.zzd);
        builder.setIsUserData(this.zze);
        return builder;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComplianceOptions{callerProductId=");
        sb2.append(this.zzb);
        sb2.append(", dataOwnerProductId=");
        sb2.append(this.zzc);
        sb2.append(", processingReason=");
        sb2.append(this.zzd);
        sb2.append(", isUserData=");
        return s.s(sb2, this.zze, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int i4 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i4);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    @KeepForSdk
    public static final Builder newBuilder(@NonNull Context context) {
        return newBuilder();
    }
}
