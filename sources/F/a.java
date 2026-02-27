package F;

import D.S;
import We.s;
import dOYHB6.tiZVw8.numX49;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import zj.C2576A;
import zj.o;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1491a;

    public a(String str) {
        this.f1491a = s.j(numX49.tnTj78("PcU"), str, numX49.tnTj78("Pce"));
    }

    public static byte[] c(int i, String str, byte[] bArr) {
        String strTnTj78 = numX49.tnTj78("Pc8");
        String strTnTj782 = numX49.tnTj78("PcC");
        try {
            Charset charset = StandardCharsets.UTF_8;
            kotlin.jvm.internal.j.f(charset, strTnTj782);
            byte[] bytes = "W1ZRCl3>".getBytes(charset);
            kotlin.jvm.internal.j.f(bytes, strTnTj78);
            byte[] bytes2 = "__CL3>3Rt#P__1V_".getBytes(charset);
            kotlin.jvm.internal.j.f(bytes2, strTnTj78);
            char[] charArray = str.toCharArray();
            kotlin.jvm.internal.j.f(charArray, "toCharArray(...)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWithMD5And128BitAES-CBC-OpenSSL").generateSecret(new PBEKeySpec(charArray, bytes, 1000, 256)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(i, secretKeySpec, new IvParameterSpec(bytes2));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            S.o(numX49.tnTj78("Pc4"), e);
            return null;
        }
    }

    @Override // F.d
    public final String a(String str) {
        byte[] bArr;
        byte[] bArrC;
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("Pco"));
        String strTnTj78 = numX49.tnTj78("PcK");
        try {
            String strSubstring = str.substring(1, str.length() - 1);
            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
            List listI = new o("\\s*,\\s*").i(0, C2576A.b0(strSubstring).toString());
            bArr = new byte[listI.size()];
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                bArr[i] = Byte.parseByte((String) listI.get(i));
            }
        } catch (Exception e) {
            S.o(strTnTj78, e);
            bArr = null;
        } catch (OutOfMemoryError e7) {
            S.o(strTnTj78, e7);
            bArr = null;
        }
        if (bArr == null || (bArrC = c(2, this.f1491a, bArr)) == null) {
            return null;
        }
        Charset charset = StandardCharsets.UTF_8;
        kotlin.jvm.internal.j.f(charset, numX49.tnTj78("Pcw"));
        return new String(bArrC, charset);
    }

    @Override // F.d
    public final String b(String str) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("Pcc"));
        Charset charset = StandardCharsets.UTF_8;
        kotlin.jvm.internal.j.f(charset, numX49.tnTj78("Pcm"));
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.j.f(bytes, numX49.tnTj78("PcD"));
        byte[] bArrC = c(1, this.f1491a, bytes);
        if (bArrC == null) {
            return null;
        }
        String string = Arrays.toString(bArrC);
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }
}
