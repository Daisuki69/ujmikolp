package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0408t0 implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3370a = new HashMap();

    @NonNull
    public static C0408t0 fromBundle(@NonNull Bundle bundle) {
        C0408t0 c0408t0 = new C0408t0();
        bundle.setClassLoader(C0408t0.class.getClassLoader());
        if (!bundle.containsKey("selectedDocument")) {
            throw new IllegalArgumentException("Required argument \"selectedDocument\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(MayaEKYCSelectedDocument.class) && !Serializable.class.isAssignableFrom(MayaEKYCSelectedDocument.class)) {
            throw new UnsupportedOperationException(MayaEKYCSelectedDocument.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument = (MayaEKYCSelectedDocument) bundle.get("selectedDocument");
        if (mayaEKYCSelectedDocument == null) {
            throw new IllegalArgumentException("Argument \"selectedDocument\" is marked as non-null but was passed a null value.");
        }
        HashMap map = c0408t0.f3370a;
        map.put("selectedDocument", mayaEKYCSelectedDocument);
        if (!bundle.containsKey("isSelectedFromSecondaryIdScreen")) {
            throw new IllegalArgumentException("Required argument \"isSelectedFromSecondaryIdScreen\" is missing and does not have an android:defaultValue");
        }
        map.put("isSelectedFromSecondaryIdScreen", Boolean.valueOf(bundle.getBoolean("isSelectedFromSecondaryIdScreen")));
        return c0408t0;
    }

    public final boolean a() {
        return ((Boolean) this.f3370a.get("isSelectedFromSecondaryIdScreen")).booleanValue();
    }

    public final MayaEKYCSelectedDocument b() {
        return (MayaEKYCSelectedDocument) this.f3370a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0408t0.class != obj.getClass()) {
            return false;
        }
        C0408t0 c0408t0 = (C0408t0) obj;
        HashMap map = this.f3370a;
        boolean zContainsKey = map.containsKey("selectedDocument");
        HashMap map2 = c0408t0.f3370a;
        if (zContainsKey != map2.containsKey("selectedDocument")) {
            return false;
        }
        if (b() == null ? c0408t0.b() == null : b().equals(c0408t0.b())) {
            return map.containsKey("isSelectedFromSecondaryIdScreen") == map2.containsKey("isSelectedFromSecondaryIdScreen") && a() == c0408t0.a();
        }
        return false;
    }

    public final int hashCode() {
        return (a() ? 1 : 0) + (((b() != null ? b().hashCode() : 0) + 31) * 31);
    }

    public final String toString() {
        return "MayaKycDocumentIdGuideFragmentArgs{selectedDocument=" + b() + ", isSelectedFromSecondaryIdScreen=" + a() + "}";
    }
}
