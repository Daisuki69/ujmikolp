package Fa;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1570a;

    public f(String str) {
        HashMap map = new HashMap();
        this.f1570a = map;
        if (str == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bBtf"));
        }
        map.put(numX49.tnTj78("bBtg"), str);
    }

    public final String a() {
        return (String) this.f1570a.get(numX49.tnTj78("bBt1"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        HashMap map = this.f1570a;
        String strTnTj78 = numX49.tnTj78("bBtn");
        if (map.containsKey(strTnTj78) != fVar.f1570a.containsKey(strTnTj78)) {
            return false;
        }
        return a() == null ? fVar.a() == null : a().equals(fVar.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_mayaPushApprovalViewRequestFragment_to_mayaPushApprovalRequestAuthorizedBottomSheetDialogFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f1570a;
        String strTnTj78 = numX49.tnTj78("bBtx");
        if (map.containsKey(strTnTj78)) {
            bundle.putString(strTnTj78, (String) map.get(strTnTj78));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_mayaPushApprovalViewRequestFragment_to_mayaPushApprovalRequestAuthorizedBottomSheetDialogFragment);
    }

    public final String toString() {
        return numX49.tnTj78("bBts") + a() + numX49.tnTj78("bBt5");
    }
}
