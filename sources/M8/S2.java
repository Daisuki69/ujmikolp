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
public final class S2 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3225a;

    public S2(MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
        HashMap map = new HashMap();
        this.f3225a = map;
        map.put("selectedDocument", mayaEKYCSelectedDocument);
    }

    public final MayaEKYCSelectedDocument a() {
        return (MayaEKYCSelectedDocument) this.f3225a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S2.class != obj.getClass()) {
            return false;
        }
        S2 s22 = (S2) obj;
        if (this.f3225a.containsKey("selectedDocument") != s22.f3225a.containsKey("selectedDocument")) {
            return false;
        }
        return a() == null ? s22.a() == null : a().equals(s22.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_upload_philsys_id_fragment_to_maya_kyc_take_video_selfie_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3225a;
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
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_upload_philsys_id_fragment_to_maya_kyc_take_video_selfie_fragment);
    }

    public final String toString() {
        return "ActionMayaKycUploadPhilsysIdFragmentToMayaKycTakeVideoSelfieFragment(actionId=2131362012){selectedDocument=" + a() + "}";
    }
}
