package Fa;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.PushApprovalPendingRequest;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1563a;

    public b(PushApprovalPendingRequest pushApprovalPendingRequest) {
        HashMap map = new HashMap();
        this.f1563a = map;
        map.put(numX49.tnTj78("bBtK"), pushApprovalPendingRequest);
    }

    public final PushApprovalPendingRequest a() {
        return (PushApprovalPendingRequest) this.f1563a.get(numX49.tnTj78("bBtw"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        HashMap map = this.f1563a;
        String strTnTj78 = numX49.tnTj78("bBtc");
        if (map.containsKey(strTnTj78) != bVar.f1563a.containsKey(strTnTj78)) {
            return false;
        }
        return a() == null ? bVar.a() == null : a().equals(bVar.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_push_approval_list_fragment_to_mayaPushApprovalViewRequestFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f1563a;
        String strTnTj78 = numX49.tnTj78("bBtm");
        if (map.containsKey(strTnTj78)) {
            PushApprovalPendingRequest pushApprovalPendingRequest = (PushApprovalPendingRequest) map.get(strTnTj78);
            if (!Parcelable.class.isAssignableFrom(PushApprovalPendingRequest.class) && pushApprovalPendingRequest != null) {
                if (!Serializable.class.isAssignableFrom(PushApprovalPendingRequest.class)) {
                    throw new UnsupportedOperationException(PushApprovalPendingRequest.class.getName().concat(numX49.tnTj78("bBtD")));
                }
                bundle.putSerializable(strTnTj78, (Serializable) Serializable.class.cast(pushApprovalPendingRequest));
                return bundle;
            }
            bundle.putParcelable(strTnTj78, (Parcelable) Parcelable.class.cast(pushApprovalPendingRequest));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_push_approval_list_fragment_to_mayaPushApprovalViewRequestFragment);
    }

    public final String toString() {
        return numX49.tnTj78("bBth") + a() + numX49.tnTj78("bBtM");
    }
}
