package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0384n implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3339a;

    public C0384n(String str) {
        HashMap map = new HashMap();
        this.f3339a = map;
        if (str == null) {
            throw new IllegalArgumentException("Argument \"destinationScreenName\" is marked as non-null but was passed a null value.");
        }
        map.put("destinationScreenName", str);
        map.put("isMinor", Boolean.TRUE);
    }

    public final String a() {
        return (String) this.f3339a.get("destinationScreenName");
    }

    public final boolean b() {
        return ((Boolean) this.f3339a.get("isMinor")).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0384n.class != obj.getClass()) {
            return false;
        }
        C0384n c0384n = (C0384n) obj;
        HashMap map = this.f3339a;
        boolean zContainsKey = map.containsKey("destinationScreenName");
        HashMap map2 = c0384n.f3339a;
        if (zContainsKey != map2.containsKey("destinationScreenName")) {
            return false;
        }
        if (a() == null ? c0384n.a() == null : a().equals(c0384n.a())) {
            return map.containsKey("isMinor") == map2.containsKey("isMinor") && b() == c0384n.b();
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_additional_documents_fragment_to_maya_kyc_confirmation_bottom_sheet_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3339a;
        if (map.containsKey("destinationScreenName")) {
            bundle.putString("destinationScreenName", (String) map.get("destinationScreenName"));
        }
        if (map.containsKey("isMinor")) {
            bundle.putBoolean("isMinor", ((Boolean) map.get("isMinor")).booleanValue());
        }
        return bundle;
    }

    public final int hashCode() {
        return (((b() ? 1 : 0) + (((a() != null ? a().hashCode() : 0) + 31) * 31)) * 31) + R.id.action_maya_kyc_additional_documents_fragment_to_maya_kyc_confirmation_bottom_sheet_dialog_fragment;
    }

    public final String toString() {
        return "ActionMayaKycAdditionalDocumentsFragmentToMayaKycConfirmationBottomSheetDialogFragment(actionId=2131361932){destinationScreenName=" + a() + ", isMinor=" + b() + "}";
    }
}
