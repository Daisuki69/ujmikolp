package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3137a;

    public B() {
        HashMap map = new HashMap();
        this.f3137a = map;
        map.put("sourceKey", "AMLC");
    }

    public final String a() {
        return (String) this.f3137a.get("sourceKey");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        B b8 = (B) obj;
        if (this.f3137a.containsKey("sourceKey") != b8.f3137a.containsKey("sourceKey")) {
            return false;
        }
        return a() == null ? b8.a() == null : a().equals(b8.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_amlc_upload_documents_fragment_to_maya_kyc_dnfbp_why_needed_bottom_sheet_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3137a;
        if (map.containsKey("sourceKey")) {
            bundle.putString("sourceKey", (String) map.get("sourceKey"));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_amlc_upload_documents_fragment_to_maya_kyc_dnfbp_why_needed_bottom_sheet_dialog_fragment);
    }

    public final String toString() {
        return "ActionMayaKycAmlcUploadDocumentsFragmentToMayaKycDnfbpWhyNeededBottomSheetDialogFragment(actionId=2131361939){sourceKey=" + a() + "}";
    }
}
