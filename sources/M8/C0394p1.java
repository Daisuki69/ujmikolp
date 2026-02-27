package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0394p1 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3351a;

    public C0394p1() {
        HashMap map = new HashMap();
        this.f3351a = map;
        map.put("isFromDashboard", Boolean.TRUE);
    }

    public final boolean a() {
        return ((Boolean) this.f3351a.get("isFromDashboard")).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0394p1.class != obj.getClass()) {
            return false;
        }
        C0394p1 c0394p1 = (C0394p1) obj;
        return this.f3351a.containsKey("isFromDashboard") == c0394p1.f3351a.containsKey("isFromDashboard") && a() == c0394p1.a();
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_initial_loading_fragment_to_maya_kyc_amlc_certification_flow;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3351a;
        if (map.containsKey("isFromDashboard")) {
            bundle.putBoolean("isFromDashboard", ((Boolean) map.get("isFromDashboard")).booleanValue());
        }
        return bundle;
    }

    public final int hashCode() {
        return (((a() ? 1 : 0) + 31) * 31) + R.id.action_maya_kyc_initial_loading_fragment_to_maya_kyc_amlc_certification_flow;
    }

    public final String toString() {
        return "ActionMayaKycInitialLoadingFragmentToMayaKycAmlcCertificationFlow(actionId=2131361969){isFromDashboard=" + a() + "}";
    }
}
