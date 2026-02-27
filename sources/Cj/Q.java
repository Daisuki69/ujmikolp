package cj;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class Q extends P {
    public static Set c(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(L.b(objArr.length));
        C1129o.y(objArr, linkedHashSet);
        return linkedHashSet;
    }
}
