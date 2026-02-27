package zj;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class r {
    public static void a(StringBuilder sb2, Object obj, Function1 function1) {
        if (function1 != null) {
            sb2.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }
}
