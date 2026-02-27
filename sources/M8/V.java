package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.KycPersonalInfoSnapshot;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class V implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3234a;

    public V(KycPersonalInfoSnapshot kycPersonalInfoSnapshot, boolean z4) {
        HashMap map = new HashMap();
        this.f3234a = map;
        map.put("personalInfoSnapshot", kycPersonalInfoSnapshot);
        map.put("isMinor", Boolean.valueOf(z4));
    }

    public final boolean a() {
        return ((Boolean) this.f3234a.get("isMinor")).booleanValue();
    }

    public final KycPersonalInfoSnapshot b() {
        return (KycPersonalInfoSnapshot) this.f3234a.get("personalInfoSnapshot");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || V.class != obj.getClass()) {
            return false;
        }
        V v7 = (V) obj;
        HashMap map = this.f3234a;
        boolean zContainsKey = map.containsKey("personalInfoSnapshot");
        HashMap map2 = v7.f3234a;
        if (zContainsKey != map2.containsKey("personalInfoSnapshot")) {
            return false;
        }
        if (b() == null ? v7.b() == null : b().equals(v7.b())) {
            return map.containsKey("isMinor") == map2.containsKey("isMinor") && a() == v7.a();
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_complete_personal_information_fragment_to_mayaKycPersonalInfoConfirmSubmissionFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3234a;
        if (map.containsKey("personalInfoSnapshot")) {
            KycPersonalInfoSnapshot kycPersonalInfoSnapshot = (KycPersonalInfoSnapshot) map.get("personalInfoSnapshot");
            if (Parcelable.class.isAssignableFrom(KycPersonalInfoSnapshot.class) || kycPersonalInfoSnapshot == null) {
                bundle.putParcelable("personalInfoSnapshot", (Parcelable) Parcelable.class.cast(kycPersonalInfoSnapshot));
            } else {
                if (!Serializable.class.isAssignableFrom(KycPersonalInfoSnapshot.class)) {
                    throw new UnsupportedOperationException(KycPersonalInfoSnapshot.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("personalInfoSnapshot", (Serializable) Serializable.class.cast(kycPersonalInfoSnapshot));
            }
        }
        if (map.containsKey("isMinor")) {
            bundle.putBoolean("isMinor", ((Boolean) map.get("isMinor")).booleanValue());
        }
        return bundle;
    }

    public final int hashCode() {
        return (((a() ? 1 : 0) + (((b() != null ? b().hashCode() : 0) + 31) * 31)) * 31) + R.id.action_maya_kyc_complete_personal_information_fragment_to_mayaKycPersonalInfoConfirmSubmissionFragment;
    }

    public final String toString() {
        return "ActionMayaKycCompletePersonalInformationFragmentToMayaKycPersonalInfoConfirmSubmissionFragment(actionId=2131361942){personalInfoSnapshot=" + b() + ", isMinor=" + a() + "}";
    }
}
