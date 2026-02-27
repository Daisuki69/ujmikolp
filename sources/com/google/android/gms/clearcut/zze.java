package com.google.android.gms.clearcut;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "LogEventParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    public final zzha zzaa;

    @SafeParcelable.Field(id = 2)
    public zzr zzag;

    @SafeParcelable.Field(id = 3)
    public byte[] zzah;

    @SafeParcelable.Field(id = 4)
    private int[] zzai;

    @SafeParcelable.Field(id = 5)
    private String[] zzaj;

    @SafeParcelable.Field(id = 6)
    private int[] zzak;

    @SafeParcelable.Field(id = 7)
    private byte[][] zzal;

    @SafeParcelable.Field(id = 9)
    private ExperimentTokens[] zzam;
    public final ClearcutLogger.zzb zzan;
    public final ClearcutLogger.zzb zzt;

    @SafeParcelable.Field(defaultValue = "true", id = 8)
    private boolean zzz;

    public zze(zzr zzrVar, zzha zzhaVar, ClearcutLogger.zzb zzbVar, ClearcutLogger.zzb zzbVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, ExperimentTokens[] experimentTokensArr, boolean z4) {
        this.zzag = zzrVar;
        this.zzaa = zzhaVar;
        this.zzt = zzbVar;
        this.zzan = null;
        this.zzai = iArr;
        this.zzaj = null;
        this.zzak = iArr2;
        this.zzal = null;
        this.zzam = null;
        this.zzz = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (Objects.equal(this.zzag, zzeVar.zzag) && Arrays.equals(this.zzah, zzeVar.zzah) && Arrays.equals(this.zzai, zzeVar.zzai) && Arrays.equals(this.zzaj, zzeVar.zzaj) && Objects.equal(this.zzaa, zzeVar.zzaa) && Objects.equal(this.zzt, zzeVar.zzt) && Objects.equal(this.zzan, zzeVar.zzan) && Arrays.equals(this.zzak, zzeVar.zzak) && Arrays.deepEquals(this.zzal, zzeVar.zzal) && Arrays.equals(this.zzam, zzeVar.zzam) && this.zzz == zzeVar.zzz) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzag, this.zzah, this.zzai, this.zzaj, this.zzaa, this.zzt, this.zzan, this.zzak, this.zzal, this.zzam, Boolean.valueOf(this.zzz));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogEventParcelable[");
        sb2.append(this.zzag);
        sb2.append(", LogEventBytes: ");
        byte[] bArr = this.zzah;
        sb2.append(bArr == null ? null : new String(bArr));
        sb2.append(", TestCodes: ");
        sb2.append(Arrays.toString(this.zzai));
        sb2.append(", MendelPackages: ");
        sb2.append(Arrays.toString(this.zzaj));
        sb2.append(", LogEvent: ");
        sb2.append(this.zzaa);
        sb2.append(", ExtensionProducer: ");
        sb2.append(this.zzt);
        sb2.append(", VeProducer: ");
        sb2.append(this.zzan);
        sb2.append(", ExperimentIDs: ");
        sb2.append(Arrays.toString(this.zzak));
        sb2.append(", ExperimentTokens: ");
        sb2.append(Arrays.toString(this.zzal));
        sb2.append(", ExperimentTokensParcelables: ");
        sb2.append(Arrays.toString(this.zzam));
        sb2.append(", AddPhenotypeExperimentTokens: ");
        return s.s(sb2, this.zzz, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzag, i, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzah, false);
        SafeParcelWriter.writeIntArray(parcel, 4, this.zzai, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.zzaj, false);
        SafeParcelWriter.writeIntArray(parcel, 6, this.zzak, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.zzal, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzz);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.zzam, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 2) zzr zzrVar, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) int[] iArr, @SafeParcelable.Param(id = 5) String[] strArr, @SafeParcelable.Param(id = 6) int[] iArr2, @SafeParcelable.Param(id = 7) byte[][] bArr2, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) ExperimentTokens[] experimentTokensArr) {
        this.zzag = zzrVar;
        this.zzah = bArr;
        this.zzai = iArr;
        this.zzaj = strArr;
        this.zzaa = null;
        this.zzt = null;
        this.zzan = null;
        this.zzak = iArr2;
        this.zzal = bArr2;
        this.zzam = experimentTokensArr;
        this.zzz = z4;
    }
}
