package eb;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.DataPrivacyProvision;
import dOYHB6.tiZVw8.numX49;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16633a;

    public h(Consent[] consentArr, DataPrivacyProvision[] dataPrivacyProvisionArr) {
        HashMap map = new HashMap();
        this.f16633a = map;
        map.put(numX49.tnTj78("bi9Px"), consentArr);
        map.put(numX49.tnTj78("bi9Ps"), dataPrivacyProvisionArr);
    }

    public final DataPrivacyProvision[] a() {
        return (DataPrivacyProvision[]) this.f16633a.get(numX49.tnTj78("bi9P5"));
    }

    public final Consent[] b() {
        return (Consent[]) this.f16633a.get(numX49.tnTj78("bi9PJ"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        HashMap map = this.f16633a;
        String strTnTj78 = numX49.tnTj78("bi9PI");
        boolean zContainsKey = map.containsKey(strTnTj78);
        HashMap map2 = hVar.f16633a;
        if (zContainsKey != map2.containsKey(strTnTj78)) {
            return false;
        }
        if (b() == null ? hVar.b() != null : !b().equals(hVar.b())) {
            return false;
        }
        String strTnTj782 = numX49.tnTj78("bi9Pq");
        if (map.containsKey(strTnTj782) != map2.containsKey(strTnTj782)) {
            return false;
        }
        return a() == null ? hVar.a() == null : a().equals(hVar.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_account_creation_fragment_to_maya_account_provision_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f16633a;
        String strTnTj78 = numX49.tnTj78("bi9Pz");
        if (map.containsKey(strTnTj78)) {
            bundle.putParcelableArray(strTnTj78, (Consent[]) map.get(strTnTj78));
        }
        String strTnTj782 = numX49.tnTj78("bi9Pl");
        if (map.containsKey(strTnTj782)) {
            bundle.putParcelableArray(strTnTj782, (DataPrivacyProvision[]) map.get(strTnTj782));
        }
        return bundle;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(a()) + ((Arrays.hashCode(b()) + 31) * 31)) * 31) + R.id.action_maya_account_creation_fragment_to_maya_account_provision_fragment;
    }

    public final String toString() {
        return numX49.tnTj78("bi9PW") + b() + numX49.tnTj78("bi9b9") + a() + numX49.tnTj78("bi9bP");
    }
}
