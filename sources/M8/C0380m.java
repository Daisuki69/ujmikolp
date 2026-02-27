package M8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.paymaya.domain.model.KycPersonalInfoSnapshot;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0380m implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3334a = new HashMap();

    @NonNull
    public static C0380m fromBundle(@NonNull Bundle bundle) {
        C0380m c0380m = new C0380m();
        bundle.setClassLoader(C0380m.class.getClassLoader());
        boolean zContainsKey = bundle.containsKey("personalInfoSnapshot");
        HashMap map = c0380m.f3334a;
        if (!zContainsKey) {
            map.put("personalInfoSnapshot", null);
            return c0380m;
        }
        if (!Parcelable.class.isAssignableFrom(KycPersonalInfoSnapshot.class) && !Serializable.class.isAssignableFrom(KycPersonalInfoSnapshot.class)) {
            throw new UnsupportedOperationException(KycPersonalInfoSnapshot.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        map.put("personalInfoSnapshot", (KycPersonalInfoSnapshot) bundle.get("personalInfoSnapshot"));
        return c0380m;
    }

    public final KycPersonalInfoSnapshot a() {
        return (KycPersonalInfoSnapshot) this.f3334a.get("personalInfoSnapshot");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0380m.class != obj.getClass()) {
            return false;
        }
        C0380m c0380m = (C0380m) obj;
        if (this.f3334a.containsKey("personalInfoSnapshot") != c0380m.f3334a.containsKey("personalInfoSnapshot")) {
            return false;
        }
        return a() == null ? c0380m.a() == null : a().equals(c0380m.a());
    }

    public final int hashCode() {
        return 31 + (a() != null ? a().hashCode() : 0);
    }

    public final String toString() {
        return "MayaKycAdditionalDocumentsFragmentArgs{personalInfoSnapshot=" + a() + "}";
    }
}
