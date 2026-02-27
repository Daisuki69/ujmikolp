package c0;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile SecretKey f9197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f9198b = new Object();

    public SecretKey a() {
        if (f9197a == null) {
            synchronized (f9198b) {
                try {
                    if (f9197a == null) {
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                        keyGenerator.init(256);
                        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
                        kotlin.jvm.internal.j.d(secretKeyGenerateKey);
                        f9197a = secretKeyGenerateKey;
                    }
                    Unit unit = Unit.f18162a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        SecretKey secretKey = f9197a;
        kotlin.jvm.internal.j.d(secretKey);
        return secretKey;
    }
}
