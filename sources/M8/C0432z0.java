package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0432z0 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3394a;

    public C0432z0(MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
        HashMap map = new HashMap();
        this.f3394a = map;
        map.put("selectedDocument", mayaEKYCSelectedDocument);
        map.put("isSelectedFromSecondaryIdScreen", Boolean.FALSE);
    }

    public final boolean a() {
        return ((Boolean) this.f3394a.get("isSelectedFromSecondaryIdScreen")).booleanValue();
    }

    public final MayaEKYCSelectedDocument b() {
        return (MayaEKYCSelectedDocument) this.f3394a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0432z0.class != obj.getClass()) {
            return false;
        }
        C0432z0 c0432z0 = (C0432z0) obj;
        HashMap map = this.f3394a;
        boolean zContainsKey = map.containsKey("selectedDocument");
        HashMap map2 = c0432z0.f3394a;
        if (zContainsKey != map2.containsKey("selectedDocument")) {
            return false;
        }
        if (b() == null ? c0432z0.b() == null : b().equals(c0432z0.b())) {
            return map.containsKey("isSelectedFromSecondaryIdScreen") == map2.containsKey("isSelectedFromSecondaryIdScreen") && a() == c0432z0.a();
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_id_review_fragment_to_maya_kyc_upload_philsys_id_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3394a;
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
        return (((a() ? 1 : 0) + (((b() != null ? b().hashCode() : 0) + 31) * 31)) * 31) + R.id.action_maya_kyc_id_review_fragment_to_maya_kyc_upload_philsys_id_fragment;
    }

    public final String toString() {
        return "ActionMayaKycIdReviewFragmentToMayaKycUploadPhilsysIdFragment(actionId=2131361965){selectedDocument=" + b() + ", isSelectedFromSecondaryIdScreen=" + a() + "}";
    }
}
