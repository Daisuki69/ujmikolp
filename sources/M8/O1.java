package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class O1 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3204a;

    public O1(String str) {
        HashMap map = new HashMap();
        this.f3204a = map;
        if (str == null) {
            throw new IllegalArgumentException("Argument \"destinationScreenName\" is marked as non-null but was passed a null value.");
        }
        map.put("destinationScreenName", str);
    }

    public final String a() {
        return (String) this.f3204a.get("destinationScreenName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O1.class != obj.getClass()) {
            return false;
        }
        O1 o12 = (O1) obj;
        if (this.f3204a.containsKey("destinationScreenName") != o12.f3204a.containsKey("destinationScreenName")) {
            return false;
        }
        return a() == null ? o12.a() == null : a().equals(o12.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_simple_capture_fragment_to_maya_kyc_change_your_mind_bottom_sheet_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3204a;
        if (map.containsKey("destinationScreenName")) {
            bundle.putString("destinationScreenName", (String) map.get("destinationScreenName"));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_simple_capture_fragment_to_maya_kyc_change_your_mind_bottom_sheet_dialog_fragment);
    }

    public final String toString() {
        return "ActionMayaKycSimpleCaptureFragmentToMayaKycChangeYourMindBottomSheetDialogFragment(actionId=2131361980){destinationScreenName=" + a() + "}";
    }
}
