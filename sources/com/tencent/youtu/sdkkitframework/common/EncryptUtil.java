package com.tencent.youtu.sdkkitframework.common;

import We.s;
import android.os.Environment;
import com.tenpay.utils.SMUtils;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class EncryptUtil {
    public static final String head = "enhance_encrypt_method=1";
    public static final String publicKey = "04831b62b0b4f66cbd374b03d025dad9f1e4d3e19d2ed6180af3f169bf9de51b600ba6be92d06613a197db786bcfc8da5fbbe154af9566d3bed2ad372395b24843";

    private String byte2String(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b8 : bArr) {
            int i = b8 & 15;
            int i4 = (b8 & 240) >> 4;
            if (i4 >= 10) {
                stringBuffer.append((char) (i4 + 87));
            } else {
                stringBuffer.append((char) (i4 + 48));
            }
            if (i >= 10) {
                stringBuffer.append((char) (i + 87));
            } else {
                stringBuffer.append((char) (i + 48));
            }
        }
        return stringBuffer.toString();
    }

    private byte char2bytewithasc2(char c) {
        int i;
        if (c >= '0' && c <= '9') {
            i = c - '0';
        } else if (c >= 'A' && c <= 'F') {
            i = c - '7';
        } else {
            if (c < 'a' || c > 'f') {
                return (byte) 0;
            }
            i = c - 'W';
        }
        return (byte) i;
    }

    public static File createRequestFile(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStorageDirectory());
        String str2 = File.separator;
        File file = new File(s.q(sb2, str2, "RequestLog", str2));
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        File file2 = new File(file.getPath() + str2 + s.i(str, ".txt"));
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                return file2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return file2;
    }

    public static byte[] intToBytes(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    private byte[] string2bytes(String str) {
        int length = (str.length() + 1) / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        for (int i4 = 0; i4 < length; i4++) {
            bArr[i4] = 0;
            if (i >= str.length()) {
                break;
            }
            bArr[i4] = (byte) (char2bytewithasc2(str.charAt(i)) << 4);
            int i6 = i + 1;
            if (i6 >= str.length()) {
                break;
            }
            bArr[i4] = (byte) (char2bytewithasc2(str.charAt(i6)) | bArr[i4]);
            i += 2;
        }
        return bArr;
    }

    public static void writeBytesToFile(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = byteArrayInputStream.read(bArr2);
            if (i == -1) {
                byteArrayInputStream.close();
                fileOutputStream.close();
                return;
            }
            fileOutputStream.write(bArr2, 0, i);
        }
    }

    public static void writeFile(File file, String str) throws Throwable {
        PrintWriter printWriter;
        PrintWriter printWriter2 = null;
        try {
            try {
                printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            printWriter.println(str);
            printWriter.flush();
            printWriter.close();
        } catch (Exception e7) {
            e = e7;
            printWriter2 = printWriter;
            e.printStackTrace();
            if (printWriter2 != null) {
                printWriter2.close();
            }
        } catch (Throwable th3) {
            th = th3;
            printWriter2 = printWriter;
            if (printWriter2 != null) {
                printWriter2.close();
            }
            throw th;
        }
    }

    public String generateEncReq(String str, String str2, String str3, String str4) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        FaceLiveReq faceLiveReq = new FaceLiveReq();
        faceLiveReq.app_id = str2;
        if (str3 == "") {
            str3 = "not_set";
        }
        faceLiveReq.session_id = str3;
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[16];
        secureRandom.nextBytes(bArr);
        byte[] bArr2 = new byte[16];
        secureRandom.nextBytes(bArr2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bArr3 = new byte[secretKeySpec.getEncoded().length + 16];
        System.arraycopy(secretKeySpec.getEncoded(), 0, bArr3, 0, secretKeySpec.getEncoded().length);
        System.arraycopy(bArr, 0, bArr3, secretKeySpec.getEncoded().length, 16);
        messageDigest.update(bArr3);
        byte[] bArrDigest = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArrDigest.length; i++) {
            if (Integer.toHexString(bArrDigest[i] & 255).length() == 1) {
                stringBuffer.append("0");
                stringBuffer.append(Integer.toHexString(bArrDigest[i] & 255));
            } else {
                stringBuffer.append(Integer.toHexString(bArrDigest[i] & 255));
            }
        }
        faceLiveReq.sign = stringBuffer.toString();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
        byte[] bArrDoFinal = cipher.doFinal(str.getBytes());
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[secretKeySpec.getEncoded().length + 16 + bArrDoFinal.length]);
        byteBufferWrap.put(secretKeySpec.getEncoded());
        byteBufferWrap.put(bArr);
        byteBufferWrap.put(bArrDoFinal);
        faceLiveReq.data = new String(android.util.Base64.encodeToString(byteBufferWrap.array(), 2));
        return new WeJson().toJson(faceLiveReq);
    }

    public String generateSMReq(String str, String str2, String str3) {
        FaceLiveReq faceLiveReq = new FaceLiveReq();
        faceLiveReq.app_id = str2;
        if (str3 == "") {
            str3 = "not_set";
        }
        faceLiveReq.session_id = str3;
        byte[] bArrSM4GenKey = SMUtils.getInstance().SM4GenKey();
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        byte[] bArrSm4GCMEncryptNoPadding = SMUtils.getInstance().sm4GCMEncryptNoPadding(bytes, 16, bArrSM4GenKey, bArr, new byte[0]);
        long jSM2InitCtxWithPubKey = SMUtils.getInstance().SM2InitCtxWithPubKey(publicKey);
        byte[] bArrSM2Encrypt = SMUtils.getInstance().SM2Encrypt(jSM2InitCtxWithPubKey, bArrSM4GenKey, publicKey);
        SMUtils.getInstance().SM2FreeCtx(jSM2InitCtxWithPubKey);
        byte[] bytes2 = ("" + bArrSM2Encrypt.length).getBytes();
        byte[] bArr2 = new byte[16];
        int i = 0;
        for (int length = bArrSm4GCMEncryptNoPadding.length - 16; length < bArrSm4GCMEncryptNoPadding.length; length++) {
            bArr2[i] = bArrSm4GCMEncryptNoPadding[length];
            i++;
        }
        byte[] bArr3 = new byte[bArrSm4GCMEncryptNoPadding.length - 16];
        for (int i4 = 0; i4 < bArrSm4GCMEncryptNoPadding.length - 16; i4++) {
            bArr3[i4] = bArrSm4GCMEncryptNoPadding[i4];
        }
        String strEncodeToString = android.util.Base64.encodeToString(bArr3, 2);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[bytes2.length + 32 + head.getBytes().length + bArrSM2Encrypt.length + strEncodeToString.getBytes().length]);
        byteBufferWrap.put(head.getBytes());
        byteBufferWrap.put(bArr);
        byteBufferWrap.put(bytes2);
        byteBufferWrap.put(bArrSM2Encrypt);
        byteBufferWrap.put(bArr2);
        byteBufferWrap.put(strEncodeToString.getBytes());
        faceLiveReq.data = new String(android.util.Base64.encodeToString(byteBufferWrap.array(), 2));
        return new WeJson().toJson(faceLiveReq);
    }
}
