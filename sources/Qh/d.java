package Qh;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5384a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, int i) {
        super(str);
        this.f5384a = i;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.f5384a) {
            case 0:
            case 2:
                return this;
            case 1:
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String message) {
        super(message);
        this.f5384a = 1;
        j.g(message, "message");
    }
}
