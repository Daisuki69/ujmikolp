package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.paymaya.R;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0420w0 implements NavDirections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3381a;

    public C0420w0(MayaEKYCSelectedDocument mayaEKYCSelectedDocument, boolean z4) {
        HashMap map = new HashMap();
        this.f3381a = map;
        map.put("selectedDocument", mayaEKYCSelectedDocument);
        map.put("isSelectedFromSecondaryIdScreen", Boolean.valueOf(z4));
    }

    public final boolean a() {
        return ((Boolean) this.f3381a.get("isSelectedFromSecondaryIdScreen")).booleanValue();
    }

    public final MayaEKYCSelectedDocument b() {
        return (MayaEKYCSelectedDocument) this.f3381a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0420w0.class != obj.getClass()) {
            return false;
        }
        C0420w0 c0420w0 = (C0420w0) obj;
        HashMap map = this.f3381a;
        boolean zContainsKey = map.containsKey("selectedDocument");
        HashMap map2 = c0420w0.f3381a;
        if (zContainsKey != map2.containsKey("selectedDocument")) {
            return false;
        }
        if (b() == null ? c0420w0.b() == null : b().equals(c0420w0.b())) {
            return map.containsKey("isSelectedFromSecondaryIdScreen") == map2.containsKey("isSelectedFromSecondaryIdScreen") && a() == c0420w0.a();
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public final int getActionId() {
        return R.id.action_maya_kyc_document_id_guide_fragment_to_maya_kyc_take_id_photo_fragment;
    }

    @Override // androidx.navigation.NavDirections
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        HashMap map = this.f3381a;
        if (map.containsKey("selectedDocument")) {
            MayaEKYCSelectedDocument mayaEKYCSelectedDocument = (MayaEKYCSelectedDocument) map.get("selectedDocument");
            if (Parcelable.class.isAssignableFrom(MayaEKYCSelectedDocument.class) || mayaEKYCSelectedDocument == null) {
                bundle.putParcelable("selectedDocument", (Parcelable) Parcelable.class.cast(mayaEKYCSelectedDocument));
            } else {
                if (!Serializable.class.isAssignableFrom(MayaEKYCSelectedDocument.class)) {
                    throw new UnsupportedOperationException(MayaEKYCSelectedDocument.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("selectedDocument", (Serializable) Serializable.class.cast(mayaEKYCSelectedDocument));
            }
        }
        if (map.containsKey("isSelectedFromSecondaryIdScreen")) {
            bundle.putBoolean("isSelectedFromSecondaryIdScreen", ((Boolean) map.get("isSelectedFromSecondaryIdScreen")).booleanValue());
        }
        return bundle;
    }

    public final int hashCode() {
        return (((a() ? 1 : 0) + (((b() != null ? b().hashCode() : 0) + 31) * 31)) * 31) + R.id.action_maya_kyc_document_id_guide_fragment_to_maya_kyc_take_id_photo_fragment;
    }

    public final String toString() {
        return "ActionMayaKycDocumentIdGuideFragmentToMayaKycTakeIdPhotoFragment(actionId=2131361948){selectedDocument=" + b() + ", isSelectedFromSecondaryIdScreen=" + a() + "}";
    }
}
