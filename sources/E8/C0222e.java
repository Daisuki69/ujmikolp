package E8;

import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.mayaui.kyczoloz.utils.ComplianceRequest;
import com.paymaya.mayaui.kyczoloz.utils.DosriDetails;
import com.paymaya.mayaui.kyczoloz.utils.FatcaDetails;
import com.paymaya.mayaui.kyczoloz.utils.Name;
import com.paymaya.mayaui.kyczoloz.utils.RelatedTo;
import java.util.ArrayList;

/* JADX INFO: renamed from: E8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0222e implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1281a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Boolean boolValueOf;
        switch (this.f1281a) {
            case 0:
                kotlin.jvm.internal.j.g(parcel, "parcel");
                return new ComplianceRequest(parcel.readInt() == 0 ? null : DosriDetails.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FatcaDetails.CREATOR.createFromParcel(parcel) : null);
            case 1:
                kotlin.jvm.internal.j.g(parcel, "parcel");
                int I4 = 0;
                boolean z4 = parcel.readInt() != 0;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    while (I4 != i) {
                        I4 = AbstractC1213b.I(RelatedTo.CREATOR, parcel, arrayList2, I4, 1);
                    }
                    arrayList = arrayList2;
                }
                return new DosriDetails(z4, string, arrayList, parcel.readString());
            case 2:
                kotlin.jvm.internal.j.g(parcel, "parcel");
                return new FatcaDetails(parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readString());
            case 3:
                kotlin.jvm.internal.j.g(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Name(string2, string3, string4, boolValueOf);
            default:
                kotlin.jvm.internal.j.g(parcel, "parcel");
                return new RelatedTo(parcel.readInt() == 0 ? null : Name.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1281a) {
            case 0:
                return new ComplianceRequest[i];
            case 1:
                return new DosriDetails[i];
            case 2:
                return new FatcaDetails[i];
            case 3:
                return new Name[i];
            default:
                return new RelatedTo[i];
        }
    }
}
