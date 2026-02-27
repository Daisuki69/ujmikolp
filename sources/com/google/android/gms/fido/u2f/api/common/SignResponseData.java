package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.fido.zzap;
import com.google.android.gms.internal.fido.zzaq;
import com.google.android.gms.internal.fido.zzbl;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "SignResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public class SignResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<SignResponseData> CREATOR = new zzl();

    @NonNull
    @VisibleForTesting
    public static final String JSON_RESPONSE_DATA_CLIENT_DATA = "clientData";

    @NonNull
    @VisibleForTesting
    public static final String JSON_RESPONSE_DATA_KEY_HANDLE = "keyHandle";

    @NonNull
    @VisibleForTesting
    public static final String JSON_RESPONSE_DATA_SIGNATURE_DATA = "signatureData";

    @SafeParcelable.Field(getter = "getKeyHandle", id = 2)
    private final byte[] zza;

    @SafeParcelable.Field(getter = "getClientDataString", id = 3)
    private final String zzb;

    @SafeParcelable.Field(getter = "getSignatureData", id = 4)
    private final byte[] zzc;

    @SafeParcelable.Field(getter = "getApplication", id = 5)
    private final byte[] zzd;

    @Deprecated
    public SignResponseData(@NonNull byte[] bArr, @NonNull String str, @NonNull byte[] bArr2) {
        this(bArr, str, bArr2, new byte[0]);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.zza, signResponseData.zza) && Objects.equal(this.zzb, signResponseData.zzb) && Arrays.equals(this.zzc, signResponseData.zzc) && Arrays.equals(this.zzd, signResponseData.zzd);
    }

    @NonNull
    public String getClientDataString() {
        return this.zzb;
    }

    @NonNull
    public byte[] getKeyHandle() {
        return this.zza;
    }

    @NonNull
    public byte[] getSignatureData() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd)));
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    @NonNull
    public JSONObject toJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_RESPONSE_DATA_KEY_HANDLE, Base64.encodeToString(this.zza, 11));
            jSONObject.put(JSON_RESPONSE_DATA_CLIENT_DATA, Base64.encodeToString(this.zzb.getBytes(), 11));
            jSONObject.put(JSON_RESPONSE_DATA_SIGNATURE_DATA, Base64.encodeToString(this.zzc, 11));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public String toString() {
        zzap zzapVarZza = zzaq.zza(this);
        zzbl zzblVarZzd = zzbl.zzd();
        byte[] bArr = this.zza;
        zzapVarZza.zzb(JSON_RESPONSE_DATA_KEY_HANDLE, zzblVarZzd.zze(bArr, 0, bArr.length));
        zzapVarZza.zzb("clientDataString", this.zzb);
        zzbl zzblVarZzd2 = zzbl.zzd();
        byte[] bArr2 = this.zzc;
        zzapVarZza.zzb(JSON_RESPONSE_DATA_SIGNATURE_DATA, zzblVarZzd2.zze(bArr2, 0, bArr2.length));
        zzbl zzblVarZzd3 = zzbl.zzd();
        byte[] bArr3 = this.zzd;
        zzapVarZza.zzb(MimeTypes.BASE_TYPE_APPLICATION, zzblVarZzd3.zze(bArr3, 0, bArr3.length));
        return zzapVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeString(parcel, 3, getClientDataString(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getSignatureData(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public SignResponseData(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) String str, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr2, @NonNull @SafeParcelable.Param(id = 5) byte[] bArr3) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr2);
        this.zzd = (byte[]) Preconditions.checkNotNull(bArr3);
    }
}
