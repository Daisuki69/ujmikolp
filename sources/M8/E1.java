package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.paymaya.domain.model.KycPersonalInfoSnapshot;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class E1 implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3157a = new HashMap();

    @NonNull
    public static E1 fromBundle(@NonNull Bundle bundle) {
        E1 e12 = new E1();
        bundle.setClassLoader(E1.class.getClassLoader());
        if (!bundle.containsKey("personalInfoSnapshot")) {
            throw new IllegalArgumentException("Required argument \"personalInfoSnapshot\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(KycPersonalInfoSnapshot.class) && !Serializable.class.isAssignableFrom(KycPersonalInfoSnapshot.class)) {
            throw new UnsupportedOperationException(KycPersonalInfoSnapshot.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        KycPersonalInfoSnapshot kycPersonalInfoSnapshot = (KycPersonalInfoSnapshot) bundle.get("personalInfoSnapshot");
        if (kycPersonalInfoSnapshot == null) {
            throw new IllegalArgumentException("Argument \"personalInfoSnapshot\" is marked as non-null but was passed a null value.");
        }
        HashMap map = e12.f3157a;
        map.put("personalInfoSnapshot", kycPersonalInfoSnapshot);
        if (!bundle.containsKey("isMinor")) {
            throw new IllegalArgumentException("Required argument \"isMinor\" is missing and does not have an android:defaultValue");
        }
        map.put("isMinor", Boolean.valueOf(bundle.getBoolean("isMinor")));
        return e12;
    }

    public final boolean a() {
        return ((Boolean) this.f3157a.get("isMinor")).booleanValue();
    }

    public final KycPersonalInfoSnapshot b() {
        return (KycPersonalInfoSnapshot) this.f3157a.get("personalInfoSnapshot");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E1.class != obj.getClass()) {
            return false;
        }
        E1 e12 = (E1) obj;
        HashMap map = this.f3157a;
        boolean zContainsKey = map.containsKey("personalInfoSnapshot");
        HashMap map2 = e12.f3157a;
        if (zContainsKey != map2.containsKey("personalInfoSnapshot")) {
            return false;
        }
        if (b() == null ? e12.b() == null : b().equals(e12.b())) {
            return map.containsKey("isMinor") == map2.containsKey("isMinor") && a() == e12.a();
        }
        return false;
    }

    public final int hashCode() {
        return (a() ? 1 : 0) + (((b() != null ? b().hashCode() : 0) + 31) * 31);
    }

    public final String toString() {
        return "MayaKycPersonalInfoConfirmSubmissionFragmentArgs{personalInfoSnapshot=" + b() + ", isMinor=" + a() + "}";
    }
}
