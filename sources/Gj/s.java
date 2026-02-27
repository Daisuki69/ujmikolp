package Gj;

import a.AbstractC0617a;
import bj.AbstractC1039j;
import bj.C1037h;
import com.dynatrace.android.agent.Global;
import ij.AbstractC1607a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2030a = 0;

    static {
        Object objA;
        Object objA2;
        Exception exc = new Exception();
        String simpleName = AbstractC0617a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), Global.UNDERSCORE, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = AbstractC1607a.class.getCanonicalName();
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (C1037h.a(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objA2 = s.class.getCanonicalName();
        } catch (Throwable th3) {
            C1037h.a aVar3 = C1037h.f9166b;
            objA2 = AbstractC1039j.a(th3);
        }
        if (C1037h.a(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
