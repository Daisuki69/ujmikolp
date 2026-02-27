package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0434z2 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3398a;

    public C0434z2(String str) {
        HashMap map = new HashMap();
        this.f3398a = map;
        if (str == null) {
            throw new IllegalArgumentException("Argument \"destinationScreenName\" is marked as non-null but was passed a null value.");
        }
        map.put("destinationScreenName", str);
    }

    public final String a() {
        return (String) this.f3398a.get("destinationScreenName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0434z2.class != obj.getClass()) {
            return false;
        }
        C0434z2 c0434z2 = (C0434z2) obj;
        if (this.f3398a.containsKey("destinationScreenName") != c0434z2.f3398a.containsKey("destinationScreenName")) {
            return false;
        }
        return a() == null ? c0434z2.a() == null : a().equals(c0434z2.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_submit_secondary_id_fragment_to_maya_kyc_change_your_mind_bottom_sheet_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3398a;
        if (map.containsKey("destinationScreenName")) {
            bundle.putString("destinationScreenName", (String) map.get("destinationScreenName"));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_submit_secondary_id_fragment_to_maya_kyc_change_your_mind_bottom_sheet_dialog_fragment);
    }

    public final String toString() {
        return "ActionMayaKycSubmitSecondaryIdFragmentToMayaKycChangeYourMindBottomSheetDialogFragment(actionId=2131361997){destinationScreenName=" + a() + "}";
    }
}
