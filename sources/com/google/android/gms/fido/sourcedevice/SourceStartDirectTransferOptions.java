package com.google.android.gms.fido.sourcedevice;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "SourceStartDirectTransferOptionsCreator")
public class SourceStartDirectTransferOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final int CALLER_TYPE_BROWSER = 2;
    public static final int CALLER_TYPE_UNKNOWN = 0;

    @NonNull
    public static final Parcelable.Creator<SourceStartDirectTransferOptions> CREATOR = new zzb();

    @SafeParcelable.Field(defaultValueUnchecked = "SourceStartDirectTransferOptions.CALLER_TYPE_UNKNOWN", getter = "getCallerType", id = 1)
    private int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "false", getter = "getIsUserPresenceVerified", id = 2)
    private boolean zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getAccountListForAuthentication", id = 3)
    private List zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "false", getter = "getIsUserVerified", id = 4)
    private boolean zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getUserVerificationOrigin", id = 5)
    private String zze;

    public SourceStartDirectTransferOptions(int i) {
        this.zza = i;
        this.zzb = false;
        this.zzd = false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public SourceStartDirectTransferOptions(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) boolean z4, @NonNull @SafeParcelable.Param(id = 3) List list, @SafeParcelable.Param(id = 4) boolean z5, @NonNull @SafeParcelable.Param(id = 5) String str) {
        this.zza = i;
        this.zzb = z4;
        this.zzc = list;
        this.zzd = z5;
        this.zze = str;
    }
}
