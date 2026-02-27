package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.KycPersonalInfoSnapshot;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0388o implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3343a;

    public C0388o(KycPersonalInfoSnapshot kycPersonalInfoSnapshot) {
        HashMap map = new HashMap();
        this.f3343a = map;
        if (kycPersonalInfoSnapshot == null) {
            throw new IllegalArgumentException("Argument \"personalInfoSnapshot\" is marked as non-null but was passed a null value.");
        }
        map.put("personalInfoSnapshot", kycPersonalInfoSnapshot);
        map.put("isMinor", Boolean.TRUE);
    }

    public final boolean a() {
        return ((Boolean) this.f3343a.get("isMinor")).booleanValue();
    }

    public final KycPersonalInfoSnapshot b() {
        return (KycPersonalInfoSnapshot) this.f3343a.get("personalInfoSnapshot");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0388o.class != obj.getClass()) {
            return false;
        }
        C0388o c0388o = (C0388o) obj;
        HashMap map = this.f3343a;
        boolean zContainsKey = map.containsKey("personalInfoSnapshot");
        HashMap map2 = c0388o.f3343a;
        if (zContainsKey != map2.containsKey("personalInfoSnapshot")) {
            return false;
        }
        if (b() == null ? c0388o.b() == null : b().equals(c0388o.b())) {
            return map.containsKey("isMinor") == map2.containsKey("isMinor") && a() == c0388o.a();
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_additional_documents_fragment_to_mayaKycPersonalInfoConfirmSubmissionFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3343a;
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
        return (((a() ? 1 : 0) + (((b() != null ? b().hashCode() : 0) + 31) * 31)) * 31) + R.id.action_maya_kyc_additional_documents_fragment_to_mayaKycPersonalInfoConfirmSubmissionFragment;
    }

    public final String toString() {
        return "ActionMayaKycAdditionalDocumentsFragmentToMayaKycPersonalInfoConfirmSubmissionFragment(actionId=2131361931){personalInfoSnapshot=" + b() + ", isMinor=" + a() + "}";
    }
}
