package com.shield.android.shieldsignature;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.j;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15490a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f15491b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public final String a(String baseString, String keyString) throws GeneralSecurityException {
        j.g(baseString, "baseString");
        j.g(keyString, "keyString");
        Charset charset = C2581c.f21468b;
        byte[] bytes = keyString.getBytes(charset);
        j.f(bytes, "this as java.lang.String).getBytes(charset)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        j.f(mac, "getInstance(\"HmacSHA256\")");
        mac.init(secretKeySpec);
        byte[] bytes2 = baseString.getBytes(charset);
        j.f(bytes2, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDoFinal = mac.doFinal(bytes2);
        j.f(bArrDoFinal, "mac.doFinal(baseString.toByteArray())");
        ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
        j.f(BIG_ENDIAN, "BIG_ENDIAN");
        char[] cArr = new char[bArrDoFinal.length * 2];
        char[] cArr2 = f15491b;
        int length = bArrDoFinal.length;
        for (int i = 0; i < length; i++) {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            int i4 = i << 1;
            byte b8 = bArrDoFinal[i];
            cArr[i4] = cArr2[(b8 >> 4) & 15];
            cArr[i4 + 1] = cArr2[b8 & 15];
        }
        return new String(cArr);
    }
}
