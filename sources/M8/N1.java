package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import d4.AbstractC1331a;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class N1 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3202a;

    public N1(MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
        HashMap map = new HashMap();
        this.f3202a = map;
        map.put("selectedDocument", mayaEKYCSelectedDocument);
    }

    public final MayaEKYCSelectedDocument a() {
        return (MayaEKYCSelectedDocument) this.f3202a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N1.class != obj.getClass()) {
            return false;
        }
        N1 n12 = (N1) obj;
        if (this.f3202a.containsKey("selectedDocument") != n12.f3202a.containsKey("selectedDocument")) {
            return false;
        }
        return a() == null ? n12.a() == null : a().equals(n12.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_id_review_fragment_to_maya_kyc_take_video_selfie_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3202a;
        if (map.containsKey("selectedDocument")) {
            MayaEKYCSelectedDocument mayaEKYCSelectedDocument = (MayaEKYCSelectedDocument) map.get("selectedDocument");
            if (!Parcelable.class.isAssignableFrom(MayaEKYCSelectedDocument.class) && mayaEKYCSelectedDocument != null) {
                if (!Serializable.class.isAssignableFrom(MayaEKYCSelectedDocument.class)) {
                    throw new UnsupportedOperationException(MayaEKYCSelectedDocument.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("selectedDocument", (Serializable) Serializable.class.cast(mayaEKYCSelectedDocument));
                return bundle;
            }
            bundle.putParcelable("selectedDocument", (Parcelable) Parcelable.class.cast(mayaEKYCSelectedDocument));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_id_review_fragment_to_maya_kyc_take_video_selfie_fragment);
    }

    public final String toString() {
        return "ActionMayaKycIdReviewFragmentToMayaKycTakeVideoSelfieFragment(actionId=2131361964){selectedDocument=" + a() + "}";
    }
}
