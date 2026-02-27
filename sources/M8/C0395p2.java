package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0395p2 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3352a;

    public C0395p2() {
        HashMap map = new HashMap();
        this.f3352a = map;
        map.put("sourceKey", "SSNE");
    }

    public final String a() {
        return (String) this.f3352a.get("sourceKey");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0395p2.class != obj.getClass()) {
            return false;
        }
        C0395p2 c0395p2 = (C0395p2) obj;
        if (this.f3352a.containsKey("sourceKey") != c0395p2.f3352a.containsKey("sourceKey")) {
            return false;
        }
        return a() == null ? c0395p2.a() == null : a().equals(c0395p2.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_ssne_upload_documents_fragment_to_maya_kyc_restart_bottom_sheet_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3352a;
        if (map.containsKey("sourceKey")) {
            bundle.putString("sourceKey", (String) map.get("sourceKey"));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_ssne_upload_documents_fragment_to_maya_kyc_restart_bottom_sheet_dialog_fragment);
    }

    public final String toString() {
        return "ActionMayaKycSsneUploadDocumentsFragmentToMayaKycRestartBottomSheetDialogFragment(actionId=2131361991){sourceKey=" + a() + "}";
    }
}
