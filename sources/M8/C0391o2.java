package M8;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0391o2 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3347a;

    public C0391o2() {
        HashMap map = new HashMap();
        this.f3347a = map;
        map.put("sourceKey", "SSNE");
    }

    public final String a() {
        return (String) this.f3347a.get("sourceKey");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0391o2.class != obj.getClass()) {
            return false;
        }
        C0391o2 c0391o2 = (C0391o2) obj;
        if (this.f3347a.containsKey("sourceKey") != c0391o2.f3347a.containsKey("sourceKey")) {
            return false;
        }
        return a() == null ? c0391o2.a() == null : a().equals(c0391o2.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_ssne_upload_documents_fragment_to_maya_kyc_dnfbp_why_needed_bottom_sheet_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3347a;
        if (map.containsKey("sourceKey")) {
            bundle.putString("sourceKey", (String) map.get("sourceKey"));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_ssne_upload_documents_fragment_to_maya_kyc_dnfbp_why_needed_bottom_sheet_dialog_fragment);
    }

    public final String toString() {
        return "ActionMayaKycSsneUploadDocumentsFragmentToMayaKycDnfbpWhyNeededBottomSheetDialogFragment(actionId=2131361989){sourceKey=" + a() + "}";
    }
}
