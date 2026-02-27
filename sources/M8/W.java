package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class W implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3240a;

    public W(String str) {
        HashMap map = new HashMap();
        this.f3240a = map;
        if (str == null) {
            throw new IllegalArgumentException("Argument \"destinationScreenName\" is marked as non-null but was passed a null value.");
        }
        map.put("destinationScreenName", str);
    }

    public final String a() {
        return (String) this.f3240a.get("destinationScreenName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w6 = (W) obj;
        if (this.f3240a.containsKey("destinationScreenName") != w6.f3240a.containsKey("destinationScreenName")) {
            return false;
        }
        return a() == null ? w6.a() == null : a().equals(w6.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_to_change_your_mind_bottom_sheet_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3240a;
        if (map.containsKey("destinationScreenName")) {
            bundle.putString("destinationScreenName", (String) map.get("destinationScreenName"));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_to_change_your_mind_bottom_sheet_dialog_fragment);
    }

    public final String toString() {
        return "ActionToChangeYourMindBottomSheetDialogFragment(actionId=2131362033){destinationScreenName=" + a() + "}";
    }
}
