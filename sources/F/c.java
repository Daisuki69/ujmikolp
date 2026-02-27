package F;

import D.S;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.stats.CodePackage;
import dOYHB6.tiZVw8.numX49;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyStore;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mg.c f1494a;

    public c(mg.c cVar) {
        this.f1494a = cVar;
    }

    public static b c(int i, byte[] bArr, byte[] bArr2, SecretKey secretKey) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            if (i == 1) {
                cipher.init(i, secretKey);
                byte[] iv = cipher.getIV();
                byte[] bArrDoFinal = cipher.doFinal(bArr);
                kotlin.jvm.internal.j.d(iv);
                kotlin.jvm.internal.j.d(bArrDoFinal);
                return new b(iv, bArrDoFinal);
            }
            if (i != 2) {
                S.l("Invalid mode used");
                return null;
            }
            if (bArr2 == null) {
                S.l("IV is required for decryption");
                return null;
            }
            cipher.init(i, secretKey, new GCMParameterSpec(128, bArr2));
            byte[] bArrDoFinal2 = cipher.doFinal(bArr);
            kotlin.jvm.internal.j.d(bArrDoFinal2);
            return new b(bArr2, bArrDoFinal2);
        } catch (Exception e) {
            S.o(numX49.tnTj78("PcL"), e);
            return null;
        }
    }

    public static b d(c cVar, int i, byte[] bArr, byte[] bArr2, int i4) {
        SecretKey secretKeyGenerateKey = null;
        if ((i4 & 4) != 0) {
            bArr2 = null;
        }
        mg.c cVar2 = cVar.f1494a;
        String strTnTj78 = numX49.tnTj78("Pcr");
        String strTnTj782 = numX49.tnTj78("PcZ");
        try {
            KeyStore keyStore = KeyStore.getInstance(strTnTj78);
            keyStore.load(null);
            if (keyStore.containsAlias(strTnTj782)) {
                Key key = keyStore.getKey(strTnTj782, null);
                kotlin.jvm.internal.j.e(key, "null cannot be cast to non-null type javax.crypto.SecretKey");
                secretKeyGenerateKey = (SecretKey) key;
            } else {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", strTnTj78);
                KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strTnTj782, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build();
                kotlin.jvm.internal.j.f(keyGenParameterSpecBuild, "build(...)");
                keyGenerator.init(keyGenParameterSpecBuild);
                secretKeyGenerateKey = keyGenerator.generateKey();
            }
        } catch (Exception e) {
            S.o(numX49.tnTj78("Pck"), e);
        }
        cVar.getClass();
        return c(i, bArr, bArr2, secretKeyGenerateKey);
    }

    @Override // F.d
    public final String a(String str) {
        b bVar;
        b bVarD;
        String strTnTj78 = numX49.tnTj78("PcB");
        String strTnTj782 = numX49.tnTj78("Pcu");
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("PcV"));
        try {
            List listT = C2576A.T(C2576A.N(C2576A.M(str, "<ct<"), ">ct>"), new String[]{Global.COLON}, 6);
            String str2 = (String) listT.get(0);
            kotlin.jvm.internal.j.g(str2, strTnTj782);
            byte[] bArrDecode = Base64.decode(str2, 2);
            kotlin.jvm.internal.j.f(bArrDecode, strTnTj78);
            String str3 = (String) listT.get(1);
            kotlin.jvm.internal.j.g(str3, strTnTj782);
            byte[] bArrDecode2 = Base64.decode(str3, 2);
            kotlin.jvm.internal.j.f(bArrDecode2, strTnTj78);
            bVar = new b(bArrDecode, bArrDecode2);
        } catch (Exception e) {
            S.o(numX49.tnTj78("PcS"), e);
            bVar = null;
        } catch (OutOfMemoryError e7) {
            S.o(numX49.tnTj78("Pcj"), e7);
            bVar = null;
        }
        if (bVar == null || (bVarD = d(this, 2, bVar.f1493b, bVar.f1492a, 8)) == null) {
            return null;
        }
        Charset charset = StandardCharsets.UTF_8;
        kotlin.jvm.internal.j.f(charset, numX49.tnTj78("Pcd"));
        return new String(bVarD.f1493b, charset);
    }

    @Override // F.d
    public final String b(String str) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("Pci"));
        Charset charset = StandardCharsets.UTF_8;
        kotlin.jvm.internal.j.f(charset, numX49.tnTj78("PcE"));
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.j.f(bytes, numX49.tnTj78("PcF"));
        b bVarD = d(this, 1, bytes, null, 12);
        if (bVarD == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("PcH"));
        String strTnTj78 = numX49.tnTj78("PcO");
        byte[] bArr = bVarD.f1492a;
        kotlin.jvm.internal.j.g(bArr, strTnTj78);
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        String strTnTj782 = numX49.tnTj78("PcQ");
        kotlin.jvm.internal.j.f(strEncodeToString, strTnTj782);
        sb2.append(strEncodeToString);
        sb2.append(':');
        String strEncodeToString2 = Base64.encodeToString(bVarD.f1493b, 2);
        kotlin.jvm.internal.j.f(strEncodeToString2, strTnTj782);
        sb2.append(strEncodeToString2);
        sb2.append(numX49.tnTj78("Pct"));
        return sb2.toString();
    }
}
