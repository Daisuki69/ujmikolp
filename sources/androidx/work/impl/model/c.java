package androidx.work.impl.model;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkSpecDao_Impl f8251b;

    public /* synthetic */ c(WorkSpecDao_Impl workSpecDao_Impl, int i) {
        this.f8250a = i;
        this.f8251b = workSpecDao_Impl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8250a) {
            case 0:
                return this.f8251b.lambda$__fetchRelationshipWorkTagAsjavaLangString$0((HashMap) obj);
            default:
                return this.f8251b.lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1((HashMap) obj);
        }
    }
}
