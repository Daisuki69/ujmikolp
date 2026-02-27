package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.KycPersonalInfoSnapshot;
import d4.AbstractC1331a;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class T0 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3227a = new HashMap();

    public final KycPersonalInfoSnapshot a() {
        return (KycPersonalInfoSnapshot) this.f3227a.get("personalInfoSnapshot");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T0.class != obj.getClass()) {
            return false;
        }
        T0 t0 = (T0) obj;
        if (this.f3227a.containsKey("personalInfoSnapshot") != t0.f3227a.containsKey("personalInfoSnapshot")) {
            return false;
        }
        return a() == null ? t0.a() == null : a().equals(t0.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_everything_clear_fragment_to_maya_kyc_additional_documents_header;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3227a;
        if (!map.containsKey("personalInfoSnapshot")) {
            bundle.putSerializable("personalInfoSnapshot", null);
            return bundle;
        }
        KycPersonalInfoSnapshot kycPersonalInfoSnapshot = (KycPersonalInfoSnapshot) map.get("personalInfoSnapshot");
        if (Parcelable.class.isAssignableFrom(KycPersonalInfoSnapshot.class) || kycPersonalInfoSnapshot == null) {
            bundle.putParcelable("personalInfoSnapshot", (Parcelable) Parcelable.class.cast(kycPersonalInfoSnapshot));
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(KycPersonalInfoSnapshot.class)) {
            throw new UnsupportedOperationException(KycPersonalInfoSnapshot.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putSerializable("personalInfoSnapshot", (Serializable) Serializable.class.cast(kycPersonalInfoSnapshot));
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_everything_clear_fragment_to_maya_kyc_additional_documents_header);
    }

    public final String toString() {
        return "ActionMayaKycEverythingClearFragmentToMayaKycAdditionalDocumentsHeader(actionId=2131361953){personalInfoSnapshot=" + a() + "}";
    }
}
