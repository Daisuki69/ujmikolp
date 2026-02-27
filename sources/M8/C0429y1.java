package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.mayaui.kyczoloz.utils.KycMinorDocument;
import d4.AbstractC1331a;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0429y1 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3391a;

    public C0429y1(KycMinorDocument kycMinorDocument) {
        HashMap map = new HashMap();
        this.f3391a = map;
        map.put("kycMinorDocument", kycMinorDocument);
    }

    public final KycMinorDocument a() {
        return (KycMinorDocument) this.f3391a.get("kycMinorDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0429y1.class != obj.getClass()) {
            return false;
        }
        C0429y1 c0429y1 = (C0429y1) obj;
        if (this.f3391a.containsKey("kycMinorDocument") != c0429y1.f3391a.containsKey("kycMinorDocument")) {
            return false;
        }
        return a() == null ? c0429y1.a() == null : a().equals(c0429y1.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_mayaKycMinorTakeAPhotoFragment_to_maya_kyc_everything_clear_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3391a;
        if (map.containsKey("kycMinorDocument")) {
            KycMinorDocument kycMinorDocument = (KycMinorDocument) map.get("kycMinorDocument");
            if (!Parcelable.class.isAssignableFrom(KycMinorDocument.class) && kycMinorDocument != null) {
                if (!Serializable.class.isAssignableFrom(KycMinorDocument.class)) {
                    throw new UnsupportedOperationException(KycMinorDocument.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("kycMinorDocument", (Serializable) Serializable.class.cast(kycMinorDocument));
                return bundle;
            }
            bundle.putParcelable("kycMinorDocument", (Parcelable) Parcelable.class.cast(kycMinorDocument));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_mayaKycMinorTakeAPhotoFragment_to_maya_kyc_everything_clear_fragment);
    }

    public final String toString() {
        return "ActionMayaKycMinorTakeAPhotoFragmentToMayaKycEverythingClearFragment(actionId=2131361924){kycMinorDocument=" + a() + "}";
    }
}
