package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class J2 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3183a;

    public J2(String str) {
        HashMap map = new HashMap();
        this.f3183a = map;
        if (str == null) {
            throw new IllegalArgumentException("Argument \"destinationScreenName\" is marked as non-null but was passed a null value.");
        }
        map.put("destinationScreenName", str);
    }

    public final String a() {
        return (String) this.f3183a.get("destinationScreenName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J2.class != obj.getClass()) {
            return false;
        }
        J2 j22 = (J2) obj;
        if (this.f3183a.containsKey("destinationScreenName") != j22.f3183a.containsKey("destinationScreenName")) {
            return false;
        }
        return a() == null ? j22.a() == null : a().equals(j22.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_take_video_selfie_fragment_to_maya_kyc_change_your_mind_bottom_sheet_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3183a;
        if (map.containsKey("destinationScreenName")) {
            bundle.putString("destinationScreenName", (String) map.get("destinationScreenName"));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_take_video_selfie_fragment_to_maya_kyc_change_your_mind_bottom_sheet_dialog_fragment);
    }

    public final String toString() {
        return "ActionMayaKycTakeVideoSelfieFragmentToMayaKycChangeYourMindBottomSheetDialogFragment(actionId=2131362006){destinationScreenName=" + a() + "}";
    }
}
