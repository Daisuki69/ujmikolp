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
public final class g implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1571a;

    public g(PushApprovalPendingRequest pushApprovalPendingRequest) {
        HashMap map = new HashMap();
        this.f1571a = map;
        if (pushApprovalPendingRequest == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bBt7"));
        }
        map.put(numX49.tnTj78("bBtv"), pushApprovalPendingRequest);
    }

    public final PushApprovalPendingRequest a() {
        return (PushApprovalPendingRequest) this.f1571a.get(numX49.tnTj78("bBtA"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        HashMap map = this.f1571a;
        String strTnTj78 = numX49.tnTj78("bBtY");
        if (map.containsKey(strTnTj78) != gVar.f1571a.containsKey(strTnTj78)) {
            return false;
        }
        return a() == null ? gVar.a() == null : a().equals(gVar.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_push_approval_view_request_fragment_to_mayaPushApprovalRequestDeniedFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f1571a;
        String strTnTj78 = numX49.tnTj78("bBtT");
        if (map.containsKey(strTnTj78)) {
            PushApprovalPendingRequest pushApprovalPendingRequest = (PushApprovalPendingRequest) map.get(strTnTj78);
            if (!Parcelable.class.isAssignableFrom(PushApprovalPendingRequest.class) && pushApprovalPendingRequest != null) {
                if (!Serializable.class.isAssignableFrom(PushApprovalPendingRequest.class)) {
                    throw new UnsupportedOperationException(PushApprovalPendingRequest.class.getName().concat(numX49.tnTj78("bBtR")));
                }
                bundle.putSerializable(strTnTj78, (Serializable) Serializable.class.cast(pushApprovalPendingRequest));
                return bundle;
            }
            bundle.putParcelable(strTnTj78, (Parcelable) Parcelable.class.cast(pushApprovalPendingRequest));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_push_approval_view_request_fragment_to_mayaPushApprovalRequestDeniedFragment);
    }

    public final String toString() {
        return numX49.tnTj78("bBtp") + a() + numX49.tnTj78("bBt0");
    }
}
