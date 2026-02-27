package eb;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.DataPrivacyProvision;
import dOYHB6.tiZVw8.numX49;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16640a = new HashMap();

    @NonNull
    public static m fromBundle(@NonNull Bundle bundle) {
        Consent[] consentArr;
        m mVar = new m();
        bundle.setClassLoader(m.class.getClassLoader());
        String strTnTj78 = numX49.tnTj78("bi9PO");
        if (!bundle.containsKey(strTnTj78)) {
            throw new IllegalArgumentException(numX49.tnTj78("bi9PU"));
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray(strTnTj78);
        DataPrivacyProvision[] dataPrivacyProvisionArr = null;
        if (parcelableArray != null) {
            consentArr = new Consent[parcelableArray.length];
            System.arraycopy(parcelableArray, 0, consentArr, 0, parcelableArray.length);
        } else {
            consentArr = null;
        }
        HashMap map = mVar.f16640a;
        map.put(strTnTj78, consentArr);
        String strTnTj782 = numX49.tnTj78("bi9PQ");
        if (!bundle.containsKey(strTnTj782)) {
            throw new IllegalArgumentException(numX49.tnTj78("bi9Pt"));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray(strTnTj782);
        if (parcelableArray2 != null) {
            dataPrivacyProvisionArr = new DataPrivacyProvision[parcelableArray2.length];
            System.arraycopy(parcelableArray2, 0, dataPrivacyProvisionArr, 0, parcelableArray2.length);
        }
        map.put(strTnTj782, dataPrivacyProvisionArr);
        return mVar;
    }

    public final DataPrivacyProvision[] a() {
        return (DataPrivacyProvision[]) this.f16640a.get(numX49.tnTj78("bi9Pe"));
    }

    public final Consent[] b() {
        return (Consent[]) this.f16640a.get(numX49.tnTj78("bi9P8"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        HashMap map = this.f16640a;
        String strTnTj78 = numX49.tnTj78("bi9PC");
        boolean zContainsKey = map.containsKey(strTnTj78);
        HashMap map2 = mVar.f16640a;
        if (zContainsKey != map2.containsKey(strTnTj78)) {
            return false;
        }
        if (b() == null ? mVar.b() != null : !b().equals(mVar.b())) {
            return false;
        }
        String strTnTj782 = numX49.tnTj78("bi9P4");
        if (map.containsKey(strTnTj782) != map2.containsKey(strTnTj782)) {
            return false;
        }
        return a() == null ? mVar.a() == null : a().equals(mVar.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(a()) + ((Arrays.hashCode(b()) + 31) * 31);
    }

    public final String toString() {
        return numX49.tnTj78("bi9Po") + b() + numX49.tnTj78("bi9PK") + a() + numX49.tnTj78("bi9Pw");
    }
}
