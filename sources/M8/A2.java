package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class A2 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3136a;

    public A2(String str, MayaEKYCSelectedDocument mayaEKYCSelectedDocument, boolean z4) {
        HashMap map = new HashMap();
        this.f3136a = map;
        map.put("idPage", str);
        if (mayaEKYCSelectedDocument == null) {
            throw new IllegalArgumentException("Argument \"selectedDocument\" is marked as non-null but was passed a null value.");
        }
        map.put("selectedDocument", mayaEKYCSelectedDocument);
        map.put("isSelectedFromSecondaryIdScreen", Boolean.valueOf(z4));
    }

    public final String a() {
        return (String) this.f3136a.get("idPage");
    }

    public final boolean b() {
        return ((Boolean) this.f3136a.get("isSelectedFromSecondaryIdScreen")).booleanValue();
    }

    public final MayaEKYCSelectedDocument c() {
        return (MayaEKYCSelectedDocument) this.f3136a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A2.class != obj.getClass()) {
            return false;
        }
        A2 a22 = (A2) obj;
        HashMap map = this.f3136a;
        boolean zContainsKey = map.containsKey("idPage");
        HashMap map2 = a22.f3136a;
        if (zContainsKey != map2.containsKey("idPage")) {
            return false;
        }
        if (a() == null ? a22.a() != null : !a().equals(a22.a())) {
            return false;
        }
        if (map.containsKey("selectedDocument") != map2.containsKey("selectedDocument")) {
            return false;
        }
        if (c() == null ? a22.c() == null : c().equals(a22.c())) {
            return map.containsKey("isSelectedFromSecondaryIdScreen") == map2.containsKey("isSelectedFromSecondaryIdScreen") && b() == a22.b();
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_submit_secondary_id_fragment_to_maya_kyc_simple_capture_v3_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3136a;
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
        return (((b() ? 1 : 0) + (((((a() != null ? a().hashCode() : 0) + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31)) * 31) + R.id.action_maya_kyc_submit_secondary_id_fragment_to_maya_kyc_simple_capture_v3_fragment;
    }

    public final String toString() {
        return "ActionMayaKycSubmitSecondaryIdFragmentToMayaKycSimpleCaptureV3Fragment(actionId=2131361998){idPage=" + a() + ", selectedDocument=" + c() + ", isSelectedFromSecondaryIdScreen=" + b() + "}";
    }
}
