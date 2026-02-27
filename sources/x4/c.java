package X4;

import com.google.gson.j;
import com.google.gson.q;
import com.paymaya.adkit.data.network.AdUserTagApi;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdUserTagApi f6530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f6531b = new j();

    public c(AdUserTagApi adUserTagApi) {
        this.f6530a = adUserTagApi;
    }

    public static RequestBody a(String str) {
        q qVar = new q();
        qVar.l("adsTagId", str);
        MediaType mediaType = MediaType.Companion.parse("application/json; charset=utf-8");
        String string = qVar.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.j.f(charsetForName, "forName(...)");
        byte[] bytes = string.getBytes(charsetForName);
        kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
        return RequestBody.Companion.create(bytes, mediaType, 0, bytes.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, ij.AbstractC1609c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.c.b(java.lang.String, ij.c):java.lang.Object");
    }
}
