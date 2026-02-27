package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0418v2 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3379a;

    public C0418v2(MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
        HashMap map = new HashMap();
        this.f3379a = map;
        if (mayaEKYCSelectedDocument == null) {
            throw new IllegalArgumentException("Argument \"selectedDocument\" is marked as non-null but was passed a null value.");
        }
        map.put("selectedDocument", mayaEKYCSelectedDocument);
        map.put("isSelectedFromSecondaryIdScreen", Boolean.FALSE);
    }

    public final boolean a() {
        return ((Boolean) this.f3379a.get("isSelectedFromSecondaryIdScreen")).booleanValue();
    }

    public final MayaEKYCSelectedDocument b() {
        return (MayaEKYCSelectedDocument) this.f3379a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0418v2.class != obj.getClass()) {
            return false;
        }
        C0418v2 c0418v2 = (C0418v2) obj;
        HashMap map = this.f3379a;
        boolean zContainsKey = map.containsKey("selectedDocument");
        HashMap map2 = c0418v2.f3379a;
        if (zContainsKey != map2.containsKey("selectedDocument")) {
            return false;
        }
        if (b() == null ? c0418v2.b() == null : b().equals(c0418v2.b())) {
            return map.containsKey("isSelectedFromSecondaryIdScreen") == map2.containsKey("isSelectedFromSecondaryIdScreen") && a() == c0418v2.a();
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_submit_id_fragment_to_maya_kyc_document_id_guide_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3379a;
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
        return (((a() ? 1 : 0) + (((b() != null ? b().hashCode() : 0) + 31) * 31)) * 31) + R.id.action_maya_kyc_submit_id_fragment_to_maya_kyc_document_id_guide_fragment;
    }

    public final String toString() {
        return "ActionMayaKycSubmitIdFragmentToMayaKycDocumentIdGuideFragment(actionId=2131361995){selectedDocument=" + b() + ", isSelectedFromSecondaryIdScreen=" + a() + "}";
    }
}
