package com.google.android.gms.phenotype;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.media3.datasource.cache.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.AbstractC1173g;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "FlagCreator")
@SafeParcelable.Reserved({1})
public final class zzi extends AbstractSafeParcelable implements Comparable<zzi> {
    public static final Parcelable.Creator<zzi> CREATOR = new zzk();
    private static final Comparator<zzi> zzai = new zzj();

    @SafeParcelable.Field(id = 2)
    public final String name;

    @SafeParcelable.Field(id = 3)
    private final long zzab;

    @SafeParcelable.Field(id = 4)
    private final boolean zzac;

    @SafeParcelable.Field(id = 5)
    private final double zzad;

    @SafeParcelable.Field(id = 6)
    private final String zzae;

    @SafeParcelable.Field(id = 7)
    private final byte[] zzaf;

    @SafeParcelable.Field(id = 8)
    private final int zzag;

    @SafeParcelable.Field(id = 9)
    public final int zzah;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) double d10, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) byte[] bArr, @SafeParcelable.Param(id = 8) int i, @SafeParcelable.Param(id = 9) int i4) {
        this.name = str;
        this.zzab = j;
        this.zzac = z4;
        this.zzad = d10;
        this.zzae = str2;
        this.zzaf = bArr;
        this.zzag = i;
        this.zzah = i4;
    }

    private static int compare(int i, int i4) {
        if (i < i4) {
            return -1;
        }
        return i == i4 ? 0 : 1;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzi zziVar) {
        zzi zziVar2 = zziVar;
        int iCompareTo = this.name.compareTo(zziVar2.name);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompare = compare(this.zzag, zziVar2.zzag);
        if (iCompare != 0) {
            return iCompare;
        }
        int i = this.zzag;
        if (i == 1) {
            long j = this.zzab;
            long j6 = zziVar2.zzab;
            if (j < j6) {
                return -1;
            }
            return j == j6 ? 0 : 1;
        }
        if (i == 2) {
            boolean z4 = this.zzac;
            if (z4 == zziVar2.zzac) {
                return 0;
            }
            return z4 ? 1 : -1;
        }
        if (i == 3) {
            return Double.compare(this.zzad, zziVar2.zzad);
        }
        if (i == 4) {
            String str = this.zzae;
            String str2 = zziVar2.zzae;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (i != 5) {
            throw new AssertionError(AbstractC1173g.q(31, this.zzag, "Invalid enum value: "));
        }
        byte[] bArr = this.zzaf;
        byte[] bArr2 = zziVar2.zzaf;
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i4 = 0; i4 < Math.min(this.zzaf.length, zziVar2.zzaf.length); i4++) {
            int i6 = this.zzaf[i4] - zziVar2.zzaf[i4];
            if (i6 != 0) {
                return i6;
            }
        }
        return compare(this.zzaf.length, zziVar2.zzaf.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof zzi) {
            zzi zziVar = (zzi) obj;
            if (zzn.equals(this.name, zziVar.name) && (i = this.zzag) == zziVar.zzag && this.zzah == zziVar.zzah) {
                if (i != 1) {
                    if (i == 2) {
                        return this.zzac == zziVar.zzac;
                    }
                    if (i == 3) {
                        return this.zzad == zziVar.zzad;
                    }
                    if (i == 4) {
                        return zzn.equals(this.zzae, zziVar.zzae);
                    }
                    if (i == 5) {
                        return Arrays.equals(this.zzaf, zziVar.zzaf);
                    }
                    throw new AssertionError(AbstractC1173g.q(31, this.zzag, "Invalid enum value: "));
                }
                if (this.zzab == zziVar.zzab) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Flag(");
        sb2.append(this.name);
        sb2.append(", ");
        int i = this.zzag;
        if (i == 1) {
            sb2.append(this.zzab);
        } else if (i == 2) {
            sb2.append(this.zzac);
        } else if (i == 3) {
            sb2.append(this.zzad);
        } else if (i == 4) {
            sb2.append("'");
            sb2.append(this.zzae);
            sb2.append("'");
        } else {
            if (i != 5) {
                String str = this.name;
                int i4 = this.zzag;
                StringBuilder sb3 = new StringBuilder(c.c(27, str));
                sb3.append("Invalid type: ");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(i4);
                throw new AssertionError(sb3.toString());
            }
            if (this.zzaf == null) {
                sb2.append("null");
            } else {
                sb2.append("'");
                sb2.append(Base64.encodeToString(this.zzaf, 3));
                sb2.append("'");
            }
        }
        sb2.append(", ");
        sb2.append(this.zzag);
        sb2.append(", ");
        return s.o(sb2, ")", this.zzah);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzab);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzac);
        SafeParcelWriter.writeDouble(parcel, 5, this.zzad);
        SafeParcelWriter.writeString(parcel, 6, this.zzae, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zzaf, false);
        SafeParcelWriter.writeInt(parcel, 8, this.zzag);
        SafeParcelWriter.writeInt(parcel, 9, this.zzah);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
