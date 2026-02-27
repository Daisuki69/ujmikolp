package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class Q2 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3217a;

    public Q2(int i, String str, int i4, int i6, int i10, int i11) {
        HashMap map = new HashMap();
        this.f3217a = map;
        androidx.media3.datasource.cache.c.t(i, map, "drawableRes", i4, "titleRes");
        androidx.media3.datasource.cache.c.t(i6, map, "messageRes", i10, "actionRes");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"pageSource\" is marked as non-null but was passed a null value.");
        }
        map.put("pageSource", str);
        map.put("errorCode", Integer.valueOf(i11));
    }

    public final int a() {
        return ((Integer) this.f3217a.get("actionRes")).intValue();
    }

    public final int b() {
        return ((Integer) this.f3217a.get("drawableRes")).intValue();
    }

    public final int c() {
        return ((Integer) this.f3217a.get("errorCode")).intValue();
    }

    public final int d() {
        return ((Integer) this.f3217a.get("messageRes")).intValue();
    }

    public final String e() {
        return (String) this.f3217a.get("pageSource");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q2.class != obj.getClass()) {
            return false;
        }
        Q2 q22 = (Q2) obj;
        HashMap map = this.f3217a;
        boolean zContainsKey = map.containsKey("drawableRes");
        HashMap map2 = q22.f3217a;
        if (zContainsKey != map2.containsKey("drawableRes") || b() != q22.b() || map.containsKey("titleRes") != map2.containsKey("titleRes") || f() != q22.f() || map.containsKey("messageRes") != map2.containsKey("messageRes") || d() != q22.d() || map.containsKey("actionRes") != map2.containsKey("actionRes") || a() != q22.a() || map.containsKey("pageSource") != map2.containsKey("pageSource")) {
            return false;
        }
        if (e() == null ? q22.e() == null : e().equals(q22.e())) {
            return map.containsKey("errorCode") == map2.containsKey("errorCode") && c() == q22.c();
        }
        return false;
    }

    public final int f() {
        return ((Integer) this.f3217a.get("titleRes")).intValue();
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_upload_philsys_id_fragment_to_maya_kyc_error_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3217a;
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
        return ((c() + ((((a() + ((d() + ((f() + ((b() + 31) * 31)) * 31)) * 31)) * 31) + (e() != null ? e().hashCode() : 0)) * 31)) * 31) + R.id.action_maya_kyc_upload_philsys_id_fragment_to_maya_kyc_error_dialog_fragment;
    }

    public final String toString() {
        return "ActionMayaKycUploadPhilsysIdFragmentToMayaKycErrorDialogFragment(actionId=2131362010){drawableRes=" + b() + ", titleRes=" + f() + ", messageRes=" + d() + ", actionRes=" + a() + ", pageSource=" + e() + ", errorCode=" + c() + "}";
    }
}
