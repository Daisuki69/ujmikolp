package com.google.android.gms.internal.clearcut;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.clearcut.zzge;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "PlayLoggerContextCreator")
@SafeParcelable.Reserved({1})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    @SafeParcelable.Field(id = 2)
    private final String packageName;

    @SafeParcelable.Field(defaultValue = "true", id = 7)
    private final boolean zzay;

    @SafeParcelable.Field(id = 10)
    private final int zzaz;

    @SafeParcelable.Field(id = 3)
    private final int zzi;

    @SafeParcelable.Field(id = 8)
    public final String zzj;

    @SafeParcelable.Field(id = 4)
    public final int zzk;

    @SafeParcelable.Field(id = 5)
    private final String zzl;

    @SafeParcelable.Field(id = 6)
    private final String zzm;

    @SafeParcelable.Field(id = 9)
    private final boolean zzn;

    public zzr(String str, int i, int i4, String str2, String str3, String str4, boolean z4, zzge.zzv.zzb zzbVar) {
        this.packageName = (String) Preconditions.checkNotNull(str);
        this.zzi = i;
        this.zzk = i4;
        this.zzj = str2;
        this.zzl = str3;
        this.zzm = str4;
        this.zzay = !z4;
        this.zzn = z4;
        this.zzaz = zzbVar.zzc();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzrVar = (zzr) obj;
            if (Objects.equal(this.packageName, zzrVar.packageName) && this.zzi == zzrVar.zzi && this.zzk == zzrVar.zzk && Objects.equal(this.zzj, zzrVar.zzj) && Objects.equal(this.zzl, zzrVar.zzl) && Objects.equal(this.zzm, zzrVar.zzm) && this.zzay == zzrVar.zzay && this.zzn == zzrVar.zzn && this.zzaz == zzrVar.zzaz) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.packageName, Integer.valueOf(this.zzi), Integer.valueOf(this.zzk), this.zzj, this.zzl, this.zzm, Boolean.valueOf(this.zzay), Boolean.valueOf(this.zzn), Integer.valueOf(this.zzaz));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayLoggerContext[package=");
        sb2.append(this.packageName);
        sb2.append(",packageVersionCode=");
        sb2.append(this.zzi);
        sb2.append(",logSource=");
        sb2.append(this.zzk);
        sb2.append(",logSourceName=");
        sb2.append(this.zzj);
        sb2.append(",uploadAccount=");
        sb2.append(this.zzl);
        sb2.append(",loggingId=");
        sb2.append(this.zzm);
        sb2.append(",logAndroidId=");
        sb2.append(this.zzay);
        sb2.append(",isAnonymous=");
        sb2.append(this.zzn);
        sb2.append(",qosTier=");
        return s.o(sb2, "]", this.zzaz);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzi);
        SafeParcelWriter.writeInt(parcel, 4, this.zzk);
        SafeParcelWriter.writeString(parcel, 5, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzm, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzay);
        SafeParcelWriter.writeString(parcel, 8, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzn);
        SafeParcelWriter.writeInt(parcel, 10, this.zzaz);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) boolean z4, @SafeParcelable.Param(id = 8) String str4, @SafeParcelable.Param(id = 9) boolean z5, @SafeParcelable.Param(id = 10) int i6) {
        this.packageName = str;
        this.zzi = i;
        this.zzk = i4;
        this.zzl = str2;
        this.zzm = str3;
        this.zzay = z4;
        this.zzj = str4;
        this.zzn = z5;
        this.zzaz = i6;
    }
}
