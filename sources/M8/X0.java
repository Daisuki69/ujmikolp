package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class X0 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3247a;

    public X0(String str) {
        HashMap map = new HashMap();
        this.f3247a = map;
        if (str == null) {
            throw new IllegalArgumentException("Argument \"destinationScreenName\" is marked as non-null but was passed a null value.");
        }
        map.put("destinationScreenName", str);
    }

    public final String a() {
        return (String) this.f3247a.get("destinationScreenName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X0.class != obj.getClass()) {
            return false;
        }
        X0 x02 = (X0) obj;
        if (this.f3247a.containsKey("destinationScreenName") != x02.f3247a.containsKey("destinationScreenName")) {
            return false;
        }
        return a() == null ? x02.a() == null : a().equals(x02.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_face_authentication_tips_fragment_to_maya_kyc_bottom_sheets_flow;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3247a;
        if (map.containsKey("destinationScreenName")) {
            bundle.putString("destinationScreenName", (String) map.get("destinationScreenName"));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_face_authentication_tips_fragment_to_maya_kyc_bottom_sheets_flow);
    }

    public final String toString() {
        return "ActionMayaKycFaceAuthenticationTipsFragmentToMayaKycBottomSheetsFlow(actionId=2131361954){destinationScreenName=" + a() + "}";
    }
}
