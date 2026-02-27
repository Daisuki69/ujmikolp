package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0370j1 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3321a = new HashMap();

    public final String a() {
        return (String) this.f3321a.get("captureMethod");
    }

    public final String b() {
        return (String) this.f3321a.get("documentType");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0370j1.class != obj.getClass()) {
            return false;
        }
        C0370j1 c0370j1 = (C0370j1) obj;
        HashMap map = this.f3321a;
        boolean zContainsKey = map.containsKey("captureMethod");
        HashMap map2 = c0370j1.f3321a;
        if (zContainsKey != map2.containsKey("captureMethod")) {
            return false;
        }
        if (a() == null ? c0370j1.a() != null : !a().equals(c0370j1.a())) {
            return false;
        }
        if (map.containsKey("documentType") != map2.containsKey("documentType")) {
            return false;
        }
        return b() == null ? c0370j1.b() == null : b().equals(c0370j1.b());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_id_review_fragment_to_maya_kyc_complete_personal_information_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3321a;
        if (map.containsKey("captureMethod")) {
            bundle.putString("captureMethod", (String) map.get("captureMethod"));
        } else {
            bundle.putString("captureMethod", "");
        }
        if (map.containsKey("documentType")) {
            bundle.putString("documentType", (String) map.get("documentType"));
            return bundle;
        }
        bundle.putString("documentType", "");
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(((a() != null ? a().hashCode() : 0) + 31) * 31, b() != null ? b().hashCode() : 0, 31, R.id.action_maya_kyc_id_review_fragment_to_maya_kyc_complete_personal_information_fragment);
    }

    public final String toString() {
        return "ActionMayaKycIdReviewFragmentToMayaKycCompletePersonalInformationFragment(actionId=2131361959){captureMethod=" + a() + ", documentType=" + b() + "}";
    }
}
