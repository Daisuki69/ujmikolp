package com.shield.android.l;

import com.shield.android.i.c;
import com.shield.android.u.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    private static final Map<String, String> pH;
    private static final Map<String, Integer> pI;

    static {
        HashMap map = new HashMap(8);
        pH = map;
        map.put("MD5", "MD5");
        map.put("SHA", "SHA-1");
        map.put("SHA1", "SHA-1");
        map.put("SHA-1", "SHA-1");
        map.put("SHA-256", "SHA-256");
        map.put("SHA-384", "SHA-384");
        map.put("SHA-512", "SHA-512");
        HashMap map2 = new HashMap(5);
        pI = map2;
        map2.put("MD5", 0);
        map2.put("SHA-1", 0);
        map2.put("SHA-256", 0);
        map2.put("SHA-384", 9);
        map2.put("SHA-512", 9);
    }

    public static List<com.shield.android.t.a> b(b bVar, c.b bVar2) throws IOException, com.shield.android.i.a {
        return com.shield.android.t.c.a(bVar, bVar2);
    }
}
