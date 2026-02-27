package zj;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f21488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21489b;
    public final m c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f21490d;

    public n(Matcher matcher, String input) {
        kotlin.jvm.internal.j.g(input, "input");
        this.f21488a = matcher;
        this.f21489b = input;
        this.c = new m(this);
    }

    @Override // kotlin.text.MatchResult
    public final List a() {
        if (this.f21490d == null) {
            this.f21490d = new k(this);
        }
        k kVar = this.f21490d;
        kotlin.jvm.internal.j.d(kVar);
        return kVar;
    }

    @Override // kotlin.text.MatchResult
    public final IntRange b() {
        Matcher matcher = this.f21488a;
        return kotlin.ranges.d.f(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String strGroup = this.f21488a.group();
        kotlin.jvm.internal.j.f(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public final n next() {
        Matcher matcher = this.f21488a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        String str = this.f21489b;
        if (iEnd > str.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(str);
        kotlin.jvm.internal.j.f(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new n(matcher2, str);
        }
        return null;
    }
}
