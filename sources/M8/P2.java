package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class P2 implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3209a = new HashMap();

    @NonNull
    public static P2 fromBundle(@NonNull Bundle bundle) {
        P2 p22 = new P2();
        bundle.setClassLoader(P2.class.getClassLoader());
        if (!bundle.containsKey("selectedDocument")) {
            throw new IllegalArgumentException("Required argument \"selectedDocument\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(MayaEKYCSelectedDocument.class) && !Serializable.class.isAssignableFrom(MayaEKYCSelectedDocument.class)) {
            throw new UnsupportedOperationException(MayaEKYCSelectedDocument.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument = (MayaEKYCSelectedDocument) bundle.get("selectedDocument");
        HashMap map = p22.f3209a;
        map.put("selectedDocument", mayaEKYCSelectedDocument);
        if (!bundle.containsKey("isSelectedFromSecondaryIdScreen")) {
            throw new IllegalArgumentException("Required argument \"isSelectedFromSecondaryIdScreen\" is missing and does not have an android:defaultValue");
        }
        map.put("isSelectedFromSecondaryIdScreen", Boolean.valueOf(bundle.getBoolean("isSelectedFromSecondaryIdScreen")));
        return p22;
    }

    public final boolean a() {
        return ((Boolean) this.f3209a.get("isSelectedFromSecondaryIdScreen")).booleanValue();
    }

    public final MayaEKYCSelectedDocument b() {
        return (MayaEKYCSelectedDocument) this.f3209a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P2.class != obj.getClass()) {
            return false;
        }
        P2 p22 = (P2) obj;
        HashMap map = this.f3209a;
        boolean zContainsKey = map.containsKey("selectedDocument");
        HashMap map2 = p22.f3209a;
        if (zContainsKey != map2.containsKey("selectedDocument")) {
            return false;
        }
        if (b() == null ? p22.b() == null : b().equals(p22.b())) {
            return map.containsKey("isSelectedFromSecondaryIdScreen") == map2.containsKey("isSelectedFromSecondaryIdScreen") && a() == p22.a();
        }
        return false;
    }

    public final int hashCode() {
        return (a() ? 1 : 0) + (((b() != null ? b().hashCode() : 0) + 31) * 31);
    }

    public final String toString() {
        return "MayaKycUploadPhilsysIdFragmentArgs{selectedDocument=" + b() + ", isSelectedFromSecondaryIdScreen=" + a() + "}";
    }
}
