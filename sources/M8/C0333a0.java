package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.KycSelectionModel;
import d4.AbstractC1331a;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0333a0 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3263a;

    public C0333a0(KycSelectionModel kycSelectionModel) {
        HashMap map = new HashMap();
        this.f3263a = map;
        map.put("uiModel", kycSelectionModel);
    }

    public final KycSelectionModel a() {
        return (KycSelectionModel) this.f3263a.get("uiModel");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0333a0.class != obj.getClass()) {
            return false;
        }
        C0333a0 c0333a0 = (C0333a0) obj;
        if (this.f3263a.containsKey("uiModel") != c0333a0.f3263a.containsKey("uiModel")) {
            return false;
        }
        return a() == null ? c0333a0.a() == null : a().equals(c0333a0.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_to_single_selection_bottom_sheet_dialog_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3263a;
        if (map.containsKey("uiModel")) {
            KycSelectionModel kycSelectionModel = (KycSelectionModel) map.get("uiModel");
            if (!Parcelable.class.isAssignableFrom(KycSelectionModel.class) && kycSelectionModel != null) {
                if (!Serializable.class.isAssignableFrom(KycSelectionModel.class)) {
                    throw new UnsupportedOperationException(KycSelectionModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("uiModel", (Serializable) Serializable.class.cast(kycSelectionModel));
                return bundle;
            }
            bundle.putParcelable("uiModel", (Parcelable) Parcelable.class.cast(kycSelectionModel));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_to_single_selection_bottom_sheet_dialog_fragment);
    }

    public final String toString() {
        return "ActionToSingleSelectionBottomSheetDialogFragment(actionId=2131362044){uiModel=" + a() + "}";
    }
}
