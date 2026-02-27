package androidx.navigation;

import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class NavDeepLink$pattern$2 extends k implements Function0<Pattern> {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$pattern$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Pattern invoke() {
        String str = this.this$0.patternFinalRegex;
        if (str != null) {
            return Pattern.compile(str, 2);
        }
        return null;
    }
}
