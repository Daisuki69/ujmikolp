package l0;

import D.W;
import android.os.Build;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f18217a = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r4v4, types: [l0.a] */
    public static final c a(CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (cleverTapInstanceConfig == null) {
            throw new IllegalArgumentException("Can't create task for null config");
        }
        int i = Build.VERSION.SDK_INT;
        ConcurrentHashMap concurrentHashMap = f18217a;
        String str = cleverTapInstanceConfig.f9439a;
        if (i >= 24) {
            final W w6 = new W(cleverTapInstanceConfig, 1);
            Object objComputeIfAbsent = concurrentHashMap.computeIfAbsent(str, new Function() { // from class: l0.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (c) w6.invoke(obj);
                }
            });
            j.d(objComputeIfAbsent);
            return (c) objComputeIfAbsent;
        }
        j.d(str);
        c cVar = (c) concurrentHashMap.get(str);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(cleverTapInstanceConfig);
        c cVar3 = (c) concurrentHashMap.putIfAbsent(str, cVar2);
        return cVar3 == null ? cVar2 : cVar3;
    }
}
