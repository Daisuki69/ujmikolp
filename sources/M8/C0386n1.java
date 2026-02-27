package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0386n1 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3341a;

    public C0386n1(MayaEKYCSelectedDocument mayaEKYCSelectedDocument, boolean z4) {
        HashMap map = new HashMap();
        this.f3341a = map;
        map.put("idPage", "BACK");
        map.put("selectedDocument", mayaEKYCSelectedDocument);
        map.put("isSelectedFromSecondaryIdScreen", Boolean.valueOf(z4));
    }

    public final String a() {
        return (String) this.f3341a.get("idPage");
    }

    public final boolean b() {
        return ((Boolean) this.f3341a.get("isSelectedFromSecondaryIdScreen")).booleanValue();
    }

    public final MayaEKYCSelectedDocument c() {
        return (MayaEKYCSelectedDocument) this.f3341a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0386n1.class != obj.getClass()) {
            return false;
        }
        C0386n1 c0386n1 = (C0386n1) obj;
        HashMap map = this.f3341a;
        boolean zContainsKey = map.containsKey("idPage");
        HashMap map2 = c0386n1.f3341a;
        if (zContainsKey != map2.containsKey("idPage")) {
            return false;
        }
        if (a() == null ? c0386n1.a() != null : !a().equals(c0386n1.a())) {
            return false;
        }
        if (map.containsKey("selectedDocument") != map2.containsKey("selectedDocument")) {
            return false;
        }
        if (c() == null ? c0386n1.c() == null : c().equals(c0386n1.c())) {
            return map.containsKey("isSelectedFromSecondaryIdScreen") == map2.containsKey("isSelectedFromSecondaryIdScreen") && b() == c0386n1.b();
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_id_review_fragment_to_maya_kyc_simple_capture_v3_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3341a;
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
        return bundle;
    }

    public final int hashCode() {
        return (((b() ? 1 : 0) + (((((a() != null ? a().hashCode() : 0) + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31)) * 31) + R.id.action_maya_kyc_id_review_fragment_to_maya_kyc_simple_capture_v3_fragment;
    }

    public final String toString() {
        return "ActionMayaKycIdReviewFragmentToMayaKycSimpleCaptureV3Fragment(actionId=2131361963){idPage=" + a() + ", selectedDocument=" + c() + ", isSelectedFromSecondaryIdScreen=" + b() + "}";
    }
}
