package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.paymaya.mayaui.kyczoloz.utils.KycMinorDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0425x1 implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3386a = new HashMap();

    @NonNull
    public static C0425x1 fromBundle(@NonNull Bundle bundle) {
        C0425x1 c0425x1 = new C0425x1();
        bundle.setClassLoader(C0425x1.class.getClassLoader());
        if (!bundle.containsKey("kycMinorDocument")) {
            throw new IllegalArgumentException("Required argument \"kycMinorDocument\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(KycMinorDocument.class) && !Serializable.class.isAssignableFrom(KycMinorDocument.class)) {
            throw new UnsupportedOperationException(KycMinorDocument.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        c0425x1.f3386a.put("kycMinorDocument", (KycMinorDocument) bundle.get("kycMinorDocument"));
        return c0425x1;
    }

    public final KycMinorDocument a() {
        return (KycMinorDocument) this.f3386a.get("kycMinorDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0425x1.class != obj.getClass()) {
            return false;
        }
        C0425x1 c0425x1 = (C0425x1) obj;
        if (this.f3386a.containsKey("kycMinorDocument") != c0425x1.f3386a.containsKey("kycMinorDocument")) {
            return false;
        }
        return a() == null ? c0425x1.a() == null : a().equals(c0425x1.a());
    }

    public final int hashCode() {
        return 31 + (a() != null ? a().hashCode() : 0);
    }

    public final String toString() {
        return "MayaKycMinorTakeAPhotoFragmentArgs{kycMinorDocument=" + a() + "}";
    }
}
