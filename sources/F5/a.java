package F5;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f1549a;

    static {
        HashMap map = new HashMap();
        f1549a = map;
        map.put("DES", "DES/CBC/PKCS5Padding");
        map.put("RSA", "RSA/ECB/PKCS1Padding");
    }
}
