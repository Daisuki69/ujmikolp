package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class L2 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3194a;

    public L2(MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
        HashMap map = new HashMap();
        this.f3194a = map;
        map.put("selectedDocument", mayaEKYCSelectedDocument);
    }

    public final boolean a() {
        return ((Boolean) this.f3194a.get("isOnIdLessFlow")).booleanValue();
    }

    public final MayaEKYCSelectedDocument b() {
        return (MayaEKYCSelectedDocument) this.f3194a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L2.class != obj.getClass()) {
            return false;
        }
        L2 l22 = (L2) obj;
        HashMap map = this.f3194a;
        boolean zContainsKey = map.containsKey("selectedDocument");
        HashMap map2 = l22.f3194a;
        if (zContainsKey != map2.containsKey("selectedDocument")) {
            return false;
        }
        if (b() == null ? l22.b() == null : b().equals(l22.b())) {
            return map.containsKey("isOnIdLessFlow") == map2.containsKey("isOnIdLessFlow") && a() == l22.a();
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_take_video_selfie_fragment_to_maya_kyc_liveness_capture_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3194a;
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
        if (map.containsKey("isOnIdLessFlow")) {
            bundle.putBoolean("isOnIdLessFlow", ((Boolean) map.get("isOnIdLessFlow")).booleanValue());
            return bundle;
        }
        bundle.putBoolean("isOnIdLessFlow", false);
        return bundle;
    }

    public final int hashCode() {
        return (((a() ? 1 : 0) + (((b() != null ? b().hashCode() : 0) + 31) * 31)) * 31) + R.id.action_maya_kyc_take_video_selfie_fragment_to_maya_kyc_liveness_capture_fragment;
    }

    public final String toString() {
        return "ActionMayaKycTakeVideoSelfieFragmentToMayaKycLivenessCaptureFragment(actionId=2131362009){selectedDocument=" + b() + ", isOnIdLessFlow=" + a() + "}";
    }
}
