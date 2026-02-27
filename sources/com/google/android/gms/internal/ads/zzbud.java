package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzbud extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbud> CREATOR = new zzbue();

    @SafeParcelable.Field(id = 2)
    public final boolean zza;

    @Nullable
    @SafeParcelable.Field(id = 3)
    public final List zzb;

    public zzbud() {
        this(false, Collections.EMPTY_LIST);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z4 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, z4);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbud(@SafeParcelable.Param(id = 2) boolean z4, @SafeParcelable.Param(id = 3) List list) {
        this.zza = z4;
        this.zzb = list;
    }
}
