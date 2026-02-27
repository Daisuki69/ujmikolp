package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class E2 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3158a;

    public E2(String str) {
        HashMap map = new HashMap();
        this.f3158a = map;
        androidx.media3.datasource.cache.c.t(2131231241, map, "drawableRes", R.string.maya_label_that_didnt_load_right, "titleRes");
        androidx.media3.datasource.cache.c.t(R.string.maya_label_something_went_wrong, map, "messageRes", R.string.maya_label_got_it, "actionRes");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"pageSource\" is marked as non-null but was passed a null value.");
        }
        map.put("pageSource", str);
        map.put("errorCode", -1);
    }

    public final int a() {
        return ((Integer) this.f3158a.get("actionRes")).intValue();
    }

    public final int b() {
        return ((Integer) this.f3158a.get("drawableRes")).intValue();
    }

    public final int c() {
        return ((Integer) this.f3158a.get("errorCode")).intValue();
    }

    public final int d() {
        return ((Integer) this.f3158a.get("messageRes")).intValue();
    }

    public final String e() {
        return (String) this.f3158a.get("pageSource");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E2.class != obj.getClass()) {
            return false;
        }
        E2 e22 = (E2) obj;
        HashMap map = this.f3158a;
        boolean zContainsKey = map.containsKey("drawableRes");
        HashMap map2 = e22.f3158a;
        if (zContainsKey != map2.containsKey("drawableRes") || b() != e22.b() || map.containsKey("titleRes") != map2.containsKey("titleRes") || f() != e22.f() || map.containsKey("messageRes") != map2.containsKey("messageRes") || d() != e22.d() || map.containsKey("actionRes") != map2.containsKey("actionRes") || a() != e22.a() || map.containsKey("pageSource") != map2.containsKey("pageSource")) {
            return false;
        }
        if (e() == null ? e22.e() == null : e().equals(e22.e())) {
            return map.containsKey("errorCode") == map2.containsKey("errorCode") && c() == e22.c();
        }
        return false;
    }

    public final int f() {
        return ((Integer) this.f3158a.get("titleRes")).intValue();
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_take_id_photo_fragment_to_maya_kyc_error_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3158a;
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
        return ((c() + ((((a() + ((d() + ((f() + ((b() + 31) * 31)) * 31)) * 31)) * 31) + (e() != null ? e().hashCode() : 0)) * 31)) * 31) + R.id.action_maya_kyc_take_id_photo_fragment_to_maya_kyc_error_dialog_fragment;
    }

    public final String toString() {
        return "ActionMayaKycTakeIdPhotoFragmentToMayaKycErrorDialogFragment(actionId=2131362002){drawableRes=" + b() + ", titleRes=" + f() + ", messageRes=" + d() + ", actionRes=" + a() + ", pageSource=" + e() + ", errorCode=" + c() + "}";
    }
}
