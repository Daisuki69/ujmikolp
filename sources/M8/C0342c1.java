package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0342c1 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3278a;

    public C0342c1(String str, int i) {
        HashMap map = new HashMap();
        this.f3278a = map;
        androidx.media3.datasource.cache.c.t(2131231472, map, "drawableRes", R.string.maya_label_that_didnt_load_right, "titleRes");
        androidx.media3.datasource.cache.c.t(R.string.maya_label_connection_issue_split, map, "messageRes", R.string.maya_label_got_it, "actionRes");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"pageSource\" is marked as non-null but was passed a null value.");
        }
        map.put("pageSource", str);
        map.put("errorCode", Integer.valueOf(i));
    }

    public final int a() {
        return ((Integer) this.f3278a.get("actionRes")).intValue();
    }

    public final int b() {
        return ((Integer) this.f3278a.get("drawableRes")).intValue();
    }

    public final int c() {
        return ((Integer) this.f3278a.get("errorCode")).intValue();
    }

    public final int d() {
        return ((Integer) this.f3278a.get("messageRes")).intValue();
    }

    public final String e() {
        return (String) this.f3278a.get("pageSource");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0342c1.class != obj.getClass()) {
            return false;
        }
        C0342c1 c0342c1 = (C0342c1) obj;
        HashMap map = this.f3278a;
        boolean zContainsKey = map.containsKey("drawableRes");
        HashMap map2 = c0342c1.f3278a;
        if (zContainsKey != map2.containsKey("drawableRes") || b() != c0342c1.b() || map.containsKey("titleRes") != map2.containsKey("titleRes") || f() != c0342c1.f() || map.containsKey("messageRes") != map2.containsKey("messageRes") || d() != c0342c1.d() || map.containsKey("actionRes") != map2.containsKey("actionRes") || a() != c0342c1.a() || map.containsKey("pageSource") != map2.containsKey("pageSource")) {
            return false;
        }
        if (e() == null ? c0342c1.e() == null : e().equals(c0342c1.e())) {
            return map.containsKey("errorCode") == map2.containsKey("errorCode") && c() == c0342c1.c();
        }
        return false;
    }

    public final int f() {
        return ((Integer) this.f3278a.get("titleRes")).intValue();
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_to_kyc_error_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3278a;
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
        return ((c() + ((((a() + ((d() + ((f() + ((b() + 31) * 31)) * 31)) * 31)) * 31) + (e() != null ? e().hashCode() : 0)) * 31)) * 31) + R.id.action_to_kyc_error_dialog_fragment;
    }

    public final String toString() {
        return "ActionToKycErrorDialogFragment(actionId=2131362035){drawableRes=" + b() + ", titleRes=" + f() + ", messageRes=" + d() + ", actionRes=" + a() + ", pageSource=" + e() + ", errorCode=" + c() + "}";
    }
}
