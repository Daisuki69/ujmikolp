package Fa;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1572a;

    public h(String str) {
        HashMap map = new HashMap();
        this.f1572a = map;
        if (str == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bBt6"));
        }
        map.put(numX49.tnTj78("bBtN"), str);
    }

    public final String a() {
        return (String) this.f1572a.get(numX49.tnTj78("bBta"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        HashMap map = this.f1572a;
        String strTnTj78 = numX49.tnTj78("bBtX");
        if (map.containsKey(strTnTj78) != hVar.f1572a.containsKey(strTnTj78)) {
            return false;
        }
        return a() == null ? hVar.a() == null : a().equals(hVar.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_mayaPushApprovalViewRequestFragment_to_mayaPushApprovalRequestExpiredBottomSheetDialogFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f1572a;
        String strTnTj78 = numX49.tnTj78("bBtG");
        if (map.containsKey(strTnTj78)) {
            bundle.putString(strTnTj78, (String) map.get(strTnTj78));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_mayaPushApprovalViewRequestFragment_to_mayaPushApprovalRequestExpiredBottomSheetDialogFragment);
    }

    public final String toString() {
        return numX49.tnTj78("bBt3") + a() + numX49.tnTj78("bBty");
    }
}
