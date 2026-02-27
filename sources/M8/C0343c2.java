package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0343c2 implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3279a = new HashMap();

    @NonNull
    public static C0343c2 fromBundle(@NonNull Bundle bundle) {
        C0343c2 c0343c2 = new C0343c2();
        bundle.setClassLoader(C0343c2.class.getClassLoader());
        if (!bundle.containsKey("idPage")) {
            throw new IllegalArgumentException("Required argument \"idPage\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("idPage");
        HashMap map = c0343c2.f3279a;
        map.put("idPage", string);
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
        map.put("selectedDocument", mayaEKYCSelectedDocument);
        if (!bundle.containsKey("isSelectedFromSecondaryIdScreen")) {
            throw new IllegalArgumentException("Required argument \"isSelectedFromSecondaryIdScreen\" is missing and does not have an android:defaultValue");
        }
        map.put("isSelectedFromSecondaryIdScreen", Boolean.valueOf(bundle.getBoolean("isSelectedFromSecondaryIdScreen")));
        return c0343c2;
    }

    public final String a() {
        return (String) this.f3279a.get("idPage");
    }

    public final boolean b() {
        return ((Boolean) this.f3279a.get("isSelectedFromSecondaryIdScreen")).booleanValue();
    }

    public final MayaEKYCSelectedDocument c() {
        return (MayaEKYCSelectedDocument) this.f3279a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0343c2.class != obj.getClass()) {
            return false;
        }
        C0343c2 c0343c2 = (C0343c2) obj;
        HashMap map = this.f3279a;
        boolean zContainsKey = map.containsKey("idPage");
        HashMap map2 = c0343c2.f3279a;
        if (zContainsKey != map2.containsKey("idPage")) {
            return false;
        }
        if (a() == null ? c0343c2.a() != null : !a().equals(c0343c2.a())) {
            return false;
        }
        if (map.containsKey("selectedDocument") != map2.containsKey("selectedDocument")) {
            return false;
        }
        if (c() == null ? c0343c2.c() == null : c().equals(c0343c2.c())) {
            return map.containsKey("isSelectedFromSecondaryIdScreen") == map2.containsKey("isSelectedFromSecondaryIdScreen") && b() == c0343c2.b();
        }
        return false;
    }

    public final int hashCode() {
        return (b() ? 1 : 0) + (((((a() != null ? a().hashCode() : 0) + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MayaKycSimpleCaptureV3FragmentArgs{idPage=" + a() + ", selectedDocument=" + c() + ", isSelectedFromSecondaryIdScreen=" + b() + "}";
    }
}
