package F5;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f1550a = "0123456789abcdef".toCharArray();

    public static String a(String str, String str2, String str3) throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), str3);
        Mac mac = Mac.getInstance(str3);
        mac.init(secretKeySpec);
        byte[] bArrDoFinal = mac.doFinal(str2.getBytes());
        char[] cArr = new char[bArrDoFinal.length * 2];
        for (int i = 0; i < bArrDoFinal.length; i++) {
            byte b8 = bArrDoFinal[i];
            int i4 = i * 2;
            char[] cArr2 = f1550a;
            cArr[i4] = cArr2[(b8 & 255) >>> 4];
            cArr[i4 + 1] = cArr2[b8 & 15];
        }
        return new String(cArr);
    }
}
