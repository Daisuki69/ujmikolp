package c0;

import Bj.E;
import D.S;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n2.C1915b;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1915b f9186b;
    public final /* synthetic */ JSONArray c;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C1915b c1915b, JSONArray jSONArray, String str, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f9186b = c1915b;
        this.c = jSONArray;
        this.e = str;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new d(this.f9186b, this.c, this.e, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f9185a;
        C1915b c1915b = this.f9186b;
        S s9 = (S) c1915b.h;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                JSONArray jSONArrayA = C1915b.a(c1915b, this.c, this.e);
                if (jSONArrayA.length() > 0) {
                    this.f9185a = 1;
                    if (C1915b.b(c1915b, jSONArrayA, this) == enumC1578a) {
                        return enumC1578a;
                    }
                } else {
                    s9.getClass();
                    S.s("ContentFetch", "No valid content fetch items to send.");
                    Unit unit = Unit.f18162a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
        } catch (CancellationException unused) {
            s9.getClass();
            S.s("ContentFetch", "Fetch job was cancelled.");
        } catch (Exception e) {
            s9.getClass();
            S.t("ContentFetch", "Unexpected error during content fetch", e);
        }
        return Unit.f18162a;
    }
}
