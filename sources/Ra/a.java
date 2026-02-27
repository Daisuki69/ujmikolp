package Ra;

import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.Y;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f5472d;
    public final Y e;
    public final C1293x0 f;

    public a(com.paymaya.data.preference.a mPreference, Y y7, C1293x0 c1293x0) {
        j.g(mPreference, "mPreference");
        this.f5472d = mPreference;
        this.e = y7;
        this.f = c1293x0;
    }

    public final String k() {
        if (!this.f5472d.e().isMayaV2SetUsernameEnabled()) {
            return "";
        }
        Y y7 = this.e;
        String strB = y7.b();
        j.f(strB, "getUsernameIdentity(...)");
        if (strB.length() <= 0) {
            return "";
        }
        String strB2 = y7.b();
        j.f(strB2, "getUsernameIdentity(...)");
        return strB2;
    }
}
