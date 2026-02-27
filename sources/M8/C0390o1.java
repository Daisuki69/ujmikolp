package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0390o1 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3346a;

    public C0390o1() {
        HashMap map = new HashMap();
        this.f3346a = map;
        map.put("navigationSource", "source_secondary_id_screen");
    }

    public final String a() {
        return (String) this.f3346a.get("navigationSource");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0390o1.class != obj.getClass()) {
            return false;
        }
        C0390o1 c0390o1 = (C0390o1) obj;
        if (this.f3346a.containsKey("navigationSource") != c0390o1.f3346a.containsKey("navigationSource")) {
            return false;
        }
        return a() == null ? c0390o1.a() == null : a().equals(c0390o1.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_id_review_fragment_to_maya_kyc_work_details_flow;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3346a;
        if (map.containsKey("navigationSource")) {
            bundle.putString("navigationSource", (String) map.get("navigationSource"));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_id_review_fragment_to_maya_kyc_work_details_flow);
    }

    public final String toString() {
        return "ActionMayaKycIdReviewFragmentToMayaKycWorkDetailsFlow(actionId=2131361966){navigationSource=" + a() + "}";
    }
}
