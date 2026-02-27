package Gi;

import Xh.i;
import android.util.Base64;
import java.nio.charset.Charset;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f1996b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cg.c f1997a;

    public a(String str) {
        this.f1997a = new Cg.c(str, 9);
    }

    @Override // Gi.d
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        Cg.c cVar = this.f1997a;
        Cipher cipherJ = cVar.j(1);
        try {
            try {
                byte[] bArrDoFinal = cipherJ.doFinal(str.getBytes(f1996b));
                cVar.s(cipherJ);
                return Base64.encodeToString(bArrDoFinal, 0);
            } catch (Exception e) {
                Ri.a.g("Error encrypting data: " + e.getMessage());
                cVar.s(cipherJ);
                return null;
            }
        } catch (Throwable th2) {
            cVar.s(cipherJ);
            throw th2;
        }
    }

    @Override // Gi.d
    public final String r(String str) {
        if (str == null) {
            return null;
        }
        Cg.c cVar = this.f1997a;
        Cipher cipherJ = cVar.j(2);
        try {
            return new String(cipherJ.doFinal(i.d(str)), f1996b);
        } catch (Exception e) {
            Ri.a.g("Error decrypting data for source: " + str + " - " + e.getMessage());
            return null;
        } finally {
            cVar.s(cipherJ);
        }
    }
}
