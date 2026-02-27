package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class X implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3246a;

    public X(String str, boolean z4) {
        HashMap map = new HashMap();
        this.f3246a = map;
        if (str == null) {
            throw new IllegalArgumentException("Argument \"destinationScreenName\" is marked as non-null but was passed a null value.");
        }
        map.put("destinationScreenName", str);
        map.put("isMinor", Boolean.valueOf(z4));
    }

    public final String a() {
        return (String) this.f3246a.get("destinationScreenName");
    }

    public final boolean b() {
        return ((Boolean) this.f3246a.get("isMinor")).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X.class != obj.getClass()) {
            return false;
        }
        X x6 = (X) obj;
        HashMap map = this.f3246a;
        boolean zContainsKey = map.containsKey("destinationScreenName");
        HashMap map2 = x6.f3246a;
        if (zContainsKey != map2.containsKey("destinationScreenName")) {
            return false;
        }
        if (a() == null ? x6.a() == null : a().equals(x6.a())) {
            return map.containsKey("isMinor") == map2.containsKey("isMinor") && b() == x6.b();
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_to_confirmation_bottom_sheet_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3246a;
        if (map.containsKey("destinationScreenName")) {
            bundle.putString("destinationScreenName", (String) map.get("destinationScreenName"));
        }
        if (map.containsKey("isMinor")) {
            bundle.putBoolean("isMinor", ((Boolean) map.get("isMinor")).booleanValue());
        }
        return bundle;
    }

    public final int hashCode() {
        return (((b() ? 1 : 0) + (((a() != null ? a().hashCode() : 0) + 31) * 31)) * 31) + R.id.action_to_confirmation_bottom_sheet_dialog_fragment;
    }

    public final String toString() {
        return "ActionToConfirmationBottomSheetDialogFragment(actionId=2131362034){destinationScreenName=" + a() + ", isMinor=" + b() + "}";
    }
}
