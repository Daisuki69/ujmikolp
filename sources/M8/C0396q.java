package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.mayaui.kyczoloz.utils.KycMinorDocument;
import d4.AbstractC1331a;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0396q implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3353a;

    public C0396q(KycMinorDocument kycMinorDocument) {
        HashMap map = new HashMap();
        this.f3353a = map;
        map.put("kycMinorDocument", kycMinorDocument);
    }

    public final KycMinorDocument a() {
        return (KycMinorDocument) this.f3353a.get("kycMinorDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0396q.class != obj.getClass()) {
            return false;
        }
        C0396q c0396q = (C0396q) obj;
        if (this.f3353a.containsKey("kycMinorDocument") != c0396q.f3353a.containsKey("kycMinorDocument")) {
            return false;
        }
        return a() == null ? c0396q.a() == null : a().equals(c0396q.a());
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_additional_documents_header_to_mayaKycMinorTakeAPhotoFragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3353a;
        if (map.containsKey("kycMinorDocument")) {
            KycMinorDocument kycMinorDocument = (KycMinorDocument) map.get("kycMinorDocument");
            if (!Parcelable.class.isAssignableFrom(KycMinorDocument.class) && kycMinorDocument != null) {
                if (!Serializable.class.isAssignableFrom(KycMinorDocument.class)) {
                    throw new UnsupportedOperationException(KycMinorDocument.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("kycMinorDocument", (Serializable) Serializable.class.cast(kycMinorDocument));
                return bundle;
            }
            bundle.putParcelable("kycMinorDocument", (Parcelable) Parcelable.class.cast(kycMinorDocument));
        }
        return bundle;
    }

    public final int hashCode() {
        return AbstractC1331a.k(31, a() != null ? a().hashCode() : 0, 31, R.id.action_maya_kyc_additional_documents_header_to_mayaKycMinorTakeAPhotoFragment);
    }

    public final String toString() {
        return "ActionMayaKycAdditionalDocumentsHeaderToMayaKycMinorTakeAPhotoFragment(actionId=2131361933){kycMinorDocument=" + a() + "}";
    }
}
