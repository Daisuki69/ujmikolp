package Gi;

import androidx.core.util.Pools;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pools.SynchronizedPool f2001a = new Pools.SynchronizedPool(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2.d f2002b;

    public c(z2.d dVar) {
        this.f2002b = dVar;
    }

    public final Object a() {
        Object objAcquire = this.f2001a.acquire();
        if (objAcquire != null) {
            return objAcquire;
        }
        this.f2002b.getClass();
        try {
            return Cipher.getInstance("AES/CBC/PKCS7Padding");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            Ri.a.g("Error creating cipher: " + e.getMessage());
            return null;
        }
    }
}
