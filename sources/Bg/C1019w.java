package bg;

import android.util.DisplayMetrics;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import javax.crypto.KeyGenerator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: bg.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1019w extends kotlin.jvm.internal.k implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1019w f9131b = new C1019w(0, 0);
    public static final C1019w c = new C1019w(0, 1);
    public static final C1019w e = new C1019w(0, 2);
    public static final C1019w f = new C1019w(0, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1019w f9132g = new C1019w(0, 4);
    public static final C1019w h = new C1019w(0, 5);
    public static final C1019w i = new C1019w(0, 7);
    public static final C1019w j = new C1019w(0, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9133a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1019w(int i4, int i6) {
        super(i4);
        this.f9133a = i6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchAlgorithmException {
        switch (this.f9133a) {
            case 0:
                C0966H c0966h = new C0966H();
                new ConcurrentHashMap();
                return c0966h;
            case 1:
                return new C0952A();
            case 2:
                return new C1012p();
            case 3:
                C0972K c0972k = new C0972K();
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(256, new SecureRandom());
                kotlin.jvm.internal.j.c(keyGenerator.generateKey(), "keygen.generateKey()");
                new SecureRandom().nextBytes(new byte[16]);
                return c0972k;
            case 4:
                return new x0(new SecureRandom().nextInt(181) + 90);
            case 5:
                t0 t0Var = new t0();
                Pattern.compile("[^\\d\\-\\+()\\s\\[\\]*#$&<>:]");
                new ConcurrentHashMap();
                return t0Var;
            case 6:
                return null;
            case 7:
                return new DisplayMetrics();
            case 8:
                return new ConcurrentHashMap();
            case 9:
                throw null;
            case 10:
                return null;
            default:
                return null;
        }
    }
}
