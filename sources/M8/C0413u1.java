package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import d4.AbstractC1331a;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0413u1 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3375a;

    public C0413u1(MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
        HashMap map = new HashMap();
        this.f3375a = map;
        map.put("firstSelectedSecondaryIdDocument", mayaEKYCSelectedDocument);
    }

    public final MayaEKYCSelectedDocument a() {
        return (MayaEKYCSelectedDocument) this.f3375a.get("firstSelectedSecondaryIdDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0413u1.class != obj.getClass()) {
            return false;
        }
        C0413u1 c0413u1 = (C0413u1) obj;
        if (this.f3375a.containsKey("firstSelectedSecondaryIdDocument") != c0413u1.f3375a.containsKey("firstSelectedSecondaryIdDocument")) {
            return false;
        }
        return a() == null ? c0413u1.a() == null : a().equals(c0413u1.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_liveness_capture_fragment_to_maya_kyc_submit_secondary_id_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3375a;
        if (map.containsKey("firstSelectedSecondaryIdDocument")) {
            MayaEKYCSelectedDocument mayaEKYCSelectedDocument = (MayaEKYCSelectedDocument) map.get("firstSelectedSecondaryIdDocument");
            if (!Parcelable.class.isAssignableFrom(MayaEKYCSelectedDocument.class) && mayaEKYCSelectedDocument != null) {
                if (!Serializable.class.isAssignableFrom(MayaEKYCSelectedDocument.class)) {
                    throw new UnsupportedOperationException(MayaEKYCSelectedDocument.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("firstSelectedSecondaryIdDocument", (Serializable) Serializable.class.cast(mayaEKYCSelectedDocument));
                return bundle;
            }
            bundle.putParcelable("firstSelectedSecondaryIdDocument", (Parcelable) Parcelable.class.cast(mayaEKYCSelectedDocument));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_liveness_capture_fragment_to_maya_kyc_submit_secondary_id_fragment);
    }

    public final String toString() {
        return "ActionMayaKycLivenessCaptureFragmentToMayaKycSubmitSecondaryIdFragment(actionId=2131361975){firstSelectedSecondaryIdDocument=" + a() + "}";
    }
}
