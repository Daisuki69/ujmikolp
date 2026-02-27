package bg;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: bg.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0952A {
    public static String a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
        base64OutputStream.write(bArr);
        base64OutputStream.close();
        String string = byteArrayOutputStream.toString();
        kotlin.jvm.internal.j.c(string, "byteArrayOutputStream.toString()");
        byteArrayOutputStream.close();
        return string;
    }
}
