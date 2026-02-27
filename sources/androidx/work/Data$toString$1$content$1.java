package androidx.work;

import We.s;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class Data$toString$1$content$1 extends k implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {
    public static final Data$toString$1$content$1 INSTANCE = new Data$toString$1$content$1();

    public Data$toString$1$content$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
        j.g(entry, "<name for destructuring parameter 0>");
        String key = entry.getKey();
        Object value = entry.getValue();
        StringBuilder sbV = s.v(key, " : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            j.f(value, "toString(this)");
        }
        sbV.append(value);
        return sbV.toString();
    }
}
