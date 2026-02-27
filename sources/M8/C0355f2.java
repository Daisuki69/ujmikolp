package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0355f2 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3298a;

    public C0355f2(String str) {
        HashMap map = new HashMap();
        this.f3298a = map;
        androidx.media3.datasource.cache.c.t(2131231241, map, "drawableRes", R.string.maya_label_that_didnt_load_right, "titleRes");
        androidx.media3.datasource.cache.c.t(R.string.maya_label_something_went_wrong, map, "messageRes", R.string.maya_label_got_it, "actionRes");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"pageSource\" is marked as non-null but was passed a null value.");
        }
        map.put("pageSource", str);
        map.put("errorCode", 0);
    }

    public final int a() {
        return ((Integer) this.f3298a.get("actionRes")).intValue();
    }

    public final int b() {
        return ((Integer) this.f3298a.get("drawableRes")).intValue();
    }

    public final int c() {
        return ((Integer) this.f3298a.get("errorCode")).intValue();
    }

    public final int d() {
        return ((Integer) this.f3298a.get("messageRes")).intValue();
    }

    public final String e() {
        return (String) this.f3298a.get("pageSource");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0355f2.class != obj.getClass()) {
            return false;
        }
        C0355f2 c0355f2 = (C0355f2) obj;
        HashMap map = this.f3298a;
        boolean zContainsKey = map.containsKey("drawableRes");
        HashMap map2 = c0355f2.f3298a;
        if (zContainsKey != map2.containsKey("drawableRes") || b() != c0355f2.b() || map.containsKey("titleRes") != map2.containsKey("titleRes") || f() != c0355f2.f() || map.containsKey("messageRes") != map2.containsKey("messageRes") || d() != c0355f2.d() || map.containsKey("actionRes") != map2.containsKey("actionRes") || a() != c0355f2.a() || map.containsKey("pageSource") != map2.containsKey("pageSource")) {
            return false;
        }
        if (e() == null ? c0355f2.e() == null : e().equals(c0355f2.e())) {
            return map.containsKey("errorCode") == map2.containsKey("errorCode") && c() == c0355f2.c();
        }
        return false;
    }

    public final int f() {
        return ((Integer) this.f3298a.get("titleRes")).intValue();
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_simple_capture_v3_fragment_to_maya_kyc_error_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3298a;
        if (map.containsKey("drawableRes")) {
            bundle.putInt("drawableRes", ((Integer) map.get("drawableRes")).intValue());
        }
        if (map.containsKey("titleRes")) {
            bundle.putInt("titleRes", ((Integer) map.get("titleRes")).intValue());
        }
        if (map.containsKey("messageRes")) {
            bundle.putInt("messageRes", ((Integer) map.get("messageRes")).intValue());
        }
        if (map.containsKey("actionRes")) {
            bundle.putInt("actionRes", ((Integer) map.get("actionRes")).intValue());
        }
        if (map.containsKey("pageSource")) {
            bundle.putString("pageSource", (String) map.get("pageSource"));
        }
        if (map.containsKey("errorCode")) {
            bundle.putInt("errorCode", ((Integer) map.get("errorCode")).intValue());
        }
        return bundle;
    }

    public final int hashCode() {
        return ((c() + ((((a() + ((d() + ((f() + ((b() + 31) * 31)) * 31)) * 31)) * 31) + (e() != null ? e().hashCode() : 0)) * 31)) * 31) + R.id.action_maya_kyc_simple_capture_v3_fragment_to_maya_kyc_error_dialog_fragment;
    }

    public final String toString() {
        return "ActionMayaKycSimpleCaptureV3FragmentToMayaKycErrorDialogFragment(actionId=2131361985){drawableRes=" + b() + ", titleRes=" + f() + ", messageRes=" + d() + ", actionRes=" + a() + ", pageSource=" + e() + ", errorCode=" + c() + "}";
    }
}
