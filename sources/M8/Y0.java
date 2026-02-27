package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class Y0 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3253a;

    public Y0() {
        HashMap map = new HashMap();
        this.f3253a = map;
        map.put("isOnIdLessFlow", Boolean.TRUE);
    }

    public final boolean a() {
        return ((Boolean) this.f3253a.get("isOnIdLessFlow")).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y0.class != obj.getClass()) {
            return false;
        }
        Y0 y0 = (Y0) obj;
        return this.f3253a.containsKey("isOnIdLessFlow") == y0.f3253a.containsKey("isOnIdLessFlow") && a() == y0.a();
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_face_authentication_tips_fragment_to_maya_kyc_liveness_capture_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3253a;
        if (map.containsKey("isOnIdLessFlow")) {
            bundle.putBoolean("isOnIdLessFlow", ((Boolean) map.get("isOnIdLessFlow")).booleanValue());
        }
        return bundle;
    }

    public final int hashCode() {
        return (((a() ? 1 : 0) + 31) * 31) + R.id.action_maya_kyc_face_authentication_tips_fragment_to_maya_kyc_liveness_capture_fragment;
    }

    public final String toString() {
        return "ActionMayaKycFaceAuthenticationTipsFragmentToMayaKycLivenessCaptureFragment(actionId=2131361956){isOnIdLessFlow=" + a() + "}";
    }
}
