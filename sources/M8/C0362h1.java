package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0362h1 implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3310a = new HashMap();

    @NonNull
    public static C0362h1 fromBundle(@NonNull Bundle bundle) {
        C0362h1 c0362h1 = new C0362h1();
        bundle.setClassLoader(C0362h1.class.getClassLoader());
        if (!bundle.containsKey("idPage")) {
            throw new IllegalArgumentException("Required argument \"idPage\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("idPage");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"idPage\" is marked as non-null but was passed a null value.");
        }
        HashMap map = c0362h1.f3310a;
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
        if (bundle.containsKey("isFromPhilSysUpload")) {
            map.put("isFromPhilSysUpload", Boolean.valueOf(bundle.getBoolean("isFromPhilSysUpload")));
            return c0362h1;
        }
        map.put("isFromPhilSysUpload", Boolean.FALSE);
        return c0362h1;
    }

    public final String a() {
        return (String) this.f3310a.get("idPage");
    }

    public final boolean b() {
        return ((Boolean) this.f3310a.get("isFromPhilSysUpload")).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.f3310a.get("isSelectedFromSecondaryIdScreen")).booleanValue();
    }

    public final MayaEKYCSelectedDocument d() {
        return (MayaEKYCSelectedDocument) this.f3310a.get("selectedDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0362h1.class != obj.getClass()) {
            return false;
        }
        C0362h1 c0362h1 = (C0362h1) obj;
        HashMap map = this.f3310a;
        boolean zContainsKey = map.containsKey("idPage");
        HashMap map2 = c0362h1.f3310a;
        if (zContainsKey != map2.containsKey("idPage")) {
            return false;
        }
        if (a() == null ? c0362h1.a() != null : !a().equals(c0362h1.a())) {
            return false;
        }
        if (map.containsKey("selectedDocument") != map2.containsKey("selectedDocument")) {
            return false;
        }
        if (d() == null ? c0362h1.d() == null : d().equals(c0362h1.d())) {
            return map.containsKey("isSelectedFromSecondaryIdScreen") == map2.containsKey("isSelectedFromSecondaryIdScreen") && c() == c0362h1.c() && map.containsKey("isFromPhilSysUpload") == map2.containsKey("isFromPhilSysUpload") && b() == c0362h1.b();
        }
        return false;
    }

    public final int hashCode() {
        return (b() ? 1 : 0) + (((c() ? 1 : 0) + (((((a() != null ? a().hashCode() : 0) + 31) * 31) + (d() != null ? d().hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "MayaKycIdReviewFragmentArgs{idPage=" + a() + ", selectedDocument=" + d() + ", isSelectedFromSecondaryIdScreen=" + c() + ", isFromPhilSysUpload=" + b() + "}";
    }
}
