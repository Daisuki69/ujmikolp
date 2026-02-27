package kotlin.ranges;

import java.util.Iterator;
import kj.AbstractC1785b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rj.InterfaceC2210a;
import wj.C2441a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Iterable<Character>, InterfaceC2210a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0096a f18197d = new C0096a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f18198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f18199b;
    public final int c = 1;

    /* JADX INFO: renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    public static final class C0096a {
        public C0096a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public a(char c, char c10) {
        this.f18198a = c;
        this.f18199b = (char) AbstractC1785b.a(c, c10, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new C2441a(this.f18198a, this.f18199b, this.c);
    }
}
