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
public final class Z implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3256a;

    public Z(KycPersonalInfoSnapshot kycPersonalInfoSnapshot) {
        HashMap map = new HashMap();
        this.f3256a = map;
        map.put("personalInfoSnapshot", kycPersonalInfoSnapshot);
    }

    public final KycPersonalInfoSnapshot a() {
        return (KycPersonalInfoSnapshot) this.f3256a.get("personalInfoSnapshot");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z.class != obj.getClass()) {
            return false;
        }
        Z z4 = (Z) obj;
        if (this.f3256a.containsKey("personalInfoSnapshot") != z4.f3256a.containsKey("personalInfoSnapshot")) {
            return false;
        }
        return a() == null ? z4.a() == null : a().equals(z4.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_to_maya_kyc_additional_documents_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3256a;
        if (map.containsKey("personalInfoSnapshot")) {
            KycPersonalInfoSnapshot kycPersonalInfoSnapshot = (KycPersonalInfoSnapshot) map.get("personalInfoSnapshot");
            if (!Parcelable.class.isAssignableFrom(KycPersonalInfoSnapshot.class) && kycPersonalInfoSnapshot != null) {
                if (!Serializable.class.isAssignableFrom(KycPersonalInfoSnapshot.class)) {
                    throw new UnsupportedOperationException(KycPersonalInfoSnapshot.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("personalInfoSnapshot", (Serializable) Serializable.class.cast(kycPersonalInfoSnapshot));
                return bundle;
            }
            bundle.putParcelable("personalInfoSnapshot", (Parcelable) Parcelable.class.cast(kycPersonalInfoSnapshot));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_to_maya_kyc_additional_documents_fragment);
    }

    public final String toString() {
        return "ActionToMayaKycAdditionalDocumentsFragment(actionId=2131362040){personalInfoSnapshot=" + a() + "}";
    }
}
