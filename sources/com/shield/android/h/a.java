package com.shield.android.h;

import android.util.Base64;
import com.dynatrace.android.agent.Global;
import com.shield.android.internal.NativeUtils;
import com.shield.android.internal.f;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    private final NativeUtils jT;

    public a(NativeUtils nativeUtils) {
        this.jT = nativeUtils;
    }

    public static ByteBuffer a(List<com.shield.android.t.a> list, com.shield.android.u.b bVar) throws com.shield.android.v.a, IOException, com.shield.android.i.a {
        com.shield.android.t.a next;
        Iterator<com.shield.android.t.a> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if ("AndroidManifest.xml".equals(next.ex())) {
                break;
            }
        }
        if (next != null) {
            return ByteBuffer.wrap(com.shield.android.t.b.a(bVar, next, bVar.es()));
        }
        throw new com.shield.android.i.a("Missing AndroidManifest.xml");
    }

    private PublicKey getPublicKey() throws Exception {
        if (f.bI()) {
            return KeyFactory.getInstance(this.jT.getKeyFormat()).generatePublic(new X509EncodedKeySpec(Base64.decode(this.jT.getPb().replaceAll("\\s+", ""), 2)));
        }
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new String(Base64.decode("TUlHZk1BMEdDU3FHU0liM0RRRUJBUVVBQTRHTkFEQ0JpUUtCZ1FERzcxTE9WYzRpM2xXUWorQm1PNEQ3NGd1M1VPV2tlN3cybjNqcUxRTFdHZThaM05VVnRCc3hXTE9obHhvenpOOWhNMlJvUUZqaGoySDNZSFNVK2oxK0dzRTlYbFpzYjJaaERLY1FJc0tidzh2RzA3b1laaFl2THRRd21Wb1ZEdVVJdG85dmpQVHI0K1NROTlCZ1E2Yk0zUDRVZCtyenZmcFEvb2ZFWDkvVXhRSURBUUFC", 2), StandardCharsets.UTF_8).replaceAll("\\s+", ""), 2)));
    }

    public String J(String str) throws Exception {
        if (f.bI()) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(this.jT.getPayloadFormat());
            keyGenerator.init(256);
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            String strA = a(str, bArr, secretKeyGenerateKey);
            byte[] bArrEncode = Base64.encode(secretKeyGenerateKey.getEncoded(), 2);
            Charset charset = StandardCharsets.UTF_8;
            String str2 = new String(bArrEncode, charset);
            return new String(Base64.encode((strA + Global.COLON + d((new String(Base64.encode(bArr, 2), charset) + Global.COLON + str2).getBytes())).getBytes(charset), 2), charset);
        }
        KeyGenerator keyGenerator2 = KeyGenerator.getInstance("AES");
        keyGenerator2.init(256);
        SecretKey secretKeyGenerateKey2 = keyGenerator2.generateKey();
        byte[] bArr2 = new byte[12];
        new SecureRandom().nextBytes(bArr2);
        String strA2 = a(str, bArr2, secretKeyGenerateKey2);
        byte[] bArrEncode2 = Base64.encode(secretKeyGenerateKey2.getEncoded(), 2);
        Charset charset2 = StandardCharsets.UTF_8;
        String str3 = new String(bArrEncode2, charset2);
        return new String(Base64.encode((strA2 + Global.COLON + d((new String(Base64.encode(bArr2, 2), charset2) + Global.COLON + str3).getBytes())).getBytes(charset2), 2), charset2);
    }

    public String d(byte[] bArr) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
        cipher.init(1, getPublicKey());
        return new String(Base64.encode(cipher.doFinal(bArr), 2), StandardCharsets.UTF_8);
    }

    private String a(String str, byte[] bArr, SecretKey secretKey) throws Exception {
        if (f.bI()) {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher cipher = Cipher.getInstance(this.jT.getPayloadTransformation());
            cipher.init(1, secretKey, ivParameterSpec);
            return new String(Base64.encode(cipher.doFinal(str.getBytes()), 2), StandardCharsets.UTF_8);
        }
        IvParameterSpec ivParameterSpec2 = new IvParameterSpec(bArr);
        Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
        cipher2.init(1, secretKey, ivParameterSpec2);
        return new String(Base64.encode(cipher2.doFinal(str.getBytes()), 2), StandardCharsets.UTF_8);
    }
}
