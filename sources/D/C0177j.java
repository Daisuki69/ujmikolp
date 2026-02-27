package D;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: renamed from: D.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0177j implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f924a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f924a) {
            case 0:
                CTInboxStyleConfig cTInboxStyleConfig = new CTInboxStyleConfig();
                cTInboxStyleConfig.f9435d = parcel.readString();
                cTInboxStyleConfig.e = parcel.readString();
                cTInboxStyleConfig.f = parcel.readString();
                cTInboxStyleConfig.c = parcel.readString();
                cTInboxStyleConfig.f9438l = parcel.createStringArray();
                cTInboxStyleConfig.f9433a = parcel.readString();
                cTInboxStyleConfig.i = parcel.readString();
                cTInboxStyleConfig.m = parcel.readString();
                cTInboxStyleConfig.j = parcel.readString();
                cTInboxStyleConfig.f9437k = parcel.readString();
                cTInboxStyleConfig.f9436g = parcel.readString();
                cTInboxStyleConfig.h = parcel.readString();
                cTInboxStyleConfig.f9434b = parcel.readString();
                return cTInboxStyleConfig;
            default:
                return new CleverTapInstanceConfig(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f924a) {
            case 0:
                return new CTInboxStyleConfig[i];
            default:
                return new CleverTapInstanceConfig[i];
        }
    }
}
