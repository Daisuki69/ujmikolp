package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class F1 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3162a;

    public F1() {
        HashMap map = new HashMap();
        this.f3162a = map;
        map.put("navigationSource", "confirm_submission");
    }

    public final String a() {
        return (String) this.f3162a.get("navigationSource");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F1.class != obj.getClass()) {
            return false;
        }
        F1 f12 = (F1) obj;
        if (this.f3162a.containsKey("navigationSource") != f12.f3162a.containsKey("navigationSource")) {
            return false;
        }
        return a() == null ? f12.a() == null : a().equals(f12.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_to_maya_kyc_work_details_flow;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3162a;
        if (map.containsKey("navigationSource")) {
            bundle.putString("navigationSource", (String) map.get("navigationSource"));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_to_maya_kyc_work_details_flow);
    }

    public final String toString() {
        return "ActionToMayaKycWorkDetailsFlow(actionId=2131362043){navigationSource=" + a() + "}";
    }
}
