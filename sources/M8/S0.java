package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.paymaya.mayaui.kyczoloz.utils.KycMinorDocument;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class S0 implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3223a = new HashMap();

    @NonNull
    public static S0 fromBundle(@NonNull Bundle bundle) {
        S0 s02 = new S0();
        bundle.setClassLoader(S0.class.getClassLoader());
        if (!bundle.containsKey("kycMinorDocument")) {
            throw new IllegalArgumentException("Required argument \"kycMinorDocument\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(KycMinorDocument.class) && !Serializable.class.isAssignableFrom(KycMinorDocument.class)) {
            throw new UnsupportedOperationException(KycMinorDocument.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        s02.f3223a.put("kycMinorDocument", (KycMinorDocument) bundle.get("kycMinorDocument"));
        return s02;
    }

    public final KycMinorDocument a() {
        return (KycMinorDocument) this.f3223a.get("kycMinorDocument");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S0.class != obj.getClass()) {
            return false;
        }
        S0 s02 = (S0) obj;
        if (this.f3223a.containsKey("kycMinorDocument") != s02.f3223a.containsKey("kycMinorDocument")) {
            return false;
        }
        return a() == null ? s02.a() == null : a().equals(s02.a());
    }

    public final int hashCode() {
        return 31 + (a() != null ? a().hashCode() : 0);
    }

    public final String toString() {
        return "MayaKycEverythingClearFragmentArgs{kycMinorDocument=" + a() + "}";
    }
}
