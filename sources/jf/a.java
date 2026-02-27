package jf;

import com.dynatrace.android.agent.Global;
import java.util.Locale;
import of.C1976a;
import okhttp3.internal.http2.Header;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1976a f17737d = C1976a.d(Global.COLON);
    public static final C1976a e = C1976a.d(Header.RESPONSE_STATUS_UTF8);
    public static final C1976a f = C1976a.d(Header.TARGET_METHOD_UTF8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1976a f17738g = C1976a.d(Header.TARGET_PATH_UTF8);
    public static final C1976a h = C1976a.d(Header.TARGET_SCHEME_UTF8);
    public static final C1976a i = C1976a.d(Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1976a f17739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1976a f17740b;
    public final int c;

    public a(String str, String str2) {
        this(C1976a.d(str), C1976a.d(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f17739a.equals(aVar.f17739a) && this.f17740b.equals(aVar.f17740b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17740b.hashCode() + ((this.f17739a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String strL = this.f17739a.l();
        String strL2 = this.f17740b.l();
        byte[] bArr = ef.c.f16663a;
        Locale locale = Locale.US;
        return androidx.camera.core.impl.a.j(strL, ": ", strL2);
    }

    public a(C1976a c1976a, C1976a c1976a2) {
        this.f17739a = c1976a;
        this.f17740b = c1976a2;
        this.c = c1976a2.size() + c1976a.size() + 32;
    }
}
