package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0359g2 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3306a;

    public C0359g2(String str, MayaEKYCSelectedDocument mayaEKYCSelectedDocument, boolean z4) {
        HashMap map = new HashMap();
        this.f3306a = map;
        map.put("idPage", str);
        map.put("selectedDocument", mayaEKYCSelectedDocument);
        map.put("isSelectedFromSecondaryIdScreen", Boolean.valueOf(z4));
    }

    public final String a() {
        return (String) this.f3306a.get("idPage");
    }

    public final boolean b() {
        return ((Boolean) this.f3306a.get("isFromPhilSysUpload")).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.f3306a.get("isSelectedFromSecondaryIdScreen")).booleanValue();
    }

    public final MayaEKYCSelectedDocument d() {
        return (MayaEKYCSelectedDocument) this.f3306a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0359g2.class != obj.getClass()) {
            return false;
        }
        C0359g2 c0359g2 = (C0359g2) obj;
        HashMap map = this.f3306a;
        boolean zContainsKey = map.containsKey("idPage");
        HashMap map2 = c0359g2.f3306a;
        if (zContainsKey != map2.containsKey("idPage")) {
            return false;
        }
        if (a() == null ? c0359g2.a() != null : !a().equals(c0359g2.a())) {
            return false;
        }
        if (map.containsKey("selectedDocument") != map2.containsKey("selectedDocument")) {
            return false;
        }
        if (d() == null ? c0359g2.d() == null : d().equals(c0359g2.d())) {
            return map.containsKey("isSelectedFromSecondaryIdScreen") == map2.containsKey("isSelectedFromSecondaryIdScreen") && c() == c0359g2.c() && map.containsKey("isFromPhilSysUpload") == map2.containsKey("isFromPhilSysUpload") && b() == c0359g2.b();
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_simple_capture_v3_fragment_to_maya_kyc_id_review_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3306a;
        if (map.containsKey("idPage")) {
            bundle.putString("idPage", (String) map.get("idPage"));
        }
        if (map.containsKey("selectedDocument")) {
            MayaEKYCSelectedDocument mayaEKYCSelectedDocument = (MayaEKYCSelectedDocument) map.get("selectedDocument");
            if (Parcelable.class.isAssignableFrom(MayaEKYCSelectedDocument.class) || mayaEKYCSelectedDocument == null) {
                bundle.putParcelable("selectedDocument", (Parcelable) Parcelable.class.cast(mayaEKYCSelectedDocument));
            } else {
                if (!Serializable.class.isAssignableFrom(MayaEKYCSelectedDocument.class)) {
                    throw new UnsupportedOperationException(MayaEKYCSelectedDocument.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("selectedDocument", (Serializable) Serializable.class.cast(mayaEKYCSelectedDocument));
            }
        }
        if (map.containsKey("isSelectedFromSecondaryIdScreen")) {
            bundle.putBoolean("isSelectedFromSecondaryIdScreen", ((Boolean) map.get("isSelectedFromSecondaryIdScreen")).booleanValue());
        }
        if (map.containsKey("isFromPhilSysUpload")) {
            bundle.putBoolean("isFromPhilSysUpload", ((Boolean) map.get("isFromPhilSysUpload")).booleanValue());
            return bundle;
        }
        bundle.putBoolean("isFromPhilSysUpload", false);
        return bundle;
    }

    public final int hashCode() {
        return (((b() ? 1 : 0) + (((c() ? 1 : 0) + (((((a() != null ? a().hashCode() : 0) + 31) * 31) + (d() != null ? d().hashCode() : 0)) * 31)) * 31)) * 31) + R.id.action_maya_kyc_simple_capture_v3_fragment_to_maya_kyc_id_review_fragment;
    }

    public final String toString() {
        return "ActionMayaKycSimpleCaptureV3FragmentToMayaKycIdReviewFragment(actionId=2131361986){idPage=" + a() + ", selectedDocument=" + d() + ", isSelectedFromSecondaryIdScreen=" + c() + ", isFromPhilSysUpload=" + b() + "}";
    }
}
