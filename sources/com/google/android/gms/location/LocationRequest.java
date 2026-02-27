package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.AbstractC1173g;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbo();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", id = 1)
    int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", id = 2)
    long zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", id = 3)
    long zzc;

    @SafeParcelable.Field(defaultValue = "false", id = 4)
    boolean zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", id = 5)
    long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", id = 6)
    int zzf;

    @SafeParcelable.Field(defaultValue = "0", id = 7)
    float zzg;

    @SafeParcelable.Field(defaultValue = "0", id = 8)
    long zzh;

    @SafeParcelable.Field(defaultValue = "false", id = 9)
    boolean zzi;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, false, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, 0L, false);
    }

    @NonNull
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, 600000L, false, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, 0L, true);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && this.zzb == locationRequest.zzb && this.zzc == locationRequest.zzc && this.zzd == locationRequest.zzd && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.zzi == locationRequest.zzi) {
                return true;
            }
        }
        return false;
    }

    public long getExpirationTime() {
        return this.zze;
    }

    public long getFastestInterval() {
        return this.zzc;
    }

    public long getInterval() {
        return this.zzb;
    }

    public long getMaxWaitTime() {
        long j = this.zzh;
        long j6 = this.zzb;
        return j < j6 ? j6 : j;
    }

    public int getNumUpdates() {
        return this.zzf;
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzg), Long.valueOf(this.zzh));
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.zzd;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzi;
    }

    @NonNull
    public LocationRequest setExpirationDuration(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j6 = j <= Long.MAX_VALUE - jElapsedRealtime ? j + jElapsedRealtime : Long.MAX_VALUE;
        this.zze = j6;
        if (j6 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setExpirationTime(long j) {
        this.zze = j;
        if (j < 0) {
            this.zze = 0L;
        }
        return this;
    }

    @NonNull
    public LocationRequest setFastestInterval(long j) {
        Preconditions.checkArgument(j >= 0, "illegal fastest interval: %d", Long.valueOf(j));
        this.zzd = true;
        this.zzc = j;
        return this;
    }

    @NonNull
    public LocationRequest setInterval(long j) {
        Preconditions.checkArgument(j >= 0, "illegal interval: %d", Long.valueOf(j));
        this.zzb = j;
        if (!this.zzd) {
            this.zzc = (long) (j / 6.0d);
        }
        return this;
    }

    @NonNull
    public LocationRequest setMaxWaitTime(long j) {
        Preconditions.checkArgument(j >= 0, "illegal max wait time: %d", Long.valueOf(j));
        this.zzh = j;
        return this;
    }

    @NonNull
    public LocationRequest setNumUpdates(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC1173g.q(31, i, "invalid numUpdates: "));
        }
        this.zzf = i;
        return this;
    }

    @NonNull
    public LocationRequest setPriority(int i) {
        boolean z4;
        if (i == 100 || i == 102 || i == 104) {
            z4 = true;
        } else if (i == 105) {
            i = 105;
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.checkArgument(z4, "illegal priority: %d", Integer.valueOf(i));
        this.zza = i;
        return this;
    }

    @NonNull
    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.zzg = f;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("invalid displacement: ");
        sb2.append(f);
        throw new IllegalArgumentException(sb2.toString());
    }

    @NonNull
    public LocationRequest setWaitForAccurateLocation(boolean z4) {
        this.zzi = z4;
        return this;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request[");
        int i = this.zza;
        sb2.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.zza != 105) {
            sb2.append(" requested=");
            sb2.append(this.zzb);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.zzc);
        sb2.append("ms");
        if (this.zzh > this.zzb) {
            sb2.append(" maxWait=");
            sb2.append(this.zzh);
            sb2.append("ms");
        }
        if (this.zzg > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.zzg);
            sb2.append("m");
        }
        long j = this.zze;
        if (j != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.zzf);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) long j6, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) long j7, @SafeParcelable.Param(id = 6) int i4, @SafeParcelable.Param(id = 7) float f, @SafeParcelable.Param(id = 8) long j9, @SafeParcelable.Param(id = 9) boolean z5) {
        this.zza = i;
        this.zzb = j;
        this.zzc = j6;
        this.zzd = z4;
        this.zze = j7;
        this.zzf = i4;
        this.zzg = f;
        this.zzh = j9;
        this.zzi = z5;
    }
}
